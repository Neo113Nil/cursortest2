package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import com.yandex.go.summary.ui.compose.common.selector.a;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.passport.PassportAccountNotAuthorizedExceptionAdapter;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.logistics.sdk.ui_models.form.slot.SlotLead$LeadIcon$IconStyle;

/* loaded from: classes11.dex */
public final /* synthetic */ class ls40 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ls40(tls tlsVar, shi0 shi0Var, tls tlsVar2) {
        this.a = 7;
        this.w = tlsVar;
        this.b = shi0Var;
        this.c = tlsVar2;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        ctm0 ctm0Var = (ctm0) this.b;
        tls tlsVar = (tls) this.w;
        atm0 atm0Var = (atm0) this.c;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        int i = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            boolean z = !ctm0Var.g;
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new wzl0(10, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), z, ButtonSize.XS, buttonStyle, ButtonForm.Circle, (sls) Q, wwg.S(1979730472, true, new ssm0(atm0Var, i), btsVar), btsVar, 1576320, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ctm0 ctm0Var = (ctm0) this.b;
        tls tlsVar = (tls) this.w;
        zsm0 zsm0Var = (zsm0) this.c;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        int i = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            boolean z = !ctm0Var.g;
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new wzl0(11, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), z, ButtonSize.XS, buttonStyle, ButtonForm.Circle, (sls) Q, wwg.S(-1599353106, true, new qsm0(zsm0Var, i), btsVar), btsVar, 1576320, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        ztm0 ztm0Var = (ztm0) this.b;
        fum0 fum0Var = (fum0) this.c;
        Object obj4 = (tls) this.w;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 4;
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 19) != 18);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        ytm0 ytm0Var = ztm0Var.d;
        c530 c530Var = c530.a;
        if (ytm0Var == null) {
            btsVar.e0(-100222958);
            nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            return zy11Var;
        }
        btsVar.e0(-1388706940);
        btsVar.t(false);
        boolean z = !fum0Var.b;
        f530 o = an91.o(c530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
        wp2 wp2Var = ytm0Var.b;
        CharSequence charSequence = ytm0Var.a;
        boolean k = btsVar.k(obj4) | btsVar.k(ytm0Var);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new tmm0(i, obj4, ytm0Var);
            btsVar.o0(Q);
        }
        o4b1.d(charSequence, o, z, wp2Var, null, (sls) Q, btsVar, 48, 16);
        return zy11Var;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        wls wlsVar;
        sls slsVar;
        wls wlsVar2;
        boolean z;
        cj6 cj6Var;
        boolean z2;
        ani0 ani0Var = (ani0) this.b;
        l3t0 l3t0Var = (l3t0) this.c;
        k9q0 k9q0Var = (k9q0) this.w;
        fid fidVar = (fid) obj2;
        ((Integer) obj3).getClass();
        uo5 uo5Var = x4c.b;
        so5 so5Var = x4c.G;
        jls jlsVar = (jls) ani0Var.a;
        if (jlsVar == null) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(-1645330216);
            btsVar.t(false);
        } else {
            ldc ldcVar = jlsVar.g;
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(-1645330215);
            dmw0 dmw0Var = btsVar2.a;
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            sic a = qic.a(lr20.c, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o2);
            wls wlsVar3 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            }
            qje.W(btsVar2, d.d, d);
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            int i = k9q0Var.b;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += ((Number) l3t0Var.getOrDefault(Integer.valueOf(i3), 0)).intValue();
            }
            float H = (fwiVar.H((((Number) l3t0Var.getOrDefault(Integer.valueOf(i), 0)).intValue() / 2) + i2) - 12.5f) + 2.0f;
            int i4 = wzg0.common_bubble_tail;
            if (ldcVar == null) {
                btsVar2.e0(-1852905028);
                j = ((el51) btsVar2.m(gl51.a)).d();
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1852906392);
                btsVar2.t(false);
                j = ldcVar.a;
            }
            s3b1.f(new cuj0(i4, null, null, new zez0(j), 22), sm91.f(c530Var, H, 0.0f, 2), null, btsVar2, 0, 4);
            f530 l = ymb1.l(c530Var, cyk0.c(16.0f));
            if (ldcVar == null) {
                btsVar2.e0(-1852894180);
                j2 = ((el51) btsVar2.m(gl51.a)).d();
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1852895544);
                btsVar2.t(false);
                j2 = ldcVar.a;
            }
            f530 b = m4m0.b(l, j2, qke.q);
            boolean z3 = jlsVar.d != null;
            boolean k = btsVar2.k(jlsVar);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new uyo0(17, jlsVar);
                btsVar2.o0(Q);
            }
            f530 c = rx21.c(b, z3, (tls) Q);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar2, 48);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d2 = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            wls wlsVar4 = d.f;
            qje.W(btsVar2, wlsVar4, a2);
            wls wlsVar5 = d.e;
            qje.W(btsVar2, wlsVar5, o3);
            wls wlsVar6 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar6);
            }
            wls wlsVar7 = d.d;
            qje.W(btsVar2, wlsVar7, d2);
            o430 o430Var2 = o430Var;
            v4v v4vVar = jlsVar.a;
            cj6 cj6Var2 = cj6.a;
            if (v4vVar == null) {
                btsVar2.e0(-1459702071);
                btsVar2.t(false);
                wlsVar2 = wlsVar7;
                slsVar = slsVar3;
                wlsVar = wlsVar4;
                cj6Var = cj6Var2;
                z = true;
            } else {
                btsVar2.e0(-1459702070);
                f530 m = ljs0.m(c530Var, 56.0f);
                z910 d3 = pi6.d(uo5Var, false);
                int hashCode3 = Long.hashCode(btsVar2.T);
                r1b0 o4 = btsVar2.o();
                f530 d4 = b.d(btsVar2, m);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar3);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar4, d3);
                qje.W(btsVar2, wlsVar5, o4);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar2, hashCode3, wlsVar6);
                }
                qje.W(btsVar2, wlsVar7, d4);
                wlsVar = wlsVar4;
                slsVar = slsVar3;
                wlsVar2 = wlsVar7;
                o430Var2 = o430Var2;
                s3b1.f(v4vVar, cj6Var2.a(c530Var, x4c.y), null, btsVar2, 0, 4);
                z = true;
                btsVar2.t(true);
                btsVar2.t(false);
                cj6Var = cj6Var2;
            }
            wls wlsVar8 = wlsVar;
            cj6 cj6Var3 = cj6Var;
            wls wlsVar9 = wlsVar2;
            o430 o430Var3 = o430Var2;
            int i5 = 0;
            zgb1.b(jlsVar.b, jlsVar.c, an91.o(new x2y(1.0f, z), 0.0f, 12.0f, 8.0f, 12.0f, 1), so5Var, 8388611, false, null, null, null, null, btsVar2, 27648, 992);
            bts btsVar3 = btsVar2;
            v4v v4vVar2 = jlsVar.e;
            if (v4vVar2 == null) {
                btsVar3.e0(-1458930357);
                btsVar3.t(false);
                z2 = true;
            } else {
                btsVar3.e0(-1458930356);
                pa31 pa31Var = new pa31(x4c.D);
                z910 d5 = pi6.d(uo5Var, false);
                int hashCode4 = Long.hashCode(btsVar3.T);
                r1b0 o5 = btsVar3.o();
                f530 d6 = b.d(btsVar3, pa31Var);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, wlsVar8, d5);
                qje.W(btsVar3, wlsVar5, o5);
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode4))) {
                    b64.z(hashCode4, btsVar3, hashCode4, wlsVar6);
                }
                qje.W(btsVar3, wlsVar9, d6);
                f530 o6 = an91.o(cj6Var3.a(c530Var, x4c.c), 0.0f, 6.0f, 6.0f, 0.0f, 9);
                boolean k2 = btsVar3.k(jlsVar);
                Object Q2 = btsVar3.Q();
                if (k2 || Q2 == o430Var3) {
                    Q2 = new c9q0(jlsVar, i5);
                    btsVar3.o0(Q2);
                }
                s3b1.c(v4vVar2, o6, false, null, false, null, (sls) Q2, btsVar3, 0, 60);
                btsVar3 = btsVar3;
                z2 = true;
                btsVar3.t(true);
                btsVar3.t(false);
            }
            tse0.t(btsVar3, z2, z2, false);
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        omq0 omq0Var = (omq0) this.b;
        tls tlsVar = (tls) this.w;
        tls tlsVar2 = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (omq0Var instanceof mmq0) {
            btsVar.e0(1814292269);
            a.b((mmq0) omq0Var, null, tlsVar, tlsVar2, btsVar, 0);
            btsVar.t(false);
        } else {
            if (!(omq0Var instanceof nmq0)) {
                throw unr0.y(58523475, btsVar, false);
            }
            btsVar.e0(1814559086);
            a.c((nmq0) omq0Var, null, tlsVar, tlsVar2, btsVar, 0);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        s8r0 s8r0Var = (s8r0) this.b;
        wp2 wp2Var = (wp2) this.c;
        wp2 wp2Var2 = (wp2) this.w;
        ebp0 ebp0Var = (ebp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            p9b1.c(ebp0Var, s8r0Var.b, an91.m(c530.a, 0.0f, 8.0f, 1), wp2Var, null, 0, 0, s8r0Var.d, wp2Var2, null, 0, 0, null, btsVar, (intValue & 14) | 384, 0, 7992);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        igr0 igr0Var = (igr0) this.b;
        ehr0 ehr0Var = (ehr0) this.c;
        m3u0 m3u0Var = (m3u0) this.w;
        f530 f530Var = (f530) obj;
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(-1897704375);
        eb2 h = hbb1.h(igr0Var, btsVar);
        long n = tje.n(igr0Var.a, btsVar);
        wxi0 wxi0Var = (wxi0) btsVar.m(xxi0.a);
        int i = 0;
        if (wxi0Var != null) {
            f530Var = f530Var.k(new mwo(wxi0Var, new ngr0(igr0Var, i)));
        }
        boolean k = btsVar.k(ehr0Var) | btsVar.e(h) | btsVar.k(igr0Var) | btsVar.k(m3u0Var) | btsVar.d(n);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            mgr0 mgr0Var = new mgr0(ehr0Var, h, igr0Var, m3u0Var, n, 0);
            btsVar.o0(mgr0Var);
            Q = mgr0Var;
        }
        f530 h2 = bb1.h(f530Var, (tls) Q);
        btsVar.t(false);
        return h2;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        psr0 psr0Var = (psr0) this.b;
        tls tlsVar = (tls) this.w;
        oz40 oz40Var = (oz40) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (((Boolean) oz40Var.getValue()).booleanValue()) {
            btsVar.e0(682137475);
            btsVar.t(false);
        } else {
            btsVar.e0(681836682);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            ccb1.a(psr0Var, tlsVar, an91.o(c530.a, 0.0f, 4.0f, 0.0f, w8a1.f(vuz.o(btsVar).g, btsVar).a() + 8.0f, 5), btsVar, 0, 0);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        aps0 aps0Var = (aps0) this.b;
        oz40 oz40Var = (oz40) this.c;
        tls tlsVar = (tls) this.w;
        dj6 dj6Var = (dj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            float f = yos0.b;
            float f2 = 56.0f - (f * 2.0f);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            float i = (n8e.i(dj6Var.b) - fwiVar.w0(f2)) - (fwiVar.w0(f) * 2.0f);
            float f3 = i < 0.0f ? 0.0f : i;
            yos0.a(aps0Var, btsVar, 0);
            jps0 jps0Var = aps0Var.d;
            if (jps0Var == null) {
                btsVar.e0(1858595990);
                btsVar.t(false);
            } else {
                btsVar.e0(1858595991);
                if (((Boolean) oz40Var.getValue()).booleanValue()) {
                    btsVar.e0(271489742);
                    btsVar.t(false);
                } else {
                    btsVar.e0(271105342);
                    boolean k = btsVar.k(tlsVar) | btsVar.k(aps0Var);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new xlp0(5, oz40Var, tlsVar, aps0Var);
                        btsVar.o0(Q);
                    }
                    yos0.c(jps0Var, f2, (sls) Q, aps0Var.e, f3, btsVar, 48);
                    btsVar.t(false);
                }
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        x6x0 x6x0Var = (x6x0) this.b;
        tls tlsVar = (tls) this.w;
        tls tlsVar2 = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            Iterator it = x6x0Var.c.iterator();
            while (it.hasNext()) {
                lkb1.c((l6x0) it.next(), tlsVar, tlsVar2, btsVar, 0);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        msz0 msz0Var = (msz0) this.b;
        yur yurVar = (yur) this.c;
        tls tlsVar = (tls) this.w;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            erb1.d(msz0Var.a, null, yurVar, tlsVar, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        nc01 nc01Var = (nc01) this.b;
        tls tlsVar = (tls) this.w;
        tpr tprVar = (tpr) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            rzo.b(null, "default", wwg.S(233081459, true, new w4f(8, nc01Var, tlsVar, tprVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        wg6 wg6Var = (wg6) this.b;
        la11 la11Var = (la11) this.c;
        tls tlsVar = (tls) this.w;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (((dtr0) wg6Var.g.getValue()).a != -2 && (la11Var instanceof ia11)) {
            btsVar.e0(1174232646);
            ia11 ia11Var = (ia11) la11Var;
            MultimodalRouteFabState multimodalRouteFabState = ia11Var.c;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new ec01(2, tlsVar);
                btsVar.o0(Q);
            }
            uqb1.a(multimodalRouteFabState, (tls) Q, ia11Var.d, btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.e0(1174766001);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        ab11 ab11Var = (ab11) this.b;
        androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) this.c;
        tls tlsVar = (tls) this.w;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            lub1.b(ab11Var.c, bVar, tlsVar, ab11Var.b, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.internal.a aVar;
        androidx.compose.runtime.internal.a aVar2;
        String str;
        String e;
        int i = this.a;
        int i2 = 11;
        int i3 = 19;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        int i4 = 16;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.w;
        Object obj5 = this.b;
        Object obj6 = this.c;
        final int i5 = 1;
        switch (i) {
            case 0:
                wg6 wg6Var = (wg6) obj5;
                bt40 bt40Var = (bt40) obj6;
                tls tlsVar = (tls) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                } else if (((dtr0) wg6Var.g.getValue()).a == -2) {
                    btsVar.e0(-585405100);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-585978817);
                    MultimodalRouteFabState multimodalRouteFabState = bt40Var.f;
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new adp(29, tlsVar);
                        btsVar.o0(Q);
                    }
                    uqb1.a(multimodalRouteFabState, (tls) Q, bt40Var.g, btsVar, 0);
                    btsVar.t(false);
                }
                return zy11Var;
            case 1:
                qb90 qb90Var = (qb90) obj5;
                String str2 = (String) obj6;
                sls slsVar = (sls) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Bitmap bitmap = qb90Var != null ? qb90Var.a : null;
                    if (bitmap != null) {
                        btsVar2.e0(-1838196296);
                        cn91.a(bitmap, str2, slsVar, btsVar2, 0);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1838073102);
                        cn91.c(str2, slsVar, btsVar2, 0);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                tls tlsVar2 = (tls) obj3;
                try {
                    ((tls) obj2).invoke((String) ((uge) obj5).invoke(Long.valueOf(Long.parseLong((String) obj6)), (mi3) obj4));
                } catch (PassportAccountNotAuthorizedExceptionAdapter e2) {
                    com.yandex.payment.sdk.core.data.a aVar3 = PaymentKitError.Companion;
                    String message = e2.getMessage();
                    aVar3.getClass();
                    ExternalErrorKind externalErrorKind = ExternalErrorKind.passport_account_not_authorized;
                    ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.passport;
                    if (message == null) {
                        message = "PassportAccountNotAuthorizedException";
                    }
                    tlsVar2.invoke(new ExternalConvertibleError(externalErrorKind, externalErrorTrigger, null, null, message));
                } catch (NoSuchMethodError e3) {
                    tlsVar2.invoke(new YSError("Token exchange capabilities are missing in \"passport\". Please, make sure that your host application is configured with \"passport:7.17.0\" or any higher version", e3));
                } catch (Throwable th) {
                    String message2 = th.getMessage();
                    if (message2 == null) {
                        message2 = th.getClass().getName();
                    }
                    tlsVar2.invoke(new YSError(message2, th));
                }
                return zy11Var;
            case 3:
                final h6a0 h6a0Var = (h6a0) obj5;
                tls tlsVar3 = (tls) obj4;
                tls tlsVar4 = (tls) obj6;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        Q2 = new bd90(17);
                        btsVar3.o0(Q2);
                    }
                    final int i6 = 0;
                    f530 b = fnq0.b(c530Var, false, (tls) Q2);
                    final int i7 = 1;
                    androidx.compose.runtime.internal.a S = wwg.S(-1284686671, true, new wls() { // from class: d6a0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj7, Object obj8) {
                            int i8 = i6;
                            zy11 zy11Var2 = zy11.a;
                            c530 c530Var2 = c530.a;
                            h6a0 h6a0Var2 = h6a0Var;
                            switch (i8) {
                                case 0:
                                    fid fidVar4 = (fid) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    bts btsVar4 = (bts) fidVar4;
                                    if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        v4v v4vVar = h6a0Var2.c;
                                        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.PAYMENT;
                                        s3b1.f(v4vVar, ljs0.n(c530Var2, slotLead$LeadIcon$IconStyle.getWidth(), slotLead$LeadIcon$IconStyle.getHeight()), null, btsVar4, 0, 4);
                                    } else {
                                        btsVar4.Y();
                                    }
                                    return zy11Var2;
                                default:
                                    fid fidVar5 = (fid) obj7;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    bts btsVar5 = (bts) fidVar5;
                                    if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        sic a = qic.a(lr20.e, x4c.G, btsVar5, 6);
                                        int hashCode = Long.hashCode(btsVar5.T);
                                        r1b0 o = btsVar5.o();
                                        f530 d = b.d(btsVar5, c530Var2);
                                        ohd.G1.getClass();
                                        sls slsVar2 = d.b;
                                        if (btsVar5.a == null) {
                                            cma1.b0();
                                            throw null;
                                        }
                                        btsVar5.i0();
                                        if (btsVar5.S) {
                                            btsVar5.n(slsVar2);
                                        } else {
                                            btsVar5.r0();
                                        }
                                        qje.W(btsVar5, d.f, a);
                                        qje.W(btsVar5, d.e, o);
                                        wls wlsVar = d.g;
                                        if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode))) {
                                            b64.z(hashCode, btsVar5, hashCode, wlsVar);
                                        }
                                        qje.W(btsVar5, d.d, d);
                                        cib1.d(h6a0Var2.d, null, h6a0Var2.e, null, 0, 0, btsVar5, 0, 58);
                                        CharSequence charSequence = h6a0Var2.f;
                                        if (charSequence == null) {
                                            btsVar5.e0(57996824);
                                            btsVar5.t(false);
                                        } else {
                                            btsVar5.e0(57996825);
                                            zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar5, 0, 254);
                                            btsVar5 = btsVar5;
                                            btsVar5.t(false);
                                        }
                                        btsVar5.t(true);
                                    } else {
                                        btsVar5.Y();
                                    }
                                    return zy11Var2;
                            }
                        }
                    }, btsVar3);
                    androidx.compose.runtime.internal.a S2 = wwg.S(834364304, true, new wls() { // from class: d6a0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj7, Object obj8) {
                            int i8 = i7;
                            zy11 zy11Var2 = zy11.a;
                            c530 c530Var2 = c530.a;
                            h6a0 h6a0Var2 = h6a0Var;
                            switch (i8) {
                                case 0:
                                    fid fidVar4 = (fid) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    bts btsVar4 = (bts) fidVar4;
                                    if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        v4v v4vVar = h6a0Var2.c;
                                        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.PAYMENT;
                                        s3b1.f(v4vVar, ljs0.n(c530Var2, slotLead$LeadIcon$IconStyle.getWidth(), slotLead$LeadIcon$IconStyle.getHeight()), null, btsVar4, 0, 4);
                                    } else {
                                        btsVar4.Y();
                                    }
                                    return zy11Var2;
                                default:
                                    fid fidVar5 = (fid) obj7;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    bts btsVar5 = (bts) fidVar5;
                                    if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        sic a = qic.a(lr20.e, x4c.G, btsVar5, 6);
                                        int hashCode = Long.hashCode(btsVar5.T);
                                        r1b0 o = btsVar5.o();
                                        f530 d = b.d(btsVar5, c530Var2);
                                        ohd.G1.getClass();
                                        sls slsVar2 = d.b;
                                        if (btsVar5.a == null) {
                                            cma1.b0();
                                            throw null;
                                        }
                                        btsVar5.i0();
                                        if (btsVar5.S) {
                                            btsVar5.n(slsVar2);
                                        } else {
                                            btsVar5.r0();
                                        }
                                        qje.W(btsVar5, d.f, a);
                                        qje.W(btsVar5, d.e, o);
                                        wls wlsVar = d.g;
                                        if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode))) {
                                            b64.z(hashCode, btsVar5, hashCode, wlsVar);
                                        }
                                        qje.W(btsVar5, d.d, d);
                                        cib1.d(h6a0Var2.d, null, h6a0Var2.e, null, 0, 0, btsVar5, 0, 58);
                                        CharSequence charSequence = h6a0Var2.f;
                                        if (charSequence == null) {
                                            btsVar5.e0(57996824);
                                            btsVar5.t(false);
                                        } else {
                                            btsVar5.e0(57996825);
                                            zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar5, 0, 254);
                                            btsVar5 = btsVar5;
                                            btsVar5.t(false);
                                        }
                                        btsVar5.t(true);
                                    } else {
                                        btsVar5.Y();
                                    }
                                    return zy11Var2;
                            }
                        }
                    }, btsVar3);
                    fqs0 fqs0Var = h6a0Var.g;
                    if (fqs0Var == null) {
                        btsVar3.e0(-1665450351);
                        btsVar3.t(false);
                        aVar = null;
                    } else {
                        btsVar3.e0(-1665450350);
                        androidx.compose.runtime.internal.a S3 = wwg.S(-1994380791, true, new sc20(25, fqs0Var), btsVar3);
                        btsVar3.t(false);
                        aVar = S3;
                    }
                    jvs0 jvs0Var = h6a0Var.h;
                    if (jvs0Var == null) {
                        btsVar3.e0(-1665346749);
                        btsVar3.t(false);
                        aVar2 = null;
                    } else {
                        btsVar3.e0(-1665346748);
                        androidx.compose.runtime.internal.a S4 = wwg.S(2080050047, true, new w61(jvs0Var, tlsVar3, tlsVar4, r11), btsVar3);
                        btsVar3.t(false);
                        aVar2 = S4;
                    }
                    web1.c(b, 0.0f, false, 0.0f, null, S, S2, aVar, null, aVar2, null, oa01.d, false, btsVar3, 1769472, 0, 5406);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 4:
                oz40 oz40Var = (oz40) obj5;
                uca0 uca0Var = (uca0) obj6;
                tls tlsVar5 = (tls) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                boolean V = btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16);
                dmw0 dmw0Var = btsVar4.a;
                if (V) {
                    c530 c530Var2 = c530.a;
                    f530 o = an91.o(c530Var2, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                    sic a = qic.a(lr20.c, x4c.G, btsVar4, 0);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o2 = btsVar4.o();
                    f530 d = b.d(btsVar4, o);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar4, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar4, wlsVar2, o2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar4, wlsVar3, valueOf);
                    tls tlsVar6 = d.h;
                    qje.M(btsVar4, tlsVar6);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar4, wlsVar4, d);
                    jeb1.f(ohb1.e(btsVar4, kyh0.payment_methods_action_rename_account), an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar4).e.d, btsVar4, 48, 0, 16380);
                    f530 b2 = i6b1.b(c530Var2);
                    String str3 = (String) oz40Var.getValue();
                    String str4 = uca0Var.a;
                    String e4 = ohb1.e(btsVar4, kyh0.payment_methods_needs_to_be_reduced);
                    boolean z = ((String) oz40Var.getValue()).length() > 20;
                    Object Q3 = btsVar4.Q();
                    if (Q3 == o430Var) {
                        Q3 = new ttm(8, oz40Var);
                        btsVar4.o0(Q3);
                    }
                    heb1.b(str3, (tls) Q3, b2, false, null, null, null, null, str4, null, null, null, null, e4, null, z, null, 0.0f, null, null, null, null, true, 0, 0, null, null, null, null, null, wwg.S(354138325, true, new zcp(1, oz40Var), btsVar4), btsVar4, 432, 0, HProv.ALG_TYPE_SECURECHANNEL, 48, 2139012600, 0);
                    f530 k2 = an91.k(c530Var2, 8.0f);
                    boolean b3 = btsVar4.b(4.0f) | btsVar4.c(2) | btsVar4.a(false);
                    Object Q4 = btsVar4.Q();
                    if (b3 || Q4 == o430Var) {
                        Q4 = new jg0(25);
                        btsVar4.o0(Q4);
                    }
                    z910 z910Var = (z910) Q4;
                    int hashCode2 = Long.hashCode(btsVar4.T);
                    r1b0 o3 = btsVar4.o();
                    f530 d2 = b.d(btsVar4, k2);
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, wlsVar, z910Var);
                    qje.W(btsVar4, wlsVar2, o3);
                    vfc.v(hashCode2, btsVar4, wlsVar3, btsVar4, tlsVar6);
                    qje.W(btsVar4, wlsVar4, d2);
                    boolean k3 = btsVar4.k(tlsVar5);
                    Object Q5 = btsVar4.Q();
                    if (k3 || Q5 == o430Var) {
                        Q5 = new c0(tlsVar5, oz40Var, 7);
                        btsVar4.o0(Q5);
                    }
                    cad.a.getClass();
                    ulb1.a(null, false, null, (sls) Q5, cad.b, btsVar4, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    boolean z2 = ((String) oz40Var.getValue()).length() <= 20;
                    boolean k4 = btsVar4.k(tlsVar5);
                    Object Q6 = btsVar4.Q();
                    if (k4 || Q6 == o430Var) {
                        Q6 = new c0(tlsVar5, oz40Var, 8);
                        btsVar4.o0(Q6);
                    }
                    ohb1.b(null, z2, null, (sls) Q6, cad.c, btsVar4, HProv.ALG_CLASS_DATA_ENCRYPT, 5);
                    btsVar4.t(true);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 5:
                v4b0 v4b0Var = (v4b0) obj5;
                tls tlsVar7 = (tls) obj4;
                oz40 oz40Var2 = (oz40) obj6;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    com.yandex.go.personal_goals_v2.ui.a.a(v4b0Var, (w7b0) oz40Var2.getValue(), tlsVar7, null, btsVar5, 0, 8);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 6:
                IconSpotSize iconSpotSize = (IconSpotSize) obj5;
                au2 au2Var = (au2) obj6;
                AppColor$Palette appColor$Palette = (AppColor$Palette) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    sya1.a(au2Var, ljs0.m(c530Var, iconSpotSize.getIconSize()), null, appColor$Palette, btsVar6, 0, 0);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 7:
                tls tlsVar8 = (tls) obj4;
                shi0 shi0Var = (shi0) obj5;
                tls tlsVar9 = (tls) obj6;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                boolean V2 = btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16);
                dmw0 dmw0Var2 = btsVar7.a;
                if (V2) {
                    boolean k5 = btsVar7.k(tlsVar8);
                    Object Q7 = btsVar7.Q();
                    if (k5 || Q7 == o430Var) {
                        Q7 = new gv40(19, tlsVar8);
                        btsVar7.o0(Q7);
                    }
                    c530 c530Var3 = c530.a;
                    f530 c = ljs0.c(an91.o(eja1.y(c530Var3, (tls) Q7), 0.0f, 20.0f, 0.0f, 0.0f, 13), 1.0f);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar7, 0);
                    int hashCode3 = Long.hashCode(btsVar7.T);
                    r1b0 o4 = btsVar7.o();
                    f530 d3 = b.d(btsVar7, c);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar3);
                    } else {
                        btsVar7.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(btsVar7, wlsVar5, a2);
                    wls wlsVar6 = d.e;
                    qje.W(btsVar7, wlsVar6, o4);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    wls wlsVar7 = d.g;
                    qje.W(btsVar7, wlsVar7, valueOf2);
                    tls tlsVar10 = d.h;
                    qje.M(btsVar7, tlsVar10);
                    wls wlsVar8 = d.d;
                    qje.W(btsVar7, wlsVar8, d3);
                    jeb1.f(shi0Var.a, an91.o(c530Var3, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar7).e.d, btsVar7, 48, 0, 16380);
                    boolean k6 = btsVar7.k(tlsVar9);
                    Object Q8 = btsVar7.Q();
                    if (k6 || Q8 == o430Var) {
                        Q8 = new ukb0(i4, tlsVar9);
                        btsVar7.o0(Q8);
                    }
                    f530 d4 = q791.d(c530Var3, false, null, null, (sls) Q8, 15);
                    sad.a.getClass();
                    ydb1.a(d4, sad.b, wwg.S(-1467916491, true, new phi0(shi0Var, 0), btsVar7), null, wwg.S(-523366597, true, new y740(tlsVar9, 16, shi0Var), btsVar7), null, null, false, btsVar7, 25008, 232);
                    dhi0 dhi0Var = shi0Var.j;
                    if (dhi0Var == null) {
                        btsVar7.e0(523853526);
                        btsVar7.t(false);
                        str = "invalid weight; must be greater than zero";
                    } else {
                        btsVar7.e0(523853527);
                        f530 n = an91.n(c530Var3, 16.0f, 4.0f, 16.0f, 8.0f);
                        AppColor$Palette appColor$Palette2 = AppColor$Palette.BgMinor;
                        str = "invalid weight; must be greater than zero";
                        z7m z7mVar = new z7m(20.0f);
                        byk0 byk0Var = cyk0.a;
                        wha1.a(bzk0.c(n, appColor$Palette2, new byk0(z7mVar, z7mVar, z7mVar, z7mVar)), dhi0Var, tlsVar9, btsVar7, 0);
                        btsVar7.t(false);
                    }
                    f530 c2 = ljs0.c(an91.o(c530Var3, 8.0f, 8.0f, 8.0f, 0.0f, 8), 1.0f);
                    i43 i43Var = new i43(4.0f, true, new quz(11));
                    to5 to5Var = x4c.D;
                    lhl0 a3 = khl0.a(i43Var, to5Var, btsVar7, 6);
                    int hashCode4 = Long.hashCode(btsVar7.T);
                    r1b0 o5 = btsVar7.o();
                    f530 d5 = b.d(btsVar7, c2);
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar3);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, wlsVar5, a3);
                    qje.W(btsVar7, wlsVar6, o5);
                    vfc.v(hashCode4, btsVar7, wlsVar7, btsVar7, tlsVar10);
                    qje.W(btsVar7, wlsVar8, d5);
                    if (1.0f <= 0.0d) {
                        gxv.a(str);
                    }
                    x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean k7 = btsVar7.k(tlsVar9);
                    Object Q9 = btsVar7.Q();
                    if (k7 || Q9 == o430Var) {
                        Q9 = new ukb0(19, tlsVar9);
                        btsVar7.o0(Q9);
                    }
                    ulb1.a(x2yVar, false, null, (sls) Q9, wwg.S(-614139327, true, new phi0(shi0Var, 1), btsVar7), btsVar7, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    if (1.0f <= 0.0d) {
                        gxv.a(str);
                    }
                    x2y x2yVar2 = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean k8 = btsVar7.k(tlsVar9);
                    Object Q10 = btsVar7.Q();
                    if (k8 || Q10 == o430Var) {
                        Q10 = new ukb0(20, tlsVar9);
                        btsVar7.o0(Q10);
                    }
                    ohb1.b(x2yVar2, false, null, (sls) Q10, wwg.S(2136977519, true, new phi0(shi0Var, 2), btsVar7), btsVar7, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    btsVar7.t(true);
                    f530 m = an91.m(ljs0.c(an91.m(c530Var3, 14.0f, 0.0f, 2), 1.0f), 0.0f, 10.0f, 1);
                    lhl0 a4 = khl0.a(lr20.e, to5Var, btsVar7, 6);
                    int hashCode5 = Long.hashCode(btsVar7.T);
                    r1b0 o6 = btsVar7.o();
                    f530 d6 = b.d(btsVar7, m);
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar3);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, wlsVar5, a4);
                    qje.W(btsVar7, wlsVar6, o6);
                    vfc.v(hashCode5, btsVar7, wlsVar7, btsVar7, tlsVar10);
                    qje.W(btsVar7, wlsVar8, d6);
                    String str5 = shi0Var.e;
                    if (str5 == null) {
                        btsVar7.e0(-1039968889);
                        btsVar7.t(false);
                    } else {
                        btsVar7.e0(-1039968888);
                        v0b1.a(mja1.b(str5, null, 6), ljs0.m(c530Var3, 16.0f), null, null, null, null, null, null, 0.0f, 0, btsVar7, 48, 1020);
                        btsVar7.t(false);
                    }
                    oeb1.c(btsVar7, ljs0.m(c530Var3, 2.0f));
                    jeb1.f(shi0Var.d, null, AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar7).i.a, btsVar7, 384, 0, 16250);
                    btsVar7.t(true);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 8:
                s7k0 s7k0Var = (s7k0) obj5;
                r7k0 r7k0Var = (r7k0) obj6;
                tls tlsVar11 = (tls) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    f530 m2 = an91.m(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2);
                    lhl0 a5 = khl0.a(lr20.a, x4c.E, btsVar8, 48);
                    int hashCode6 = Long.hashCode(btsVar8.T);
                    r1b0 o7 = btsVar8.o();
                    f530 d7 = b.d(btsVar8, m2);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar8.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar4);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, d.f, a5);
                    qje.W(btsVar8, d.e, o7);
                    qje.W(btsVar8, d.g, Integer.valueOf(hashCode6));
                    qje.M(btsVar8, d.h);
                    qje.W(btsVar8, d.d, d7);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    apa1.c(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), s7k0Var, btsVar8, 0);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    apa1.b(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), r7k0Var, tlsVar11, btsVar8, 0);
                    btsVar8.t(true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 9:
                oz40 oz40Var3 = (oz40) obj5;
                lik0 lik0Var = (lik0) obj6;
                zls zlsVar = (zls) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    zuc0 zuc0Var = (zuc0) oz40Var3.getValue();
                    if (zuc0Var == null) {
                        btsVar9.e0(-612508587);
                    } else {
                        btsVar9.e0(-612508586);
                        com.yandex.go.taxi.order.details.v2.ui.compose.driver.a.d(zuc0Var, lik0Var.c, zlsVar, btsVar9, 0);
                    }
                    btsVar9.t(false);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 10:
                luk0 luk0Var = (luk0) obj6;
                wg6 wg6Var2 = (wg6) obj5;
                tls tlsVar12 = (tls) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    cra1.c(luk0Var.a, wg6Var2, null, tlsVar12, btsVar10, 0);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 11:
                x7l0 x7l0Var = (x7l0) obj5;
                oz40 oz40Var4 = (oz40) obj6;
                oz40 oz40Var5 = (oz40) obj4;
                mhl0 mhl0Var = (mhl0) obj;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(mhl0Var) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                    rgb0 rgb0Var = x7l0Var.m;
                    hj0 hj0Var = rgb0Var != null ? rgb0Var.b : null;
                    if (hj0Var == null) {
                        btsVar11.e0(-1225489021);
                        btsVar11.t(false);
                    } else {
                        boolean z3 = hj0Var.a;
                        btsVar11.e0(-1225489020);
                        if (z3) {
                            btsVar11.e0(583419185);
                            e = ohb1.e(btsVar11, rzh0.accessibility_attach_image);
                            btsVar11.t(false);
                        } else {
                            btsVar11.e0(583518602);
                            e = ohb1.e(btsVar11, rzh0.accessibility_max_images_attached);
                            btsVar11.t(false);
                        }
                        boolean k9 = btsVar11.k(hj0Var);
                        Object Q11 = btsVar11.Q();
                        Object obj7 = Q11;
                        if (k9 || Q11 == o430Var) {
                            o8k0 o8k0Var = new o8k0(i2, hj0Var, oz40Var4);
                            btsVar11.o0(o8k0Var);
                            obj7 = o8k0Var;
                        }
                        sls slsVar5 = (sls) obj7;
                        f530 b4 = mhl0Var.b(tra1.b(ljs0.m(c530Var, 40.0f), z3 ? 1.0f : 0.5f), x4c.E);
                        Object Q12 = btsVar11.Q();
                        Object obj8 = Q12;
                        if (Q12 == o430Var) {
                            ttm ttmVar = new ttm(i3, oz40Var5);
                            btsVar11.o0(ttmVar);
                            obj8 = ttmVar;
                        }
                        f530 b5 = tm91.b(b4, (tls) obj8);
                        boolean k10 = btsVar11.k(e);
                        Object Q13 = btsVar11.Q();
                        Object obj9 = Q13;
                        if (k10 || Q13 == o430Var) {
                            dcc0 dcc0Var = new dcc0(e, 21);
                            btsVar11.o0(dcc0Var);
                            obj9 = dcc0Var;
                        }
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar5, fnq0.b(b5, false, (tls) obj9), ((YandexShapes) btsVar11.m(qm51.a)).a(), 0L, 0L, null, null, null, false, null, null, null, wwg.S(-36423404, true, new ls40(12, hj0Var, oz40Var4, oz40Var5), btsVar11), btsVar11, 0, 384, 4088);
                        btsVar11.t(false);
                    }
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 12:
                final hj0 hj0Var2 = (hj0) obj5;
                oz40 oz40Var6 = (oz40) obj6;
                oz40 oz40Var7 = (oz40) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    j76.b(null, null, null, 0.0f, null, btsVar12, 0);
                    if (((Boolean) oz40Var6.getValue()).booleanValue()) {
                        btsVar12.e0(1537220954);
                        String e5 = ohb1.e(btsVar12, rzh0.cargo_form_address_details_make_photo);
                        String e6 = ohb1.e(btsVar12, rzh0.cargo_form_address_details_select_files);
                        long j = ((wu60) oz40Var7.getValue()).a;
                        boolean k11 = btsVar12.k(hj0Var2);
                        Object Q14 = btsVar12.Q();
                        if (k11 || Q14 == o430Var) {
                            final int i8 = r9 ? 1 : 0;
                            Q14 = new sls() { // from class: r7l0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i9 = i8;
                                    zy11 zy11Var2 = zy11.a;
                                    hj0 hj0Var3 = hj0Var2;
                                    switch (i9) {
                                        case 0:
                                            hj0Var3.b.invoke();
                                            break;
                                        default:
                                            hj0Var3.c.invoke();
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            };
                            btsVar12.o0(Q14);
                        }
                        sls slsVar6 = (sls) Q14;
                        boolean k12 = btsVar12.k(hj0Var2);
                        Object Q15 = btsVar12.Q();
                        if (k12 || Q15 == o430Var) {
                            Q15 = new sls() { // from class: r7l0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i9 = i5;
                                    zy11 zy11Var2 = zy11.a;
                                    hj0 hj0Var3 = hj0Var2;
                                    switch (i9) {
                                        case 0:
                                            hj0Var3.b.invoke();
                                            break;
                                        default:
                                            hj0Var3.c.invoke();
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            };
                            btsVar12.o0(Q15);
                        }
                        sls slsVar7 = (sls) Q15;
                        Object Q16 = btsVar12.Q();
                        if (Q16 == o430Var) {
                            Q16 = new w01(23, oz40Var6);
                            btsVar12.o0(Q16);
                        }
                        rma1.a(e5, e6, slsVar6, slsVar7, (sls) Q16, j, btsVar12, 196992);
                        btsVar12.t(false);
                    } else {
                        btsVar12.e0(1537846286);
                        btsVar12.t(false);
                    }
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 13:
                wmm0 wmm0Var = (wmm0) obj5;
                tls tlsVar13 = (tls) obj4;
                smm0 smm0Var = (smm0) obj6;
                fid fidVar13 = (fid) obj2;
                ((Integer) obj3).getClass();
                z910 d8 = pi6.d(x4c.b, false);
                bts btsVar13 = (bts) fidVar13;
                int hashCode7 = Long.hashCode(btsVar13.T);
                r1b0 o8 = btsVar13.o();
                f530 d9 = b.d(fidVar13, c530Var);
                ohd.G1.getClass();
                sls slsVar8 = d.b;
                bts btsVar14 = (bts) fidVar13;
                if (btsVar14.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar14.i0();
                if (btsVar14.S) {
                    btsVar14.n(slsVar8);
                } else {
                    btsVar14.r0();
                }
                qje.W(fidVar13, d.f, d8);
                qje.W(fidVar13, d.e, o8);
                wls wlsVar9 = d.g;
                if (btsVar14.S || !jl40.l(btsVar14.Q(), Integer.valueOf(hashCode7))) {
                    b64.z(hashCode7, btsVar14, hashCode7, wlsVar9);
                }
                qje.W(fidVar13, d.d, d9);
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.a.e(wmm0Var, tlsVar13, fidVar13, 6);
                if (smm0Var == null) {
                    btsVar14.e0(1695102376);
                    btsVar14.t(false);
                } else {
                    btsVar14.e0(1695102377);
                    s3b1.f(smm0Var.a, an91.o(ljs0.e(ljs0.q(cj6.a.a(c530Var, x4c.A), smm0Var.b), smm0Var.c), 0.0f, 0.0f, 0.0f, 2.0f, 7), null, fidVar13, 0, 4);
                    btsVar14.t(false);
                }
                btsVar14.t(true);
                return zy11Var;
            case 14:
                return b(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return e(obj, obj2, obj3);
            case 17:
                return f(obj, obj2, obj3);
            case 18:
                return g(obj, obj2, obj3);
            case 19:
                return i(obj, obj2, obj3);
            case 20:
                return j(obj, obj2, obj3);
            case 21:
                return k(obj, obj2, obj3);
            case 22:
                return l(obj, obj2, obj3);
            case 23:
                m8u0 m8u0Var = (m8u0) obj5;
                m8u0 m8u0Var2 = (m8u0) obj6;
                m3u0 m3u0Var = (m3u0) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    i.i(m8u0Var, m8u0Var2, m3u0Var, btsVar15, 0);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 24:
                return m(obj, obj2, obj3);
            case 25:
                return n(obj, obj2, obj3);
            case 26:
                return o(obj, obj2, obj3);
            case 27:
                return p(obj, obj2, obj3);
            case 28:
                return q(obj, obj2, obj3);
            default:
                ki31 ki31Var = (ki31) obj6;
                wg6 wg6Var3 = (wg6) obj5;
                tls tlsVar14 = (tls) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar15;
                if (btsVar16.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    jtz0 jtz0Var = ki31Var.d;
                    Object Q17 = btsVar16.Q();
                    if (Q17 == o430Var) {
                        Q17 = new ke31(r11);
                        btsVar16.o0(Q17);
                    }
                    erb1.e(jtz0Var, wg6Var3, null, null, un91.b(tlsVar14, (tls) Q17, btsVar16), btsVar16, 0, 12);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ ls40(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ ls40(Object obj, wg6 wg6Var, tls tlsVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = wg6Var;
        this.w = tlsVar;
    }

    public /* synthetic */ ls40(Object obj, tls tlsVar, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.w = tlsVar;
        this.c = obj2;
    }
}
