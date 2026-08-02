package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: ActivityLifecycleCallback.kt */
/* loaded from: classes4.dex */
public final class aa0 implements Application.ActivityLifecycleCallbacks {
    public final x90 b;
    public final y90 c;
    public final svz d;
    public final com.vk.movika.sdk.base.logic.interactor.f e;
    public final z90 f;
    public final azt g;

    public aa0(svz svzVar, azt aztVar) {
        x90 x90Var = new x90(0);
        y90 y90Var = new y90(0);
        com.vk.movika.sdk.base.logic.interactor.f fVar = new com.vk.movika.sdk.base.logic.interactor.f(1);
        z90 z90Var = new z90(0);
        this.b = x90Var;
        this.c = y90Var;
        this.d = svzVar;
        this.e = fVar;
        this.f = z90Var;
        this.g = aztVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b.getClass();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.g.invoke(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.e.getClass();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.d.invoke(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.c.getClass();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f.getClass();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
