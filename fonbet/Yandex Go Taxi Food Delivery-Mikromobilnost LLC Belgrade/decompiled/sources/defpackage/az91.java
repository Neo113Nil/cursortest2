package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.c;
import com.ybsdk.core.utils.ext.a;

/* loaded from: classes11.dex */
public abstract class az91 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-859667436);
        if (btsVar.V(i & 1, i != 0)) {
            f530 e = ljs0.e(ljs0.c, 16.0f);
            uo5 uo5Var = x4c.y;
            pdd.a.getClass();
            xab1.a(e, uo5Var, pdd.e, btsVar, 3126, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qls0(i, 4);
        }
    }

    public static final void b(final jus0 jus0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(361899196);
        final int i2 = 2;
        int i3 = (btsVar2.k(jus0Var) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new n7l0(8, slsVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            web1.c(q791.d(c530.a, false, null, null, (sls) Q, 15), 0.0f, false, 0.0f, x4c.E, null, wwg.S(131643808, true, new wls() { // from class: cts0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    jus0 jus0Var2 = jus0Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                k3r k3rVar = ljs0.c;
                                z910 d = pi6.d(x4c.x, false);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d2 = b.d(btsVar3, k3rVar);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d);
                                qje.W(btsVar3, d.e, o);
                                wls wlsVar = d.g;
                                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                                }
                                qje.W(btsVar3, d.d, d2);
                                zgb1.a(jus0Var2.b, null, 8388611, false, null, null, false, null, btsVar3, 384, 250);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                k3r k3rVar2 = ljs0.c;
                                z910 d3 = pi6.d(x4c.y, false);
                                int hashCode2 = Long.hashCode(btsVar4.T);
                                r1b0 o2 = btsVar4.o();
                                f530 d4 = b.d(btsVar4, k3rVar2);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar3);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d3);
                                qje.W(btsVar4, d.e, o2);
                                wls wlsVar2 = d.g;
                                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode2))) {
                                    b64.z(hashCode2, btsVar4, hashCode2, wlsVar2);
                                }
                                qje.W(btsVar4, d.d, d4);
                                zgb1.a(jus0Var2.c, null, 17, false, null, null, false, null, btsVar4, 384, 250);
                                btsVar4.t(true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (btsVar5.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                k3r k3rVar3 = ljs0.c;
                                lhl0 a = khl0.a(lr20.b, x4c.E, btsVar5, 54);
                                int hashCode3 = Long.hashCode(btsVar5.T);
                                r1b0 o3 = btsVar5.o();
                                f530 d5 = b.d(btsVar5, k3rVar3);
                                ohd.G1.getClass();
                                sls slsVar4 = d.b;
                                if (btsVar5.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar5.i0();
                                if (btsVar5.S) {
                                    btsVar5.n(slsVar4);
                                } else {
                                    btsVar5.r0();
                                }
                                qje.W(btsVar5, d.f, a);
                                qje.W(btsVar5, d.e, o3);
                                wls wlsVar3 = d.g;
                                if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode3))) {
                                    b64.z(hashCode3, btsVar5, hashCode3, wlsVar3);
                                }
                                qje.W(btsVar5, d.d, d5);
                                zgb1.a(jus0Var2.d, an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), 8388613, false, null, null, false, null, btsVar5, 432, 248);
                                if (jus0Var2.e) {
                                    btsVar5.e0(-1745000202);
                                    s3b1.f(new cuj0(wzg0.ic_chevron_right_text_nav, null, null, new afz0(tj51.b), 22), null, null, btsVar5, 0, 6);
                                    btsVar5.t(false);
                                } else {
                                    btsVar5.e0(-1744717668);
                                    btsVar5.t(false);
                                }
                                btsVar5.t(true);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar2), wwg.S(166467745, true, new wls() { // from class: cts0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    jus0 jus0Var2 = jus0Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                k3r k3rVar = ljs0.c;
                                z910 d = pi6.d(x4c.x, false);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d2 = b.d(btsVar3, k3rVar);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d);
                                qje.W(btsVar3, d.e, o);
                                wls wlsVar = d.g;
                                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                                }
                                qje.W(btsVar3, d.d, d2);
                                zgb1.a(jus0Var2.b, null, 8388611, false, null, null, false, null, btsVar3, 384, 250);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                k3r k3rVar2 = ljs0.c;
                                z910 d3 = pi6.d(x4c.y, false);
                                int hashCode2 = Long.hashCode(btsVar4.T);
                                r1b0 o2 = btsVar4.o();
                                f530 d4 = b.d(btsVar4, k3rVar2);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar3);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d3);
                                qje.W(btsVar4, d.e, o2);
                                wls wlsVar2 = d.g;
                                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode2))) {
                                    b64.z(hashCode2, btsVar4, hashCode2, wlsVar2);
                                }
                                qje.W(btsVar4, d.d, d4);
                                zgb1.a(jus0Var2.c, null, 17, false, null, null, false, null, btsVar4, 384, 250);
                                btsVar4.t(true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (btsVar5.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                k3r k3rVar3 = ljs0.c;
                                lhl0 a = khl0.a(lr20.b, x4c.E, btsVar5, 54);
                                int hashCode3 = Long.hashCode(btsVar5.T);
                                r1b0 o3 = btsVar5.o();
                                f530 d5 = b.d(btsVar5, k3rVar3);
                                ohd.G1.getClass();
                                sls slsVar4 = d.b;
                                if (btsVar5.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar5.i0();
                                if (btsVar5.S) {
                                    btsVar5.n(slsVar4);
                                } else {
                                    btsVar5.r0();
                                }
                                qje.W(btsVar5, d.f, a);
                                qje.W(btsVar5, d.e, o3);
                                wls wlsVar3 = d.g;
                                if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode3))) {
                                    b64.z(hashCode3, btsVar5, hashCode3, wlsVar3);
                                }
                                qje.W(btsVar5, d.d, d5);
                                zgb1.a(jus0Var2.d, an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), 8388613, false, null, null, false, null, btsVar5, 432, 248);
                                if (jus0Var2.e) {
                                    btsVar5.e0(-1745000202);
                                    s3b1.f(new cuj0(wzg0.ic_chevron_right_text_nav, null, null, new afz0(tj51.b), 22), null, null, btsVar5, 0, 6);
                                    btsVar5.t(false);
                                } else {
                                    btsVar5.e0(-1744717668);
                                    btsVar5.t(false);
                                }
                                btsVar5.t(true);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar2), wwg.S(201291682, true, new wls() { // from class: cts0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i2;
                    zy11 zy11Var = zy11.a;
                    jus0 jus0Var2 = jus0Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                k3r k3rVar = ljs0.c;
                                z910 d = pi6.d(x4c.x, false);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d2 = b.d(btsVar3, k3rVar);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d);
                                qje.W(btsVar3, d.e, o);
                                wls wlsVar = d.g;
                                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                                }
                                qje.W(btsVar3, d.d, d2);
                                zgb1.a(jus0Var2.b, null, 8388611, false, null, null, false, null, btsVar3, 384, 250);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                k3r k3rVar2 = ljs0.c;
                                z910 d3 = pi6.d(x4c.y, false);
                                int hashCode2 = Long.hashCode(btsVar4.T);
                                r1b0 o2 = btsVar4.o();
                                f530 d4 = b.d(btsVar4, k3rVar2);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar3);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d3);
                                qje.W(btsVar4, d.e, o2);
                                wls wlsVar2 = d.g;
                                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode2))) {
                                    b64.z(hashCode2, btsVar4, hashCode2, wlsVar2);
                                }
                                qje.W(btsVar4, d.d, d4);
                                zgb1.a(jus0Var2.c, null, 17, false, null, null, false, null, btsVar4, 384, 250);
                                btsVar4.t(true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (btsVar5.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                k3r k3rVar3 = ljs0.c;
                                lhl0 a = khl0.a(lr20.b, x4c.E, btsVar5, 54);
                                int hashCode3 = Long.hashCode(btsVar5.T);
                                r1b0 o3 = btsVar5.o();
                                f530 d5 = b.d(btsVar5, k3rVar3);
                                ohd.G1.getClass();
                                sls slsVar4 = d.b;
                                if (btsVar5.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar5.i0();
                                if (btsVar5.S) {
                                    btsVar5.n(slsVar4);
                                } else {
                                    btsVar5.r0();
                                }
                                qje.W(btsVar5, d.f, a);
                                qje.W(btsVar5, d.e, o3);
                                wls wlsVar3 = d.g;
                                if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode3))) {
                                    b64.z(hashCode3, btsVar5, hashCode3, wlsVar3);
                                }
                                qje.W(btsVar5, d.d, d5);
                                zgb1.a(jus0Var2.d, an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), 8388613, false, null, null, false, null, btsVar5, 432, 248);
                                if (jus0Var2.e) {
                                    btsVar5.e0(-1745000202);
                                    s3b1.f(new cuj0(wzg0.ic_chevron_right_text_nav, null, null, new afz0(tj51.b), 22), null, null, btsVar5, 0, 6);
                                    btsVar5.t(false);
                                } else {
                                    btsVar5.e0(-1744717668);
                                    btsVar5.t(false);
                                }
                                btsVar5.t(true);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar2), null, null, null, false, btsVar, 114843648, 0, 7726);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(jus0Var, slsVar, i, 15);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2094411632);
        if (btsVar.V(i & 1, i != 0)) {
            pdd.a.getClass();
            web1.c(null, 0.0f, false, 0.0f, null, null, pdd.b, pdd.c, pdd.d, null, null, null, false, btsVar, 114819072, 0, 7743);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qls0(i, 3);
        }
    }

    public static final void d(final rbv rbvVar, final f530 f530Var, nhe nheVar, jt1 jt1Var, float f, int i, sls slsVar, final tls tlsVar, sls slsVar2, fid fidVar, final int i2) {
        jt1 jt1Var2;
        sls slsVar3;
        nhe nheVar2;
        float f2;
        int i3;
        int i4;
        sls slsVar4;
        int i5;
        Object obj;
        bts btsVar;
        final sls slsVar5;
        final sls slsVar6;
        final jt1 jt1Var3;
        final nhe nheVar3;
        final float f3;
        final int i6;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1453199334);
        int i7 = i2 | (btsVar2.e(rbvVar) ? 4 : 2) | (btsVar2.k(f530Var) ? 256 : 128) | 920349696;
        int i8 = (btsVar2.e(tlsVar) ? (char) 256 : (char) 128) | 3122;
        if ((306783379 & i7) == 306783378 && (i8 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            nheVar3 = nheVar;
            jt1Var3 = jt1Var;
            f3 = f;
            i6 = i;
            slsVar5 = slsVar;
            slsVar6 = slsVar2;
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            int i9 = i2 & 1;
            o430 o430Var = did.a;
            if (i9 == 0 || btsVar2.C()) {
                uo5 uo5Var = x4c.y;
                int i10 = i8 & (-15);
                btsVar2.e0(1849434622);
                Object Q = btsVar2.Q();
                if (Q == o430Var) {
                    Q = new bgc(12);
                    btsVar2.o0(Q);
                }
                sls slsVar7 = (sls) Q;
                Object k = g8e.k(1849434622, btsVar2, false);
                if (k == o430Var) {
                    k = new bgc(12);
                    btsVar2.o0(k);
                }
                btsVar2.t(false);
                jt1Var2 = uo5Var;
                slsVar3 = (sls) k;
                nheVar2 = mhe.b;
                f2 = 1.0f;
                i3 = 1;
                i4 = i10;
                slsVar4 = slsVar7;
            } else {
                btsVar2.Y();
                nheVar2 = nheVar;
                jt1Var2 = jt1Var;
                f2 = f;
                i3 = i;
                slsVar3 = slsVar2;
                i4 = i8 & (-15);
                slsVar4 = slsVar;
            }
            btsVar2.u();
            Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            boolean booleanValue = ((Boolean) btsVar2.m(s1z.a)).booleanValue();
            if (rbvVar instanceof pbv) {
                pbv pbvVar = (pbv) rbvVar;
                i5 = i7;
                obj = new ah21(pbvVar.b, pbvVar.d, pbvVar.c, pbvVar.e, pbvVar.a, pbvVar.f);
            } else {
                i5 = i7;
                if (rbvVar instanceof nbv) {
                    nbv nbvVar = (nbv) rbvVar;
                    obj = new euj0(nbvVar.a, nbvVar.b);
                } else if (rbvVar instanceof ibv) {
                    obj = ((ibv) rbvVar).a;
                } else if (rbvVar instanceof lbv) {
                    obj = new e9i0(((lbv) rbvVar).a);
                } else if (rbvVar instanceof mbv) {
                    mbv mbvVar = (mbv) rbvVar;
                    obj = new f9i0(mbvVar.a, mbvVar.b, mbvVar.c, mbvVar.d);
                } else {
                    if (!(rbvVar instanceof jbv)) {
                        w511.b();
                        return;
                    }
                    obj = ((jbv) rbvVar).a;
                }
            }
            btsVar2.e0(-1633490746);
            boolean k2 = btsVar2.k(obj) | btsVar2.a(booleanValue);
            Object Q2 = btsVar2.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = s4b1.e(rbvVar, context, booleanValue);
                btsVar2.o0(Q2);
            }
            hev hevVar = (hev) Q2;
            btsVar2.t(false);
            c f4 = a.f();
            btsVar2.e0(5004770);
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = new e350(23, slsVar4);
                btsVar2.o0(Q3);
            }
            tls tlsVar2 = (tls) Q3;
            btsVar2.t(false);
            btsVar2.e0(5004770);
            boolean z = (i4 & 896) == 256;
            Object Q4 = btsVar2.Q();
            if (z || Q4 == o430Var) {
                Q4 = new ec01(19, tlsVar);
                btsVar2.o0(Q4);
            }
            tls tlsVar3 = (tls) Q4;
            Object k3 = g8e.k(5004770, btsVar2, false);
            if (k3 == o430Var) {
                k3 = new e350(24, slsVar3);
                btsVar2.o0(k3);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            coil.compose.b.b(hevVar, f4, f530Var, tlsVar2, tlsVar3, (tls) k3, jt1Var2, nheVar2, f2, i3, btsVar, ((i5 << 3) & 7168) | 1794096, 3510);
            slsVar5 = slsVar4;
            slsVar6 = slsVar3;
            jt1Var3 = jt1Var2;
            nheVar3 = nheVar2;
            f3 = f2;
            i6 = i3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f530Var, nheVar3, jt1Var3, f3, i6, slsVar5, tlsVar, slsVar6, i2) { // from class: lp51
                public final /* synthetic */ tls A;
                public final /* synthetic */ sls B;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ nhe c;
                public final /* synthetic */ jt1 w;
                public final /* synthetic */ float x;
                public final /* synthetic */ int y;
                public final /* synthetic */ sls z;

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int O = vng.O(49);
                    az91.d(rbv.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj2, O);
                    return zy11.a;
                }
            };
        }
    }
}
