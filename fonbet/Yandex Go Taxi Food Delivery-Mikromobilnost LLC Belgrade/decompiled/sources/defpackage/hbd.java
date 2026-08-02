package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.information.presentation.b;
import com.yandex.go.scooters.ignition.controlling.d;
import com.yandex.go.scooters.ignition.controlling.disabling_confirmation.a;
import com.yandex.go.scooters.passes.active.v3.c;
import com.yandex.go.scooters.passes.purchase.packages.f;
import java.util.List;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final /* synthetic */ class hbd implements bms {
    public final /* synthetic */ int a;

    public /* synthetic */ hbd(int i) {
        this.a = i;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        yao0 yao0Var = (yao0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        kcd kcdVar = kcd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(yao0Var) ? 32 : 16;
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
            fva0.f(a, "Scooters.PackagesUpsaleOnBook", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Scooters.PackagesUpsaleOnBook");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        pao0.h(yao0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        xjo0 xjo0Var = (xjo0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        ncd ncdVar = ncd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(xjo0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            u3b1.k(xjo0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        wxo0 wxo0Var = (wxo0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        qcd qcdVar = qcd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(wxo0Var) ? 32 : 16;
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
            fva0.f(a, "Scooters.SubscriptionPurchaseInfo", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Scooters.SubscriptionPurchaseInfo");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        j4b1.d(wxo0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        vzo0 vzo0Var = (vzo0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        rcd rcdVar = rcd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(vzo0Var) ? 32 : 16;
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
            fva0.f(a, "Scooters.SubscriptionUpsaleOnBook", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Scooters.SubscriptionUpsaleOnBook");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        lzo0.g(vzo0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        s1p0 s1p0Var = (s1p0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        tcd tcdVar = tcd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(s1p0Var) ? 32 : 16;
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
            fva0.f(a, "Scooters.SuperPassesPurchase", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Scooters.SuperPassesPurchase");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        k4b1.i(s1p0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        l2p0 l2p0Var = (l2p0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        vcd vcdVar = vcd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(l2p0Var) ? 32 : 16;
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
            fva0.f(a, "Scooters.SuperPassesUpsaleOnBook", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Scooters.SuperPassesUpsaleOnBook");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        g2p0.g(l2p0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        g7p0 g7p0Var = (g7p0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        xcd xcdVar = xcd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(g7p0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            v4b1.c(g7p0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        jxq0 jxq0Var = (jxq0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        bdd bddVar = bdd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(jxq0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            b.a(jxq0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        psr0 psr0Var = (psr0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        edd eddVar = edd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(psr0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            ccb1.e(psr0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        egs0 egs0Var = (egs0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        idd iddVar = idd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(egs0Var) : fidVar.e(egs0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            adb1.d(egs0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        nhj0 nhj0Var = (nhj0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        udd uddVar = udd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(nhj0Var) ? 32 : 16;
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
            fva0.f(a, "SpecialNeedsScreenCompose", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("SpecialNeedsScreenCompose");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        ula1.e(nhj0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        rhu0 rhu0Var = (rhu0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        wdd wddVar = wdd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(rhu0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            qgb1.a(rhu0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        ydd yddVar = ydd.a;
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(list) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                v0b1.a((nvi0) list.get(i), ljs0.i(c530.a, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        ydd yddVar = ydd.a;
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(list) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                v0b1.a((nvi0) list.get(i), ljs0.i(c530.a, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        rzw0 rzw0Var = (rzw0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        zdd zddVar = zdd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(rzw0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            mjb1.d(rzw0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.a;
        zy11 zy11Var = null;
        o430 o430Var = did.a;
        zy11 zy11Var2 = zy11.a;
        switch (i15) {
            case 0:
                xfd xfdVar = (xfd) obj;
                e0m0 e0m0Var = (e0m0) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                ibd ibdVar = ibd.a;
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((bts) fidVar).k(e0m0Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    lxa1.a(e0m0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                spm0 spm0Var = (spm0) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                lbd lbdVar = lbd.a;
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((bts) fidVar2).k(spm0Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    wza1.g(spm0Var, btsVar2, (intValue2 >> 3) & 14);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 2:
                xfd xfdVar2 = (xfd) obj;
                urm0 urm0Var = (urm0) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                mbd mbdVar = mbd.a;
                if ((intValue3 & 6) == 0) {
                    i2 = intValue3 | ((intValue3 & 8) == 0 ? ((bts) fidVar3).k(xfdVar2) : fidVar3.e(xfdVar2) ? 4 : 2);
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= ((bts) fidVar3).k(urm0Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i2 & 1, (i2 & 147) != 146)) {
                    fva0 a = f4z.a();
                    View view = (View) btsVar3.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar3.k(view);
                    Object Q = btsVar3.Q();
                    if (k || Q == o430Var) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        Q = (xva0) tag;
                        btsVar3.o0(Q);
                    }
                    xva0 xva0Var = (xva0) Q;
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        fva0.f(a, "Scooters.ActivePassesV3.Freeze", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var.a;
                        if (yuf0Var != null) {
                            yuf0Var.I("Scooters.ActivePassesV3.Freeze");
                            zy11Var = zy11Var2;
                        }
                        btsVar3.o0(zy11Var);
                        Q2 = zy11Var;
                    }
                    e0b1.e(urm0Var, ((bgd) xfdVar2).a, btsVar3, (i2 >> 3) & 14);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 3:
                xfd xfdVar3 = (xfd) obj;
                hsm0 hsm0Var = (hsm0) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                obd obdVar = obd.a;
                if ((intValue4 & 6) == 0) {
                    i3 = intValue4 | ((intValue4 & 8) == 0 ? ((bts) fidVar4).k(xfdVar3) : fidVar4.e(xfdVar3) ? 4 : 2);
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i3 |= ((bts) fidVar4).k(hsm0Var) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i3 & 1, (i3 & 147) != 146)) {
                    fva0 a2 = f4z.a();
                    View view2 = (View) btsVar4.m(AndroidCompositionLocals_androidKt.f);
                    boolean k2 = btsVar4.k(view2);
                    Object Q3 = btsVar4.Q();
                    if (k2 || Q3 == o430Var) {
                        View rootView2 = view2.getRootView();
                        Object tag2 = rootView2.getTag(t9h0.metricsStateHolder);
                        if (tag2 == null) {
                            tag2 = new xva0();
                            rootView2.setTag(t9h0.metricsStateHolder, tag2);
                        }
                        Q3 = (xva0) tag2;
                        btsVar4.o0(Q3);
                    }
                    xva0 xva0Var2 = (xva0) Q3;
                    Object Q4 = btsVar4.Q();
                    if (Q4 == o430Var) {
                        fva0.f(a2, "Scooters.ActivePassesV3.RenewDisabling", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var2 = xva0Var2.a;
                        if (yuf0Var2 != null) {
                            yuf0Var2.I("Scooters.ActivePassesV3.RenewDisabling");
                            zy11Var = zy11Var2;
                        }
                        btsVar4.o0(zy11Var);
                        Q4 = zy11Var;
                    }
                    f0b1.d(hsm0Var, ((bgd) xfdVar3).a, btsVar4, (i3 >> 3) & 14);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 4:
                xfd xfdVar4 = (xfd) obj;
                ctm0 ctm0Var = (ctm0) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                pbd pbdVar = pbd.a;
                if ((intValue5 & 6) == 0) {
                    i4 = intValue5 | ((intValue5 & 8) == 0 ? ((bts) fidVar5).k(xfdVar4) : fidVar5.e(xfdVar4) ? 4 : 2);
                } else {
                    i4 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i4 |= ((bts) fidVar5).k(ctm0Var) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(i4 & 1, (i4 & 147) != 146)) {
                    fva0 a3 = f4z.a();
                    View view3 = (View) btsVar5.m(AndroidCompositionLocals_androidKt.f);
                    boolean k3 = btsVar5.k(view3);
                    Object Q5 = btsVar5.Q();
                    if (k3 || Q5 == o430Var) {
                        View rootView3 = view3.getRootView();
                        Object tag3 = rootView3.getTag(t9h0.metricsStateHolder);
                        if (tag3 == null) {
                            tag3 = new xva0();
                            rootView3.setTag(t9h0.metricsStateHolder, tag3);
                        }
                        Q5 = (xva0) tag3;
                        btsVar5.o0(Q5);
                    }
                    xva0 xva0Var3 = (xva0) Q5;
                    Object Q6 = btsVar5.Q();
                    if (Q6 == o430Var) {
                        fva0.f(a3, "Scooters.ActivePassesV3.RenewMenu", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var3 = xva0Var3.a;
                        if (yuf0Var3 != null) {
                            yuf0Var3.I("Scooters.ActivePassesV3.RenewMenu");
                            zy11Var = zy11Var2;
                        }
                        btsVar5.o0(zy11Var);
                        Q6 = zy11Var;
                    }
                    k0b1.g(ctm0Var, ((bgd) xfdVar4).a, btsVar5, (i4 >> 3) & 14);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 5:
                xfd xfdVar5 = (xfd) obj;
                fum0 fum0Var = (fum0) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                rbd rbdVar = rbd.a;
                if ((intValue6 & 6) == 0) {
                    i5 = intValue6 | ((intValue6 & 8) == 0 ? ((bts) fidVar6).k(xfdVar5) : fidVar6.e(xfdVar5) ? 4 : 2);
                } else {
                    i5 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i5 |= ((bts) fidVar6).k(fum0Var) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(i5 & 1, (i5 & 147) != 146)) {
                    fva0 a4 = f4z.a();
                    View view4 = (View) btsVar6.m(AndroidCompositionLocals_androidKt.f);
                    boolean k4 = btsVar6.k(view4);
                    Object Q7 = btsVar6.Q();
                    if (k4 || Q7 == o430Var) {
                        View rootView4 = view4.getRootView();
                        Object tag4 = rootView4.getTag(t9h0.metricsStateHolder);
                        if (tag4 == null) {
                            tag4 = new xva0();
                            rootView4.setTag(t9h0.metricsStateHolder, tag4);
                        }
                        Q7 = (xva0) tag4;
                        btsVar6.o0(Q7);
                    }
                    xva0 xva0Var4 = (xva0) Q7;
                    Object Q8 = btsVar6.Q();
                    if (Q8 == o430Var) {
                        fva0.f(a4, "Scooters.ActivePassesV3", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var4 = xva0Var4.a;
                        if (yuf0Var4 != null) {
                            yuf0Var4.I("Scooters.ActivePassesV3");
                            zy11Var = zy11Var2;
                        }
                        btsVar6.o0(zy11Var);
                        Q8 = zy11Var;
                    }
                    c.e(fum0Var, ((bgd) xfdVar5).a, btsVar6, (i5 >> 3) & 14);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 6:
                xfd xfdVar6 = (xfd) obj;
                pum0 pum0Var = (pum0) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                tbd tbdVar = tbd.a;
                if ((intValue7 & 6) == 0) {
                    i6 = intValue7 | ((intValue7 & 8) == 0 ? ((bts) fidVar7).k(xfdVar6) : fidVar7.e(xfdVar6) ? 4 : 2);
                } else {
                    i6 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i6 |= ((bts) fidVar7).k(pum0Var) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(i6 & 1, (i6 & 147) != 146)) {
                    fva0 a5 = f4z.a();
                    View view5 = (View) btsVar7.m(AndroidCompositionLocals_androidKt.f);
                    boolean k5 = btsVar7.k(view5);
                    Object Q9 = btsVar7.Q();
                    if (k5 || Q9 == o430Var) {
                        View rootView5 = view5.getRootView();
                        Object tag5 = rootView5.getTag(t9h0.metricsStateHolder);
                        if (tag5 == null) {
                            tag5 = new xva0();
                            rootView5.setTag(t9h0.metricsStateHolder, tag5);
                        }
                        Q9 = (xva0) tag5;
                        btsVar7.o0(Q9);
                    }
                    xva0 xva0Var5 = (xva0) Q9;
                    Object Q10 = btsVar7.Q();
                    if (Q10 == o430Var) {
                        fva0.f(a5, "Scooters.ActivePassesV3.Winback", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var5 = xva0Var5.a;
                        if (yuf0Var5 != null) {
                            yuf0Var5.I("Scooters.ActivePassesV3.Winback");
                            zy11Var = zy11Var2;
                        }
                        btsVar7.o0(zy11Var);
                        Q10 = zy11Var;
                    }
                    l0b1.f(pum0Var, ((bgd) xfdVar6).a, btsVar7, (i6 >> 3) & 14);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 7:
                xfd xfdVar7 = (xfd) obj;
                hpn0 hpn0Var = (hpn0) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                ubd ubdVar = ubd.a;
                if ((intValue8 & 6) == 0) {
                    i7 = intValue8 | ((intValue8 & 8) == 0 ? ((bts) fidVar8).k(xfdVar7) : fidVar8.e(xfdVar7) ? 4 : 2);
                } else {
                    i7 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i7 |= ((bts) fidVar8).k(hpn0Var) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(i7 & 1, (i7 & 147) != 146)) {
                    fva0 a6 = f4z.a();
                    View view6 = (View) btsVar8.m(AndroidCompositionLocals_androidKt.f);
                    boolean k6 = btsVar8.k(view6);
                    Object Q11 = btsVar8.Q();
                    if (k6 || Q11 == o430Var) {
                        View rootView6 = view6.getRootView();
                        Object tag6 = rootView6.getTag(t9h0.metricsStateHolder);
                        if (tag6 == null) {
                            tag6 = new xva0();
                            rootView6.setTag(t9h0.metricsStateHolder, tag6);
                        }
                        Q11 = (xva0) tag6;
                        btsVar8.o0(Q11);
                    }
                    xva0 xva0Var6 = (xva0) Q11;
                    Object Q12 = btsVar8.Q();
                    if (Q12 == o430Var) {
                        fva0.f(a6, "Scooters.IgnitionDisablingConfirmation", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var6 = xva0Var6.a;
                        if (yuf0Var6 != null) {
                            yuf0Var6.I("Scooters.IgnitionDisablingConfirmation");
                            zy11Var = zy11Var2;
                        }
                        btsVar8.o0(zy11Var);
                        Q12 = zy11Var;
                    }
                    a.a(hpn0Var, ((bgd) xfdVar7).a, btsVar8, (i7 >> 3) & 14);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 8:
                xfd xfdVar8 = (xfd) obj;
                rqn0 rqn0Var = (rqn0) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                wbd wbdVar = wbd.a;
                if ((intValue9 & 6) == 0) {
                    i8 = intValue9 | ((intValue9 & 8) == 0 ? ((bts) fidVar9).k(xfdVar8) : fidVar9.e(xfdVar8) ? 4 : 2);
                } else {
                    i8 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i8 |= ((bts) fidVar9).k(rqn0Var) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(i8 & 1, (i8 & 147) != 146)) {
                    fva0 a7 = f4z.a();
                    View view7 = (View) btsVar9.m(AndroidCompositionLocals_androidKt.f);
                    boolean k7 = btsVar9.k(view7);
                    Object Q13 = btsVar9.Q();
                    if (k7 || Q13 == o430Var) {
                        View rootView7 = view7.getRootView();
                        Object tag7 = rootView7.getTag(t9h0.metricsStateHolder);
                        if (tag7 == null) {
                            tag7 = new xva0();
                            rootView7.setTag(t9h0.metricsStateHolder, tag7);
                        }
                        Q13 = (xva0) tag7;
                        btsVar9.o0(Q13);
                    }
                    xva0 xva0Var7 = (xva0) Q13;
                    Object Q14 = btsVar9.Q();
                    if (Q14 == o430Var) {
                        fva0.f(a7, "Scooters.IgnitionControlling", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var7 = xva0Var7.a;
                        if (yuf0Var7 != null) {
                            yuf0Var7.I("Scooters.IgnitionControlling");
                            zy11Var = zy11Var2;
                        }
                        btsVar9.o0(zy11Var);
                        Q14 = zy11Var;
                    }
                    d.e(rqn0Var, ((bgd) xfdVar8).a, btsVar9, (i8 >> 3) & 14);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 9:
                xfd xfdVar9 = (xfd) obj;
                xrn0 xrn0Var = (xrn0) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                ybd ybdVar = ybd.a;
                if ((intValue10 & 6) == 0) {
                    i9 = intValue10 | ((intValue10 & 8) == 0 ? ((bts) fidVar10).k(xfdVar9) : fidVar10.e(xfdVar9) ? 4 : 2);
                } else {
                    i9 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i9 |= ((bts) fidVar10).k(xrn0Var) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(i9 & 1, (i9 & 147) != 146)) {
                    fva0 a8 = f4z.a();
                    View view8 = (View) btsVar10.m(AndroidCompositionLocals_androidKt.f);
                    boolean k8 = btsVar10.k(view8);
                    Object Q15 = btsVar10.Q();
                    if (k8 || Q15 == o430Var) {
                        View rootView8 = view8.getRootView();
                        Object tag8 = rootView8.getTag(t9h0.metricsStateHolder);
                        if (tag8 == null) {
                            tag8 = new xva0();
                            rootView8.setTag(t9h0.metricsStateHolder, tag8);
                        }
                        Q15 = (xva0) tag8;
                        btsVar10.o0(Q15);
                    }
                    xva0 xva0Var8 = (xva0) Q15;
                    Object Q16 = btsVar10.Q();
                    if (Q16 == o430Var) {
                        fva0.f(a8, "Scooters.IgnitionControlPanel", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var8 = xva0Var8.a;
                        if (yuf0Var8 != null) {
                            yuf0Var8.I("Scooters.IgnitionControlPanel");
                            zy11Var = zy11Var2;
                        }
                        btsVar10.o0(zy11Var);
                        Q16 = zy11Var;
                    }
                    com.yandex.go.scooters.ignition.panel.d.b(xrn0Var, ((bgd) xfdVar9).a, btsVar10, (i9 >> 3) & 14);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 10:
                xfd xfdVar10 = (xfd) obj;
                dsn0 dsn0Var = (dsn0) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                bcd bcdVar = bcd.a;
                if ((intValue11 & 6) == 0) {
                    i10 = intValue11 | ((intValue11 & 8) == 0 ? ((bts) fidVar11).k(xfdVar10) : fidVar11.e(xfdVar10) ? 4 : 2);
                } else {
                    i10 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i10 |= ((bts) fidVar11).k(dsn0Var) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i10 & 1, (i10 & 147) != 146)) {
                    fva0 a9 = f4z.a();
                    View view9 = (View) btsVar11.m(AndroidCompositionLocals_androidKt.f);
                    boolean k9 = btsVar11.k(view9);
                    Object Q17 = btsVar11.Q();
                    if (k9 || Q17 == o430Var) {
                        View rootView9 = view9.getRootView();
                        Object tag9 = rootView9.getTag(t9h0.metricsStateHolder);
                        if (tag9 == null) {
                            tag9 = new xva0();
                            rootView9.setTag(t9h0.metricsStateHolder, tag9);
                        }
                        Q17 = (xva0) tag9;
                        btsVar11.o0(Q17);
                    }
                    xva0 xva0Var9 = (xva0) Q17;
                    Object Q18 = btsVar11.Q();
                    if (Q18 == o430Var) {
                        fva0.f(a9, "Scooters.IgnitionPermissionInfo", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var9 = xva0Var9.a;
                        if (yuf0Var9 != null) {
                            yuf0Var9.I("Scooters.IgnitionPermissionInfo");
                            zy11Var = zy11Var2;
                        }
                        btsVar11.o0(zy11Var);
                        Q18 = zy11Var;
                    }
                    e2b1.a(dsn0Var, ((bgd) xfdVar10).a, btsVar11, (i10 >> 3) & 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 11:
                xfd xfdVar11 = (xfd) obj;
                sun0 sun0Var = (sun0) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                dcd dcdVar = dcd.a;
                if ((intValue12 & 6) == 0) {
                    i11 = intValue12 | ((intValue12 & 8) == 0 ? ((bts) fidVar12).k(xfdVar11) : fidVar12.e(xfdVar11) ? 4 : 2);
                } else {
                    i11 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i11 |= ((bts) fidVar12).k(sun0Var) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(i11 & 1, (i11 & 147) != 146)) {
                    fva0 a10 = f4z.a();
                    View view10 = (View) btsVar12.m(AndroidCompositionLocals_androidKt.f);
                    boolean k10 = btsVar12.k(view10);
                    Object Q19 = btsVar12.Q();
                    if (k10 || Q19 == o430Var) {
                        View rootView10 = view10.getRootView();
                        Object tag10 = rootView10.getTag(t9h0.metricsStateHolder);
                        if (tag10 == null) {
                            tag10 = new xva0();
                            rootView10.setTag(t9h0.metricsStateHolder, tag10);
                        }
                        Q19 = (xva0) tag10;
                        btsVar12.o0(Q19);
                    }
                    xva0 xva0Var10 = (xva0) Q19;
                    Object Q20 = btsVar12.Q();
                    if (Q20 == o430Var) {
                        fva0.f(a10, "Scooters.InsuranceSuggestV2", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var10 = xva0Var10.a;
                        if (yuf0Var10 != null) {
                            yuf0Var10.I("Scooters.InsuranceSuggestV2");
                            zy11Var = zy11Var2;
                        }
                        btsVar12.o0(zy11Var);
                        Q20 = zy11Var;
                    }
                    n2b1.h(sun0Var, ((bgd) xfdVar11).a, btsVar12, (i11 >> 3) & 14);
                } else {
                    btsVar12.Y();
                }
                return zy11Var2;
            case 12:
                xfd xfdVar12 = (xfd) obj;
                f2o0 f2o0Var = (f2o0) obj2;
                fid fidVar13 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                fcd fcdVar = fcd.a;
                if ((intValue13 & 6) == 0) {
                    i12 = intValue13 | ((intValue13 & 8) == 0 ? ((bts) fidVar13).k(xfdVar12) : fidVar13.e(xfdVar12) ? 4 : 2);
                } else {
                    i12 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    i12 |= ((bts) fidVar13).k(f2o0Var) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(i12 & 1, (i12 & 147) != 146)) {
                    fva0 a11 = f4z.a();
                    View view11 = (View) btsVar13.m(AndroidCompositionLocals_androidKt.f);
                    boolean k11 = btsVar13.k(view11);
                    Object Q21 = btsVar13.Q();
                    if (k11 || Q21 == o430Var) {
                        View rootView11 = view11.getRootView();
                        Object tag11 = rootView11.getTag(t9h0.metricsStateHolder);
                        if (tag11 == null) {
                            tag11 = new xva0();
                            rootView11.setTag(t9h0.metricsStateHolder, tag11);
                        }
                        Q21 = (xva0) tag11;
                        btsVar13.o0(Q21);
                    }
                    xva0 xva0Var11 = (xva0) Q21;
                    Object Q22 = btsVar13.Q();
                    if (Q22 == o430Var) {
                        fva0.f(a11, "Scooters.Newbie", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var11 = xva0Var11.a;
                        if (yuf0Var11 != null) {
                            yuf0Var11.I("Scooters.Newbie");
                            zy11Var = zy11Var2;
                        }
                        btsVar13.o0(zy11Var);
                        Q22 = zy11Var;
                    }
                    t2b1.d(f2o0Var, ((bgd) xfdVar12).a, btsVar13, (i12 >> 3) & 14);
                } else {
                    btsVar13.Y();
                }
                return zy11Var2;
            case 13:
                xfd xfdVar13 = (xfd) obj;
                p8o0 p8o0Var = (p8o0) obj2;
                fid fidVar14 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                icd icdVar = icd.a;
                if ((intValue14 & 6) == 0) {
                    i13 = intValue14 | ((intValue14 & 8) == 0 ? ((bts) fidVar14).k(xfdVar13) : fidVar14.e(xfdVar13) ? 4 : 2);
                } else {
                    i13 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i13 |= ((bts) fidVar14).k(p8o0Var) ? 32 : 16;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(i13 & 1, (i13 & 147) != 146)) {
                    fva0 a12 = f4z.a();
                    View view12 = (View) btsVar14.m(AndroidCompositionLocals_androidKt.f);
                    boolean k12 = btsVar14.k(view12);
                    Object Q23 = btsVar14.Q();
                    if (k12 || Q23 == o430Var) {
                        View rootView12 = view12.getRootView();
                        Object tag12 = rootView12.getTag(t9h0.metricsStateHolder);
                        if (tag12 == null) {
                            tag12 = new xva0();
                            rootView12.setTag(t9h0.metricsStateHolder, tag12);
                        }
                        Q23 = (xva0) tag12;
                        btsVar14.o0(Q23);
                    }
                    xva0 xva0Var12 = (xva0) Q23;
                    Object Q24 = btsVar14.Q();
                    if (Q24 == o430Var) {
                        fva0.f(a12, "Scooters.PackagesPurchase", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var12 = xva0Var12.a;
                        if (yuf0Var12 != null) {
                            yuf0Var12.I("Scooters.PackagesPurchase");
                            zy11Var = zy11Var2;
                        }
                        btsVar14.o0(zy11Var);
                        Q24 = zy11Var;
                    }
                    f.l(p8o0Var, ((bgd) xfdVar13).a, btsVar14, (i13 >> 3) & 14);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 14:
                return b(obj, obj2, obj3, obj4);
            case 15:
                return d(obj, obj2, obj3, obj4);
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
                xfd xfdVar14 = (xfd) obj;
                qfx0 qfx0Var = (qfx0) obj2;
                fid fidVar15 = (fid) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                bed bedVar = bed.a;
                if ((intValue15 & 6) == 0) {
                    i14 = intValue15 | ((intValue15 & 8) == 0 ? ((bts) fidVar15).k(xfdVar14) : fidVar15.e(xfdVar14) ? 4 : 2);
                } else {
                    i14 = intValue15;
                }
                if ((intValue15 & 48) == 0) {
                    i14 |= ((bts) fidVar15).k(qfx0Var) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(i14 & 1, (i14 & 147) != 146)) {
                    fva0 a13 = f4z.a();
                    View view13 = (View) btsVar15.m(AndroidCompositionLocals_androidKt.f);
                    boolean k13 = btsVar15.k(view13);
                    Object Q25 = btsVar15.Q();
                    if (k13 || Q25 == o430Var) {
                        View rootView13 = view13.getRootView();
                        Object tag13 = rootView13.getTag(t9h0.metricsStateHolder);
                        if (tag13 == null) {
                            tag13 = new xva0();
                            rootView13.setTag(t9h0.metricsStateHolder, tag13);
                        }
                        Q25 = (xva0) tag13;
                        btsVar15.o0(Q25);
                    }
                    xva0 xva0Var13 = (xva0) Q25;
                    Object Q26 = btsVar15.Q();
                    if (Q26 == o430Var) {
                        fva0.f(a13, "TariffDetailsScreenCompose", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var13 = xva0Var13.a;
                        if (yuf0Var13 != null) {
                            yuf0Var13.I("TariffDetailsScreenCompose");
                            zy11Var = zy11Var2;
                        }
                        btsVar15.o0(zy11Var);
                        Q26 = zy11Var;
                    }
                    pkb1.b(qfx0Var, ((bgd) xfdVar14).a, btsVar15, (i14 >> 3) & 14);
                } else {
                    btsVar15.Y();
                }
                return zy11Var2;
        }
    }
}
