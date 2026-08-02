package defpackage;

import androidx.compose.material3.h;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class k2z0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ k2z0(a aVar) {
        this.a = 21;
        this.b = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        Integer num = null;
        int i2 = 6;
        int i3 = 7;
        int i4 = 2;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    k3r k3rVar = ljs0.c;
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = ly3.i(btsVar);
                    }
                    zx40 zx40Var = (zx40) Q;
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new bgc(12);
                        btsVar.o0(Q2);
                    }
                    f530 b = q791.b(k3rVar, zx40Var, null, false, null, null, (sls) Q2, 28);
                    sic a = qic.a(lr20.e, x4c.G, btsVar, 6);
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
                    nnm.p(0, aVar, btsVar, true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    float f = ((y7m) btsVar2.m(h.c)).a;
                    if (Float.isNaN(f)) {
                        f = 0.0f;
                    }
                    y7m y7mVar = new y7m(8.0f - (f - rz6.d));
                    y7m y7mVar2 = new y7m(0.0f);
                    y7m y7mVar3 = new y7m(8.0f);
                    if (y7mVar2.compareTo(y7mVar3) > 0) {
                        xfo.e(46, y7mVar3, " is less than minimum ", y7mVar2, "Cannot coerce value to an empty range: maximum ");
                        return null;
                    }
                    if (y7mVar.compareTo(y7mVar2) < 0) {
                        y7mVar = y7mVar2;
                    } else if (y7mVar.compareTo(y7mVar3) > 0) {
                        y7mVar = y7mVar3;
                    }
                    cr1.b(y7mVar.a, wwg.S(-459506658, true, new k2z0(aVar, i4), btsVar2), btsVar2, 390);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    aVar.invoke(btsVar3, 0);
                    btsVar3.e0(-1102003461);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    rzo.a(aVar, btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    sb2.b(u76.a.a(BodyAlign.Start), wwg.S(-1799991775, true, new k2z0(aVar, i3), btsVar5), btsVar5, 56);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    sb2.b(u76.a.a(BodyAlign.End), wwg.S(-581712158, true, new k2z0(aVar, i2), btsVar6), btsVar6, 56);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    aVar.invoke(btsVar7, 0);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    aVar.invoke(btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    aVar.invoke(btsVar9, 0);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    aVar.invoke(btsVar10, 0);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar11 = (fid) obj;
                int intValue11 = ((Integer) obj2).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                    sb2.b(u76.a.a(BodyAlign.Start), wwg.S(-2077104531, true, new k2z0(aVar, 8), btsVar11), btsVar11, 56);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar12 = (fid) obj;
                int intValue12 = ((Integer) obj2).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 3) != 2)) {
                    sb2.b(u76.a.a(BodyAlign.End), wwg.S(521839406, true, new k2z0(aVar, 9), btsVar12), btsVar12, 56);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar13 = (fid) obj;
                int intValue13 = ((Integer) obj2).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 3) != 2)) {
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar13, 0);
                    int S = cma1.S(btsVar13);
                    r1b0 o2 = btsVar13.o();
                    f530 d2 = b.d(btsVar13, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar13.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar13.i0();
                    if (btsVar13.S) {
                        btsVar13.n(slsVar2);
                    } else {
                        btsVar13.r0();
                    }
                    qje.W(btsVar13, d.f, a2);
                    qje.W(btsVar13, d.e, o2);
                    wls wlsVar = d.g;
                    if (btsVar13.S || !jl40.l(btsVar13.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar13, S, wlsVar);
                    }
                    qje.W(btsVar13, d.d, d2);
                    aVar.invoke(uic.a, btsVar13, 6);
                    btsVar13.t(true);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                fid fidVar14 = (fid) obj;
                int intValue14 = ((Integer) obj2).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 3) != 2)) {
                    aVar.invoke(btsVar14, 0);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                tyu0 tyu0Var = (tyu0) obj;
                n8e n8eVar = (n8e) obj2;
                long b2 = n8e.b(0, n8eVar.a, Integer.MAX_VALUE, 0, 0, 12);
                List h0 = tyu0Var.h0("probe", aVar);
                boolean z = h0.size() == 1;
                Iterator it = h0.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    i5 += ((x910) it.next()).l0(b2).a;
                }
                long j = n8eVar.a;
                if (z) {
                    b2 = j;
                } else if (i5 > n8e.i(j)) {
                    long j2 = n8eVar.a;
                    b2 = n8e.b(0, j2, n8e.i(j2) / 2, 0, 0, 12);
                }
                List h02 = tyu0Var.h0("content", aVar);
                ArrayList arrayList = new ArrayList(tcc.n(h02, 10));
                Iterator it2 = h02.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((x910) it2.next()).l0(b2));
                }
                Iterator it3 = arrayList.iterator();
                int i6 = 0;
                while (it3.hasNext()) {
                    i6 += ((o) it3.next()).a;
                }
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    num = Integer.valueOf(((o) it4.next()).b);
                    while (it4.hasNext()) {
                        Integer valueOf = Integer.valueOf(((o) it4.next()).b);
                        if (num.compareTo(valueOf) < 0) {
                            num = valueOf;
                        }
                    }
                }
                int intValue15 = num != null ? num.intValue() : 0;
                return tyu0Var.w(i6, intValue15, kotlin.collections.b.f(), new g12(intValue15, 2, arrayList));
            case 15:
                fid fidVar15 = (fid) obj;
                int intValue16 = ((Integer) obj2).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue16 & 1, (intValue16 & 3) != 2)) {
                    aVar.invoke(xpr.a, btsVar15, 6);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 16:
                Object obj3 = (fid) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    bts btsVar16 = (bts) obj3;
                    if (btsVar16.E()) {
                        btsVar16.Y();
                        return zy11Var;
                    }
                }
                aVar.invoke(0, obj3, 6);
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                qdb1.a(aVar, (fid) obj, vng.O(7));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                x2b1.a(aVar, (fid) obj, vng.O(55));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                k4b1.h(aVar, (fid) obj, vng.O(7));
                return zy11Var;
            case 20:
                fid fidVar16 = (fid) obj;
                int intValue17 = ((Integer) obj2).intValue();
                bts btsVar17 = (bts) fidVar16;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 3) != 2)) {
                    aVar.invoke(cj6.a, btsVar17, 0);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 21:
                fid fidVar17 = (fid) obj;
                int intValue18 = ((Integer) obj2).intValue();
                bts btsVar18 = (bts) fidVar17;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 3) != 2)) {
                    v8b1.b(c530Var, aVar, btsVar18, 0, 0);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 22:
                fid fidVar18 = (fid) obj;
                int intValue19 = ((Integer) obj2).intValue();
                bts btsVar19 = (bts) fidVar18;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 3) != 2)) {
                    aVar.invoke(btsVar19, 0);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 23:
                fid fidVar19 = (fid) obj;
                int intValue20 = ((Integer) obj2).intValue();
                bts btsVar20 = (bts) fidVar19;
                if (btsVar20.V(intValue20 & 1, (intValue20 & 3) != 2)) {
                    aVar.invoke(btsVar20, 0);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                vub1.a(aVar, (fid) obj, vng.O(7));
                return zy11Var;
            case 25:
                fid fidVar20 = (fid) obj;
                int intValue21 = ((Integer) obj2).intValue();
                bts btsVar21 = (bts) fidVar20;
                if (btsVar21.V(intValue21 & 1, (intValue21 & 3) != 2)) {
                    aVar.invoke(btsVar21, 0);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 26:
                fid fidVar21 = (fid) obj;
                int intValue22 = ((Integer) obj2).intValue();
                bts btsVar22 = (bts) fidVar21;
                if (btsVar22.V(intValue22 & 1, (intValue22 & 3) != 2)) {
                    aVar.invoke(btsVar22, 0);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                wub1.a(aVar, (fid) obj, vng.O(7));
                return zy11Var;
            default:
                fid fidVar22 = (fid) obj;
                int intValue23 = ((Integer) obj2).intValue();
                bts btsVar23 = (bts) fidVar22;
                if (btsVar23.V(intValue23 & 1, (intValue23 & 3) != 2)) {
                    aVar.invoke(btsVar23, 0);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ k2z0(int i, int i2, a aVar) {
        this.a = i2;
        this.b = aVar;
    }

    public /* synthetic */ k2z0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }
}
