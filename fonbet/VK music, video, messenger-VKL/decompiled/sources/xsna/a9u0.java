package xsna;

import android.app.Activity;

/* compiled from: VkAppCallback.kt */
/* loaded from: classes6.dex */
public final class a9u0 extends ja0 {
    public final /* synthetic */ z8u0 b;

    public a9u0(z8u0 z8u0Var) {
        this.b = z8u0Var;
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        z8u0 z8u0Var = this.b;
        if (activity.equals(z8u0Var.e)) {
            z8u0Var.A.f();
        }
    }
}
