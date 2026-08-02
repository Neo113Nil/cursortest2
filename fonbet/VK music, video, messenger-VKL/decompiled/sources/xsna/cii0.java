package xsna;

import java.util.List;

/* compiled from: SendPlayerStatsPlugin.kt */
/* loaded from: classes.dex */
public final class cii0 extends o56 implements pr4 {
    @Override // xsna.o56, xsna.kr4
    public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
        qr4.d(bgk0Var, ur4Var);
    }

    @Override // xsna.o56, xsna.kr4
    public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
        List<String> list = qr4.a;
        qr4.e(bgk0Var, ur4Var, ir4Var.z());
    }

    @Override // xsna.o56, xsna.kr4
    public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
        qr4.b(th);
    }

    @Override // xsna.pr4
    public final void u(ir4 ir4Var) {
        ir4Var.v(this);
    }
}
