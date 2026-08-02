package defpackage;

import com.yandex.go.feedsdk.lifecycle.a;

/* loaded from: classes.dex */
public abstract class fkr extends m230 {
    public u45 E;
    public w0j F;

    public fkr() {
        super(null);
    }

    @Override // defpackage.m230, defpackage.h55
    public void H(Object obj) {
        super.H(obj);
        this.E = null;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        this.F = null;
    }

    @Override // defpackage.m230
    public final void R(u45 u45Var) {
        w0j w0jVar = this.F;
        if (w0jVar != null) {
            w0jVar.a();
        }
        this.F = null;
        this.E = u45Var;
        this.F = a.a(u45Var, this);
    }

    public void T(cgl0 cgl0Var) {
        u45 u45Var = this.E;
        if (u45Var != null) {
            P().f(u45Var, new qpo(13, this, cgl0Var));
        }
    }
}
