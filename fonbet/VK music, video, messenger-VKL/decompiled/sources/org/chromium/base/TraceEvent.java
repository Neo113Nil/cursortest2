package org.chromium.base;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import xsna.e630;
import xsna.ss9;

/* loaded from: classes11.dex */
public class TraceEvent implements AutoCloseable {
    private static volatile boolean sEnabled;
    private static boolean sEventNameFilteringEnabled;
    private static volatile boolean sUiThreadReady;
    private final String mName;

    /* loaded from: classes8.dex */
    public static class ActivityInfo {
        public String mActivityName;
        public ArrayList<ViewInfo> mViews = new ArrayList<>(125);

        public ActivityInfo(String str) {
            this.mActivityName = str;
        }
    }

    /* loaded from: classes8.dex */
    public static class BasicLooperMonitor implements Printer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final String FILTERED_EVENT_NAME = "Looper.dispatch: EVENT_NAME_FILTERED";
        static final String LOOPER_TASK_PREFIX = "Looper.dispatch: ";
        private static final int SHORTEST_LOG_PREFIX_LENGTH = 18;
        private String mCurrentTarget;

        private static String getTarget(String str) {
            int indexOf = str.indexOf(40, SHORTEST_LOG_PREFIX_LENGTH);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
            return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
        }

        private static String getTargetName(String str) {
            int indexOf = str.indexOf(125, SHORTEST_LOG_PREFIX_LENGTH);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(58, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            return indexOf != -1 ? str.substring(indexOf + 2, indexOf2) : "";
        }

        public static String getTraceEventName(String str) {
            return TraceEvent.sEventNameFilteringEnabled ? FILTERED_EVENT_NAME : ss9.a(LOOPER_TASK_PREFIX, getTarget(str), "(", getTargetName(str), ")");
        }

        public void beginHandling(String str) {
            boolean enabled = EarlyTraceEvent.enabled();
            if (TraceEvent.sEnabled || enabled) {
                this.mCurrentTarget = getTraceEventName(str);
                if (TraceEvent.sEnabled) {
                    TraceEventJni.get().beginToplevel(this.mCurrentTarget);
                } else {
                    EarlyTraceEvent.begin(this.mCurrentTarget, true);
                }
            }
        }

        public void endHandling(String str) {
            boolean enabled = EarlyTraceEvent.enabled();
            if ((TraceEvent.sEnabled || enabled) && this.mCurrentTarget != null) {
                if (TraceEvent.sEnabled) {
                    TraceEventJni.get().endToplevel();
                } else {
                    EarlyTraceEvent.end(this.mCurrentTarget, true);
                }
            }
            this.mCurrentTarget = null;
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">")) {
                beginHandling(str);
            } else {
                endHandling(str);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class IdleTracingLooperMonitor extends BasicLooperMonitor implements MessageQueue.IdleHandler {
        private static final long FRAME_DURATION_MILLIS = 16;
        private static final String IDLE_EVENT_NAME = "Looper.queueIdle";
        private static final long MIN_INTERESTING_BURST_DURATION_MILLIS = 48;
        private static final long MIN_INTERESTING_DURATION_MILLIS = 16;
        private static final String TAG = "TraceEvt_LooperMonitor";
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        public /* synthetic */ IdleTracingLooperMonitor(int i) {
            this();
        }

        private final void syncIdleMonitoring() {
            if (TraceEvent.sEnabled && !this.mIdleMonitorAttached) {
                this.mLastIdleStartedAt = TimeUtils.elapsedRealtimeMillis();
                Looper.myQueue().addIdleHandler(this);
                this.mIdleMonitorAttached = true;
            } else {
                if (!this.mIdleMonitorAttached || TraceEvent.sEnabled) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(this);
                this.mIdleMonitorAttached = false;
            }
        }

        private static void traceAndLog(int i, String str) {
            TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", str);
            android.util.Log.println(i, TAG, str);
        }

        @Override // org.chromium.base.TraceEvent.BasicLooperMonitor
        public final void beginHandling(String str) {
            if (this.mNumTasksSinceLastIdle == 0) {
                TraceEvent.end(IDLE_EVENT_NAME);
            }
            this.mLastWorkStartedAt = TimeUtils.elapsedRealtimeMillis();
            syncIdleMonitoring();
            super.beginHandling(str);
        }

        @Override // org.chromium.base.TraceEvent.BasicLooperMonitor
        public final void endHandling(String str) {
            long elapsedRealtimeMillis = TimeUtils.elapsedRealtimeMillis() - this.mLastWorkStartedAt;
            if (elapsedRealtimeMillis > 16) {
                traceAndLog(5, "observed a task that took " + elapsedRealtimeMillis + "ms: " + str);
            }
            super.endHandling(str);
            syncIdleMonitoring();
            this.mNumTasksSeen++;
            this.mNumTasksSinceLastIdle++;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtimeMillis = TimeUtils.elapsedRealtimeMillis();
            if (this.mLastIdleStartedAt == 0) {
                this.mLastIdleStartedAt = elapsedRealtimeMillis;
            }
            long j = elapsedRealtimeMillis - this.mLastIdleStartedAt;
            this.mNumIdlesSeen++;
            TraceEvent.begin(IDLE_EVENT_NAME, this.mNumTasksSinceLastIdle + " tasks since last idle.");
            if (j > MIN_INTERESTING_BURST_DURATION_MILLIS) {
                int i = this.mNumTasksSeen;
                int i2 = this.mNumIdlesSeen;
                int i3 = this.mNumTasksSinceLastIdle;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" tasks and ");
                sb.append(i2);
                sb.append(" idles processed so far, ");
                sb.append(i3);
                traceAndLog(3, e630.c(sb, " tasks bursted and ", j, "ms elapsed since last idle"));
            }
            this.mLastIdleStartedAt = elapsedRealtimeMillis;
            this.mNumTasksSinceLastIdle = 0;
            return true;
        }

        private IdleTracingLooperMonitor() {
        }
    }

    public static final class LooperMonitorHolder {
        private static final BasicLooperMonitor sInstance;

        static {
            sInstance = CommandLine.getInstance().hasSwitch(BaseSwitches.ENABLE_IDLE_TRACING) ? new IdleTracingLooperMonitor(0) : new BasicLooperMonitor();
        }

        private LooperMonitorHolder() {
        }
    }

    public interface Natives {
        void addViewDump(int i, int i2, boolean z, boolean z2, String str, String str2, long j);

        void begin(String str, String str2);

        void beginToplevel(String str);

        void beginWithIntArg(String str, int i);

        void end(String str, long j);

        void endToplevel();

        void finishAsync(long j);

        void initViewHierarchyDump(long j, Object obj);

        void instant(String str, String str2);

        void instantAndroidIPC(String str, long j);

        void instantAndroidToolbar(int i, int i2, int i3);

        void registerEnabledObserver();

        long startActivityDump(String str, long j);

        void startAsync(String str, long j);

        void startupActivityStart(long j, long j2);

        void startupLaunchCause(long j, long j2, int i);

        void startupTimeToFirstVisibleContent2(long j, long j2, long j3);

        boolean viewHierarchyDumpEnabled();

        void webViewStartupFirstInstance(long j, long j2, boolean z);

        void webViewStartupNotFirstInstance(long j, long j2);

        void webViewStartupStage1(long j, long j2);

        void webViewStartupStartChromiumLocked(long j, long j2, int i, int i2, int i3);

        void webViewStartupTotalFactoryInit(long j, long j2);
    }

    /* loaded from: classes8.dex */
    public static final class ViewHierarchyDumper implements MessageQueue.IdleHandler {
        private static final long MIN_VIEW_DUMP_INTERVAL_MILLIS = 1000;
        private static ViewHierarchyDumper sInstance;
        private long mLastDumpTs;

        private ViewHierarchyDumper() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dumpView(ActivityInfo activityInfo, int i, View view) {
            ThreadUtils.assertOnUiThread();
            int id = view.getId();
            activityInfo.mViews.add(new ViewInfo(id, i, view.isShown(), view.isDirty(), view.getClass().getSimpleName(), view.getResources()));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    dumpView(activityInfo, id, viewGroup.getChildAt(i2));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$updateEnabledState$0() {
            setEnabled(TraceEventJni.get().viewHierarchyDumpEnabled());
        }

        private static void setEnabled(boolean z) {
            ThreadUtils.assertOnUiThread();
            ViewHierarchyDumper viewHierarchyDumper = sInstance;
            if (viewHierarchyDumper == null && z) {
                sInstance = new ViewHierarchyDumper();
                Looper.myQueue().addIdleHandler(sInstance);
            } else {
                if (viewHierarchyDumper == null || z) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(sInstance);
                sInstance = null;
            }
        }

        public static void updateEnabledState() {
            PostTask.runOrPostTask(7, new a());
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtimeMillis = TimeUtils.elapsedRealtimeMillis();
            long j = this.mLastDumpTs;
            if (j != 0 && elapsedRealtimeMillis - j <= 1000) {
                return true;
            }
            this.mLastDumpTs = elapsedRealtimeMillis;
            TraceEvent.snapshotViewHierarchy();
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public static class ViewInfo {
        private final String mClassName;
        private final int mId;
        private final boolean mIsDirty;
        private final boolean mIsShown;
        private final int mParentId;
        private final Resources mRes;

        public ViewInfo(int i, int i2, boolean z, boolean z2, String str, Resources resources) {
            this.mId = i;
            this.mParentId = i2;
            this.mIsShown = z;
            this.mIsDirty = z2;
            this.mClassName = str;
            this.mRes = resources;
        }
    }

    private TraceEvent(String str, String str2) {
        this.mName = str;
        begin(str, str2);
    }

    public static void begin(String str) {
        begin(str, (String) null);
    }

    @CalledByNative
    public static void dumpViewHierarchy(long j, Object obj) {
        String str;
        if (ApplicationStatus.isInitialized()) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                long startActivityDump = TraceEventJni.get().startActivityDump(activityInfo.mActivityName, j);
                Iterator<ViewInfo> it2 = activityInfo.mViews.iterator();
                while (it2.hasNext()) {
                    ViewInfo next = it2.next();
                    try {
                        if (next.mRes != null) {
                            if (next.mId != 0 && next.mId != -1) {
                                str = next.mRes.getResourceName(next.mId);
                            }
                            str = "__no_id__";
                        } else {
                            str = "__no_resources__";
                        }
                    } catch (Resources.NotFoundException unused) {
                        str = "__name_not_found__";
                    }
                    TraceEventJni.get().addViewDump(next.mId, next.mParentId, next.mIsShown, next.mIsDirty, next.mClassName, str, startActivityDump);
                }
            }
        }
    }

    public static boolean enabled() {
        return sEnabled;
    }

    public static void end(String str) {
        end(str, null);
    }

    public static boolean eventNameFilteringEnabled() {
        return sEventNameFilteringEnabled;
    }

    public static void finishAsync(String str, long j) {
        EarlyTraceEvent.finishAsync(str, j);
        if (sEnabled) {
            TraceEventJni.get().finishAsync(j);
        }
    }

    public static void instant(String str) {
        if (sEnabled) {
            TraceEventJni.get().instant(str, null);
        }
    }

    public static void instantAndroidIPC(String str, long j) {
        if (sEnabled) {
            TraceEventJni.get().instantAndroidIPC(str, j);
        }
    }

    public static void instantAndroidToolbar(int i, int i2, int i3) {
        if (sEnabled) {
            TraceEventJni.get().instantAndroidToolbar(i, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$snapshotViewHierarchy$0(long j, ArrayList arrayList) {
        TraceEventJni.get().initViewHierarchyDump(j, arrayList);
    }

    public static void maybeEnableEarlyTracing(boolean z) {
        if (z) {
            EarlyTraceEvent.maybeEnableInBrowserProcess();
        }
        if (EarlyTraceEvent.enabled()) {
            ThreadUtils.getUiThreadLooper().setMessageLogging(LooperMonitorHolder.sInstance);
        }
    }

    public static void onNativeTracingReady() {
        TraceEventJni.get().registerEnabledObserver();
    }

    public static void onUiThreadReady() {
        sUiThreadReady = true;
        if (sEnabled) {
            ViewHierarchyDumper.updateEnabledState();
        }
    }

    public static TraceEvent scoped(String str, String str2) {
        if (EarlyTraceEvent.enabled() || enabled()) {
            return new TraceEvent(str, str2);
        }
        return null;
    }

    @CalledByNative
    public static void setEnabled(boolean z) {
        if (z) {
            EarlyTraceEvent.disable();
        }
        if (sEnabled != z) {
            sEnabled = z;
            ThreadUtils.getUiThreadLooper().setMessageLogging(z ? LooperMonitorHolder.sInstance : null);
        }
        if (sEnabled) {
            EarlyTraceEvent.dumpActivityStartupEvents();
        }
        if (sUiThreadReady) {
            ViewHierarchyDumper.updateEnabledState();
        }
    }

    @CalledByNative
    public static void setEventNameFilteringEnabled(boolean z) {
        sEventNameFilteringEnabled = z;
    }

    public static void snapshotViewHierarchy() {
        if (sEnabled && TraceEventJni.get().viewHierarchyDumpEnabled()) {
            begin("instantAndroidViewHierarchy");
            final ArrayList<ActivityInfo> snapshotViewHierarchyState = snapshotViewHierarchyState();
            if (snapshotViewHierarchyState.isEmpty()) {
                end("instantAndroidViewHierarchy");
                return;
            }
            final long hashCode = snapshotViewHierarchyState.hashCode();
            PostTask.postTask(0, new Runnable() { // from class: xsna.qdp0
                @Override // java.lang.Runnable
                public final void run() {
                    TraceEvent.lambda$snapshotViewHierarchy$0(hashCode, snapshotViewHierarchyState);
                }
            });
            end("instantAndroidViewHierarchy", null, hashCode);
        }
    }

    public static ArrayList<ActivityInfo> snapshotViewHierarchyState() {
        if (!ApplicationStatus.isInitialized()) {
            return new ArrayList<>();
        }
        ArrayList<ActivityInfo> arrayList = new ArrayList<>(2);
        for (Activity activity : ApplicationStatus.getRunningActivities()) {
            arrayList.add(new ActivityInfo(activity.getClass().getName()));
            ViewHierarchyDumper.dumpView(arrayList.get(arrayList.size() - 1), 0, activity.getWindow().getDecorView().getRootView());
        }
        return arrayList;
    }

    public static void startAsync(String str, long j) {
        EarlyTraceEvent.startAsync(str, j);
        if (sEnabled) {
            TraceEventJni.get().startAsync(str, j);
        }
    }

    public static void startupActivityStart(long j, long j2) {
        if (sEnabled) {
            TraceEventJni.get().startupActivityStart(j, j2);
        } else {
            EarlyTraceEvent.startupActivityStart(j, j2);
        }
    }

    public static void startupLaunchCause(long j, int i) {
        if (sEnabled) {
            TraceEventJni.get().startupLaunchCause(j, SystemClock.uptimeMillis(), i);
        } else {
            EarlyTraceEvent.startupLaunchCause(j, i);
        }
    }

    public static void startupTimeToFirstVisibleContent2(long j, long j2, long j3) {
        if (sEnabled) {
            TraceEventJni.get().startupTimeToFirstVisibleContent2(j, j2, j3);
        }
    }

    public static void webViewStartupFirstInstance(long j, long j2, boolean z) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupFirstInstance(j, j2, z);
        }
    }

    public static void webViewStartupNotFirstInstance(long j, long j2) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupNotFirstInstance(j, j2);
        }
    }

    public static void webViewStartupStage1(long j, long j2) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupStage1(j, j2);
        }
    }

    public static void webViewStartupStartChromiumLocked(long j, long j2, int i, int i2, int i3) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupStartChromiumLocked(j, j2, i, i2, i3);
        }
    }

    public static void webViewStartupTotalFactoryInit(long j, long j2) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupTotalFactoryInit(j, j2);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end(this.mName);
    }

    public static void begin(String str, String str2) {
        EarlyTraceEvent.begin(str, false);
        if (sEnabled) {
            TraceEventJni.get().begin(str, str2);
        }
    }

    public static void end(String str, String str2) {
        end(str, str2, 0L);
    }

    public static void instant(String str, String str2) {
        if (sEnabled) {
            TraceEventJni.get().instant(str, str2);
        }
    }

    public static void end(String str, String str2, long j) {
        EarlyTraceEvent.end(str, false);
        if (sEnabled) {
            TraceEventJni.get().end(str2, j);
        }
    }

    public static TraceEvent scoped(String str, int i) {
        if (EarlyTraceEvent.enabled() || enabled()) {
            return new TraceEvent(str, i);
        }
        return null;
    }

    private TraceEvent(String str, int i) {
        this.mName = str;
        begin(str, i);
    }

    public static void begin(String str, int i) {
        EarlyTraceEvent.begin(str, false);
        if (sEnabled) {
            TraceEventJni.get().beginWithIntArg(str, i);
        }
    }

    public static TraceEvent scoped(String str) {
        return scoped(str, (String) null);
    }
}
