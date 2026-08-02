package defpackage;

import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.semantics.f;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.sdk.checkout.impl.uicomponents.ModalTitleSize;
import com.yandex.go.navigator.main_screen.h;
import com.yandex.go.navigator.main_screen.i;
import com.yandex.go.payments.analytics.PaymentsAnalytics$PaymentMethodsType;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PickUpError;
import com.yandex.go.pickup_from_photo.domain.exception.RecognitionEmptyResultException;
import com.yandex.go.pickup_from_photo.domain.exception.RecognitionFailedException;
import com.yandex.go.pickup_from_photo.domain.exception.StatusPollingException;
import com.yandex.go.pickup_from_photo.domain.exception.SuggestException;
import com.yandex.go.pickup_from_photo.domain.exception.UploadPhotosException;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.bdui.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.ui.routeinfo.a;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes11.dex */
public final /* synthetic */ class l0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        qxa qxaVar = (qxa) this.b;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            c530 c530Var = c530.a;
            f530 d = ooc.d(an91.j(ljs0.c(c530Var, 1.0f), j690Var), null, 3);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
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
            qje.W(btsVar, d.d, d2);
            qgy.b(qxaVar.a, null, an91.m(n.e(c530Var, 16.0f, btsVar, c530Var, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 384, 0, 12282);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            if (qxaVar.b == null) {
                btsVar.e0(1929802718);
                btsVar.t(false);
            } else {
                btsVar.e0(1929802719);
                qgy.b(qxaVar.b, null, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).g.a, null, btsVar, 384, 0, 12282);
                ly3.B(c530Var, 16.0f, btsVar, false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new fv9(15, tlsVar);
                btsVar.o0(Q);
            }
            o5d.a.getClass();
            phb1.b((sls) Q, m, false, null, null, o5d.b, null, null, null, btsVar, 196656, 988);
            ly3.B(c530Var, 8.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        ylj yljVar = (ylj) this.b;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            f530 o = an91.o(an91.j(c530.a, j690Var), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = yljVar.a;
            if (charSequence == null) {
                btsVar.e0(709223655);
                btsVar.t(false);
            } else {
                btsVar.e0(709223656);
                unb1.a(null, charSequence, ModalTitleSize.L, btsVar, 384, 1);
                btsVar.t(false);
            }
            btsVar.e0(-392759220);
            Iterator it = yljVar.b.iterator();
            while (it.hasNext()) {
                ph91.a((hlj) it.next(), tlsVar, btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wp2 wp2Var = (wp2) this.b;
        ohy ohyVar = (ohy) this.c;
        ibp0 ibp0Var = (ibp0) obj;
        InputState inputState = (InputState) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (((bts) fidVar).k(ibp0Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= fidVar.c(inputState.ordinal()) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            boolean e = k7b1.e(inputState);
            c530 c530Var = c530.a;
            if (e) {
                btsVar.e0(391829475);
                zrb1.a(ibp0Var, tea1.f(), c530Var, wp2Var, btsVar, i & 14, 4);
                btsVar.t(false);
            } else {
                btsVar.e0(391883012);
                float f = ohyVar.b;
                if (Float.isNaN(f)) {
                    f = deb1.a(ibp0Var.c());
                }
                nnm.s(c530Var, f, btsVar, false);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        i iVar = (i) this.b;
        h hVar = (h) this.c;
        xfd xfdVar = (xfd) obj;
        x700 x700Var = (x700) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(x700Var) : fidVar.e(x700Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            q3z.a(cwa1.a(iVar.R), wwg.S(-1766162380, true, new gxm(22, x700Var, xfdVar, hVar), btsVar), btsVar, 48);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        wv30 wv30Var = (wv30) this.b;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        int i = 16;
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            f530 k = an91.k(an91.j(ljs0.c(c530.a, 1.0f), j690Var), 8.0f);
            boolean k2 = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k2 || Q == o430Var) {
                Q = new adp(19, tlsVar);
                btsVar.o0(Q);
            }
            tls tlsVar2 = (tls) Q;
            boolean k3 = btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            if (k3 || Q2 == o430Var) {
                Q2 = new sg0(i, tlsVar);
                btsVar.o0(Q2);
            }
            a.b(wv30Var, tlsVar2, (wls) Q2, k, btsVar, 8);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        yfd yfdVar = (yfd) this.b;
        ru.yandex.taxi.masstransit.router.h hVar = (ru.yandex.taxi.masstransit.router.h) this.c;
        xfd xfdVar = (xfd) obj;
        wv30 wv30Var = (wv30) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(wv30Var) : fidVar.e(wv30Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            boolean z = (i & 14) == 4 || ((i & 8) != 0 && btsVar.e(xfdVar));
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new x1d(xfdVar, 4);
                btsVar.o0(Q);
            }
            qe61.a(null, (tls) Q, btsVar, 0, 1);
            ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
            boolean e = btsVar.e(yfdVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new ft20(23, yfdVar);
                btsVar.o0(Q2);
            }
            a.c(wv30Var, composeContentKt$ContentImpl$scope$1$1$action$1, null, (tls) Q2, e.d(hVar.G.a), btsVar, 8 | ((i >> 3) & 14));
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        k340 k340Var = (k340) this.b;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            c530 c530Var = c530.a;
            f530 d = ooc.d(an91.j(ljs0.c(c530Var, 1.0f), j690Var), sb2.K(300, 0, null, 6), 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
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
            qje.W(btsVar, d.d, d2);
            bpb1.a(k340Var.a, ljs0.e(an91.m(c530Var, 0.0f, 8.0f, 1), 56.0f), btsVar, 48);
            yrl.b(6, 6, btsVar, an91.m(c530Var, 16.0f, 0.0f, 2));
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean e = btsVar.e(k340Var) | btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new t130(9, k340Var, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(c, null, null, null, null, null, false, null, (tls) Q, btsVar, 6, 510);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        final u540 u540Var = (u540) this.b;
        androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        final int i = 0;
        final int i2 = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
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
            f530 o2 = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
            boolean e = btsVar.e(u540Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new tls() { // from class: t540
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        u540 u540Var2 = u540Var;
                        switch (i3) {
                            case 0:
                                List list = u540Var2.a.b;
                                ((m6y) ((u6y) obj5)).f(list.size(), null, new qc0(list, 21), new androidx.compose.runtime.internal.a(2039820996, new xs4(3, list, u540Var2), true));
                                break;
                            default:
                                tdu tduVar = u540Var2.a.a;
                                f.l((mnq0) obj5, tduVar.a + " " + tduVar.d);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(o2, (tls) Q), null, wwg.S(-2043143218, true, new wg30(8, u540Var), btsVar), null, null, null, null, false, btsVar, 384, 250);
            boolean e2 = btsVar.e(u540Var);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new tls() { // from class: t540
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        int i3 = i;
                        zy11 zy11Var = zy11.a;
                        u540 u540Var2 = u540Var;
                        switch (i3) {
                            case 0:
                                List list = u540Var2.a.b;
                                ((m6y) ((u6y) obj5)).f(list.size(), null, new qc0(list, 21), new androidx.compose.runtime.internal.a(2039820996, new xs4(3, list, u540Var2), true));
                                break;
                            default:
                                tdu tduVar = u540Var2.a.a;
                                f.l((mnq0) obj5, tduVar.a + " " + tduVar.d);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            adb1.a(null, bVar, j690Var, null, null, null, false, null, (tls) Q2, btsVar, (intValue << 3) & 896, 505);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        yfd yfdVar = (yfd) this.b;
        t130 t130Var = (t130) this.c;
        xfd xfdVar = (xfd) obj;
        czy0 czy0Var = (czy0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(czy0Var) : fidVar.e(czy0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            ru.yandex.taxi.masstransit.threadvariants.a.a(czy0Var, ((o640) ((agd) yfdVar).a).b, null, ((bgd) xfdVar).a, t130Var, btsVar, 8 | ((i >> 3) & 14));
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        u510 u510Var = (u510) this.b;
        tls tlsVar = (tls) this.c;
        ((Integer) obj2).getClass();
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & HProv.PP_SECURITY_LEVEL) != 128)) {
            List list = u510Var.e;
            if (list == null) {
                btsVar.e0(566758165);
                btsVar.t(false);
            } else {
                btsVar.e0(566758166);
                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, c530.a);
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
                ydb1.a(null, null, wwg.S(553349393, true, new wg30(10, u510Var), btsVar), null, null, null, SlotSize.M, false, btsVar, 1573248, 187);
                btsVar.e0(1450882821);
                int i = 0;
                for (Object obj5 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    t510 t510Var = (t510) obj5;
                    npb1.b(0, btsVar, tlsVar, t510Var, null);
                    if (i == scc.f(list)) {
                        btsVar.e0(149016771);
                    } else if (t510Var.a instanceof i510) {
                        btsVar.e0(149117180);
                        yrl.c(null, null, btsVar, 0, 7);
                    } else {
                        btsVar.e0(149168888);
                        yrl.e(null, null, btsVar, 0, 7);
                        btsVar.t(false);
                        i = i2;
                    }
                    btsVar.t(false);
                    i = i2;
                }
                tse0.t(btsVar, false, true, false);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        oca0 oca0Var = (oca0) this.b;
        yfd yfdVar = (yfd) this.c;
        xfd xfdVar = (xfd) obj;
        uca0 uca0Var = (uca0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(uca0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        Object obj5 = zy11.a;
        if (!V) {
            btsVar.Y();
            return obj5;
        }
        fva0 a = f4z.a();
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        Object obj6 = did.a;
        if (k || Q == obj6) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(t9h0.metricsStateHolder);
            if (tag == null) {
                tag = new xva0();
                rootView.setTag(t9h0.metricsStateHolder, tag);
            }
            Q = (xva0) tag;
            btsVar.o0(Q);
        }
        xva0 xva0Var = (xva0) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj6) {
            fva0.f(a, "Payments.FeatureNameEdit", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Payments.FeatureNameEdit");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        PaymentsAnalytics$PaymentMethodsType U = oca0.U(((mca0) ((agd) yfdVar).a).b.a);
        if (U != null) {
            x770 x770Var = oca0Var.H;
            boolean z = !evu0.J(uca0Var.b);
            x770Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("payment_method_type", U.getEventValue());
            hashMap.put("has_text", Boolean.valueOf(z));
            x770Var.a.a("Payments.PaymentMethodEditView.Shown", hashMap, 1, new HashMap());
        }
        gf91.a(uca0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        wls wlsVar = (wls) this.c;
        fid fidVar = (fid) obj3;
        ((Integer) obj4).getClass();
        kjg0 kjg0Var = (kjg0) linkedHashMap.get((String) obj2);
        zy11 zy11Var = zy11.a;
        if (kjg0Var == null) {
            return zy11Var;
        }
        ArrayList arrayList = kjg0Var.c;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(kjg0Var.a);
        Object Q = btsVar.Q();
        int i = 1;
        if (k || Q == did.a) {
            Q = new ugd0(i, wlsVar, kjg0Var);
            btsVar.o0(Q);
        }
        tls tlsVar = (tls) Q;
        int i2 = fxd0.a[kjg0Var.d.ordinal()];
        if (i2 == 1) {
            btsVar.e0(-532855806);
            gxd0.d(kjg0Var.b, arrayList, kjg0Var.e, tlsVar, btsVar, 0);
            btsVar.t(false);
            return zy11Var;
        }
        if (i2 != 2) {
            throw unr0.y(1091186882, btsVar, false);
        }
        btsVar.e0(-532493788);
        gxd0.g(kjg0Var.b, arrayList, kjg0Var.e, tlsVar, btsVar, 0);
        btsVar.t(false);
        return zy11Var;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ygi0 ygi0Var = (ygi0) this.b;
        yfd yfdVar = (yfd) this.c;
        xfd xfdVar = (xfd) obj;
        zgi0 zgi0Var = (zgi0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(zgi0Var) : fidVar.e(zgi0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            umb0 umb0Var = (umb0) ygi0Var.L;
            Throwable th = ((g8o) ((agd) yfdVar).a).a;
            umb0Var.getClass();
            PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError = th instanceof UploadPhotosException ? PhotoPickUpAnalytics$PickUpError.UploadHandleError : th instanceof SuggestException ? PhotoPickUpAnalytics$PickUpError.SuggestHandleError : th instanceof StatusPollingException ? PhotoPickUpAnalytics$PickUpError.FetchingHandleError : th instanceof RecognitionEmptyResultException ? PhotoPickUpAnalytics$PickUpError.FetchingEmptyResult : th instanceof RecognitionFailedException ? PhotoPickUpAnalytics$PickUpError.FetchingStatusFailed : th instanceof TimeoutException ? PhotoPickUpAnalytics$PickUpError.FetchingTimeout : PhotoPickUpAnalytics$PickUpError.Unknown;
            nhb0 nhb0Var = umb0Var.a;
            nhb0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("error_type", photoPickUpAnalytics$PickUpError.getEventValue());
            nhb0Var.a.a("PhotoPickUp.ErrorModal.Shown", hashMap, 1, new HashMap());
            vha1.a(zgi0Var, ((bgd) xfdVar).a, btsVar, ((i >> 3) & 14) | 8);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        luk0 luk0Var = (luk0) this.b;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            f530 j = an91.j(c530.a, j690Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, j);
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
            qqa1.a(luk0Var.b, null, btsVar, 0);
            xqa1.d(0, btsVar, tlsVar, null, luk0Var.c);
            uh91.a(luk0Var.d, null, tlsVar, btsVar, 0);
            lqa1.b(luk0Var.e, null, tlsVar, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        ss9 ss9Var = (ss9) this.b;
        ScootersBduiScreenType scootersBduiScreenType = (ScootersBduiScreenType) this.c;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & HProv.PP_SECURITY_LEVEL) != 128)) {
            com.yandex.go.flex.common.facade.b bVar = (com.yandex.go.flex.common.facade.b) ss9Var.I;
            ljr ljrVar = (ljr) ss9Var.J;
            c.c(bVar, ljrVar != null ? ljrVar.b : null, scootersBduiScreenType, ljrVar == null || !ljrVar.a.a, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r15;
        ?? r3;
        Object obj5;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        o430 o430Var = did.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        zy11 zy11Var = null;
        zy11 zy11Var2 = zy11.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i4) {
            case 0:
                z0 z0Var = (z0) obj7;
                tls tlsVar = (tls) obj6;
                j690 j690Var = (j690) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 145) != 144);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    f530 k = ljs0.p(an91.j(c530Var, j690Var), 0.0f, 0.0f, 0.0f, 377.0f, 7).k(ljs0.b);
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, k);
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
                    com.yandex.go.requirements.comment.summary.ui.v3.ui.a.h(z0Var.a, btsVar, 0);
                    String str = z0Var.b;
                    String str2 = z0Var.c;
                    boolean k2 = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k2 || Q == o430Var) {
                        r15 = 0;
                        Q = new a0(false ? 1 : 0, tlsVar);
                        btsVar.o0(Q);
                    } else {
                        r15 = 0;
                    }
                    com.yandex.go.requirements.comment.summary.ui.v3.ui.a.c(str, str2, (tls) Q, btsVar, r15);
                    x2y x2yVar = new x2y(1.0f, true);
                    z910 d2 = pi6.d(x4c.b, r15);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d3 = b.d(btsVar, x2yVar);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, d2);
                    qje.W(btsVar, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                    qje.W(btsVar, wlsVar4, d3);
                    oip0 o3 = pw91.o(btsVar);
                    ((nx2) btsVar.m(uy2.c)).getClass();
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = jeb1.g(androidx.compose.runtime.f.d(new is6(o3, 4)));
                        btsVar.o0(Q2);
                    }
                    qor qorVar = (qor) Q2;
                    Object Q3 = btsVar.Q();
                    if (Q3 == o430Var) {
                        Q3 = androidx.compose.runtime.f.j(new y7m(0.0f));
                        btsVar.o0(Q3);
                    }
                    oz40 oz40Var = (oz40) Q3;
                    float density = ((fwi) btsVar.m(j.h)).getDensity();
                    r5v0 r5v0Var = z0Var.d;
                    boolean k3 = btsVar.k(tlsVar);
                    Object Q4 = btsVar.Q();
                    if (k3 || Q4 == o430Var) {
                        Q4 = new a0(1, tlsVar);
                        btsVar.o0(Q4);
                    }
                    com.yandex.go.requirements.comment.summary.ui.v3.ui.a.e(null, o3, r5v0Var, oz40Var, (tls) Q4, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
                    f530 a2 = cj6.a.a(c530Var, x4c.B);
                    boolean b = btsVar.b(density);
                    Object Q5 = btsVar.Q();
                    if (b || Q5 == o430Var) {
                        Q5 = new n0(oz40Var, density);
                        btsVar.o0(Q5);
                    }
                    f530 b2 = xm91.b(a2, (tls) Q5);
                    String str3 = z0Var.e;
                    c47 c47Var = z0Var.g;
                    String str4 = z0Var.f;
                    boolean k4 = btsVar.k(tlsVar);
                    Object Q6 = btsVar.Q();
                    if (k4 || Q6 == o430Var) {
                        Q6 = new o0(0, tlsVar);
                        btsVar.o0(Q6);
                    }
                    com.yandex.go.requirements.comment.summary.ui.v3.ui.a.b(b2, c47Var, str3, str4, qorVar, (sls) Q6, btsVar, 0);
                    btsVar.t(true);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                oz40 oz40Var2 = (oz40) obj7;
                sls slsVar2 = (sls) obj6;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    btsVar2.Y();
                } else if (((hoy0) oz40Var2.getValue()).a.b.length() > 0) {
                    btsVar2.e0(2092041078);
                    String e = ohb1.e(btsVar2, kyh0.common_clear_description);
                    f530 o4 = an91.o(c530.a, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                    boolean k5 = btsVar2.k(e);
                    Object Q7 = btsVar2.Q();
                    if (k5 || Q7 == o430Var) {
                        r3 = 0;
                        h0 h0Var = new h0(e, false ? 1 : 0);
                        btsVar2.o0(h0Var);
                        obj5 = h0Var;
                    } else {
                        r3 = 0;
                        obj5 = Q7;
                    }
                    o4b1.b(vfc.k(dzg0.ic_close, r3, -1411607277, btsVar2, r3), null, q791.d(fnq0.b(o4, r3, (tls) obj5), true, null, new awk0(r3), slsVar2, 10), null, null, 0.0f, null, btsVar2, 8, 56);
                    btsVar2.t(r3);
                } else {
                    btsVar2.e0(2092461996);
                    btsVar2.t(false);
                }
                return zy11Var2;
            case 2:
                at6 at6Var = (at6) obj7;
                tls tlsVar3 = (tls) obj6;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    os6 os6Var = at6Var.b;
                    if (os6Var instanceof ms6) {
                        btsVar3.e0(835207995);
                        xbb1.a((ms6) at6Var.b, tlsVar3, btsVar3, 8);
                        btsVar3.t(false);
                    } else {
                        if (!(os6Var instanceof ns6)) {
                            throw unr0.y(835205750, btsVar3, false);
                        }
                        btsVar3.e0(835212471);
                        ybb1.a(btsVar3, 0);
                        btsVar3.t(false);
                    }
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 3:
                yv6 yv6Var = (yv6) obj7;
                tls tlsVar4 = (tls) obj6;
                j690 j690Var2 = (j690) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((bts) fidVar4).k(j690Var2) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 145) != 144)) {
                    f530 o5 = an91.o(an91.j(c530Var, j690Var2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    sic a3 = qic.a(g43Var, x4c.G, btsVar4, 0);
                    int hashCode3 = Long.hashCode(btsVar4.T);
                    r1b0 o6 = btsVar4.o();
                    f530 d4 = b.d(btsVar4, o5);
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
                    qje.W(btsVar4, d.f, a3);
                    qje.W(btsVar4, d.e, o6);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d4);
                    yv6Var.getClass();
                    btsVar4.e0(280764984);
                    btsVar4.t(false);
                    btsVar4.e0(-2069148453);
                    Iterator it = yv6Var.a.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            ny61.u();
                            return null;
                        }
                        gcb1.a(tlsVar4, btsVar4, 0);
                    }
                    btsVar4.t(false);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 4:
                m68 m68Var = (m68) obj7;
                tls tlsVar5 = (tls) obj6;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    a68 a68Var = m68Var.b;
                    if (a68Var instanceof x58) {
                        btsVar5.e0(774453323);
                        afb1.a((x58) m68Var.b, tlsVar5, btsVar5, 8);
                        btsVar5.t(false);
                    } else if (a68Var instanceof y58) {
                        btsVar5.e0(774456675);
                        bfb1.a(btsVar5, 0);
                        btsVar5.t(false);
                    } else {
                        if (!jl40.l(a68Var, z58.a)) {
                            throw unr0.y(774451267, btsVar5, false);
                        }
                        btsVar5.e0(774458825);
                        btsVar5.t(false);
                        tlsVar5.invoke(f68.a);
                    }
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 5:
                an9 an9Var = (an9) obj7;
                tls tlsVar6 = (tls) obj6;
                j690 j690Var3 = (j690) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((bts) fidVar6).k(j690Var3) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 145) != 144)) {
                    f530 d5 = ooc.d(an91.j(ljs0.c(c530Var, 1.0f), j690Var3), null, 3);
                    sic a4 = qic.a(g43Var, x4c.G, btsVar6, 0);
                    int hashCode4 = Long.hashCode(btsVar6.T);
                    r1b0 o7 = btsVar6.o();
                    f530 d6 = b.d(btsVar6, d5);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar4);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a4);
                    qje.W(btsVar6, d.e, o7);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d6);
                    tm9.a(an9Var, tlsVar6, btsVar6, 0);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 6:
                du9 du9Var = (du9) obj7;
                tls tlsVar7 = (tls) obj6;
                j690 j690Var4 = (j690) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((bts) fidVar7).k(j690Var4) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 145) != 144)) {
                    f530 d7 = ooc.d(an91.j(ljs0.c(c530Var, 1.0f), j690Var4), null, 3);
                    sic a5 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int hashCode5 = Long.hashCode(btsVar7.T);
                    r1b0 o8 = btsVar7.o();
                    f530 d8 = b.d(btsVar7, d7);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar5);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a5);
                    qje.W(btsVar7, d.e, o8);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d8);
                    com.yandex.go.chargers.discounts.activate.c.b(du9Var.a, tlsVar7, du9Var.c, du9Var.b != null, btsVar7, 6);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 7:
                gea geaVar = (gea) obj7;
                tls tlsVar8 = (tls) obj6;
                j690 j690Var5 = (j690) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                if ((intValue8 & 48) == 0) {
                    intValue8 |= ((bts) fidVar8).k(j690Var5) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                boolean V2 = btsVar8.V(intValue8 & 1, (intValue8 & 145) != 144);
                dmw0 dmw0Var2 = btsVar8.a;
                if (!V2) {
                    btsVar8.Y();
                    return zy11Var2;
                }
                f530 m = an91.m(an91.o(an91.j(ljs0.c(c530Var, 1.0f), j690Var5), 0.0f, 20.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2);
                sic a6 = qic.a(g43Var, x4c.G, btsVar8, 0);
                int hashCode6 = Long.hashCode(btsVar8.T);
                r1b0 o9 = btsVar8.o();
                f530 d9 = b.d(btsVar8, m);
                ohd.G1.getClass();
                sls slsVar6 = d.b;
                if (dmw0Var2 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar8.i0();
                if (btsVar8.S) {
                    btsVar8.n(slsVar6);
                } else {
                    btsVar8.r0();
                }
                wls wlsVar5 = d.f;
                qje.W(btsVar8, wlsVar5, a6);
                wls wlsVar6 = d.e;
                qje.W(btsVar8, wlsVar6, o9);
                Integer valueOf2 = Integer.valueOf(hashCode6);
                wls wlsVar7 = d.g;
                qje.W(btsVar8, wlsVar7, valueOf2);
                tls tlsVar9 = d.h;
                qje.M(btsVar8, tlsVar9);
                wls wlsVar8 = d.d;
                qje.W(btsVar8, wlsVar8, d9);
                CharSequence charSequence = geaVar.a;
                if (charSequence == null) {
                    btsVar8.e0(1365964229);
                    btsVar8.t(false);
                    z = false;
                } else {
                    btsVar8.e0(1365964230);
                    qgy.b(charSequence, null, ljs0.c(c530Var, 1.0f), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar8, 384, 0, 16378);
                    z = false;
                    ly3.B(c530Var, 12.0f, btsVar8, false);
                }
                CharSequence charSequence2 = geaVar.b;
                if (charSequence2 == null) {
                    btsVar8.e0(1366141797);
                    btsVar8.t(z);
                    z2 = z;
                } else {
                    btsVar8.e0(1366141798);
                    qgy.b(charSequence2, null, ljs0.c(c530Var, 1.0f), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar8, 384, 0, 16378);
                    z2 = false;
                    ly3.B(c530Var, 16.0f, btsVar8, false);
                }
                f530 m2 = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 8.0f, 1);
                z910 d10 = pi6.d(x4c.b, z2);
                int hashCode7 = Long.hashCode(btsVar8.T);
                r1b0 o10 = btsVar8.o();
                f530 d11 = b.d(btsVar8, m2);
                btsVar8.i0();
                if (btsVar8.S) {
                    btsVar8.n(slsVar6);
                } else {
                    btsVar8.r0();
                }
                qje.W(btsVar8, wlsVar5, d10);
                qje.W(btsVar8, wlsVar6, o10);
                vfc.v(hashCode7, btsVar8, wlsVar7, btsVar8, tlsVar9);
                qje.W(btsVar8, wlsVar8, d11);
                ButtonStyle buttonStyle = ButtonStyle.Main;
                f530 c = ljs0.c(c530Var, 1.0f);
                boolean k6 = btsVar8.k(tlsVar8);
                Object Q8 = btsVar8.Q();
                if (k6 || Q8 == o430Var) {
                    Q8 = new fv9(3, tlsVar8);
                    btsVar8.o0(Q8);
                }
                w4d.a.getClass();
                d17.c(c, false, null, buttonStyle, null, (sls) Q8, w4d.b, btsVar8, 1575942, 22);
                btsVar8.t(true);
                btsVar8.t(true);
                return zy11Var2;
            case 8:
                int i5 = 2;
                tla tlaVar = (tla) obj7;
                yga ygaVar = (yga) obj6;
                xfd xfdVar = (xfd) obj;
                dha dhaVar = (dha) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                if ((intValue9 & 6) == 0) {
                    if ((intValue9 & 8) == 0 ? ((bts) fidVar9).k(xfdVar) : fidVar9.e(xfdVar)) {
                        i5 = 4;
                    }
                    i = i5 | intValue9;
                } else {
                    i = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i |= (intValue9 & 64) == 0 ? ((bts) fidVar9).k(dhaVar) : fidVar9.e(dhaVar) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(i & 1, (i & 147) != 146)) {
                    rzo.b(null, "default", wwg.S(-1843402779, true, new tb0(dhaVar, tlaVar, ygaVar, xfdVar, 1), btsVar9), btsVar9, 3456, 3);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 9:
                yha yhaVar = (yha) obj7;
                tls tlsVar10 = (tls) obj6;
                j690 j690Var6 = (j690) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                if ((intValue10 & 48) == 0) {
                    intValue10 |= ((bts) fidVar10).k(j690Var6) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 145) != 144)) {
                    f530 d12 = ooc.d(an91.j(pfb1.b(tra1.b(ljs0.c(c530Var, 1.0f), yhaVar.g ? 0.3f : 1.0f), yhaVar.g, 30), j690Var6), null, 3);
                    sic a7 = qic.a(g43Var, x4c.G, btsVar10, 0);
                    int hashCode8 = Long.hashCode(btsVar10.T);
                    r1b0 o11 = btsVar10.o();
                    f530 d13 = b.d(btsVar10, d12);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar10.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar10.i0();
                    if (btsVar10.S) {
                        btsVar10.n(slsVar7);
                    } else {
                        btsVar10.r0();
                    }
                    qje.W(btsVar10, d.f, a7);
                    qje.W(btsVar10, d.e, o11);
                    qje.W(btsVar10, d.g, Integer.valueOf(hashCode8));
                    qje.M(btsVar10, d.h);
                    qje.W(btsVar10, d.d, d13);
                    if (yhaVar.f) {
                        btsVar10.e0(921834961);
                        zib1.d(btsVar10, 0);
                        btsVar10.t(false);
                    } else {
                        btsVar10.e0(921887475);
                        zib1.c(yhaVar, tlsVar10, btsVar10, 0);
                        btsVar10.t(false);
                    }
                    btsVar10.t(true);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 10:
                tla tlaVar2 = (tla) obj7;
                ika ikaVar = (ika) obj6;
                xfd xfdVar2 = (xfd) obj;
                int i6 = 2;
                qla qlaVar = (qla) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                if ((intValue11 & 6) == 0) {
                    if ((intValue11 & 8) == 0 ? ((bts) fidVar11).k(xfdVar2) : fidVar11.e(xfdVar2)) {
                        i6 = 4;
                    }
                    i2 = i6 | intValue11;
                } else {
                    i2 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i2 |= (intValue11 & 64) == 0 ? ((bts) fidVar11).k(qlaVar) : fidVar11.e(qlaVar) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i2 & 1, (i2 & 147) != 146)) {
                    String key = ChargersPerfEvent.ACTIVE_PASSES.getKey();
                    fva0 a8 = f4z.a();
                    View view = (View) btsVar11.m(AndroidCompositionLocals_androidKt.f);
                    boolean k7 = btsVar11.k(view);
                    Object Q9 = btsVar11.Q();
                    Object obj8 = Q9;
                    if (k7 || Q9 == o430Var) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        xva0 xva0Var = (xva0) tag;
                        btsVar11.o0(xva0Var);
                        obj8 = xva0Var;
                    }
                    xva0 xva0Var2 = (xva0) obj8;
                    Object Q10 = btsVar11.Q();
                    if (Q10 == o430Var) {
                        fva0.f(a8, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var2.a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key);
                            zy11Var = zy11Var2;
                        }
                        btsVar11.o0(zy11Var);
                        Q10 = zy11Var;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new tb0(qlaVar, tlaVar2, ikaVar, xfdVar2, 2), btsVar11), btsVar11, 3456, 3);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 11:
                oip0 oip0Var = (oip0) obj7;
                gwa gwaVar = (gwa) obj6;
                j690 j690Var7 = (j690) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                if ((intValue12 & 48) == 0) {
                    intValue12 |= ((bts) fidVar12).k(j690Var7) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 145) != 144)) {
                    f530 j = an91.j(bzk0.c(pw91.u(ljs0.c(c530Var, 1.0f), oip0Var, 14), AppColor$Palette.CardDivider, qke.q), j690Var7);
                    sic a9 = qic.a(g43Var, x4c.G, btsVar12, 0);
                    int hashCode9 = Long.hashCode(btsVar12.T);
                    r1b0 o12 = btsVar12.o();
                    f530 d14 = b.d(btsVar12, j);
                    ohd.G1.getClass();
                    sls slsVar8 = d.b;
                    if (btsVar12.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar8);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, d.f, a9);
                    qje.W(btsVar12, d.e, o12);
                    qje.W(btsVar12, d.g, Integer.valueOf(hashCode9));
                    qje.M(btsVar12, d.h);
                    qje.W(btsVar12, d.d, d14);
                    com.yandex.go.chargers.surge.info.d.c(gwaVar, btsVar12, 0);
                    ly3.B(c530Var, 6.0f, btsVar12, true);
                } else {
                    btsVar12.Y();
                }
                return zy11Var2;
            case 12:
                return b(obj, obj2, obj3, obj4);
            case 13:
                ste steVar = (ste) obj7;
                tls tlsVar11 = (tls) obj6;
                j690 j690Var8 = (j690) obj2;
                fid fidVar13 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                if ((intValue13 & 48) == 0) {
                    intValue13 |= ((bts) fidVar13).k(j690Var8) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar13;
                if (!btsVar13.V(intValue13 & 1, (intValue13 & 145) != 144)) {
                    btsVar13.Y();
                } else if (steVar instanceof qte) {
                    btsVar13.e0(-1177100077);
                    hsb1.b((qte) steVar, tlsVar11, j690Var8, btsVar13, (intValue13 << 3) & 896);
                    btsVar13.t(false);
                } else {
                    if (!(steVar instanceof rte)) {
                        throw unr0.y(-1177102253, btsVar13, false);
                    }
                    btsVar13.e0(-1177097022);
                    hsb1.d(j690Var8, btsVar13, (intValue13 >> 3) & 14);
                    btsVar13.t(false);
                }
                return zy11Var2;
            case 14:
                return d(obj, obj2, obj3, obj4);
            case 15:
                xxo xxoVar = (xxo) obj7;
                tls tlsVar12 = (tls) obj6;
                j690 j690Var9 = (j690) obj2;
                fid fidVar14 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                if ((intValue14 & 48) == 0) {
                    intValue14 |= ((bts) fidVar14).k(j690Var9) ? 32 : 16;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 145) != 144)) {
                    iha1.d(xxoVar, j690Var9, tlsVar12, btsVar14, intValue14 & 112);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 16:
                return e(obj, obj2, obj3, obj4);
            case 17:
                return f(obj, obj2, obj3, obj4);
            case 18:
                return g(obj, obj2, obj3, obj4);
            case 19:
                return i(obj, obj2, obj3, obj4);
            case 20:
                return j(obj, obj2, obj3, obj4);
            case 21:
                return k(obj, obj2, obj3, obj4);
            case 22:
                return l(obj, obj2, obj3, obj4);
            case 23:
                return m(obj, obj2, obj3, obj4);
            case 24:
                return n(obj, obj2, obj3, obj4);
            case 25:
                return o(obj, obj2, obj3, obj4);
            case 26:
                return p(obj, obj2, obj3, obj4);
            case 27:
                return q(obj, obj2, obj3, obj4);
            case 28:
                return r(obj, obj2, obj3, obj4);
            default:
                String str5 = (String) obj7;
                tls tlsVar13 = (tls) obj6;
                ibp0 ibp0Var = (ibp0) obj;
                InputState inputState = (InputState) obj2;
                fid fidVar15 = (fid) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                if ((intValue15 & 6) == 0) {
                    i3 = (((bts) fidVar15).k(ibp0Var) ? 4 : 2) | intValue15;
                } else {
                    i3 = intValue15;
                }
                if ((intValue15 & 48) == 0) {
                    i3 |= fidVar15.c(inputState.ordinal()) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar15;
                if (!btsVar15.V(i3 & 1, (i3 & 147) != 146)) {
                    btsVar15.Y();
                } else if (k7b1.f(inputState)) {
                    btsVar15.e0(-872149122);
                    au2 au2Var = hub1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("CrossS", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 g = tse0.g(7.05f, 8.46f, 10.59f, 12.0f);
                        g.i(-3.54f, 3.54f);
                        g.i(1.41f, 1.41f);
                        g.h(12.0f, 13.41f);
                        g.i(3.54f, 3.54f);
                        g.i(1.41f, -1.41f);
                        g.h(13.41f, 12.0f);
                        g.i(3.54f, -3.54f);
                        g.i(-1.41f, -1.41f);
                        tse0.u(g, 12.0f, 10.59f, 8.46f, 7.05f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", g.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        hub1.a = au2Var;
                    }
                    au2 au2Var2 = au2Var;
                    boolean k8 = btsVar15.k(str5);
                    Object Q11 = btsVar15.Q();
                    if (k8 || Q11 == o430Var) {
                        Q11 = new g8r0(str5, 6);
                        btsVar15.o0(Q11);
                    }
                    f530 k9 = an91.k(fnq0.b(c530Var, false, (tls) Q11), 8.0f);
                    boolean k10 = btsVar15.k(tlsVar13);
                    Object Q12 = btsVar15.Q();
                    if (k10 || Q12 == o430Var) {
                        Q12 = new lao0(15, tlsVar13);
                        btsVar15.o0(Q12);
                    }
                    sya1.a(au2Var2, q791.d(k9, false, null, null, (sls) Q12, 15), null, null, btsVar15, 0, 12);
                    btsVar15.t(false);
                } else {
                    btsVar15.e0(-871846252);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar15, false);
                }
                return zy11Var2;
        }
    }
}
