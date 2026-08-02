package defpackage;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ckd implements yf10, nmm {
    public final Object a;
    public xf10 b;
    public mmm c;
    public final /* synthetic */ ekd w;

    public ckd(ekd ekdVar, Object obj) {
        this.w = ekdVar;
        this.b = ekdVar.a(null);
        this.c = new mmm(ekdVar.w.c, 0, null);
        this.a = obj;
    }

    public final boolean a(int i, sf10 sf10Var) {
        sf10 sf10Var2;
        Object obj = this.a;
        ekd ekdVar = this.w;
        if (sf10Var != null) {
            sf10Var2 = ekdVar.h(obj, sf10Var);
            if (sf10Var2 == null) {
                return false;
            }
        } else {
            sf10Var2 = null;
        }
        int j = ekdVar.j(i, obj);
        xf10 xf10Var = this.b;
        if (xf10Var.a != j || !Objects.equals(xf10Var.b, sf10Var2)) {
            this.b = new xf10(ekdVar.c.c, j, sf10Var2);
        }
        mmm mmmVar = this.c;
        if (mmmVar.a == j && Objects.equals(mmmVar.b, sf10Var2)) {
            return true;
        }
        this.c = new mmm(ekdVar.w.c, j, sf10Var2);
        return true;
    }

    public final he10 b(he10 he10Var, sf10 sf10Var) {
        long j = he10Var.f;
        ekd ekdVar = this.w;
        Object obj = this.a;
        long i = ekdVar.i(j, obj);
        long j2 = he10Var.g;
        long i2 = ekdVar.i(j2, obj);
        return (i == j && i2 == j2) ? he10Var : new he10(he10Var.a, he10Var.b, he10Var.c, he10Var.d, he10Var.e, i, i2);
    }

    @Override // defpackage.yf10
    public final void onDownstreamFormatChanged(int i, sf10 sf10Var, he10 he10Var) {
        if (a(i, sf10Var)) {
            xf10 xf10Var = this.b;
            he10 b = b(he10Var, sf10Var);
            xf10Var.getClass();
            xf10Var.a(new h2r(14, xf10Var, b));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmKeysLoaded(int i, sf10 sf10Var) {
        if (a(i, sf10Var)) {
            this.c.a();
        }
    }

    @Override // defpackage.nmm
    public final void onDrmKeysRemoved(int i, sf10 sf10Var) {
        if (a(i, sf10Var)) {
            this.c.b();
        }
    }

    @Override // defpackage.nmm
    public final void onDrmKeysRestored(int i, sf10 sf10Var) {
        if (a(i, sf10Var)) {
            this.c.c();
        }
    }

    @Override // defpackage.nmm
    public final void onDrmSessionAcquired(int i, sf10 sf10Var, int i2) {
        if (a(i, sf10Var)) {
            this.c.d(i2);
        }
    }

    @Override // defpackage.nmm
    public final void onDrmSessionManagerError(int i, sf10 sf10Var, Exception exc) {
        if (a(i, sf10Var)) {
            this.c.e(exc);
        }
    }

    @Override // defpackage.nmm
    public final void onDrmSessionReleased(int i, sf10 sf10Var) {
        if (a(i, sf10Var)) {
            this.c.f();
        }
    }

    @Override // defpackage.yf10
    public final void onLoadCanceled(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        if (a(i, sf10Var)) {
            xf10 xf10Var = this.b;
            he10 b = b(he10Var, sf10Var);
            xf10Var.getClass();
            xf10Var.a(new vf10(xf10Var, uwyVar, b, 1));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadCompleted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        if (a(i, sf10Var)) {
            xf10 xf10Var = this.b;
            he10 b = b(he10Var, sf10Var);
            xf10Var.getClass();
            xf10Var.a(new vf10(xf10Var, uwyVar, b, 0));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadError(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        if (a(i, sf10Var)) {
            xf10 xf10Var = this.b;
            he10 b = b(he10Var, sf10Var);
            xf10Var.getClass();
            xf10Var.a(new a5h(xf10Var, uwyVar, b, iOException, z));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadStarted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, int i2) {
        if (a(i, sf10Var)) {
            xf10 xf10Var = this.b;
            he10 b = b(he10Var, sf10Var);
            xf10Var.getClass();
            xf10Var.a(new z4h(xf10Var, uwyVar, b, i2, 2));
        }
    }

    @Override // defpackage.yf10
    public final void onUpstreamDiscarded(int i, sf10 sf10Var, he10 he10Var) {
        if (a(i, sf10Var)) {
            xf10 xf10Var = this.b;
            he10 b = b(he10Var, sf10Var);
            sf10 sf10Var2 = xf10Var.b;
            sf10Var2.getClass();
            xf10Var.a(new t26(14, xf10Var, sf10Var2, b));
        }
    }
}
