package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes10.dex */
public final class f implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ f(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                j18Var.resumeWith(zy11Var);
                break;
            default:
                j18Var.resumeWith(zy11Var);
                break;
        }
    }
}
