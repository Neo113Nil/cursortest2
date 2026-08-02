package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AppStateTracker.kt */
/* loaded from: classes11.dex */
public final class w93 extends ja0 {
    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object obj;
        WeakReference<Activity> weakReference;
        Activity activity2;
        ArrayList arrayList = x93.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Object obj2 = ((WeakReference) obj).get();
            WeakReference<Activity> weakReference2 = x93.c;
            if (epx.f(obj2, weakReference2 != null ? weakReference2.get() : null)) {
                break;
            }
        }
        if (obj == null && (weakReference = x93.c) != null && (activity2 = weakReference.get()) != null) {
            arrayList.add(new WeakReference(activity2));
        }
        x93.c = null;
        x93.b = true;
        x93.a.removeCallbacksAndMessages(null);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Handler handler = x93.a;
        x93.c = new WeakReference<>(activity);
        if (x93.b || activity.isTaskRoot()) {
            L.p("==== APP IN FOREGROUND ====");
            x93.b = false;
            x93.a.removeCallbacksAndMessages(null);
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }
}
