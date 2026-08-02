package com.yandex.passport.sloth.ui;

import android.R;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.yandex.passport.sloth.ui.error.ButtonMode;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c36;
import defpackage.c530;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.did;
import defpackage.eq11;
import defpackage.f530;
import defpackage.f5z;
import defpackage.ffx;
import defpackage.fid;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.k50;
import defpackage.kla1;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lz40;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qic;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r1b0;
import defpackage.rfc;
import defpackage.rs31;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tls;
import defpackage.vqy0;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yd00;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class w {
    public static final void a(com.yandex.passport.sloth.ui.error.d dVar, com.yandex.passport.sloth.ui.string.a aVar, com.yandex.passport.common.ui.progress.g gVar, sls slsVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        Integer num;
        pa90 rfcVar;
        Integer num2;
        boolean z;
        c530 c530Var;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-36015687);
        int i2 = i | (btsVar.k(dVar) ? 4 : 2) | (btsVar.k(aVar) ? 32 : 16) | (btsVar.k(gVar) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | ImageMetadata.EDGE_MODE;
        if ((74899 & i2) == 74898 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            ButtonMode buttonMode = dVar.c;
            int i3 = buttonMode == null ? -1 : m.a[buttonMode.ordinal()];
            if (i3 == -1 || i3 == 1) {
                num = null;
            } else if (i3 == 2) {
                num = Integer.valueOf(R.string.cancel);
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                num = Integer.valueOf(((com.yandex.passport.internal.ui.sloth.k) aVar).a(SlothString.CLOSE));
            }
            com.yandex.passport.common.ui.progress.f fVar = gVar.c;
            k3r k3rVar = ljs0.c;
            Integer num3 = num;
            if (fVar instanceof com.yandex.passport.common.ui.progress.d) {
                btsVar.e0(1091950918);
                rfcVar = mt71.m(((com.yandex.passport.common.ui.progress.d) fVar).a, 0, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(1092039423);
                rfcVar = new rfc(((agc) btsVar.m(dgc.a)).n);
                btsVar.t(false);
            }
            f530 j0 = cma1.j0(k3rVar, rfcVar, null, mhe.g, 0.0f, null, 54);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, j0);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(-1495303707);
            if (dVar.a) {
                com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.common.ui.progress.p.c(gVar, null, btsVar, (i2 >> 6) & 14, 2);
            }
            btsVar.t(false);
            btsVar.e0(-1495300222);
            if (dVar.e) {
                num2 = num3;
                z = false;
                o4b1.b(mt71.m(d.passport_sloth_unexpected_error, 0, btsVar), null, null, null, null, 0.0f, new c36(((agc) btsVar.m(dgc.a)).a, 5), btsVar, 48, 60);
            } else {
                num2 = num3;
                z = false;
            }
            btsVar.t(z);
            btsVar.e0(-1495289754);
            SlothString slothString = dVar.b;
            c530 c530Var2 = c530.a;
            if (slothString != null) {
                c530Var = c530Var2;
                vqy0.c(ohb1.e(btsVar, ((com.yandex.passport.internal.ui.sloth.k) aVar).a(slothString)), an91.o(an91.m(c530Var2, 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13), ((agc) btsVar.m(dgc.a)).a, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).k, btsVar, 48, 0, 130040);
                btsVar = btsVar;
            } else {
                c530Var = c530Var2;
            }
            btsVar.t(z);
            btsVar.e0(-1495274894);
            if (num2 != null) {
                btsVar.e0(-1495272942);
                boolean z2 = ((i2 & 7168) == 2048 ? true : z) | ((i2 & 14) != 4 ? z : true) | ((i2 & HProv.ALG_CLASS_ALL) == 16384 ? true : z);
                Object Q = btsVar.Q();
                if (z2 || Q == did.a) {
                    Q = new com.yandex.passport.internal.ui.bouncer.chooser.d(dVar, slsVar, tlsVar);
                    btsVar.o0(Q);
                }
                btsVar.t(z);
                bts btsVar2 = btsVar;
                androidx.compose.material3.a.a((sls) Q, an91.o(c530Var, 0.0f, 14.0f, 0.0f, 0.0f, 13), false, null, null, null, null, wwg.S(1815316467, true, new com.yandex.passport.internal.flags.presentation.y(2, num2), btsVar), btsVar2, 805306416, 508);
                btsVar = btsVar2;
            }
            btsVar.t(z);
            btsVar.t(true);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.flags.presentation.r0(dVar, aVar, gVar, slsVar, tlsVar, f530Var2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if ((r32 & 2) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(com.yandex.passport.sloth.ui.dependencies.c cVar, String str, fid fidVar, int i, int i2) {
        String str2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Object Q;
        rs31 a;
        lz40 lz40Var;
        p pVar;
        Object obj;
        boolean z3;
        Object obj2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1161295754);
        int i5 = i | (btsVar2.k(cVar) ? 4 : 2);
        if ((i2 & 2) == 0) {
            str2 = str;
            if (btsVar2.k(str2)) {
                i3 = 32;
                i4 = i5 | i3;
                if ((i4 & 19) == 18 || !btsVar2.E()) {
                    btsVar2.a0();
                    if ((i & 1) != 0 || btsVar2.C()) {
                        if ((i2 & 2) != 0) {
                            str2 = qoi0.a(z1.class).c();
                            if (str2 == null) {
                                str2 = "";
                            }
                            i4 &= -113;
                        }
                        btsVar2.u();
                        btsVar2.e0(1138402651);
                        int i6 = i4 & 14;
                        final int i7 = 0;
                        z = i6 != 4;
                        Object Q2 = btsVar2.Q();
                        o430 o430Var = did.a;
                        Object obj3 = Q2;
                        if (!z || Q2 == o430Var) {
                            a aVar = new a(new q(), cVar);
                            btsVar2.o0(aVar);
                            obj3 = aVar;
                        }
                        k kVar = (k) obj3;
                        btsVar2.t(false);
                        btsVar2.e0(1138409380);
                        z2 = i6 != 4;
                        Q = btsVar2.Q();
                        if (!z2 || Q == o430Var) {
                            b1 slothUiInteractor = cVar.getSlothUiInteractor();
                            slothUiInteractor.getClass();
                            com.yandex.passport.sloth.dependencies.h slothUrlProvider = cVar.getSlothUrlProvider();
                            slothUrlProvider.getClass();
                            l slothComposeUIReporter = cVar.getSlothComposeUIReporter();
                            slothComposeUIReporter.getClass();
                            new a2();
                            new com.arkivanov.mvikotlin.main.store.a();
                            com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                            oVar.a = slothUiInteractor;
                            oVar.b = slothComposeUIReporter;
                            oVar.c = slothUrlProvider;
                            p1 p1Var = new p1(oVar);
                            btsVar2.o0(p1Var);
                            Q = p1Var;
                        }
                        p1 p1Var2 = (p1) Q;
                        btsVar2.t(false);
                        a = f5z.a(btsVar2);
                        if (a != null) {
                            ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        String str3 = str2;
                        final z1 z1Var = (z1) ooc.G(qoi0.a(z1.class), a, str2, p1Var2, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
                        Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
                        a aVar2 = (a) kVar;
                        com.yandex.passport.sloth.ui.dependencies.c cVar2 = aVar2.a;
                        com.yandex.passport.sloth.ui.dependencies.c cVar3 = aVar2.a;
                        l slothComposeUIReporter2 = cVar2.getSlothComposeUIReporter();
                        q5z.h(slothComposeUIReporter2);
                        btsVar2.e0(1138432843);
                        boolean k = btsVar2.k(slothComposeUIReporter2) | btsVar2.k(context);
                        Object Q3 = btsVar2.Q();
                        Object obj4 = Q3;
                        if (k || Q3 == o430Var) {
                            l slothComposeUIReporter3 = cVar3.getSlothComposeUIReporter();
                            q5z.h(slothComposeUIReporter3);
                            com.yandex.passport.sloth.ui.string.a stringRepository = cVar3.getStringRepository();
                            q5z.h(stringRepository);
                            com.yandex.passport.sloth.ui.dependencies.d slothDebugInformationDelegate = cVar3.getSlothDebugInformationDelegate();
                            q5z.h(slothDebugInformationDelegate);
                            h hVar = new h(context, slothComposeUIReporter3, stringRepository, slothDebugInformationDelegate);
                            btsVar2.o0(hVar);
                            obj4 = hVar;
                        }
                        h hVar2 = (h) obj4;
                        btsVar2.t(false);
                        oz40 b = androidx.compose.runtime.f.b(z1Var.c, btsVar2);
                        com.yandex.passport.sloth.ui.dependencies.q slothWishConsumer = cVar3.getSlothWishConsumer();
                        q5z.h(slothWishConsumer);
                        l slothComposeUIReporter4 = cVar3.getSlothComposeUIReporter();
                        q5z.h(slothComposeUIReporter4);
                        p pVar2 = new p(slothWishConsumer, slothComposeUIReporter4);
                        k50 k50Var = new k50();
                        btsVar2.e0(1138451045);
                        boolean e = btsVar2.e(hVar2) | btsVar2.e(z1Var);
                        Object Q4 = btsVar2.Q();
                        Object obj5 = Q4;
                        if (e || Q4 == o430Var) {
                            s sVar = new s(i7, hVar2, z1Var);
                            btsVar2.o0(sVar);
                            obj5 = sVar;
                        }
                        btsVar2.t(false);
                        yd00 e2 = kla1.e(k50Var, (tls) obj5, btsVar2, 0);
                        btsVar2.e0(1138457789);
                        Object Q5 = btsVar2.Q();
                        Object obj6 = Q5;
                        if (Q5 == o430Var) {
                            kotlinx.coroutines.flow.n0 c = ffx.c(0, 0, null, 7);
                            btsVar2.o0(c);
                            obj6 = c;
                        }
                        lz40 lz40Var2 = (lz40) obj6;
                        btsVar2.t(false);
                        btsVar2.e0(1138461594);
                        boolean e3 = btsVar2.e(z1Var) | btsVar2.e(lz40Var2) | btsVar2.e(hVar2) | btsVar2.e(e2) | btsVar2.e(pVar2);
                        Object Q6 = btsVar2.Q();
                        if (e3 || Q6 == o430Var) {
                            lz40Var = lz40Var2;
                            Q6 = new SlothScreenContentKt$SlothScreenContent$1$1(e2, lz40Var, hVar2, z1Var, pVar2, null);
                            pVar = pVar2;
                            btsVar2.o0(Q6);
                        } else {
                            lz40Var = lz40Var2;
                            pVar = pVar2;
                        }
                        btsVar2.t(false);
                        zy11 zy11Var = zy11.a;
                        zpn.e(btsVar2, (wls) Q6, zy11Var);
                        btsVar2.e0(1138507566);
                        boolean e4 = btsVar2.e(hVar2);
                        Object Q7 = btsVar2.Q();
                        Object obj7 = Q7;
                        if (e4 || Q7 == o430Var) {
                            SlothScreenContentKt$SlothScreenContent$2$1 slothScreenContentKt$SlothScreenContent$2$1 = new SlothScreenContentKt$SlothScreenContent$2$1(hVar2, null);
                            btsVar2.o0(slothScreenContentKt$SlothScreenContent$2$1);
                            obj7 = slothScreenContentKt$SlothScreenContent$2$1;
                        }
                        btsVar2.t(false);
                        zpn.e(btsVar2, (wls) obj7, zy11Var);
                        r slothNetworkStatus = cVar3.getSlothNetworkStatus();
                        q5z.h(slothNetworkStatus);
                        btsVar2.e0(1138511811);
                        boolean e5 = btsVar2.e(aVar2) | btsVar2.e(z1Var);
                        Object Q8 = btsVar2.Q();
                        Object obj8 = Q8;
                        if (e5 || Q8 == o430Var) {
                            SlothScreenContentKt$SlothScreenContent$3$1 slothScreenContentKt$SlothScreenContent$3$1 = new SlothScreenContentKt$SlothScreenContent$3$1(aVar2, z1Var, null);
                            btsVar2.o0(slothScreenContentKt$SlothScreenContent$3$1);
                            obj8 = slothScreenContentKt$SlothScreenContent$3$1;
                        }
                        btsVar2.t(false);
                        zpn.e(btsVar2, (wls) obj8, slothNetworkStatus);
                        com.yandex.passport.common.common.a applicationDetailsProvider = cVar3.getApplicationDetailsProvider();
                        q5z.h(applicationDetailsProvider);
                        btsVar2.e0(1138537044);
                        boolean e6 = btsVar2.e(hVar2);
                        Object Q9 = btsVar2.Q();
                        Object obj9 = Q9;
                        if (e6 || Q9 == o430Var) {
                            com.yandex.passport.internal.ui.bouncer.challenge.e eVar = new com.yandex.passport.internal.ui.bouncer.challenge.e(2, hVar2);
                            btsVar2.o0(eVar);
                            obj9 = eVar;
                        }
                        tls tlsVar = (tls) obj9;
                        btsVar2.t(false);
                        btsVar2.e0(1138540050);
                        boolean e7 = btsVar2.e(pVar);
                        Object Q10 = btsVar2.Q();
                        Object obj10 = Q10;
                        if (e7 || Q10 == o430Var) {
                            u uVar = new u(pVar, 2);
                            btsVar2.o0(uVar);
                            obj10 = uVar;
                        }
                        sls slsVar = (sls) obj10;
                        btsVar2.t(false);
                        btsVar2.e0(1138543393);
                        boolean e8 = btsVar2.e(hVar2) | btsVar2.e(pVar);
                        Object Q11 = btsVar2.Q();
                        Object obj11 = Q11;
                        if (e8 || Q11 == o430Var) {
                            s sVar2 = new s(1, hVar2, pVar);
                            btsVar2.o0(sVar2);
                            obj11 = sVar2;
                        }
                        tls tlsVar2 = (tls) obj11;
                        btsVar2.t(false);
                        btsVar2.e0(1138548840);
                        boolean e9 = btsVar2.e(z1Var);
                        Object Q12 = btsVar2.Q();
                        Object obj12 = Q12;
                        if (e9 || Q12 == o430Var) {
                            sls slsVar2 = new sls() { // from class: com.yandex.passport.sloth.ui.v
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i8 = i7;
                                    zy11 zy11Var2 = zy11.a;
                                    z1 z1Var2 = z1Var;
                                    switch (i8) {
                                        case 0:
                                            z1Var2.W(v1.a);
                                            break;
                                        case 1:
                                            z1Var2.W(new x1(v0.a));
                                            break;
                                        default:
                                            z1Var2.W(w1.a);
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            };
                            btsVar2.o0(slsVar2);
                            obj12 = slsVar2;
                        }
                        sls slsVar3 = (sls) obj12;
                        btsVar2.t(false);
                        btsVar2.e0(1138551992);
                        boolean e10 = btsVar2.e(pVar);
                        Object Q13 = btsVar2.Q();
                        Object obj13 = Q13;
                        if (e10 || Q13 == o430Var) {
                            u uVar2 = new u(pVar, 3);
                            btsVar2.o0(uVar2);
                            obj13 = uVar2;
                        }
                        sls slsVar4 = (sls) obj13;
                        btsVar2.t(false);
                        btsVar2.e0(1138555071);
                        boolean e11 = btsVar2.e(z1Var);
                        p pVar3 = pVar;
                        Object Q14 = btsVar2.Q();
                        if (e11 || Q14 == o430Var) {
                            final int i8 = 1;
                            sls slsVar5 = new sls() { // from class: com.yandex.passport.sloth.ui.v
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i82 = i8;
                                    zy11 zy11Var2 = zy11.a;
                                    z1 z1Var2 = z1Var;
                                    switch (i82) {
                                        case 0:
                                            z1Var2.W(v1.a);
                                            break;
                                        case 1:
                                            z1Var2.W(new x1(v0.a));
                                            break;
                                        default:
                                            z1Var2.W(w1.a);
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            };
                            btsVar2.o0(slsVar5);
                            obj = slsVar5;
                        } else {
                            obj = Q14;
                        }
                        sls slsVar6 = (sls) obj;
                        btsVar2.t(false);
                        btsVar2.e0(1138558439);
                        boolean e12 = btsVar2.e(z1Var);
                        Object Q15 = btsVar2.Q();
                        Object obj14 = Q15;
                        if (e12 || Q15 == o430Var) {
                            final int i9 = 2;
                            sls slsVar7 = new sls() { // from class: com.yandex.passport.sloth.ui.v
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i82 = i9;
                                    zy11 zy11Var2 = zy11.a;
                                    z1 z1Var2 = z1Var;
                                    switch (i82) {
                                        case 0:
                                            z1Var2.W(v1.a);
                                            break;
                                        case 1:
                                            z1Var2.W(new x1(v0.a));
                                            break;
                                        default:
                                            z1Var2.W(w1.a);
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            };
                            btsVar2.o0(slsVar7);
                            obj14 = slsVar7;
                        }
                        sls slsVar8 = (sls) obj14;
                        btsVar2.t(false);
                        btsVar2.e0(1138561166);
                        boolean e13 = btsVar2.e(z1Var);
                        Object Q16 = btsVar2.Q();
                        Object obj15 = Q16;
                        if (e13 || Q16 == o430Var) {
                            t tVar = new t(z1Var, 2);
                            btsVar2.o0(tVar);
                            obj15 = tVar;
                        }
                        tls tlsVar3 = (tls) obj15;
                        btsVar2.t(false);
                        btsVar2.e0(1138564171);
                        boolean e14 = btsVar2.e(z1Var);
                        Object Q17 = btsVar2.Q();
                        if (e14 || Q17 == o430Var) {
                            z3 = false;
                            t tVar2 = new t(z1Var, 0);
                            btsVar2.o0(tVar2);
                            obj2 = tVar2;
                        } else {
                            z3 = false;
                            obj2 = Q17;
                        }
                        btsVar2.t(z3);
                        boolean z4 = z3;
                        e2.a(aVar2, lz40Var, applicationDetailsProvider, tlsVar, slsVar, tlsVar2, slsVar3, slsVar4, slsVar6, slsVar8, tlsVar3, (tls) obj2, false, btsVar2, 0);
                        com.yandex.passport.sloth.ui.error.d dVar = ((q1) b.getValue()).b;
                        if (dVar == null) {
                            btsVar = btsVar2;
                        } else {
                            com.yandex.passport.sloth.ui.string.a stringRepository2 = cVar3.getStringRepository();
                            q5z.h(stringRepository2);
                            com.yandex.passport.common.ui.progress.g progressProperties = cVar3.getProgressProperties();
                            q5z.h(progressProperties);
                            btsVar2.e0(1802579033);
                            boolean e15 = btsVar2.e(pVar3);
                            Object Q18 = btsVar2.Q();
                            Object obj16 = Q18;
                            if (e15 || Q18 == o430Var) {
                                u uVar3 = new u(pVar3, z4 ? 1 : 0);
                                btsVar2.o0(uVar3);
                                obj16 = uVar3;
                            }
                            sls slsVar9 = (sls) obj16;
                            btsVar2.t(z4);
                            btsVar2.e0(1802582318);
                            boolean e16 = btsVar2.e(z1Var);
                            Object Q19 = btsVar2.Q();
                            Object obj17 = Q19;
                            if (e16 || Q19 == o430Var) {
                                t tVar3 = new t(z1Var, 1);
                                btsVar2.o0(tVar3);
                                obj17 = tVar3;
                            }
                            btsVar2.t(z4);
                            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                            btsVar = btsVar2;
                            a(dVar, stringRepository2, progressProperties, slsVar9, (tls) obj17, null, btsVar, 0);
                        }
                        str2 = str3;
                    } else {
                        btsVar2.Y();
                    }
                } else {
                    btsVar2.Y();
                    btsVar = btsVar2;
                }
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new com.yandex.passport.internal.flags.presentation.d1(cVar, str2, i, i2);
                    return;
                }
                return;
            }
        } else {
            str2 = str;
        }
        i3 = 16;
        i4 = i5 | i3;
        if ((i4 & 19) == 18) {
        }
        btsVar2.a0();
        if ((i & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        btsVar2.u();
        btsVar2.e0(1138402651);
        int i62 = i4 & 14;
        final int i72 = 0;
        if (i62 != 4) {
        }
        Object Q22 = btsVar2.Q();
        o430 o430Var2 = did.a;
        Object obj32 = Q22;
        if (!z) {
        }
        a aVar3 = new a(new q(), cVar);
        btsVar2.o0(aVar3);
        obj32 = aVar3;
        k kVar2 = (k) obj32;
        btsVar2.t(false);
        btsVar2.e0(1138409380);
        if (i62 != 4) {
        }
        Q = btsVar2.Q();
        if (!z2) {
        }
        b1 slothUiInteractor2 = cVar.getSlothUiInteractor();
        slothUiInteractor2.getClass();
        com.yandex.passport.sloth.dependencies.h slothUrlProvider2 = cVar.getSlothUrlProvider();
        slothUrlProvider2.getClass();
        l slothComposeUIReporter5 = cVar.getSlothComposeUIReporter();
        slothComposeUIReporter5.getClass();
        new a2();
        new com.arkivanov.mvikotlin.main.store.a();
        com.yandex.passport.internal.ui.challenge.vpn.o oVar2 = new com.yandex.passport.internal.ui.challenge.vpn.o();
        oVar2.a = slothUiInteractor2;
        oVar2.b = slothComposeUIReporter5;
        oVar2.c = slothUrlProvider2;
        p1 p1Var3 = new p1(oVar2);
        btsVar2.o0(p1Var3);
        Q = p1Var3;
        p1 p1Var22 = (p1) Q;
        btsVar2.t(false);
        a = f5z.a(btsVar2);
        if (a != null) {
        }
    }
}
