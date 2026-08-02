package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class jdf0 extends iqh implements o8j0, vff0 {
    public vwc b;
    public final /* synthetic */ kdf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdf0(kdf0 kdf0Var, String str, w920 w920Var, hfy hfyVar) {
        super(w920Var);
        this.c = kdf0Var;
        xwc xwcVar = kdf0Var.b;
        z83.g(null, xwcVar.a, Looper.myLooper());
        this.b = new vwc(xwcVar, str, this, hfyVar);
        kdf0Var.c.a(this);
    }

    @Override // defpackage.vff0
    public final void b() {
        vwc vwcVar = this.b;
        if (vwcVar != null) {
            vwcVar.cancel();
            this.b = null;
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        kdf0 kdf0Var = this.c;
        z83.g(null, kdf0Var.a, Looper.myLooper());
        kdf0Var.c.c(this);
        vwc vwcVar = this.b;
        if (vwcVar != null) {
            vwcVar.cancel();
            this.b = null;
        }
    }

    @Override // defpackage.iqh, defpackage.w920
    public final boolean e(ngz ngzVar) {
        if (!this.a.e(ngzVar)) {
            return false;
        }
        this.c.c.c(this);
        return true;
    }

    @Override // defpackage.iqh, defpackage.w920
    public final void g(Object obj) {
        this.c.c.c(this);
        super.g(obj);
    }
}
