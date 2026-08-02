package xsna;

import xsna.hr90;
import xsna.kw40;

/* compiled from: MusicPlayerPauseEventComposer.kt */
/* loaded from: classes3.dex */
public final class cy40 extends u96 {
    public final q520 c = new q520(4);

    @Override // xsna.u96
    public final izs<Integer, Boolean> f() {
        return this.c;
    }

    public final kw40.a g(nw40 nw40Var) {
        hr90 hr90Var;
        mw40 e = e(nw40Var);
        int i = nw40Var.c;
        if (i == 1) {
            hr90Var = hr90.c.a;
        } else if (i != 6) {
            if (i != 12) {
                if (i == 27) {
                    hr90Var = hr90.a.a;
                } else if (i == 29) {
                    hr90Var = hr90.e.a;
                } else if (i == 38 || i == 3 || i == 4) {
                    hr90Var = hr90.d.a;
                } else {
                    if (i != 8) {
                        if (i != 9) {
                            switch (i) {
                                case 14:
                                    break;
                                case 15:
                                case 16:
                                    break;
                                case 17:
                                case 18:
                                case 19:
                                    long j = nw40Var.a;
                                    long j2 = nw40Var.e;
                                    hr90Var = new hr90.g(0, ((j2 != Long.MAX_VALUE ? j2 < j : j < nw40Var.b) ? 0 : 1) ^ 1);
                                    break;
                                case 20:
                                case 22:
                                case 24:
                                    hr90Var = new hr90.g(1, 0);
                                    break;
                                case 21:
                                case 23:
                                case 25:
                                    hr90Var = new hr90.g(1, 1);
                                    break;
                                default:
                                    bn40.f(lhg.a(i, "Unknown action trigger for a pause event: "));
                                    hr90Var = hr90.i.a;
                                    break;
                            }
                        } else {
                            hr90Var = hr90.j.a;
                        }
                    }
                    hr90Var = hr90.f.a;
                }
            }
            hr90Var = hr90.h.a;
        } else {
            hr90Var = hr90.b.a;
        }
        return new kw40.a(e, hr90Var);
    }
}
