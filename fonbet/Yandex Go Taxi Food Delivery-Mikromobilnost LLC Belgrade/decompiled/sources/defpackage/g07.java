package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.input.InputState;

/* loaded from: classes12.dex */
public final /* synthetic */ class g07 implements zls {
    public final /* synthetic */ wp2 A;
    public final /* synthetic */ InputState B;
    public final /* synthetic */ wp2 C;
    public final /* synthetic */ wls D;
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ ety0 y;
    public final /* synthetic */ ety0 z;

    public /* synthetic */ g07(oz40 oz40Var, float f, String str, String str2, ety0 ety0Var, ety0 ety0Var2, wp2 wp2Var, InputState inputState, wp2 wp2Var2, wls wlsVar, int i) {
        this.a = i;
        this.b = oz40Var;
        this.c = f;
        this.w = str;
        this.x = str2;
        this.y = ety0Var;
        this.z = ety0Var2;
        this.A = wp2Var;
        this.B = inputState;
        this.C = wp2Var2;
        this.D = wlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ety0 ety0Var;
        ety0 ety0Var2;
        ety0 ety0Var3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        wls wlsVar = this.D;
        InputState inputState = this.B;
        ety0 ety0Var4 = this.z;
        float f = this.c;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    f530 m = an91.m(c530Var, 0.0f, f, 1);
                    nhy nhyVar = new nhy(oz40Var);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, m);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar, wlsVar2, nhyVar);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar, wlsVar3, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar4 = d.g;
                    qje.W(btsVar, wlsVar4, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar, tlsVar);
                    wls wlsVar5 = d.d;
                    qje.W(btsVar, wlsVar5, d);
                    String str = this.w;
                    int length = str.length();
                    String str2 = this.x;
                    ety0 ety0Var5 = this.y;
                    if (length > 0) {
                        ety0Var = ety0Var5;
                        btsVar.e0(-1902736869);
                        jeb1.f(str, pj91.h(c530Var, "label"), this.A, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, (str2.length() == 0 && oz40Var.getValue() == InputState.EmptyUnfocused) ? ety0Var : ety0Var4, btsVar, 48, 0, 16376);
                        btsVar.t(false);
                    } else {
                        ety0Var = ety0Var5;
                        btsVar.e0(-1902356716);
                        btsVar.t(false);
                    }
                    f530 h = pj91.h(c530Var, "field");
                    z910 d2 = pi6.d(x4c.b, true);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d3 = b.d(btsVar, h);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar2, d2);
                    qje.W(btsVar, wlsVar3, o2);
                    vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar5, d3);
                    wlsVar.invoke(btsVar, 0);
                    btsVar.t(true);
                    if (str2.length() <= 0 || !k7b1.d(inputState)) {
                        btsVar.e0(-1901872620);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1902075949);
                        jeb1.f(str2, pj91.h(c530Var, "hint"), this.C, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 48, 0, 16376);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V2 = btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16);
                dmw0 dmw0Var2 = btsVar2.a;
                if (V2) {
                    f530 m2 = an91.m(c530Var, 0.0f, f, 1);
                    nhy nhyVar2 = new nhy(oz40Var);
                    int hashCode3 = Long.hashCode(btsVar2.T);
                    r1b0 o3 = btsVar2.o();
                    f530 d4 = b.d(btsVar2, m2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar6 = d.f;
                    qje.W(btsVar2, wlsVar6, nhyVar2);
                    wls wlsVar7 = d.e;
                    qje.W(btsVar2, wlsVar7, o3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    wls wlsVar8 = d.g;
                    qje.W(btsVar2, wlsVar8, valueOf2);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar2, tlsVar2);
                    wls wlsVar9 = d.d;
                    qje.W(btsVar2, wlsVar9, d4);
                    String str3 = this.w;
                    int length2 = str3.length();
                    String str4 = this.x;
                    ety0 ety0Var6 = this.y;
                    if (length2 > 0) {
                        ety0Var2 = ety0Var6;
                        btsVar2.e0(191316706);
                        jeb1.f(str3, pj91.h(c530Var, "label"), this.A, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, (str4.length() == 0 && oz40Var.getValue() == InputState.EmptyUnfocused) ? ety0Var2 : ety0Var4, btsVar2, 48, 0, 16376);
                        btsVar2.t(false);
                    } else {
                        ety0Var2 = ety0Var6;
                        btsVar2.e0(191696859);
                        btsVar2.t(false);
                    }
                    f530 h2 = pj91.h(c530Var, "field");
                    z910 d5 = pi6.d(x4c.b, true);
                    int hashCode4 = Long.hashCode(btsVar2.T);
                    r1b0 o4 = btsVar2.o();
                    f530 d6 = b.d(btsVar2, h2);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar6, d5);
                    qje.W(btsVar2, wlsVar7, o4);
                    vfc.v(hashCode4, btsVar2, wlsVar8, btsVar2, tlsVar2);
                    qje.W(btsVar2, wlsVar9, d6);
                    wlsVar.invoke(btsVar2, 0);
                    btsVar2.t(true);
                    if (str4.length() <= 0 || !k7b1.d(inputState)) {
                        btsVar2.e0(192180955);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(191977626);
                        jeb1.f(str4, pj91.h(c530Var, "hint"), this.C, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar2, 48, 0, 16376);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                boolean V3 = btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16);
                dmw0 dmw0Var3 = btsVar3.a;
                if (!V3) {
                    btsVar3.Y();
                    return zy11Var;
                }
                f530 m3 = an91.m(c530Var, 0.0f, f, 1);
                nhy nhyVar3 = new nhy(oz40Var);
                int hashCode5 = Long.hashCode(btsVar3.T);
                r1b0 o5 = btsVar3.o();
                f530 d7 = b.d(btsVar3, m3);
                ohd.G1.getClass();
                sls slsVar3 = d.b;
                if (dmw0Var3 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar3);
                } else {
                    btsVar3.r0();
                }
                wls wlsVar10 = d.f;
                qje.W(btsVar3, wlsVar10, nhyVar3);
                wls wlsVar11 = d.e;
                qje.W(btsVar3, wlsVar11, o5);
                Integer valueOf3 = Integer.valueOf(hashCode5);
                wls wlsVar12 = d.g;
                qje.W(btsVar3, wlsVar12, valueOf3);
                tls tlsVar3 = d.h;
                qje.M(btsVar3, tlsVar3);
                wls wlsVar13 = d.d;
                qje.W(btsVar3, wlsVar13, d7);
                String str5 = this.w;
                int length3 = str5.length();
                String str6 = this.x;
                ety0 ety0Var7 = this.y;
                if (length3 > 0) {
                    ety0Var3 = ety0Var7;
                    btsVar3.e0(-1312155985);
                    jeb1.f(str5, pj91.h(c530Var, "label"), this.A, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, (str6.length() == 0 && oz40Var.getValue() == InputState.EmptyUnfocused) ? ety0Var3 : ety0Var4, btsVar3, 48, 0, 16376);
                    btsVar3.t(false);
                } else {
                    ety0Var3 = ety0Var7;
                    btsVar3.e0(-1311775832);
                    btsVar3.t(false);
                }
                f530 h3 = pj91.h(c530Var, "field");
                z910 d8 = pi6.d(x4c.b, true);
                int hashCode6 = Long.hashCode(btsVar3.T);
                r1b0 o6 = btsVar3.o();
                f530 d9 = b.d(btsVar3, h3);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar3);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, wlsVar10, d8);
                qje.W(btsVar3, wlsVar11, o6);
                vfc.v(hashCode6, btsVar3, wlsVar12, btsVar3, tlsVar3);
                qje.W(btsVar3, wlsVar13, d9);
                wlsVar.invoke(btsVar3, 0);
                btsVar3.t(true);
                if (str6.length() <= 0 || !k7b1.d(inputState)) {
                    btsVar3.e0(-1311291736);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(-1311495065);
                    jeb1.f(str6, pj91.h(c530Var, "hint"), this.C, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var3, btsVar3, 48, 0, 16376);
                    btsVar3.t(false);
                }
                btsVar3.t(true);
                return zy11Var;
        }
    }
}
