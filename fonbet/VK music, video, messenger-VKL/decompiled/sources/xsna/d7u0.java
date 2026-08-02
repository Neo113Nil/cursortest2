package xsna;

import xsna.q630;

/* compiled from: VkAdBanner.kt */
/* loaded from: classes5.dex */
public final class d7u0 implements loy {
    public final /* synthetic */ String a;
    public final /* synthetic */ wjo0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nmo0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ izs<Integer, s3q0> g;
    public final /* synthetic */ nmo0 h;
    public final /* synthetic */ int i;

    /* JADX WARN: Multi-variable type inference failed */
    public d7u0(String str, wjo0 wjo0Var, String str2, nmo0 nmo0Var, int i, int i2, izs<? super Integer, s3q0> izsVar, nmo0 nmo0Var2, int i3) {
        this.a = str;
        this.b = wjo0Var;
        this.c = str2;
        this.d = nmo0Var;
        this.e = i;
        this.f = i2;
        this.g = izsVar;
        this.h = nmo0Var2;
        this.i = i3;
    }

    @Override // xsna.q630.b, xsna.q630
    public final <R> R a(R r, wzs<? super R, ? super q630.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // xsna.loy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        int i;
        int i2 = 0;
        long b = s6j.b(0, o6j.i(j), 0, 0, 13);
        String str = this.a;
        if (str != null) {
            i2 = wjo0.a(this.b, str, this.h, this.i, b, 972).b.f;
        }
        int i3 = wjo0.a(this.b, this.c, this.d, this.e, b, 972).b.f + i2;
        int i4 = this.f;
        if (i3 > i4) {
            i = i4 - i2;
            if (i < 1) {
                i = 1;
            }
        } else {
            i = this.e;
        }
        this.g.invoke(Integer.valueOf(i));
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new vhs0(N, 5));
    }

    @Override // xsna.loy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.Z(i);
    }

    @Override // xsna.loy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.M(i);
    }

    @Override // xsna.loy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.j0(i);
    }

    @Override // xsna.loy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.l0(i);
    }
}
