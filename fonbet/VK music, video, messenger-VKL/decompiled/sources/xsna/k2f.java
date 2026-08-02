package xsna;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;
import xsna.l2f;

/* compiled from: ClipsScreenSpinnerDialog.kt */
/* loaded from: classes17.dex */
public final class k2f extends ja0 {
    public final /* synthetic */ l2f.a b;

    public k2f(l2f.a aVar) {
        this.b = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        l2f l2fVar;
        Application application;
        l2f.a aVar = this.b;
        WeakReference<Activity> weakReference = aVar.e;
        if (epx.f(weakReference.get(), activity)) {
            try {
                aVar.g.removeCallbacksAndMessages(null);
                Activity activity2 = weakReference.get();
                if (activity2 != null && (application = activity2.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(aVar.h);
                }
                l2f l2fVar2 = aVar.f;
                if (l2fVar2 != null && l2fVar2.isShowing() && (l2fVar = aVar.f) != null) {
                    l2fVar.n();
                }
            } catch (Throwable unused) {
            }
            aVar.f = null;
        }
    }
}
