package org.chromium.base;

import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import internal.org.jni_zero.CalledByNative;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class EarlyTraceEvent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String BACKGROUND_STARTUP_TRACING_ENABLED_KEY = "bg_startup_tracing";
    static final int STATE_DISABLED = 0;
    static final int STATE_ENABLED = 1;
    static final int STATE_FINISHED = 2;
    private static final String TRACE_CONFIG_FILENAME = "/data/local/chrome-trace-config.json";
    public static final String TRACE_EARLY_JAVA_IN_CHILD_SWITCH = "trace-early-java-in-child";
    private static final String TRACE_STARTUP_SWITCH = "trace-startup";
    static List<AsyncEvent> sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    private static volatile boolean sEnabledInChildProcessBeforeCommandLine;
    static List<Event> sEvents;
    static volatile int sState;
    static final Object sLock = new Object();
    static final List<ActivityStartupEvent> sActivityStartupEvents = new ArrayList();
    static final List<ActivityLaunchCauseEvent> sActivityLaunchCauseEvents = new ArrayList();

    /* loaded from: classes8.dex */
    public static final class ActivityLaunchCauseEvent {
        final long mId;
        final int mLaunchCause;
        final long mTimeMs = SystemClock.uptimeMillis();

        public ActivityLaunchCauseEvent(long j, int i) {
            this.mId = j;
            this.mLaunchCause = i;
        }
    }

    /* loaded from: classes8.dex */
    public static final class ActivityStartupEvent {
        final long mId;
        final long mTimeMs;

        public ActivityStartupEvent(long j, long j2) {
            this.mId = j;
            this.mTimeMs = j2;
        }
    }

    /* loaded from: classes8.dex */
    public static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final String mName;
        final long mTimeNanos = System.nanoTime();

        public AsyncEvent(String str, long j, boolean z) {
            this.mName = str;
            this.mId = j;
            this.mIsStart = z;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Event {
        final boolean mIsStart;
        final boolean mIsToplevel;
        final String mName;
        final int mThreadId = Process.myTid();
        final long mTimeNanos = System.nanoTime();
        final long mThreadTimeMillis = SystemClock.currentThreadTimeMillis();

        public Event(String str, boolean z, boolean z2) {
            this.mIsStart = z;
            this.mIsToplevel = z2;
            this.mName = str;
        }
    }

    /* loaded from: classes8.dex */
    public interface Natives {
        void recordEarlyAsyncBeginEvent(String str, long j, long j2);

        void recordEarlyAsyncEndEvent(long j, long j2);

        void recordEarlyBeginEvent(String str, long j, int i, long j2);

        void recordEarlyEndEvent(String str, long j, int i, long j2);

        void recordEarlyToplevelBeginEvent(String str, long j, int i, long j2);

        void recordEarlyToplevelEndEvent(String str, long j, int i, long j2);
    }

    public static void begin(String str, boolean z) {
        if (enabled()) {
            Event event = new Event(str, true, z);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sEvents.add(event);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void disable() {
        synchronized (sLock) {
            try {
                if (enabled()) {
                    if (!sEvents.isEmpty()) {
                        dumpEvents(sEvents);
                        sEvents.clear();
                    }
                    if (!sAsyncEvents.isEmpty()) {
                        dumpAsyncEvents(sAsyncEvents);
                        sAsyncEvents.clear();
                    }
                    sState = 2;
                    sEvents = null;
                    sAsyncEvents = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void dumpActivityStartupEvents() {
        synchronized (sLock) {
            try {
                List<ActivityStartupEvent> list = sActivityStartupEvents;
                if (!list.isEmpty()) {
                    for (ActivityStartupEvent activityStartupEvent : list) {
                        TraceEventJni.get().startupActivityStart(activityStartupEvent.mId, activityStartupEvent.mTimeMs);
                    }
                    sActivityStartupEvents.clear();
                }
                List<ActivityLaunchCauseEvent> list2 = sActivityLaunchCauseEvents;
                if (!list2.isEmpty()) {
                    for (ActivityLaunchCauseEvent activityLaunchCauseEvent : list2) {
                        TraceEventJni.get().startupLaunchCause(activityLaunchCauseEvent.mId, activityLaunchCauseEvent.mTimeMs, activityLaunchCauseEvent.mLaunchCause);
                    }
                    sActivityLaunchCauseEvents.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void dumpAsyncEvents(List<AsyncEvent> list) {
        for (AsyncEvent asyncEvent : list) {
            if (asyncEvent.mIsStart) {
                EarlyTraceEventJni.get().recordEarlyAsyncBeginEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimeNanos);
            } else {
                EarlyTraceEventJni.get().recordEarlyAsyncEndEvent(asyncEvent.mId, asyncEvent.mTimeNanos);
            }
        }
    }

    private static void dumpEvents(List<Event> list) {
        for (Event event : list) {
            if (event.mIsStart) {
                if (event.mIsToplevel) {
                    EarlyTraceEventJni.get().recordEarlyToplevelBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                } else {
                    EarlyTraceEventJni.get().recordEarlyBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                }
            } else if (event.mIsToplevel) {
                EarlyTraceEventJni.get().recordEarlyToplevelEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            } else {
                EarlyTraceEventJni.get().recordEarlyEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            }
        }
    }

    public static void earlyEnableInChildWithoutCommandLine() {
        sEnabledInChildProcessBeforeCommandLine = true;
        enable();
    }

    public static void enable() {
        synchronized (sLock) {
            try {
                if (sState != 0) {
                    return;
                }
                sEvents = new ArrayList();
                sAsyncEvents = new ArrayList();
                sState = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean enabled() {
        return sState == 1;
    }

    public static void end(String str, boolean z) {
        if (enabled()) {
            Event event = new Event(str, false, z);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sEvents.add(event);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void finishAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, false);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sAsyncEvents.add(asyncEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @CalledByNative
    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    public static List<Event> getMatchingCompletedEventsForTesting(String str) {
        synchronized (sLock) {
            try {
                ArrayList arrayList = new ArrayList();
                if (!enabled()) {
                    return arrayList;
                }
                for (Event event : sEvents) {
                    if (event.mName.equals(str)) {
                        arrayList.add(event);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void maybeEnableInBrowserProcess() {
        boolean z;
        ThreadUtils.assertOnUiThread();
        if (sState != 0) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            boolean z2 = true;
            if (CommandLine.getInstance().hasSwitch(TRACE_STARTUP_SWITCH)) {
                z = true;
            } else {
                try {
                    z = new File(TRACE_CONFIG_FILENAME).exists();
                } catch (SecurityException unused) {
                    z = false;
                }
            }
            if (ContextUtils.getAppSharedPreferences().getBoolean(BACKGROUND_STARTUP_TRACING_ENABLED_KEY, false)) {
                if (!z) {
                    sCachedBackgroundStartupTracingFlag = true;
                    if (z2) {
                        return;
                    }
                    enable();
                    return;
                }
                setBackgroundStartupTracingFlag(false);
                sCachedBackgroundStartupTracingFlag = false;
            }
            z2 = z;
            if (z2) {
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void onCommandLineAvailableInChildProcess() {
        if (sEnabledInChildProcessBeforeCommandLine) {
            synchronized (sLock) {
                try {
                    if (!CommandLine.getInstance().hasSwitch(TRACE_EARLY_JAVA_IN_CHILD_SWITCH)) {
                        reset();
                    } else {
                        if (sState == 0) {
                            enable();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void reset() {
        synchronized (sLock) {
            sState = 0;
            sEvents = null;
            sAsyncEvents = null;
        }
    }

    @CalledByNative
    public static void setBackgroundStartupTracingFlag(boolean z) {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            ContextUtils.getAppSharedPreferences().edit().putBoolean(BACKGROUND_STARTUP_TRACING_ENABLED_KEY, z).apply();
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void startAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, true);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sAsyncEvents.add(asyncEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void startupActivityStart(long j, long j2) {
        ActivityStartupEvent activityStartupEvent = new ActivityStartupEvent(j, j2);
        synchronized (sLock) {
            sActivityStartupEvents.add(activityStartupEvent);
        }
    }

    public static void startupLaunchCause(long j, int i) {
        ActivityLaunchCauseEvent activityLaunchCauseEvent = new ActivityLaunchCauseEvent(j, i);
        synchronized (sLock) {
            sActivityLaunchCauseEvents.add(activityLaunchCauseEvent);
        }
    }
}
