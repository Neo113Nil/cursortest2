package com.yandex.go.payments.addmethod.ui.home;

import androidx.compose.runtime.f;
import com.yandex.go.payments.addmethod.data.model.UserDataField;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.crb1;
import defpackage.cx20;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eg0;
import defpackage.evu0;
import defpackage.f530;
import defpackage.fid;
import defpackage.g43;
import defpackage.gw00;
import defpackage.i43;
import defpackage.jeb1;
import defpackage.k3r;
import defpackage.ki0;
import defpackage.l3t0;
import defpackage.le;
import defpackage.lh0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m0;
import defpackage.mh0;
import defpackage.n;
import defpackage.nc0;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.og0;
import defpackage.oh0;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pfb1;
import defpackage.ph0;
import defpackage.pi6;
import defpackage.q;
import defpackage.q791;
import defpackage.qg0;
import defpackage.qgy;
import defpackage.qh0;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.rg0;
import defpackage.rh0;
import defpackage.sg0;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.tn1;
import defpackage.tse0;
import defpackage.ulb1;
import defpackage.vfc;
import defpackage.vg0;
import defpackage.vi91;
import defpackage.wg0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xg0;
import defpackage.xh0;
import defpackage.xya1;
import defpackage.z910;
import defpackage.zla1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class d {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void a(defpackage.mh0 r43, defpackage.tls r44, defpackage.fid r45, int r46) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.payments.addmethod.ui.home.d.a(mh0, tls, fid, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x05c4, code lost:
    
        if (r4 == r43) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(mh0 mh0Var, final tls tlsVar, fid fidVar, int i) {
        mh0 mh0Var2;
        tls tlsVar2;
        bts btsVar;
        boolean z;
        bts btsVar2;
        c530 c530Var;
        o430 o430Var;
        boolean z2;
        boolean z3;
        boolean z4;
        f530 f530Var;
        boolean z5;
        Object obj;
        bts btsVar3;
        final lh0 lh0Var;
        Object obj2;
        boolean z6;
        c530 c530Var2;
        final boolean z7;
        o430 o430Var2;
        Iterator it;
        float f;
        boolean z8;
        l3t0 l3t0Var;
        oz40 oz40Var;
        oz40 oz40Var2;
        mh0 mh0Var3;
        o430 o430Var3;
        final mh0 mh0Var4 = mh0Var;
        so5 so5Var = x4c.G;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(1491938166);
        dmw0 dmw0Var = btsVar4.a;
        int i2 = (i & 6) == 0 ? (btsVar4.k(mh0Var4) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar4.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar4.V(i3 & 1, (i3 & 19) != 18)) {
            List<rh0> list = mh0Var4.f;
            String str = mh0Var4.j;
            boolean k = btsVar4.k(list);
            Object Q = btsVar4.Q();
            o430 o430Var4 = did.a;
            Object obj3 = Q;
            if (k || Q == o430Var4) {
                l3t0 l3t0Var2 = new l3t0();
                for (rh0 rh0Var : list) {
                    l3t0Var2.put(rh0Var.a, vi91.c(rh0Var));
                }
                btsVar4.o0(l3t0Var2);
                obj3 = l3t0Var2;
            }
            l3t0 l3t0Var3 = (l3t0) obj3;
            Object Q2 = btsVar4.Q();
            Object obj4 = Q2;
            if (Q2 == o430Var4) {
                oz40 j = f.j(kotlin.collections.b.f());
                btsVar4.o0(j);
                obj4 = j;
            }
            oz40 oz40Var3 = (oz40) obj4;
            Object Q3 = btsVar4.Q();
            Object obj5 = Q3;
            if (Q3 == o430Var4) {
                oz40 j2 = f.j(Boolean.FALSE);
                btsVar4.o0(j2);
                obj5 = j2;
            }
            oz40 oz40Var4 = (oz40) obj5;
            Object Q4 = btsVar4.Q();
            Object obj6 = Q4;
            if (Q4 == o430Var4) {
                oz40 j3 = f.j(null);
                btsVar4.o0(j3);
                obj6 = j3;
            }
            final oz40 oz40Var5 = (oz40) obj6;
            if (str != null && !str.equals((String) oz40Var5.getValue())) {
                oz40Var5.setValue(str);
                oz40Var4.setValue(Boolean.FALSE);
                rh0 rh0Var2 = (rh0) kotlin.collections.a.R(list);
                String str2 = rh0Var2 != null ? rh0Var2.a : null;
                if (str2 != null) {
                    oz40Var3.setValue(gw00.e(new Pair(str2, str)));
                }
            }
            boolean k2 = btsVar4.k(kotlin.collections.a.J0(l3t0Var3.w));
            Object Q5 = btsVar4.Q();
            Object obj7 = Q5;
            if (k2 || Q5 == o430Var4) {
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : list) {
                    if (((rh0) obj8).d) {
                        arrayList.add(obj8);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) l3t0Var3.get(((rh0) it2.next()).a);
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (evu0.J(str3)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                Boolean valueOf = Boolean.valueOf(z);
                btsVar4.o0(valueOf);
                obj7 = valueOf;
            }
            boolean booleanValue = ((Boolean) obj7).booleanValue();
            k3r k3rVar = ljs0.c;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar4, 0);
            int hashCode = Long.hashCode(btsVar4.T);
            r1b0 o = btsVar4.o();
            f530 d = androidx.compose.ui.b.d(btsVar4, k3rVar);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar4.i0();
            if (btsVar4.S) {
                btsVar4.n(slsVar);
            } else {
                btsVar4.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar4, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar4, wlsVar2, o);
            Integer valueOf2 = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar4, wlsVar3, valueOf2);
            tls tlsVar3 = androidx.compose.ui.node.d.h;
            qje.M(btsVar4, tlsVar3);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar4, wlsVar4, d);
            o430 o430Var5 = o430Var4;
            oz40 oz40Var6 = oz40Var4;
            crb1.b(null, wwg.S(933389548, true, new sg0(0, tlsVar), btsVar4), null, wwg.S(-380440338, true, new tn1(3, mh0Var4), btsVar4), null, wwg.S(-1694270224, true, new rg0(mh0Var4, tlsVar), btsVar4), null, btsVar4, 199728, 85);
            x2y x2yVar = new x2y(1.0f, true);
            sic a2 = qic.a(g43Var, so5Var, btsVar4, 0);
            int hashCode2 = Long.hashCode(btsVar4.T);
            r1b0 o2 = btsVar4.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar4, x2yVar);
            btsVar4.i0();
            if (btsVar4.S) {
                btsVar4.n(slsVar);
            } else {
                btsVar4.r0();
            }
            qje.W(btsVar4, wlsVar, a2);
            qje.W(btsVar4, wlsVar2, o2);
            vfc.v(hashCode2, btsVar4, wlsVar3, btsVar4, tlsVar3);
            qje.W(btsVar4, wlsVar4, d2);
            c530 c530Var3 = c530.a;
            jeb1.f(mh0Var4.a, an91.m(n.e(c530Var3, 20.0f, btsVar4, c530Var3, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar4).e.a, btsVar4, 48, 0, 16380);
            bts btsVar5 = btsVar4;
            String str4 = mh0Var4.b;
            if (str4 == null) {
                btsVar5.e0(1644503075);
                btsVar5.t(false);
                btsVar2 = btsVar5;
            } else {
                tse0.s(btsVar5, 1644503076, c530Var3, 12.0f, btsVar5);
                jeb1.f(str4, an91.m(ljs0.c(c530Var3, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar5).g.a, btsVar5, 48, 0, 16380);
                bts btsVar6 = btsVar5;
                btsVar6.t(false);
                btsVar2 = btsVar6;
            }
            oeb1.c(btsVar2, ljs0.e(c530Var3, 16.0f));
            btsVar2.e0(-224034792);
            for (rh0 rh0Var3 : list) {
                String str5 = (String) l3t0Var3.get(rh0Var3.a);
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (String) ((Map) oz40Var3.getValue()).get(rh0Var3.a);
                boolean k3 = btsVar2.k(l3t0Var3) | btsVar2.k(rh0Var3);
                Object Q6 = btsVar2.Q();
                if (k3) {
                    o430Var3 = o430Var5;
                } else {
                    o430Var3 = o430Var5;
                    if (Q6 != o430Var3) {
                        ki0.a(rh0Var3, str5, str6, (tls) Q6, btsVar2, 0);
                        oeb1.c(btsVar2, ljs0.e(c530Var3, 8.0f));
                        o430Var5 = o430Var3;
                    }
                }
                Q6 = new og0(l3t0Var3, rh0Var3, oz40Var3, 1);
                btsVar2.o0(Q6);
                ki0.a(rh0Var3, str5, str6, (tls) Q6, btsVar2, 0);
                oeb1.c(btsVar2, ljs0.e(c530Var3, 8.0f));
                o430Var5 = o430Var3;
            }
            o430 o430Var6 = o430Var5;
            btsVar2.t(false);
            btsVar2.t(true);
            List A0 = kotlin.collections.a.A0(mh0Var4.c, 2);
            if (A0.isEmpty()) {
                tlsVar2 = tlsVar;
                c530Var = c530Var3;
                o430Var = o430Var6;
                z2 = false;
                z3 = 1;
                mh0Var2 = mh0Var4;
                btsVar2.e0(753483042);
                btsVar2.t(false);
            } else {
                btsVar2.e0(751081503);
                f530 k4 = an91.k(ljs0.c(c530Var3, 1.0f), 8.0f);
                sic a3 = qic.a(new i43(8.0f, true, new quz(11)), so5Var, btsVar2, 6);
                int hashCode3 = Long.hashCode(btsVar2.T);
                r1b0 o3 = btsVar2.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar2, k4);
                ohd.G1.getClass();
                sls slsVar2 = androidx.compose.ui.node.d.b;
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, androidx.compose.ui.node.d.f, a3);
                qje.W(btsVar2, androidx.compose.ui.node.d.e, o3);
                qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode3));
                qje.M(btsVar2, androidx.compose.ui.node.d.h);
                qje.W(btsVar2, androidx.compose.ui.node.d.d, d3);
                btsVar2.e0(624320937);
                Iterator it3 = A0.iterator();
                while (it3.hasNext()) {
                    lh0 lh0Var2 = (lh0) it3.next();
                    ButtonResolvedState a4 = eg0.a(lh0Var2, booleanValue, ((Boolean) oz40Var6.getValue()).booleanValue());
                    boolean z9 = a4 != ButtonResolvedState.DISABLED;
                    c530 c530Var4 = c530Var3;
                    final boolean z10 = a4 == ButtonResolvedState.BUSY;
                    String b = eg0.b(lh0Var2, booleanValue, ((Boolean) oz40Var6.getValue()).booleanValue());
                    if (b == null) {
                        b = lh0Var2.a;
                    }
                    String str7 = b;
                    boolean a5 = btsVar2.a(z9) | btsVar2.a(z10) | btsVar2.k(lh0Var2) | ((i3 & 14) == 4) | btsVar2.k(l3t0Var3) | ((i3 & 112) == 32);
                    Object Q7 = btsVar2.Q();
                    if (a5 || Q7 == o430Var6) {
                        final l3t0 l3t0Var4 = l3t0Var3;
                        lh0Var = lh0Var2;
                        z6 = booleanValue;
                        c530Var2 = c530Var4;
                        z7 = z9;
                        o430Var2 = o430Var6;
                        it = it3;
                        f = 1.0f;
                        z8 = true;
                        final oz40 oz40Var7 = oz40Var6;
                        final oz40 oz40Var8 = oz40Var3;
                        obj2 = new sls() { // from class: ug0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                if (z7 && !z10) {
                                    jh0 jh0Var = lh0Var.c;
                                    boolean z11 = jh0Var instanceof eh0;
                                    tls tlsVar4 = tlsVar;
                                    if (z11) {
                                        mh0 mh0Var5 = mh0Var4;
                                        boolean isEmpty = mh0Var5.f.isEmpty();
                                        l3t0 l3t0Var5 = l3t0Var4;
                                        oz40 oz40Var9 = oz40Var8;
                                        if (!isEmpty) {
                                            LinkedHashMap c = eg0.c(mh0Var5.f, l3t0Var5);
                                            if (!c.isEmpty()) {
                                                oz40Var9.setValue(c);
                                            }
                                        }
                                        oz40Var9.setValue(b.f());
                                        oz40Var5.setValue(null);
                                        oz40Var7.setValue(Boolean.TRUE);
                                        ArrayList arrayList2 = new ArrayList(l3t0Var5.size());
                                        Iterator it4 = l3t0Var5.b.iterator();
                                        while (it4.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it4.next();
                                            arrayList2.add(new UserDataField((String) entry.getKey(), (String) entry.getValue()));
                                        }
                                        tlsVar4.invoke(new eh0(((eh0) jh0Var).a, arrayList2, mh0Var5.g));
                                    } else {
                                        tlsVar4.invoke(jh0Var);
                                    }
                                }
                                return zy11.a;
                            }
                        };
                        l3t0Var = l3t0Var4;
                        oz40Var = oz40Var8;
                        oz40Var2 = oz40Var7;
                        mh0Var3 = mh0Var4;
                        btsVar2.o0(obj2);
                    } else {
                        l3t0Var = l3t0Var3;
                        z7 = z9;
                        oz40Var2 = oz40Var6;
                        oz40Var = oz40Var3;
                        o430Var2 = o430Var6;
                        it = it3;
                        f = 1.0f;
                        z8 = true;
                        lh0Var = lh0Var2;
                        mh0Var3 = mh0Var4;
                        obj2 = Q7;
                        c530Var2 = c530Var4;
                        z6 = booleanValue;
                    }
                    sls slsVar3 = (sls) obj2;
                    if (lh0Var.b) {
                        btsVar2.e0(-1113168637);
                        f530 b2 = pfb1.b(ljs0.c(c530Var2, f), z10, 30);
                        z910 d4 = pi6.d(x4c.b, false);
                        int hashCode4 = Long.hashCode(btsVar2.T);
                        r1b0 o4 = btsVar2.o();
                        f530 d5 = androidx.compose.ui.b.d(btsVar2, b2);
                        ohd.G1.getClass();
                        sls slsVar4 = androidx.compose.ui.node.d.b;
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar4);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, d4);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o4);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode4));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d5);
                        ohb1.b(ljs0.c(c530Var2, f), (!z7 || z10) ? false : z8, null, slsVar3, wwg.S(-345754425, z8, new le(str7, 3), btsVar2), btsVar2, 24582, 4);
                        btsVar2.t(z8);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1112707047);
                        ulb1.a(ljs0.c(c530Var2, f), z7, null, slsVar3, wwg.S(-1607589770, z8, new le(str7, 4), btsVar2), btsVar2, 24582, 4);
                        btsVar2.t(false);
                    }
                    it3 = it;
                    mh0Var4 = mh0Var3;
                    c530Var3 = c530Var2;
                    booleanValue = z6;
                    l3t0Var3 = l3t0Var;
                    oz40Var3 = oz40Var;
                    oz40Var6 = oz40Var2;
                    o430Var6 = o430Var2;
                }
                tlsVar2 = tlsVar;
                c530Var = c530Var3;
                o430Var = o430Var6;
                z2 = false;
                z3 = 1;
                mh0Var2 = mh0Var4;
                tse0.t(btsVar2, false, true, false);
            }
            oh0 oh0Var = mh0Var2.d;
            if (oh0Var == null) {
                btsVar2.e0(753517978);
                btsVar2.t(z2);
                z5 = z3;
                btsVar3 = btsVar2;
            } else {
                btsVar2.e0(753517979);
                f530 j4 = vfc.j(x4c.H, an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7));
                if (oh0Var.b != null) {
                    btsVar2.e0(-72970503);
                    int i4 = ((i3 & 112) == 32 ? z3 : 0) | (btsVar2.k(oh0Var) ? 1 : 0);
                    Object Q8 = btsVar2.Q();
                    if (i4 == 0) {
                        obj = Q8;
                    }
                    qg0 qg0Var = new qg0(tlsVar2, oh0Var, z3);
                    btsVar2.o0(qg0Var);
                    obj = qg0Var;
                    f530Var = q791.d(c530Var, false, null, null, (sls) obj, 15);
                    z4 = false;
                    btsVar2.t(false);
                } else {
                    z4 = false;
                    btsVar2.e0(-72896227);
                    btsVar2.t(false);
                    f530Var = c530Var;
                }
                bts btsVar7 = btsVar2;
                z5 = z3;
                qgy.b(oh0Var.a, null, j4.k(f530Var), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar7, 0, 0, 12282);
                bts btsVar8 = btsVar7;
                btsVar8.t(z4);
                btsVar3 = btsVar8;
            }
            btsVar3.t(z5);
            btsVar = btsVar3;
        } else {
            mh0Var2 = mh0Var4;
            tlsVar2 = tlsVar;
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(mh0Var2, tlsVar2, i, 8);
        }
    }

    public static final void c(xh0 xh0Var, tls tlsVar, com.yandex.go.superapp.web.view.a aVar, sls slsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        tls tlsVar3;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1460741472);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(xh0Var) : btsVar.e(xh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(aVar) : btsVar.e(aVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        } else {
            slsVar2 = slsVar;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            tlsVar3 = tlsVar2;
            i2 |= btsVar.e(tlsVar3) ? 16384 : 8192;
        } else {
            tlsVar3 = tlsVar2;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 d = xh0Var.a() ? ljs0.c : ooc.d(ljs0.v(c530.a, null, 3), null, 3);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
            if (xh0Var.a()) {
                btsVar.e0(-337996467);
                z = true;
                qy20.a(null, qy20.c, qy20.d, false, wwg.S(-1010363907, true, new vg0((Object) xh0Var, tlsVar, (Object) slsVar2, tlsVar3, (Object) aVar, 0), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 9);
                btsVar.t(false);
            } else {
                btsVar.e0(-336737371);
                z = true;
                cx20.a(null, null, null, qy20.a, qy20.b, false, false, wwg.S(-571004576, true, new wg0(0, tlsVar), btsVar), wwg.S(-1563449048, true, new r5y(xh0Var, tlsVar, slsVar, tlsVar2, 1), btsVar), btsVar, 113246208, 103);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(xh0Var, tlsVar, aVar, slsVar, tlsVar2, i);
        }
    }

    public static final void d(ph0 ph0Var, tls tlsVar, sls slsVar, tls tlsVar2, com.yandex.go.superapp.web.view.a aVar, fid fidVar, int i, int i2) {
        int i3;
        com.yandex.go.superapp.web.view.a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1816401754);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(ph0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= (32768 & i) == 0 ? btsVar.k(aVar) : btsVar.e(aVar) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            com.yandex.go.superapp.web.view.a aVar3 = i4 != 0 ? null : aVar;
            boolean z = (i3 & 896) == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new AddPaymentHomeScreenKt$AddPaymentInfoScreenContent$1$1(slsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            qh0 qh0Var = ph0Var.b;
            boolean z2 = ph0Var.d;
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new q(2, ph0Var, tlsVar2, tlsVar);
                btsVar.o0(Q2);
            }
            zla1.a(qh0Var, (tls) Q2, aVar3, z2, btsVar, (i3 >> 6) & 896);
            aVar2 = aVar3;
        } else {
            btsVar.Y();
            aVar2 = aVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(ph0Var, tlsVar, slsVar, tlsVar2, aVar2, i, i2);
        }
    }
}
