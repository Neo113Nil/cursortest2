package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes11.dex */
public final class dk6 {
    public final pey a;
    public bk6 b;

    public dk6(pey peyVar) {
        this.a = peyVar;
    }

    public final tse a() {
        bk6 bk6Var = this.b;
        if (bk6Var != null) {
            return bk6Var;
        }
        pey peyVar = this.a;
        if (!peyVar.getLifecycle().b().a(Lifecycle.State.CREATED)) {
            ny61.r("Trying to access brickScope in detached state");
            return null;
        }
        bk6 bk6Var2 = new bk6();
        this.b = bk6Var2;
        peyVar.getLifecycle().a(new ck6(this));
        return bk6Var2;
    }
}
