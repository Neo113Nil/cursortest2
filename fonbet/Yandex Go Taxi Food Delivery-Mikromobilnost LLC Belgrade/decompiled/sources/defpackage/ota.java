package defpackage;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class ota implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ota(q5n q5nVar) {
        this.a = 20;
        this.b = q5nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 9;
        a aVar = null;
        int i3 = 6;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                jva jvaVar = (jva) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                } else if (jvaVar.b != null) {
                    btsVar.e0(-2075176812);
                    tdb1.d(ibp0Var, jvaVar.b, null, null, null, null, 0.0f, 0, null, btsVar, intValue & 14, 510);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-2075113975);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
                }
                return zy11Var;
            case 1:
                apb apbVar = (apb) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    jeb1.f(apbVar.c.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 0, 0, 16382);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                bpb bpbVar = (bpb) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    p9b1.c(ebp0Var, bpbVar.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 8190);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                xni xniVar = (xni) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.G, btsVar4, 0);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o = btsVar4.o();
                    f530 d = b.d(btsVar4, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a);
                    qje.W(btsVar4, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar4, hashCode, wlsVar);
                    }
                    qje.W(btsVar4, d.d, d);
                    boolean e = btsVar4.e(xniVar);
                    Object Q = btsVar4.Q();
                    if (e || Q == did.a) {
                        Q = new od9(28, xniVar);
                        btsVar4.o0(Q);
                    }
                    androidx.compose.ui.viewinterop.b.a((tls) Q, null, null, btsVar4, 0, 6);
                    WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                    pi6.a(o9a1.e(c530Var, vuz.o(btsVar4).g), btsVar4, 0);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                myc mycVar = (myc) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ymb1.e(mycVar.a, null, mycVar.d, null, mycVar.e, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, 0, 0, 65514);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fvd fvdVar = (fvd) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    jeb1.f(fvdVar.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar6).g.b, btsVar6, 0, 0, 16382);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                bzd bzdVar = (bzd) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    bzdVar.getClass();
                    throw null;
                }
                btsVar7.Y();
                return zy11Var;
            case 7:
                fbe fbeVar = (fbe) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    wpb1.d(fbeVar.a, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                u1f u1fVar = (u1f) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    ypb1.b(u1fVar.a, btsVar9, 0);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                zfe zfeVar = (zfe) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    qgy.b(zfeVar.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar10).g.b, null, btsVar10, 0, 0, 12286);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                mre mreVar = (mre) obj4;
                int intValue11 = ((Integer) obj).intValue();
                int intValue12 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue11 = mreVar.B.j(intValue11);
                }
                if (!booleanValue) {
                    intValue12 = mreVar.B.j(intValue12);
                }
                if (mreVar.z) {
                    long j = mreVar.w.b;
                    int i4 = asy0.c;
                    if (intValue11 != ((int) (j >> 32)) || intValue12 != ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                        if (Math.min(intValue11, intValue12) >= 0 && Math.max(intValue11, intValue12) <= mreVar.w.a.b.length()) {
                            if (booleanValue || intValue11 == intValue12) {
                                j jVar = mreVar.C;
                                jVar.u(false);
                                jVar.r(HandleState.None);
                            } else {
                                mreVar.C.h(true);
                            }
                            mreVar.x.v.invoke(new hoy0(mreVar.w.a, eja1.c(intValue11, intValue12), (asy0) null));
                            return Boolean.valueOf(r15);
                        }
                        j jVar2 = mreVar.C;
                        jVar2.u(false);
                        jVar2.r(HandleState.None);
                    }
                }
                r15 = false;
                return Boolean.valueOf(r15);
            case 11:
                qte qteVar = (qte) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    hsb1.a(qteVar, btsVar11, 0);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 12:
                yte yteVar = (yte) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    String str = yteVar.e;
                    jeb1.f(str == null ? "" : str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar12).g.b, btsVar12, 0, 0, 16382);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 13:
                t0f t0fVar = (t0f) obj4;
                fid fidVar13 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    sic a2 = qic.a(new i43(1.0f, true, new quz(11)), x4c.G, btsVar13, 6);
                    int hashCode2 = Long.hashCode(btsVar13.T);
                    r1b0 o2 = btsVar13.o();
                    f530 d2 = b.d(btsVar13, c);
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
                    qje.W(btsVar13, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar13, d.h);
                    qje.W(btsVar13, d.d, d2);
                    qgy.b(t0fVar.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 1, 0, xya1.d(btsVar13).g.a, null, btsVar13, 805309440, 6, 10742);
                    CharSequence charSequence = t0fVar.f;
                    CharSequence charSequence2 = (charSequence == null || evu0.J(charSequence)) ? null : charSequence;
                    if (charSequence2 == null) {
                        btsVar13.e0(1896294443);
                        btsVar13.t(false);
                    } else {
                        btsVar13.e0(1896294444);
                        qgy.b(charSequence2, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.d(btsVar13).h.a, null, btsVar13, 805309440, 6, 10742);
                        btsVar13.t(false);
                    }
                    btsVar13.t(true);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 14:
                xfh xfhVar = (xfh) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    CharSequence charSequence3 = xfhVar.d;
                    if (charSequence3 == null || charSequence3.length() == 0) {
                        btsVar14.e0(-1255934099);
                        btsVar14.t(false);
                    } else {
                        btsVar14.e0(-1256173636);
                        qgy.b(xfhVar.d, null, i891.d(c530Var, xfhVar.j), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(6), 0L, 0, 0, 0, null, null, btsVar14, HProv.ALG_TYPE_SECURECHANNEL, 0, 16242);
                        btsVar14.t(false);
                    }
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 15:
                exh exhVar = (exh) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    zgb1.b(exhVar.a, exhVar.b, null, x4c.H, 0, false, null, null, null, null, btsVar15, HProv.ALG_TYPE_SECURECHANNEL, 1012);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 16:
                kfj kfjVar = (kfj) obj4;
                fid fidVar16 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    qgy.b(kfjVar.a, null, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar16).h.b, null, btsVar16, 384, 0, 12282);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 17:
                hlj hljVar = (hlj) obj4;
                fid fidVar17 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    qgy.b(hljVar.a, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar17).g.a, null, btsVar17, 3456, 0, 12274);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 18:
                f31 f31Var = (f31) obj4;
                fid fidVar18 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    jeb1.f(f31Var.d, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar18).g.b, btsVar18, 805306416, 48, 13820);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 19:
                m5n m5nVar = (m5n) obj4;
                fid fidVar19 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
                    cyu0 cyu0Var = m5nVar.c;
                    cyu0 cyu0Var2 = !evu0.J(cyu0Var.a) ? cyu0Var : null;
                    cyu0 cyu0Var3 = m5nVar.d;
                    aib1.c(m, cyu0Var2, (cyu0Var3 == null || evu0.J(cyu0Var3.a)) ? null : cyu0Var3, x4c.H, btsVar19, 3078, 0);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 20:
                q5n q5nVar = (q5n) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    v4v v4vVar = q5nVar.c;
                    if (v4vVar == null) {
                        btsVar20.e0(-508766506);
                        btsVar20.t(false);
                    } else {
                        btsVar20.e0(-508766505);
                        aVar = wwg.S(1076248445, true, new mb(v4vVar, i2), btsVar20);
                        btsVar20.t(false);
                    }
                    a aVar2 = aVar;
                    a S = wwg.S(-630428392, true, new loj(8, q5nVar), btsVar20);
                    w6d.a.getClass();
                    web1.c(c530.a, 0.0f, false, 0.0f, null, aVar2, S, null, null, w6d.b, null, oa01.a, false, btsVar20, 806879232, 0, 5534);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 21:
                f6n f6nVar = (f6n) obj4;
                fid fidVar21 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    String str2 = f6nVar.e;
                    if (str2 == null) {
                        btsVar21.e0(-960131843);
                        btsVar21.t(false);
                    } else {
                        btsVar21.e0(-960131842);
                        aVar = wwg.S(1512672260, true, new q0(str2, 21), btsVar21);
                        btsVar21.t(false);
                    }
                    a aVar3 = aVar;
                    a S2 = wwg.S(-1179656136, true, new loj(i2, f6nVar), btsVar21);
                    y6d.a.getClass();
                    web1.c(c530.a, 0.0f, false, 0.0f, null, aVar3, S2, null, null, y6d.b, null, oa01.a, false, btsVar21, 806879232, 0, 5534);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 22:
                ((com.yandex.messaging.internal.view.input.edit.a) obj4).F.onRecreatedMentions(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3);
                return zy11Var;
            case 23:
                yel0 yel0Var = (yel0) obj4;
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar22 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((bts) fidVar22).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue24 & 1, (intValue24 & 19) != 18)) {
                    p9b1.c(ebp0Var2, yel0Var.a, c530.a, tp2.a, xya1.e(btsVar22).g.a, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar22).h.a, 2, Integer.MAX_VALUE, null, btsVar22, intValue24 & 14, 0, 0);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 24:
                ju2 ju2Var = (ju2) obj4;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar23 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((bts) fidVar23).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(intValue25 & 1, (intValue25 & 19) != 18)) {
                    au2 au2Var = ju2Var.a;
                    wp2 wp2Var = ju2Var.b;
                    if (wp2Var == null) {
                        wp2Var = tp2.a;
                    }
                    udb1.c(ibp0Var2, au2Var, null, wp2Var, btsVar23, intValue25 & 14, 6);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 25:
                tls tlsVar = (tls) obj2;
                Boolean bool = (Boolean) ((mum) obj4).a;
                tlsVar.invoke(Boolean.valueOf(bool != null ? bool.booleanValue() : apa1.e(FeatureFlag.DEBRANDING_FLAG)));
                return zy11Var;
            case 26:
                l611 l611Var = (l611) obj4;
                fid fidVar24 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                bts btsVar24 = (bts) fidVar24;
                if (btsVar24.V(intValue26 & 1, (intValue26 & 17) != 16)) {
                    qb91.a(ljs0.b(c530Var, 0.0f, SlotSize.XS.getSize(), 1), new zrm(i3, Ellipse$Size.BIG, qb91.b(l611Var.g)), 0.0f, Float.valueOf(4.0f), new ldc(ldc.f), btsVar24, 221248, 76);
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 27:
                p6o p6oVar = (p6o) obj4;
                fid fidVar25 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                bts btsVar25 = (bts) fidVar25;
                if (btsVar25.V(intValue27 & 1, (intValue27 & 17) != 16)) {
                    jeb1.f((String) p6oVar.e.b, an91.l(c530Var, 16.0f, 7.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar25).g.b, btsVar25, 48, 0, 16380);
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 28:
                zrm zrmVar = (zrm) obj4;
                fid fidVar26 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                bts btsVar26 = (bts) fidVar26;
                if (btsVar26.V(intValue28 & 1, (intValue28 & 17) != 16)) {
                    jeb1.f((String) zrmVar.b, an91.l(c530Var, 16.0f, 7.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar26).g.b, btsVar26, 48, 0, 16380);
                } else {
                    btsVar26.Y();
                }
                return zy11Var;
            default:
                uep uepVar = (uep) obj4;
                fid fidVar27 = (fid) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                bts btsVar27 = (bts) fidVar27;
                if (btsVar27.V(intValue29 & 1, (intValue29 & 17) != 16)) {
                    f530 o3 = an91.o(c530.a, 16.0f, 0.0f, 16.0f, 12.0f, 2);
                    String str3 = uepVar.a;
                    jeb1.f(str3 == null ? "" : str3, o3, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar27).e.d, btsVar27, 48, 0, 16380);
                } else {
                    btsVar27.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ ota(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ ota(f6n f6nVar) {
        this.a = 21;
        this.b = f6nVar;
    }
}
