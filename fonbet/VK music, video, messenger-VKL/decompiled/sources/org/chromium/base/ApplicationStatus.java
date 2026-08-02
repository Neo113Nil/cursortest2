package org.chromium.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.view.Window;
import internal.org.jni_zero.CalledByNative;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ApplicationStatus {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String CACHE_ACTIVITY_TASKID_KEY = "cache_activity_taskid_enabled";
    private static final String TOOLBAR_CALLBACK_WRAPPER_CLASS = "androidx.appcompat.app.ToolbarActionBar$ToolbarCallbackWrapper";

    @SuppressLint({"StaticFieldLeak"})
    private static Activity sActivity;
    private static ObserverList<ApplicationStateListener> sApplicationStateListeners;
    private static ObserverList<ActivityStateListener> sGeneralActivityStateListeners;
    private static ApplicationStateListener sNativeApplicationStateListener;
    private static ObserverList<TaskVisibilityListener> sTaskVisibilityListeners;
    private static ObserverList<WindowFocusChangedListener> sWindowFocusListeners;
    private static final Map<Activity, ActivityInfo> sActivityInfo = Collections.synchronizedMap(new HashMap());
    public static final Map<Activity, Integer> sActivityTaskId = Collections.synchronizedMap(new HashMap());

    @SuppressLint({"SupportAnnotationUsage"})
    private static int sCurrentApplicationState = 0;

    public static class ActivityInfo {
        private final ObserverList<ActivityStateListener> mListeners;
        private int mStatus;

        public /* synthetic */ ActivityInfo(int i) {
            this();
        }

        public ObserverList<ActivityStateListener> getListeners() {
            return this.mListeners;
        }

        public int getStatus() {
            return this.mStatus;
        }

        public void setStatus(int i) {
            this.mStatus = i;
        }

        private ActivityInfo() {
            this.mStatus = 6;
            this.mListeners = new ObserverList<>();
        }
    }

    public interface ActivityStateListener {
        void onActivityStateChange(Activity activity, int i);
    }

    public interface ApplicationStateListener {
        void onApplicationStateChange(int i);
    }

    public interface Natives {
        void onApplicationStateChange(int i);
    }

    public interface TaskVisibilityListener {
        void onTaskVisibilityChanged(int i, boolean z);
    }

    public static class WindowCallbackProxy implements InvocationHandler {
        private final Activity mActivity;
        private final Window.Callback mCallback;

        public WindowCallbackProxy(Activity activity, Window.Callback callback) {
            this.mCallback = callback;
            this.mActivity = activity;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getName().equals("onWindowFocusChanged") && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Boolean) {
                    onWindowFocusChanged(((Boolean) obj2).booleanValue());
                    return null;
                }
            }
            try {
                return method.invoke(this.mCallback, objArr);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof AbstractMethodError) {
                    throw e.getCause();
                }
                throw e;
            }
        }

        public void onWindowFocusChanged(boolean z) {
            this.mCallback.onWindowFocusChanged(z);
            if (ApplicationStatus.sWindowFocusListeners != null) {
                Iterator it = ApplicationStatus.sWindowFocusListeners.iterator();
                while (it.hasNext()) {
                    ((WindowFocusChangedListener) it.next()).onWindowFocusChanged(this.mActivity, z);
                }
            }
        }
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(Activity activity, boolean z);
    }

    private ApplicationStatus() {
    }

    public static boolean cleanupInvalidTask(int i) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Activity, Integer> entry : sActivityTaskId.entrySet()) {
            if (i == entry.getValue().intValue()) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            onStateChange((Activity) it.next(), 6);
        }
        return !arrayList.isEmpty();
    }

    public static Window.Callback createWindowCallbackProxy(Activity activity, Window.Callback callback) {
        return (Window.Callback) Proxy.newProxyInstance(Window.Callback.class.getClassLoader(), new Class[]{Window.Callback.class}, new WindowCallbackProxy(activity, callback));
    }

    public static void destroyForJUnitTests() {
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            try {
                ObserverList<ApplicationStateListener> observerList = sApplicationStateListeners;
                if (observerList != null) {
                    observerList.clear();
                }
                ObserverList<ActivityStateListener> observerList2 = sGeneralActivityStateListeners;
                if (observerList2 != null) {
                    observerList2.clear();
                }
                ObserverList<TaskVisibilityListener> observerList3 = sTaskVisibilityListeners;
                if (observerList3 != null) {
                    observerList3.clear();
                }
                map.clear();
                sActivityTaskId.clear();
                ObserverList<WindowFocusChangedListener> observerList4 = sWindowFocusListeners;
                if (observerList4 != null) {
                    observerList4.clear();
                }
                sCurrentApplicationState = 0;
                sActivity = null;
                sNativeApplicationStateListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int determineApplicationStateLocked() {
        Iterator<ActivityInfo> it = sActivityInfo.values().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            int status = it.next().getStatus();
            if (status != 4 && status != 5 && status != 6) {
                return 1;
            }
            if (status == 4) {
                z = true;
            } else if (status == 5) {
                z2 = true;
            }
        }
        if (z) {
            return 2;
        }
        return z2 ? 3 : 4;
    }

    public static int getApplicationStateListenerCountForTesting() {
        ObserverList<ApplicationStateListener> observerList = sApplicationStateListeners;
        if (observerList == null) {
            return 0;
        }
        return observerList.size();
    }

    public static Activity getLastTrackedFocusedActivity() {
        return sActivity;
    }

    public static List<Activity> getRunningActivities() {
        ArrayList arrayList;
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            arrayList = new ArrayList(map.keySet());
        }
        return arrayList;
    }

    public static int getStateForActivity(Activity activity) {
        ActivityInfo activityInfo;
        if (activity == null || (activityInfo = sActivityInfo.get(activity)) == null) {
            return 6;
        }
        return activityInfo.getStatus();
    }

    @CalledByNative
    public static int getStateForApplication() {
        int i;
        synchronized (sActivityInfo) {
            i = sCurrentApplicationState;
        }
        return i;
    }

    public static int getTaskId(Activity activity) {
        if (!isCachingEnabled()) {
            return activity.getTaskId();
        }
        Map<Activity, Integer> map = sActivityTaskId;
        if (!map.containsKey(activity)) {
            synchronized (map) {
                map.put(activity, Integer.valueOf(activity.getTaskId()));
            }
        }
        return map.get(activity).intValue();
    }

    @CalledByNative
    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    public static void initialize(Application application) {
        synchronized (sActivityInfo) {
            sCurrentApplicationState = 4;
        }
        registerWindowFocusChangedListener(new WindowFocusChangedListener() { // from class: org.chromium.base.ApplicationStatus.1
            @Override // org.chromium.base.ApplicationStatus.WindowFocusChangedListener
            public void onWindowFocusChanged(Activity activity, boolean z) {
                int stateForActivity;
                if (!z || activity == ApplicationStatus.sActivity || (stateForActivity = ApplicationStatus.getStateForActivity(activity)) == 6 || stateForActivity == 5) {
                    return;
                }
                ApplicationStatus.sActivity = activity;
            }
        });
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksAdapter() { // from class: org.chromium.base.ApplicationStatus.2
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // org.chromium.base.ActivityLifecycleCallbacksAdapter
            public void onStateChanged(Activity activity, int i) {
                if (i == 1) {
                    activity.getWindow().setCallback(ApplicationStatus.createWindowCallbackProxy(activity, activity.getWindow().getCallback()));
                }
                ApplicationStatus.onStateChange(activity, i);
            }
        });
    }

    public static boolean isCachingEnabled() {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            boolean z = ContextUtils.getAppSharedPreferences().getBoolean(CACHE_ACTIVITY_TASKID_KEY, false);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return z;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean isEveryActivityDestroyed() {
        return sActivityInfo.isEmpty();
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (sActivityInfo) {
            z = sCurrentApplicationState != 0;
        }
        return z;
    }

    public static boolean isTaskVisible(int i) {
        int status;
        for (Map.Entry<Activity, ActivityInfo> entry : sActivityInfo.entrySet()) {
            if (getTaskId(entry.getKey()) == i && ((status = entry.getValue().getStatus()) == 3 || status == 4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onStateChange(Activity activity, int i) {
        ActivityInfo activityInfo;
        ObserverList<ApplicationStateListener> observerList;
        ObserverList<TaskVisibilityListener> observerList2;
        if (sActivity == null || i == 1 || i == 3 || i == 2) {
            sActivity = activity;
        }
        int stateForApplication = getStateForApplication();
        boolean isTaskVisible = isTaskVisible(getTaskId(activity));
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            if (i == 1) {
                try {
                    map.put(activity, new ActivityInfo(0));
                } finally {
                }
            }
            activityInfo = map.get(activity);
            activityInfo.setStatus(i);
            if (i == 6) {
                map.remove(activity);
                if (activity == sActivity) {
                    sActivity = null;
                }
            }
            sCurrentApplicationState = determineApplicationStateLocked();
        }
        Iterator<ActivityStateListener> it = activityInfo.getListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityStateChange(activity, i);
        }
        ObserverList<ActivityStateListener> observerList3 = sGeneralActivityStateListeners;
        if (observerList3 != null) {
            Iterator<ActivityStateListener> it2 = observerList3.iterator();
            while (it2.hasNext()) {
                it2.next().onActivityStateChange(activity, i);
            }
        }
        boolean isTaskVisible2 = isTaskVisible(getTaskId(activity));
        if (isTaskVisible2 != isTaskVisible && (observerList2 = sTaskVisibilityListeners) != null) {
            Iterator<TaskVisibilityListener> it3 = observerList2.iterator();
            while (it3.hasNext()) {
                it3.next().onTaskVisibilityChanged(getTaskId(activity), isTaskVisible2);
            }
        }
        int stateForApplication2 = getStateForApplication();
        if (stateForApplication2 != stateForApplication && (observerList = sApplicationStateListeners) != null) {
            Iterator<ApplicationStateListener> it4 = observerList.iterator();
            while (it4.hasNext()) {
                it4.next().onApplicationStateChange(stateForApplication2);
            }
        }
        Map<Activity, Integer> map2 = sActivityTaskId;
        synchronized (map2) {
            if (i == 6) {
                try {
                    map2.remove(activity);
                } finally {
                }
            }
        }
    }

    public static void onStateChangeForTesting(Activity activity, int i) {
        onStateChange(activity, i);
    }

    public static boolean reachesWindowCallback(Window.Callback callback) {
        if (callback == null) {
            return false;
        }
        if (callback.getClass().getName().equals(TOOLBAR_CALLBACK_WRAPPER_CLASS)) {
            return true;
        }
        if (Proxy.isProxyClass(callback.getClass())) {
            return Proxy.getInvocationHandler(callback) instanceof WindowCallbackProxy;
        }
        for (Class<?> cls = callback.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().isAssignableFrom(Window.Callback.class)) {
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        Window.Callback callback2 = (Window.Callback) field.get(callback);
                        field.setAccessible(isAccessible);
                        if (reachesWindowCallback(callback2)) {
                            return true;
                        }
                    } catch (IllegalAccessException unused) {
                        field.setAccessible(isAccessible);
                    } catch (Throwable th) {
                        field.setAccessible(isAccessible);
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public static void registerApplicationStateListener(ApplicationStateListener applicationStateListener) {
        if (sApplicationStateListeners == null) {
            sApplicationStateListeners = new ObserverList<>();
        }
        sApplicationStateListeners.addObserver(applicationStateListener);
    }

    @SuppressLint({"NewApi"})
    public static void registerStateListenerForActivity(ActivityStateListener activityStateListener, Activity activity) {
        sActivityInfo.get(activity).getListeners().addObserver(activityStateListener);
    }

    public static void registerStateListenerForAllActivities(ActivityStateListener activityStateListener) {
        if (sGeneralActivityStateListeners == null) {
            sGeneralActivityStateListeners = new ObserverList<>();
        }
        sGeneralActivityStateListeners.addObserver(activityStateListener);
    }

    public static void registerTaskVisibilityListener(TaskVisibilityListener taskVisibilityListener) {
        if (sTaskVisibilityListeners == null) {
            sTaskVisibilityListeners = new ObserverList<>();
        }
        sTaskVisibilityListeners.addObserver(taskVisibilityListener);
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: org.chromium.base.ApplicationStatus.3
            @Override // java.lang.Runnable
            public void run() {
                if (ApplicationStatus.sNativeApplicationStateListener != null) {
                    return;
                }
                ApplicationStatus.sNativeApplicationStateListener = new ApplicationStateListener() { // from class: org.chromium.base.ApplicationStatus.3.1
                    @Override // org.chromium.base.ApplicationStatus.ApplicationStateListener
                    public void onApplicationStateChange(int i) {
                        ApplicationStatusJni.get().onApplicationStateChange(i);
                    }
                };
                ApplicationStatus.registerApplicationStateListener(ApplicationStatus.sNativeApplicationStateListener);
            }
        });
    }

    public static void registerWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        if (sWindowFocusListeners == null) {
            sWindowFocusListeners = new ObserverList<>();
        }
        sWindowFocusListeners.addObserver(windowFocusChangedListener);
    }

    public static void resetActivitiesForInstrumentationTests() {
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            try {
                Iterator it = new HashSet(map.keySet()).iterator();
                while (it.hasNext()) {
                    onStateChangeForTesting((Activity) it.next(), 6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setCachingEnabled(boolean z) {
        ContextUtils.getAppSharedPreferences().edit().putBoolean(CACHE_ACTIVITY_TASKID_KEY, z).apply();
    }

    public static void unregisterActivityStateListener(ActivityStateListener activityStateListener) {
        ObserverList<ActivityStateListener> observerList = sGeneralActivityStateListeners;
        if (observerList != null) {
            observerList.removeObserver(activityStateListener);
        }
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            try {
                Iterator<ActivityInfo> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().getListeners().removeObserver(activityStateListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void unregisterApplicationStateListener(ApplicationStateListener applicationStateListener) {
        ObserverList<ApplicationStateListener> observerList = sApplicationStateListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(applicationStateListener);
    }

    public static void unregisterTaskVisibilityListener(TaskVisibilityListener taskVisibilityListener) {
        ObserverList<TaskVisibilityListener> observerList = sTaskVisibilityListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(taskVisibilityListener);
    }

    public static void unregisterWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        ObserverList<WindowFocusChangedListener> observerList = sWindowFocusListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(windowFocusChangedListener);
    }
}
