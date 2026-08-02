package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes11.dex */
public final class ck6 implements q {
    public final /* synthetic */ dk6 a;

    public ck6(dk6 dk6Var) {
        this.a = dk6Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        dk6 dk6Var = this.a;
        pey peyVar2 = dk6Var.a;
        if (peyVar2.getLifecycle().b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            peyVar2.getLifecycle().d(this);
            bk6 bk6Var = dk6Var.b;
            if (bk6Var != null) {
                bvf0.j(bk6Var, null);
            }
            dk6Var.b = null;
        }
    }
}
