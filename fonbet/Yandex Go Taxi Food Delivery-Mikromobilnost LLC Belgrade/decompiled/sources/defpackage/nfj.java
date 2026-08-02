package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.delivery.mapper.model.OrderDetailsFormFieldType;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.payment.sdk.core.data.OrderDetails;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.ProgressBarSize;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

/* loaded from: classes11.dex */
public final /* synthetic */ class nfj implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nfj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        ea30 ea30Var = (ea30) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (ea30Var instanceof aa30) {
            btsVar.e0(-911309644);
            tk91.a((aa30) ea30Var, tlsVar, btsVar, 0);
            btsVar.t(false);
        } else if (ea30Var instanceof ba30) {
            btsVar.e0(-911184001);
            f530 d = i9a1.d(i9a1.f(c530.a));
            f930 f930Var = ((ba30) ea30Var).a;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new kiu(15, tlsVar);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            boolean k2 = btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new adp(12, tlsVar);
                btsVar.o0(Q2);
            }
            xk91.a(d, f930Var, slsVar, (tls) Q2, btsVar, 0);
            btsVar.t(false);
        } else {
            if (!(ea30Var instanceof ca30)) {
                throw unr0.y(-722134370, btsVar, false);
            }
            btsVar.e0(-910800624);
            zk91.e(btsVar, 0);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ovi0 ovi0Var = (ovi0) this.b;
        String str = (String) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            v0b1.a(ovi0Var, ljs0.m(c530Var, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
            oeb1.c(btsVar, ljs0.q(c530Var, 4.0f));
            jeb1.f(str, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16254);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.c;
        ll30 ll30Var = (ll30) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            boolean k = btsVar.k(tlsVar) | btsVar.e(ll30Var);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new lk30(tlsVar, ll30Var, 3);
                btsVar.o0(Q);
            }
            iab1.a(null, null, null, null, null, null, (sls) Q, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        km30 km30Var = (km30) this.b;
        sls slsVar = (sls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
        dmw0 dmw0Var = btsVar.a;
        if (V) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new pi30(7);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c530Var, false, (tls) Q);
            String str = km30Var.a;
            String str2 = km30Var.b;
            meb1.a(b, str, null, null, 3.0f, null, 0, 0, ety0.a(xya1.e(btsVar).d.a, 0L, 0L, null, null, (eyr) btsVar.m(p3z.a), 0L, null, null, null, 0, 0L, null, null, 16777183), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 236);
            f530 b2 = q791.b(c530Var, null, null, false, null, new awk0(0), slsVar, 12);
            to5 to5Var = x4c.E;
            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, b2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            boolean e = btsVar.e(km30Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new ft20(17, km30Var);
                btsVar.o0(Q2);
            }
            meb1.a(fnq0.b(c530Var, false, (tls) Q2).k(new x2y(1.0f, false)), str2, null, null, 3.0f, null, 1, 5, xya1.e(btsVar).i.a, btsVar, 14180352, 44);
            bts btsVar2 = btsVar;
            if (str2.length() > 0) {
                btsVar2.e0(596330990);
                sya1.a(qlb1.b(), ljs0.m(c530Var, 16.0f).k(new pa31(to5Var)), null, AppColor$Palette.Text, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 4);
                btsVar2 = btsVar2;
                btsVar2.t(false);
            } else {
                btsVar2.e0(596583206);
                btsVar2.t(false);
            }
            btsVar2.t(true);
            btsVar2.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        xp30 xp30Var = (xp30) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (jl40.l(xp30Var, wp30.a)) {
            btsVar.e0(-1249829049);
            uob1.i(btsVar, 0);
            btsVar.t(false);
        } else {
            if (!(xp30Var instanceof vp30)) {
                throw unr0.y(-1249831070, btsVar, false);
            }
            btsVar.e0(-1249825994);
            uob1.c((vp30) xp30Var, tlsVar, btsVar, 0);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        yt30 yt30Var = (yt30) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
        dmw0 dmw0Var = btsVar.a;
        if (V) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 o2 = an91.o(c530Var, 8.0f, 4.0f, 8.0f, 0.0f, 8);
            boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new jg0(20);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(1390714734);
            for (ot30 ot30Var : yt30Var.a) {
                boolean k = btsVar.k(tlsVar) | btsVar.k(ot30Var);
                Object Q2 = btsVar.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new ve30(7, tlsVar, ot30Var);
                    btsVar.o0(Q2);
                }
                wob1.b(ot30Var, (sls) Q2, btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        gci0 gci0Var = (gci0) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            rab1.b(null, wwg.S(598377806, true, new sg0(15, tlsVar), btsVar), null, null, null, wwg.S(-1103679662, true, new iu30(i, tlsVar, f.a(gci0Var, MtFloatingButtonState.FOCUS_USER_LOCATION, null, btsVar, 48, 2)), btsVar), null, btsVar, 196656, 93);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.c;
        u540 u540Var = (u540) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            rab1.b(null, wwg.S(84979986, true, new sg0(20, tlsVar), btsVar), null, null, null, wwg.S(-1796861298, true, new iu30(6, u540Var, tlsVar), btsVar), null, btsVar, 196656, 93);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:284:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x088c  */
    /* JADX WARN: Type inference failed for: r13v13, types: [androidx.compose.runtime.internal.a] */
    /* JADX WARN: Type inference failed for: r13v16, types: [androidx.compose.runtime.internal.a] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object] */
    @Override // defpackage.zls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        a aVar;
        boolean z2;
        bts btsVar;
        yee0 yee0Var;
        gri griVar;
        zb80 zb80Var;
        gfe0 gfe0Var;
        efe0 efe0Var;
        Iterable iterable;
        bfe0 bfe0Var;
        bfe0 bfe0Var2;
        c530 c530Var;
        long j;
        long j2;
        int i = this.a;
        int i2 = 21;
        g43 g43Var = lr20.c;
        int i3 = 7;
        o430 o430Var = did.a;
        c530 c530Var2 = c530.a;
        int i4 = 18;
        int i5 = 2;
        zy11 zy11Var = zy11.a;
        int i6 = 19;
        Object obj4 = this.b;
        int i7 = 14;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                egj egjVar = (egj) obj4;
                tls tlsVar = (tls) obj5;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar;
                if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                    qfj.f(ibp0Var, egjVar.c, null, tlsVar, btsVar2, intValue & 14);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 1:
                v4v v4vVar = (v4v) obj4;
                CharSequence charSequence = (CharSequence) obj5;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (v4vVar == null) {
                        btsVar3.e0(392624859);
                        btsVar3.t(false);
                        aVar = null;
                        z = true;
                    } else {
                        btsVar3.e0(392624860);
                        z = true;
                        a S = wwg.S(1657432457, true, new mb(v4vVar, i3), btsVar3);
                        btsVar3.t(false);
                        aVar = S;
                    }
                    web1.c(null, 48.0f, false, 0.0f, null, aVar, wwg.S(1911832078, z, new un1(10, charSequence), btsVar3), null, null, null, null, null, false, btsVar3, 1572864, 0, 8093);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 2:
                f31 f31Var = (f31) obj4;
                tls tlsVar2 = (tls) obj5;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar3;
                boolean V = btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16);
                dmw0 dmw0Var = btsVar4.a;
                if (V) {
                    Object Q = btsVar4.Q();
                    if (Q == o430Var) {
                        Q = new c0m(i4);
                        btsVar4.o0(Q);
                    }
                    f530 b = fnq0.b(c530Var2, false, (tls) Q);
                    sic a = qic.a(g43Var, x4c.G, btsVar4, 0);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o = btsVar4.o();
                    f530 d = b.d(btsVar4, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
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
                    wls wlsVar = d.f;
                    qje.W(btsVar4, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar4, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar4, wlsVar3, valueOf);
                    tls tlsVar3 = d.h;
                    qje.M(btsVar4, tlsVar3);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar4, wlsVar4, d);
                    String str = f31Var.f;
                    if (str == null) {
                        btsVar4.e0(31512067);
                        btsVar4.t(false);
                        z2 = true;
                    } else {
                        btsVar4.e0(31512068);
                        Object Q2 = btsVar4.Q();
                        if (Q2 == o430Var) {
                            Q2 = new c0m(i6);
                            btsVar4.o0(Q2);
                        }
                        f530 b2 = fnq0.b(c530Var2, false, (tls) Q2);
                        z910 d2 = pi6.d(x4c.b, false);
                        int hashCode2 = Long.hashCode(btsVar4.T);
                        r1b0 o2 = btsVar4.o();
                        f530 d3 = b.d(btsVar4, b2);
                        btsVar4.i0();
                        if (btsVar4.S) {
                            btsVar4.n(slsVar);
                        } else {
                            btsVar4.r0();
                        }
                        qje.W(btsVar4, wlsVar, d2);
                        qje.W(btsVar4, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar4, wlsVar3, btsVar4, tlsVar3);
                        qje.W(btsVar4, wlsVar4, d3);
                        String str2 = f31Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        com.yandex.go.address.address_map_picker.ui.a.e(str, str2, tlsVar2, btsVar4, 0);
                        z2 = true;
                        btsVar4.t(true);
                        btsVar4.t(false);
                    }
                    rab1.b(null, wwg.S(-1439315497, z2, new sg0(8, tlsVar2), btsVar4), null, null, null, wwg.S(-1148571685, z2, new sg0(9, tlsVar2), btsVar4), null, btsVar4, 196656, 93);
                    btsVar4.t(z2);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 3:
                b6n b6nVar = (b6n) obj4;
                tls tlsVar4 = (tls) obj5;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    f1a1.b(b6nVar, null, tlsVar4, btsVar5, 0, 2);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 4:
                v4v v4vVar2 = (v4v) obj4;
                String str3 = (String) obj5;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar5;
                if (btsVar6.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    c530 c530Var3 = c530.a;
                    f530 w = ljs0.w(ljs0.e(an91.o(c530Var3, 10.0f, 0.0f, 14.0f, 0.0f, 10), 32.0f), 3);
                    lhl0 a2 = khl0.a(new i43(2.0f, true, new quz(11)), x4c.E, btsVar6, 54);
                    int hashCode3 = Long.hashCode(btsVar6.T);
                    r1b0 o3 = btsVar6.o();
                    f530 d4 = b.d(btsVar6, w);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar2);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a2);
                    qje.W(btsVar6, d.e, o3);
                    wls wlsVar5 = d.g;
                    if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode3))) {
                        b64.z(hashCode3, btsVar6, hashCode3, wlsVar5);
                    }
                    qje.W(btsVar6, d.d, d4);
                    if (v4vVar2 != null) {
                        btsVar6.e0(-1008561977);
                        btsVar = btsVar6;
                        s3b1.f(v4vVar2, ljs0.m(c530Var3, 20.0f), null, btsVar, 48, 4);
                        btsVar.t(false);
                    } else {
                        btsVar = btsVar6;
                        btsVar.e0(-1008483175);
                        btsVar.t(false);
                    }
                    if (str3 != null) {
                        btsVar.e0(-1008448796);
                        ymb1.f(str3, null, 0L, null, lzr.D, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65518);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1008367111);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 5:
                enn ennVar = (enn) obj4;
                f4l0 f4l0Var = (f4l0) obj5;
                int intValue6 = ((Integer) obj).intValue();
                String str4 = (String) obj3;
                Object value = ennVar.e.e.a.getValue();
                t701 t701Var = value instanceof t701 ? (t701) value : null;
                if (t701Var != null && (griVar = t701Var.a) != null && (zb80Var = griVar.v) != null && (gfe0Var = zb80Var.a) != null && (efe0Var = gfe0Var.c) != null) {
                    if (intValue6 != 0) {
                        if (intValue6 != 1) {
                            iterable = efe0Var.d;
                        } else {
                            cfe0 cfe0Var = efe0Var.c;
                            if (cfe0Var != null) {
                                iterable = cfe0Var.b;
                            }
                            iterable = null;
                        }
                        if (iterable != null) {
                            Iterator it = iterable.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    bfe0Var2 = it.next();
                                    if (((bfe0) bfe0Var2).getType() == OrderDetailsFormFieldType.CONTACT) {
                                    }
                                } else {
                                    bfe0Var2 = 0;
                                }
                            }
                            bfe0Var = bfe0Var2;
                        } else {
                            bfe0Var = null;
                        }
                        zee0 zee0Var = bfe0Var instanceof zee0 ? (zee0) bfe0Var : null;
                        yee0Var = zee0Var != null ? zee0Var.d : null;
                    } else {
                        cfe0 cfe0Var2 = efe0Var.b;
                        if (cfe0Var2 != null) {
                            iterable = cfe0Var2.b;
                            if (iterable != null) {
                            }
                            if (bfe0Var instanceof zee0) {
                            }
                            if (zee0Var != null) {
                            }
                        }
                        iterable = null;
                        if (iterable != null) {
                        }
                        if (bfe0Var instanceof zee0) {
                        }
                        if (zee0Var != null) {
                        }
                    }
                    if (yee0Var != null) {
                        qv0 qv0Var = (qv0) kotlin.collections.a.S(intValue6, f4l0Var.getRoute().a);
                        ennVar.d.a(new l470(new mde(intValue6, yee0Var.a, yee0Var.b, yee0Var.c, yee0Var.d, yee0Var.e, yee0Var.f, yee0Var.g, qv0Var != null ? qv0Var.g : null, new mt0(str4, (Object) ennVar, (Object) f4l0Var, intValue6, 2))));
                    }
                    return zy11Var;
                }
                if (yee0Var != null) {
                }
                return zy11Var;
            case 6:
                dfl0 dfl0Var = (dfl0) obj4;
                tls tlsVar5 = (tls) obj5;
                fid fidVar6 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar6;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    btsVar7.Y();
                } else if (dfl0Var.c != null) {
                    btsVar7.e0(27886148);
                    i4a1.a(dfl0Var.c, tlsVar5, btsVar7, 0);
                    btsVar7.t(false);
                } else {
                    btsVar7.e0(27994741);
                    btsVar7.t(false);
                }
                return zy11Var;
            case 7:
                xj50 xj50Var = (xj50) obj4;
                tls tlsVar6 = (tls) obj5;
                fid fidVar7 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar7;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    f530 o4 = an91.o(c530.a, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                    sic a3 = qic.a(g43Var, x4c.G, btsVar8, 0);
                    int hashCode4 = Long.hashCode(btsVar8.T);
                    r1b0 o5 = btsVar8.o();
                    f530 d5 = b.d(btsVar8, o4);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar8.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar3);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, d.f, a3);
                    qje.W(btsVar8, d.e, o5);
                    qje.W(btsVar8, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar8, d.h);
                    qje.W(btsVar8, d.d, d5);
                    mka1.b(xj50Var.a, btsVar8, 0);
                    bk50.c(xj50Var.b, xj50Var.c, tlsVar6, btsVar8, 0);
                    e47 e47Var = xj50Var.d;
                    e47 e47Var2 = xj50Var.e;
                    boolean k = btsVar8.k(tlsVar6);
                    Object Q3 = btsVar8.Q();
                    if (k || Q3 == o430Var) {
                        Q3 = new azd(i2, tlsVar6);
                        btsVar8.o0(Q3);
                    }
                    sls slsVar4 = (sls) Q3;
                    boolean k2 = btsVar8.k(tlsVar6);
                    Object Q4 = btsVar8.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new azd(22, tlsVar6);
                        btsVar8.o0(Q4);
                    }
                    xrb1.a(e47Var, e47Var2, slsVar4, (sls) Q4, btsVar8, 0);
                    btsVar8.t(true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                n891.n(new jo0((zvt) obj4, (OrderDetails) obj5, (tls) obj2, (tls) obj3, 13));
                return zy11Var;
            case 9:
                yex0 yex0Var = (yex0) obj4;
                tls tlsVar7 = (tls) obj5;
                fid fidVar8 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar8;
                if (!btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    btsVar9.Y();
                } else if (yex0Var != null) {
                    btsVar9.e0(-678846177);
                    com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.m(yex0Var, null, tlsVar7, btsVar9, 0);
                    btsVar9.t(false);
                } else {
                    btsVar9.e0(-678669725);
                    oeb1.c(btsVar9, an91.o(ljs0.m(c530Var2, ButtonSize.L.getSize()), 8.0f, 0.0f, 0.0f, 0.0f, 14));
                    btsVar9.t(false);
                }
                return zy11Var;
            case 10:
                final tze0 tze0Var = (tze0) obj4;
                final tls tlsVar8 = (tls) obj5;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar9 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((bts) fidVar9).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar10 = (bts) fidVar9;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                    to5 to5Var = x4c.F;
                    final int i8 = false ? 1 : 0;
                    a S2 = wwg.S(-844103562, true, new wls() { // from class: fau
                        @Override // defpackage.wls
                        public final Object invoke(Object obj6, Object obj7) {
                            int i9 = i8;
                            zy11 zy11Var2 = zy11.a;
                            tls tlsVar9 = tlsVar8;
                            tze0 tze0Var2 = tze0Var;
                            fid fidVar10 = (fid) obj6;
                            int intValue11 = ((Integer) obj7).intValue();
                            switch (i9) {
                                case 0:
                                    bts btsVar11 = (bts) fidVar10;
                                    if (!btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                                        btsVar11.Y();
                                        break;
                                    } else {
                                        com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.k(tze0Var2.a, null, tlsVar9, btsVar11, 0);
                                        break;
                                    }
                                default:
                                    bts btsVar12 = (bts) fidVar10;
                                    if (!btsVar12.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                                        btsVar12.Y();
                                        break;
                                    } else {
                                        com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.i(tze0Var2.b, null, tlsVar9, btsVar12, 0);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar10);
                    final int i9 = true ? 1 : 0;
                    u9b1.a(ebp0Var, S2, wwg.S(2115490005, true, new wls() { // from class: fau
                        @Override // defpackage.wls
                        public final Object invoke(Object obj6, Object obj7) {
                            int i92 = i9;
                            zy11 zy11Var2 = zy11.a;
                            tls tlsVar9 = tlsVar8;
                            tze0 tze0Var2 = tze0Var;
                            fid fidVar10 = (fid) obj6;
                            int intValue11 = ((Integer) obj7).intValue();
                            switch (i92) {
                                case 0:
                                    bts btsVar11 = (bts) fidVar10;
                                    if (!btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                                        btsVar11.Y();
                                        break;
                                    } else {
                                        com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.k(tze0Var2.a, null, tlsVar9, btsVar11, 0);
                                        break;
                                    }
                                default:
                                    bts btsVar12 = (bts) fidVar10;
                                    if (!btsVar12.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                                        btsVar12.Y();
                                        break;
                                    } else {
                                        com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.i(tze0Var2.b, null, tlsVar9, btsVar12, 0);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar10), null, 4.0f, null, to5Var, btsVar10, (intValue10 & 14) | 1597872);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 11:
                qcu qcuVar = (qcu) obj4;
                tls tlsVar9 = (tls) obj5;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar10 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar10).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar10;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                    wza1.f(ibp0Var2, qcuVar, null, tlsVar9, btsVar11, intValue11 & 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 12:
                piu piuVar = (piu) obj4;
                tls tlsVar10 = (tls) obj5;
                fid fidVar11 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar11;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    c530 c530Var4 = c530.a;
                    f530 c = ljs0.c(c530Var4, 1.0f);
                    sic a4 = qic.a(g43Var, x4c.G, btsVar12, 0);
                    int hashCode5 = Long.hashCode(btsVar12.T);
                    r1b0 o6 = btsVar12.o();
                    f530 d6 = b.d(btsVar12, c);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar12.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar5);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, d.f, a4);
                    qje.W(btsVar12, d.e, o6);
                    qje.W(btsVar12, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar12, d.h);
                    qje.W(btsVar12, d.d, d6);
                    if (piuVar.d != null) {
                        btsVar12.e0(-1528865017);
                        ovi0 a5 = mja1.a(piuVar.d, null, 6);
                        c530Var = c530Var4;
                        f530 m = ljs0.m(an91.o(c530Var4, 10.0f, 10.0f, 0.0f, 8.0f, 4), 40.0f);
                        s7d.a.getClass();
                        v0b1.a(a5, m, null, null, s7d.b, null, null, null, 0.0f, 0, btsVar12, 24624, 1004);
                        btsVar12.t(false);
                    } else {
                        c530Var = c530Var4;
                        tse0.s(btsVar12, -1528546709, c530Var, 20.0f, btsVar12);
                        btsVar12.t(false);
                    }
                    f530 o7 = an91.o(c530Var, 16.0f, 0.0f, 16.0f, 12.0f, 2);
                    Object Q5 = btsVar12.Q();
                    if (Q5 == o430Var) {
                        Q5 = new jiu(false ? 1 : 0);
                        btsVar12.o0(Q5);
                    }
                    jeb1.f(piuVar.a, fnq0.b(o7, false, (tls) Q5), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar12).e.d, btsVar12, 0, 0, 16380);
                    jeb1.f(piuVar.b, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar12).g.a, btsVar12, 48, 0, 16380);
                    f530 l = an91.l(ljs0.c(c530Var, 1.0f), 8.0f, 4.0f);
                    boolean k3 = btsVar12.k(tlsVar10);
                    Object Q6 = btsVar12.Q();
                    if (k3 || Q6 == o430Var) {
                        Q6 = new kiu(false ? 1 : 0, tlsVar10);
                        btsVar12.o0(Q6);
                    }
                    ohb1.b(l, false, null, (sls) Q6, wwg.S(1333346475, true, new ctq(10, piuVar), btsVar12), btsVar12, 24582, 6);
                    ly3.B(c530Var, 8.0f, btsVar12, true);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 13:
                lru lruVar = (lru) obj4;
                a aVar2 = (a) obj5;
                dj6 dj6Var = (dj6) obj;
                fid fidVar12 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar12).k(dj6Var) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar12;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 19) != 18)) {
                    float d7 = dj6Var.d();
                    lhl0 a6 = khl0.a(new i43(lruVar.e, true, new quz(11)), x4c.E, btsVar13, 48);
                    int hashCode6 = Long.hashCode(btsVar13.T);
                    r1b0 o8 = btsVar13.o();
                    f530 d8 = b.d(btsVar13, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (btsVar13.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar13.i0();
                    if (btsVar13.S) {
                        btsVar13.n(slsVar6);
                    } else {
                        btsVar13.r0();
                    }
                    qje.W(btsVar13, d.f, a6);
                    qje.W(btsVar13, d.e, o8);
                    wls wlsVar6 = d.g;
                    if (btsVar13.S || !jl40.l(btsVar13.Q(), Integer.valueOf(hashCode6))) {
                        b64.z(hashCode6, btsVar13, hashCode6, wlsVar6);
                    }
                    qje.W(btsVar13, d.d, d8);
                    btsVar13.e0(-1602821014);
                    for (jru jruVar : lruVar.c) {
                        v1b1.b(jruVar.a, d7, wwg.S(-1836770304, true, new nfj(i7, aVar2, jruVar), btsVar13), btsVar13, 3078);
                        i7 = 14;
                    }
                    btsVar13.t(false);
                    btsVar13.t(true);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 14:
                ?? r13 = (a) obj4;
                jru jruVar2 = (jru) obj5;
                fid fidVar13 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar13;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    r13.invoke(jruVar2.b, btsVar14, 0);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 15:
                SourceDestinationComponent sourceDestinationComponent = (SourceDestinationComponent) obj4;
                rzu rzuVar = (rzu) obj5;
                fid fidVar14 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    f530 c2 = ljs0.c(c530Var2, 1.0f);
                    boolean e = btsVar15.e(sourceDestinationComponent);
                    Object Q7 = btsVar15.Q();
                    if (e || Q7 == o430Var) {
                        Q7 = new gau(i3, sourceDestinationComponent);
                        btsVar15.o0(Q7);
                    }
                    tls tlsVar11 = (tls) Q7;
                    boolean e2 = btsVar15.e(sourceDestinationComponent) | btsVar15.k(rzuVar);
                    Object Q8 = btsVar15.Q();
                    if (e2 || Q8 == o430Var) {
                        Q8 = new mgu(i5, sourceDestinationComponent, rzuVar);
                        btsVar15.o0(Q8);
                    }
                    androidx.compose.ui.viewinterop.b.a(tlsVar11, c2, (tls) Q8, btsVar15, 48, 0);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 16:
                y4v y4vVar = (y4v) obj4;
                f530 f530Var = (f530) obj5;
                fid fidVar15 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar15;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    s3b1.f(y4vVar.a, f530Var, null, btsVar16, 0, 4);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 17:
                ?? r132 = (a) obj4;
                oz40 oz40Var = (oz40) obj5;
                ibp0 ibp0Var3 = (ibp0) obj;
                fid fidVar16 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((bts) fidVar16).k(ibp0Var3) ? 4 : 2;
                }
                bts btsVar17 = (bts) fidVar16;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 19) != 18)) {
                    r132.invoke(ibp0Var3, oz40Var.getValue(), btsVar17, Integer.valueOf(intValue17 & 14));
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 18:
                t510 t510Var = (t510) obj4;
                tls tlsVar12 = (tls) obj5;
                ibp0 ibp0Var4 = (ibp0) obj;
                fid fidVar17 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((bts) fidVar17).k(ibp0Var4) ? 4 : 2;
                }
                bts btsVar18 = (bts) fidVar17;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 19) != 18)) {
                    xib1.b(ibp0Var4, t510Var.c, true, tlsVar12, btsVar18, intValue18 & 14);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 19:
                ak20 ak20Var = (ak20) obj4;
                tls tlsVar13 = (tls) obj5;
                fid fidVar18 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar18;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    oeb1.c(btsVar19, ljs0.e(c530Var2, 20.0f));
                    ru.yandex.taxi.logistics.sdk.mission_details.ui.a.a(ak20Var.a.b, null, null, btsVar19, 0, 6);
                    oeb1.c(btsVar19, ljs0.e(c530Var2, 8.0f));
                    dk20 dk20Var = ak20Var.a;
                    rmb1.a(dk20Var.c, dk20Var.d, btsVar19, 0);
                    fj20 fj20Var = ak20Var.b;
                    kj20.b(fj20Var.a, fj20Var.b, fj20Var.c, fj20Var.d, tlsVar13, btsVar19, 0);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 20:
                ProgressBarSize progressBarSize = (ProgressBarSize) obj4;
                nhf0 nhf0Var = (nhf0) obj5;
                ldc ldcVar = nhf0Var.b;
                fid fidVar19 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar19;
                if (btsVar20.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    int i10 = pj20.a[progressBarSize.ordinal()];
                    if (i10 == 1) {
                        btsVar20.e0(1830298428);
                        String str5 = nhf0Var.c;
                        if (ldcVar == null) {
                            btsVar20.e0(1444519967);
                            j = ((el51) btsVar20.m(gl51.a)).n();
                            btsVar20.t(false);
                        } else {
                            btsVar20.e0(1444518789);
                            btsVar20.t(false);
                            j = ldcVar.a;
                        }
                        ymb1.g(str5, null, j, lzr.G, 0L, 0L, 0L, 0, false, 0, null, null, btsVar20, HProv.ALG_CLASS_DATA_ENCRYPT, 65514);
                        btsVar20.t(false);
                    } else {
                        if (i10 != 2) {
                            throw unr0.y(1444513537, btsVar20, false);
                        }
                        btsVar20.e0(1830611311);
                        String str6 = nhf0Var.c;
                        if (ldcVar == null) {
                            btsVar20.e0(1444529919);
                            j2 = ((el51) btsVar20.m(gl51.a)).n();
                            btsVar20.t(false);
                        } else {
                            btsVar20.e0(1444528741);
                            btsVar20.t(false);
                            j2 = ldcVar.a;
                        }
                        ymb1.e(str6, null, j2, null, lzr.G, null, 0L, uh6.E(19), 0L, null, 0, false, 0, null, null, btsVar20, 12607488, 0, 65386);
                        btsVar20.t(false);
                    }
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 21:
                return b(obj, obj2, obj3);
            case 22:
                return d(obj, obj2, obj3);
            case 23:
                return e(obj, obj2, obj3);
            case 24:
                return f(obj, obj2, obj3);
            case 25:
                return g(obj, obj2, obj3);
            case 26:
                return i(obj, obj2, obj3);
            case 27:
                return j(obj, obj2, obj3);
            case 28:
                return k(obj, obj2, obj3);
            default:
                tls tlsVar14 = (tls) obj5;
                czy0 czy0Var = (czy0) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar20;
                if (btsVar21.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    rab1.b(null, wwg.S(-2107226304, true, new sg0(i2, tlsVar14), btsVar21), null, null, null, wwg.S(665407164, true, new iu30(i3, czy0Var, tlsVar14), btsVar21), null, btsVar21, 196656, 93);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ nfj(tls tlsVar, int i, Object obj) {
        this.a = i;
        this.c = tlsVar;
        this.b = obj;
    }
}
