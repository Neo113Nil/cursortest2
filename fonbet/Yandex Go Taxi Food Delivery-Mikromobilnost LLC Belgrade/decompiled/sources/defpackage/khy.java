package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes12.dex */
public final /* synthetic */ class khy implements zls {
    public final /* synthetic */ wp2 A;
    public final /* synthetic */ bms B;
    public final /* synthetic */ float C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ ety0 F;
    public final /* synthetic */ ety0 G;
    public final /* synthetic */ wp2 H;
    public final /* synthetic */ InputState I;
    public final /* synthetic */ wp2 J;
    public final /* synthetic */ bms K;
    public final /* synthetic */ bms L;
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ fhy c;
    public final /* synthetic */ ohy w;
    public final /* synthetic */ SlotSize x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ String z;

    public /* synthetic */ khy(oz40 oz40Var, fhy fhyVar, ohy ohyVar, SlotSize slotSize, boolean z, String str, wp2 wp2Var, bms bmsVar, float f, String str2, String str3, ety0 ety0Var, ety0 ety0Var2, wp2 wp2Var2, InputState inputState, wp2 wp2Var3, bms bmsVar2, bms bmsVar3, int i) {
        this.a = i;
        this.b = oz40Var;
        this.c = fhyVar;
        this.w = ohyVar;
        this.x = slotSize;
        this.y = z;
        this.z = str;
        this.A = wp2Var;
        this.B = bmsVar;
        this.C = f;
        this.D = str2;
        this.E = str3;
        this.F = ety0Var;
        this.G = ety0Var2;
        this.H = wp2Var2;
        this.I = inputState;
        this.J = wp2Var3;
        this.K = bmsVar2;
        this.L = bmsVar3;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f530 a;
        f530 a2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g43 g43Var = lr20.c;
        bms bmsVar = this.L;
        bms bmsVar2 = this.K;
        bms bmsVar3 = this.B;
        boolean z = this.y;
        ohy ohyVar = this.w;
        fhy fhyVar = this.c;
        switch (i) {
            case 0:
                wls wlsVar = (wls) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= fidVar.e(wlsVar) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    sic a3 = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    c530 c530Var = c530.a;
                    f530 d = b.d(btsVar, c530Var);
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
                    qje.W(btsVar, d.f, a3);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    oz40 oz40Var = this.b;
                    a = b.a(c530Var, m.a(), new qk30(22, oz40Var, fhyVar, ohyVar));
                    ydb1.a(a, wwg.S(-1240792747, true, new e07(bmsVar3, oz40Var, 3), btsVar), wwg.S(-579927430, true, new g07(oz40Var, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, wlsVar, 1), btsVar), wwg.S(-2119541469, true, new e07(bmsVar2, oz40Var, 4), btsVar), wwg.S(-235270912, true, new e07(bmsVar, oz40Var, 5), btsVar), null, this.x, false, btsVar, 28080, 160);
                    if (z) {
                        btsVar.e0(26265736);
                        jeb1.f(this.z, an91.o(c530Var, ohyVar.a, 4.0f, ohyVar.b, 0.0f, 8), this.A, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 0, 0, 16376);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(26507319);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                a aVar = (a) bmsVar;
                wls wlsVar2 = (wls) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= fidVar2.e(wlsVar2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    sic a4 = qic.a(g43Var, x4c.G, btsVar2, 0);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    c530 c530Var2 = c530.a;
                    f530 d2 = b.d(btsVar2, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a4);
                    qje.W(btsVar2, d.e, o2);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    oz40 oz40Var2 = this.b;
                    a2 = b.a(c530Var2, m.a(), new qk30(22, oz40Var2, fhyVar, ohyVar));
                    ydb1.a(a2, wwg.S(806787752, true, new e07(bmsVar3, oz40Var2, 6), btsVar2), wwg.S(1707976397, true, new g07(oz40Var2, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, wlsVar2, 2), btsVar2), wwg.S(-1891874698, true, new e07(bmsVar2, oz40Var2, 7), btsVar2), wwg.S(125881171, true, new nfj(17, aVar, oz40Var2), btsVar2), null, this.x, false, btsVar2, 28080, 160);
                    if (z) {
                        btsVar2.e0(-2050211755);
                        jeb1.f(this.z, an91.o(c530Var2, ohyVar.a, 4.0f, ohyVar.b, 0.0f, 8), this.A, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 0, 0, 16376);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-2049970172);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
