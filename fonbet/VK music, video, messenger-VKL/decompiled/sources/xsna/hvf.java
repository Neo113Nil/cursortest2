package xsna;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class hvf implements loy {
    @Override // xsna.loy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        float j1 = ep10Var.j1(o6j.h(j));
        int r0 = ep10Var.r0(pco.a(j1, kuo0.l) >= 0 ? vuo0.b : pco.a(j1, kuo0.m) >= 0 ? kuo0.n : kuo0.o);
        if (!((r0 >= 0) & (r0 >= 0))) {
            wzw.a("width and height must be >= 0");
        }
        tra0 N = zo10Var.N(s6j.h(r0, r0, r0, r0));
        return ep10Var.Q(N.b, N.c, jgp.b, new op1(N, 28));
    }
}
