package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.taxi.order.y;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public abstract class j76 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    public static final void a(sh0 sh0Var, fid fidVar, int i) {
        int i2;
        ?? r4;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1071932044);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z2 = sh0Var.a;
            c530 c530Var = c530.a;
            f530 b = z2 ? ljs0.c : ljs0.b(c530Var, 0.0f, 240.0f, 1);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(an91.m(ljs0.q(c530Var, 160.0f), 16.0f, 0.0f, 2), 28.0f), null, false, null, null, null, false, btsVar, 6, 254);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(an91.m(ljs0.q(c530Var, 280.0f), 16.0f, 0.0f, 2), 20.0f), null, false, null, null, null, false, btsVar, 6, 254);
            if (sh0Var.a) {
                btsVar.e0(1815405516);
                z = true;
                oeb1.c(btsVar, new x2y(1.0f, true));
                btsVar.t(false);
            } else {
                z = true;
                btsVar.e0(1815455488);
                btsVar.t(false);
            }
            btsVar.t(z);
            r4 = z;
        } else {
            r4 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(sh0Var, i, r4);
        }
    }

    public static final void b(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i) {
        f530 f530Var2;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar2;
        jt1 jt1Var3;
        float f3;
        wec wecVar3;
        nhe nheVar3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1901539346);
        int i2 = i | 93622;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jt1Var3 = x4c.y;
                c36 c36Var = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                c530 c530Var = c530.a;
                f3 = 1.0f;
                wecVar3 = c36Var;
                nheVar3 = mhe.b;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                jt1Var3 = jt1Var;
                nheVar3 = nheVar;
                f3 = f;
                wecVar3 = wecVar;
            }
            btsVar.u();
            jt1 jt1Var4 = jt1Var3;
            o4b1.b(mt71.m(wzg0.ic_attach_straight, 0, btsVar), null, f530Var3, jt1Var4, nheVar3, f3, wecVar3, btsVar, 224688, 0);
            f530Var2 = f530Var3;
            jt1Var2 = jt1Var4;
            nheVar2 = nheVar3;
            f2 = f3;
            wecVar2 = wecVar3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
            wecVar2 = wecVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dt11(f530Var2, jt1Var2, nheVar2, f2, wecVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i, int i2) {
        wec wecVar2;
        int i3;
        int i4;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar3;
        f530 f530Var2;
        aii0 v;
        wec wecVar4;
        jt1 jt1Var3;
        nhe nheVar3;
        float f3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1560427884);
        int i5 = i | 28086;
        if ((i2 & 32) == 0) {
            wecVar2 = wecVar;
            if (btsVar.k(wecVar2)) {
                i3 = 131072;
                i4 = i5 | i3;
                if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
                    btsVar.Y();
                    jt1Var2 = jt1Var;
                    nheVar2 = nheVar;
                    f2 = f;
                    wecVar3 = wecVar2;
                    f530Var2 = f530Var;
                } else {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        uo5 uo5Var = x4c.y;
                        int i6 = i2 & 32;
                        c530 c530Var = c530.a;
                        kl40 kl40Var = mhe.b;
                        if (i6 != 0) {
                            wecVar2 = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                            i4 &= -458753;
                        }
                        wecVar4 = wecVar2;
                        jt1Var3 = uo5Var;
                        nheVar3 = kl40Var;
                        f3 = 1.0f;
                        f530Var3 = c530Var;
                    } else {
                        btsVar.Y();
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        f530Var3 = f530Var;
                        jt1Var3 = jt1Var;
                        nheVar3 = nheVar;
                        f3 = f;
                        wecVar4 = wecVar2;
                    }
                    btsVar.u();
                    o4b1.b(mt71.m(wzg0.ic_chevron_right, 0, btsVar), null, f530Var3, jt1Var3, nheVar3, f3, wecVar4, btsVar, 224688 | ((i4 << 3) & 3670016), 0);
                    f530Var2 = f530Var3;
                    jt1Var2 = jt1Var3;
                    nheVar2 = nheVar3;
                    f2 = f3;
                    wecVar3 = wecVar4;
                }
                v = btsVar.v();
                if (v == null) {
                    v.d = new et11(f530Var2, jt1Var2, nheVar2, f2, wecVar3, i, i2, 0);
                    return;
                }
                return;
            }
        } else {
            wecVar2 = wecVar;
        }
        i3 = 65536;
        i4 = i5 | i3;
        if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i) {
        f530 f530Var2;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar2;
        jt1 jt1Var3;
        float f3;
        wec wecVar3;
        nhe nheVar3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-919041207);
        int i2 = i | 93622;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jt1Var3 = x4c.y;
                c36 c36Var = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                c530 c530Var = c530.a;
                f3 = 1.0f;
                wecVar3 = c36Var;
                nheVar3 = mhe.b;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                jt1Var3 = jt1Var;
                nheVar3 = nheVar;
                f3 = f;
                wecVar3 = wecVar;
            }
            btsVar.u();
            jt1 jt1Var4 = jt1Var3;
            o4b1.b(mt71.m(wzg0.ic_cross, 0, btsVar), null, f530Var3, jt1Var4, nheVar3, f3, wecVar3, btsVar, 224688, 0);
            f530Var2 = f530Var3;
            jt1Var2 = jt1Var4;
            nheVar2 = nheVar3;
            f2 = f3;
            wecVar2 = wecVar3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
            wecVar2 = wecVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dt11(f530Var2, jt1Var2, nheVar2, f2, wecVar2, i, 4);
        }
    }

    public static final void e(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i) {
        f530 f530Var2;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar2;
        jt1 jt1Var3;
        float f3;
        wec wecVar3;
        nhe nheVar3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(651481030);
        int i2 = i | 93622;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jt1Var3 = x4c.y;
                c36 c36Var = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                c530 c530Var = c530.a;
                f3 = 1.0f;
                wecVar3 = c36Var;
                nheVar3 = mhe.b;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                jt1Var3 = jt1Var;
                nheVar3 = nheVar;
                f3 = f;
                wecVar3 = wecVar;
            }
            btsVar.u();
            jt1 jt1Var4 = jt1Var3;
            o4b1.b(mt71.m(wzg0.ic_left, 0, btsVar), null, f530Var3, jt1Var4, nheVar3, f3, wecVar3, btsVar, 224688, 0);
            f530Var2 = f530Var3;
            jt1Var2 = jt1Var4;
            nheVar2 = nheVar3;
            f2 = f3;
            wecVar2 = wecVar3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
            wecVar2 = wecVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dt11(f530Var2, jt1Var2, nheVar2, f2, wecVar2, i, 2);
        }
    }

    public static final void f(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, c36 c36Var, fid fidVar, int i) {
        f530 f530Var2;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        jt1 jt1Var3;
        f530 f530Var3;
        nhe nheVar3;
        float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-668958430);
        int i2 = i | 28086 | (btsVar.k(c36Var) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jt1Var3 = x4c.y;
                f530Var3 = c530.a;
                nheVar3 = mhe.b;
                f3 = 1.0f;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                jt1Var3 = jt1Var;
                nheVar3 = nheVar;
                f3 = f;
            }
            btsVar.u();
            o4b1.b(mt71.m(wzg0.ic_lock, 0, btsVar), null, f530Var3, jt1Var3, nheVar3, f3, c36Var, btsVar, 224688 | ((i2 << 3) & 3670016), 0);
            f530Var2 = f530Var3;
            jt1Var2 = jt1Var3;
            nheVar2 = nheVar3;
            f2 = f3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new h3z0(f530Var2, jt1Var2, nheVar2, f2, c36Var, i);
        }
    }

    public static final void g(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i) {
        f530 f530Var2;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar2;
        jt1 jt1Var3;
        float f3;
        wec wecVar3;
        nhe nheVar3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1478126061);
        int i2 = i | 93622;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jt1Var3 = x4c.y;
                c36 c36Var = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                c530 c530Var = c530.a;
                f3 = 1.0f;
                wecVar3 = c36Var;
                nheVar3 = mhe.b;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                jt1Var3 = jt1Var;
                nheVar3 = nheVar;
                f3 = f;
                wecVar3 = wecVar;
            }
            btsVar.u();
            jt1 jt1Var4 = jt1Var3;
            o4b1.b(mt71.m(wzg0.ic_plus, 0, btsVar), null, f530Var3, jt1Var4, nheVar3, f3, wecVar3, btsVar, 224688, 0);
            f530Var2 = f530Var3;
            jt1Var2 = jt1Var4;
            nheVar2 = nheVar3;
            f2 = f3;
            wecVar2 = wecVar3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
            wecVar2 = wecVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dt11(f530Var2, jt1Var2, nheVar2, f2, wecVar2, i, 0);
        }
    }

    public static final void h(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i) {
        f530 f530Var2;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar2;
        jt1 jt1Var3;
        float f3;
        wec wecVar3;
        nhe nheVar3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(162167365);
        int i2 = i | 93622;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jt1Var3 = x4c.y;
                c36 c36Var = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                c530 c530Var = c530.a;
                f3 = 1.0f;
                wecVar3 = c36Var;
                nheVar3 = mhe.b;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                jt1Var3 = jt1Var;
                nheVar3 = nheVar;
                f3 = f;
                wecVar3 = wecVar;
            }
            btsVar.u();
            jt1 jt1Var4 = jt1Var3;
            o4b1.b(mt71.m(wzg0.ic_search, 0, btsVar), null, f530Var3, jt1Var4, nheVar3, f3, wecVar3, btsVar, 224688, 0);
            f530Var2 = f530Var3;
            jt1Var2 = jt1Var4;
            nheVar2 = nheVar3;
            f2 = f3;
            wecVar2 = wecVar3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
            wecVar2 = wecVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dt11(f530Var2, jt1Var2, nheVar2, f2, wecVar2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, int i, int i2) {
        wec wecVar2;
        int i3;
        int i4;
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        wec wecVar3;
        f530 f530Var2;
        aii0 v;
        wec wecVar4;
        jt1 jt1Var3;
        nhe nheVar3;
        float f3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2145496997);
        int i5 = i | 28086;
        if ((i2 & 32) == 0) {
            wecVar2 = wecVar;
            if (btsVar.k(wecVar2)) {
                i3 = 131072;
                i4 = i5 | i3;
                if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
                    btsVar.Y();
                    jt1Var2 = jt1Var;
                    nheVar2 = nheVar;
                    f2 = f;
                    wecVar3 = wecVar2;
                    f530Var2 = f530Var;
                } else {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        uo5 uo5Var = x4c.y;
                        int i6 = i2 & 32;
                        c530 c530Var = c530.a;
                        kl40 kl40Var = mhe.b;
                        if (i6 != 0) {
                            wecVar2 = new c36(((el51) btsVar.m(gl51.a)).j(), 5);
                            i4 &= -458753;
                        }
                        wecVar4 = wecVar2;
                        jt1Var3 = uo5Var;
                        nheVar3 = kl40Var;
                        f3 = 1.0f;
                        f530Var3 = c530Var;
                    } else {
                        btsVar.Y();
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        f530Var3 = f530Var;
                        jt1Var3 = jt1Var;
                        nheVar3 = nheVar;
                        f3 = f;
                        wecVar4 = wecVar2;
                    }
                    btsVar.u();
                    o4b1.b(mt71.m(wzg0.ic_star, 0, btsVar), null, f530Var3, jt1Var3, nheVar3, f3, wecVar4, btsVar, 224688 | ((i4 << 3) & 3670016), 0);
                    f530Var2 = f530Var3;
                    jt1Var2 = jt1Var3;
                    nheVar2 = nheVar3;
                    f2 = f3;
                    wecVar3 = wecVar4;
                }
                v = btsVar.v();
                if (v == null) {
                    v.d = new et11(f530Var2, jt1Var2, nheVar2, f2, wecVar3, i, i2, 1);
                    return;
                }
                return;
            }
        } else {
            wecVar2 = wecVar;
        }
        i3 = 65536;
        i4 = i5 | i3;
        if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static fag j(h6r h6rVar, String str, y yVar) {
        h6rVar.getClass();
        str.getClass();
        return new fag(h6rVar, str, yVar);
    }

    public static lg80 k(String str) {
        cg80 cg80Var = cg80.b;
        return str == null ? cg80Var : str.equals("navigator") ? eg80.b : str.equals("navigator_gas_stations") ? fg80.b : str.equals("discovery") ? cg80Var : str.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY) ? kg80.b : str.equals("advert") ? ag80.b : str.equals("ride_geosearch") ? hg80.b : new bg80(str);
    }
}
