package xsna;

import android.app.Activity;

/* compiled from: MultiWindowDelegate.kt */
/* loaded from: classes7.dex */
public final class a740 implements z640 {
    public final q090 a;

    public a740(q090 q090Var) {
        this.a = q090Var;
    }

    @Override // xsna.z640
    public final boolean a() {
        Activity activity = (Activity) this.a.invoke();
        return activity != null && activity.isInMultiWindowMode();
    }
}
