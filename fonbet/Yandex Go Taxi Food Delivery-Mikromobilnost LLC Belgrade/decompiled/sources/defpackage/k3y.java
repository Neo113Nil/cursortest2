package defpackage;

import kotlin.a;

/* loaded from: classes8.dex */
public final class k3y implements yf7 {
    public final d5j0 a;
    public final i3y b;

    public k3y(d5j0 d5j0Var, xf7 xf7Var) {
        this.a = d5j0Var;
        this.b = a.a(new ou(28, xf7Var, this));
    }

    @Override // defpackage.yf7
    public final void I(al7 al7Var) {
        a().I(al7Var);
    }

    public final yf7 a() {
        return (yf7) this.b.getValue();
    }

    @Override // defpackage.yf7
    public final void cancel() {
        a().cancel();
    }

    @Override // defpackage.yf7
    public final yf7 clone() {
        return new k3y(this.a, new ynt(1, this));
    }

    @Override // defpackage.yf7
    public final kvj0 execute() {
        return a().execute();
    }

    @Override // defpackage.yf7
    public final d5j0 k() {
        return this.a;
    }

    @Override // defpackage.yf7
    public final boolean n() {
        return a().n();
    }

    @Override // defpackage.yf7
    public final ydz0 timeout() {
        return a().timeout();
    }
}
