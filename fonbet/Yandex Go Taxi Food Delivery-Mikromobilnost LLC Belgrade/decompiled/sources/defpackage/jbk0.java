package defpackage;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.acceptance.domain.c;
import com.yandex.go.payments.api.acceptance.AcceptancePaymentOrderContext;
import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderFeedbackQuestionInfoState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.checkin.a;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderAnalyticsReporter$CompleteButtonActionName;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.d;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class jbk0 {
    public final d A;
    public final h3y B;
    public final pg7 C;
    public final k48 D;
    public final g E;
    public final h3y F;
    public final a G;
    public final mok0 H;
    public final com.yandex.go.taxi.order.change.due.domain.a I;
    public final com.yandex.go.taxi.order.change.price.domain.a J;
    public final com.yandex.go.taxi.order.change.requirements.interactor.a K;
    public final g6y0 L;
    public final opw M;
    public final i3y N = kotlin.a.b(LazyThreadSafetyMode.NONE, new zfj0(23));
    public final o2y0 a;
    public final je b;
    public final com.yandex.go.taxi.order.details.v2.analytics.g c;
    public final x980 d;
    public final b5j e;
    public final h3y f;
    public final c2y0 g;
    public final y1y0 h;
    public final w1y0 i;
    public final f2y0 j;
    public final a2y0 k;
    public final b2y0 l;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.a m;
    public final alk0 n;
    public final u2y0 o;
    public final x980 p;
    public final i2y0 q;
    public final ddk0 r;
    public final h2y0 s;
    public final ss21 t;
    public final yk21 u;
    public final k2y0 v;
    public final v1y0 w;
    public final v8k0 x;
    public final lg21 y;
    public final l1t z;

    public jbk0(o2y0 o2y0Var, je jeVar, com.yandex.go.taxi.order.details.v2.analytics.g gVar, x980 x980Var, b5j b5jVar, h3y h3yVar, c2y0 c2y0Var, j2y0 j2y0Var, y1y0 y1y0Var, w1y0 w1y0Var, f2y0 f2y0Var, a2y0 a2y0Var, b2y0 b2y0Var, com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar, alk0 alk0Var, u2y0 u2y0Var, x980 x980Var2, i2y0 i2y0Var, ddk0 ddk0Var, h2y0 h2y0Var, ss21 ss21Var, yk21 yk21Var, k2y0 k2y0Var, v1y0 v1y0Var, v8k0 v8k0Var, lg21 lg21Var, l1t l1tVar, d dVar, h3y h3yVar2, pg7 pg7Var, k48 k48Var, g gVar2, h3y h3yVar3, a aVar2, mok0 mok0Var, com.yandex.go.taxi.order.change.due.domain.a aVar3, com.yandex.go.taxi.order.change.price.domain.a aVar4, com.yandex.go.taxi.order.change.requirements.interactor.a aVar5, g6y0 g6y0Var, opw opwVar) {
        this.a = o2y0Var;
        this.b = jeVar;
        this.c = gVar;
        this.d = x980Var;
        this.e = b5jVar;
        this.f = h3yVar;
        this.g = c2y0Var;
        this.h = y1y0Var;
        this.i = w1y0Var;
        this.j = f2y0Var;
        this.k = a2y0Var;
        this.l = b2y0Var;
        this.m = aVar;
        this.n = alk0Var;
        this.o = u2y0Var;
        this.p = x980Var2;
        this.q = i2y0Var;
        this.r = ddk0Var;
        this.s = h2y0Var;
        this.t = ss21Var;
        this.u = yk21Var;
        this.v = k2y0Var;
        this.w = v1y0Var;
        this.x = v8k0Var;
        this.y = lg21Var;
        this.z = l1tVar;
        this.A = dVar;
        this.B = h3yVar2;
        this.C = pg7Var;
        this.D = k48Var;
        this.E = gVar2;
        this.F = h3yVar3;
        this.G = aVar2;
        this.H = mok0Var;
        this.I = aVar3;
        this.J = aVar4;
        this.K = aVar5;
        this.L = g6y0Var;
        this.M = opwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ibk0 ibk0Var, wrs0 wrs0Var, SuspendLambda suspendLambda) {
        Object value;
        TaxiOrder taxiOrder;
        Object value2;
        TaxiOrder taxiOrder2;
        zy11 zy11Var = zy11.a;
        l76 l76Var = l76.T;
        this.c.b(ibk0Var.a(), wrs0Var);
        if (!(ibk0Var instanceof s9k0) && !(ibk0Var instanceof gbk0)) {
            if (ibk0Var instanceof sak0) {
                this.M.getClass();
                ((f) this.g.a).Y(this.a, null, null);
            } else if (ibk0Var instanceof tak0) {
                a2y0 a2y0Var = this.k;
                o2y0 o2y0Var = this.a;
                f fVar = (f) a2y0Var.a;
                fVar.E((m950) fVar.z0.get(), o2y0Var.b(), new bp70(o2y0Var, fVar), hxx.a);
            } else if (ibk0Var instanceof mak0) {
                this.l.a(this.a, RouteChangeWarning.ADD_ROUTE_POINT);
            } else if (ibk0Var instanceof nak0) {
                this.l.a(this.a, RouteChangeWarning.CHANGE_ROUTE_POINT);
            } else if (ibk0Var instanceof l9k0) {
                this.l.a(this.a, RouteChangeWarning.CHANGE_DESTINATION);
            } else if (ibk0Var instanceof hak0) {
                this.n.j();
            } else if (ibk0Var instanceof dak0) {
                this.n.i();
            } else if (ibk0Var instanceof wak0) {
                this.n.g(((wak0) ibk0Var).b);
            } else if (ibk0Var instanceof xak0) {
                this.n.f();
            } else if (ibk0Var instanceof c9k0) {
                ((f) this.d).s0(this.a);
            } else if (ibk0Var instanceof g9k0) {
                this.m.a();
                ((qzc) this.f.get()).a(this.a, OrderAnalyticsReporter$CompleteButtonActionName.CLOSE);
                this.n.l();
            } else if (ibk0Var instanceof h9k0) {
                this.m.a();
                ((qzc) this.f.get()).a(this.a, OrderAnalyticsReporter$CompleteButtonActionName.CLOSE_AND_DEEPLINK);
                this.n.l();
                b5j b5jVar = this.e;
                b5jVar.getClass();
                b5jVar.a.a(Uri.parse(((h9k0) ibk0Var).b), DeeplinkSource.UNSPECIFIED);
            } else if (!(ibk0Var instanceof j9k0)) {
                if (ibk0Var instanceof o9k0) {
                    this.n.b(((o9k0) ibk0Var).a);
                } else if (ibk0Var instanceof n9k0) {
                    n9k0 n9k0Var = (n9k0) ibk0Var;
                    m9k0 m9k0Var = n9k0Var.c;
                    if (m9k0Var != null) {
                        ((m48) this.D).b(n9k0Var.a, m9k0Var.a, m9k0Var.b, m9k0Var.c, n9k0Var.b, 8388661);
                    }
                } else if (ibk0Var instanceof iak0) {
                    b(((iak0) ibk0Var).b);
                } else {
                    if (ibk0Var instanceof jak0) {
                        b(((jak0) ibk0Var).b);
                        DetailsOpenReason detailsOpenReason = DetailsOpenReason.RATING;
                        ((i6y0) this.L).c(l76Var);
                        this.E.d(this.a.b().a, false, detailsOpenReason, TaxiCardNavigationAction.EMPTY);
                    } else if (ibk0Var instanceof r9k0) {
                        this.w.a();
                    } else if (ibk0Var instanceof gak0) {
                        ((mg21) this.y).c(((gak0) ibk0Var).b);
                    } else if (ibk0Var instanceof q9k0) {
                        q9k0 q9k0Var = (q9k0) ibk0Var;
                        String str = q9k0Var.a;
                        String str2 = q9k0Var.b;
                        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar = this.m;
                        List list = aVar.a.b().l.W.h;
                        if (list != null) {
                            List<TaxiOrderFeedbackQuestionInfoState> list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                for (TaxiOrderFeedbackQuestionInfoState taxiOrderFeedbackQuestionInfoState : list2) {
                                    if (jl40.l(taxiOrderFeedbackQuestionInfoState.a, str) && jl40.l(taxiOrderFeedbackQuestionInfoState.b, str2)) {
                                        aVar.g(new l0o(28));
                                        break;
                                    }
                                }
                            }
                        }
                        aVar.g(new r(str, str2, 15));
                    } else if (ibk0Var instanceof u9k0) {
                        u9k0 u9k0Var = (u9k0) ibk0Var;
                        y1y0 y1y0Var = this.h;
                        o2y0 o2y0Var2 = this.a;
                        String str3 = u9k0Var.b;
                        String str4 = u9k0Var.c;
                        String str5 = u9k0Var.d;
                        rp70 rp70Var = ((f) y1y0Var.a).C1;
                        rp70Var.getClass();
                        tdj tdjVar = new tdj(o2y0Var2);
                        tdjVar.b = str3;
                        tdjVar.c = str4;
                        tdjVar.g = str5;
                        rp70Var.c.n(tdjVar, new pp70(o2y0Var2, "centerModal"));
                    } else if (ibk0Var instanceof t9k0) {
                        t9k0 t9k0Var = (t9k0) ibk0Var;
                        ief iefVar = this.a.b().V().K;
                        fef h = iefVar != null ? gwk0.h(iefVar) : null;
                        w1y0 w1y0Var = this.i;
                        uc6 uc6Var = t9k0Var.b;
                        f fVar2 = (f) w1y0Var.a;
                        OrderFragment orderFragment = fVar2.p1;
                        if (orderFragment != null && fVar2.getLifecycle().w.a(Lifecycle.State.STARTED)) {
                            orderFragment.openBottomModal(uc6Var, h);
                        }
                    } else if (ibk0Var instanceof aak0) {
                        aak0 aak0Var = (aak0) ibk0Var;
                        o2y0 o2y0Var3 = this.a;
                        ief iefVar2 = o2y0Var3.b().V().K;
                        fef h2 = iefVar2 != null ? gwk0.h(iefVar2) : null;
                        f2y0 f2y0Var = this.j;
                        s3j s3jVar = new s3j(o2y0Var3.b().a, aak0Var.b, o2y0Var3.c());
                        f fVar3 = (f) f2y0Var.a;
                        OrderFragment orderFragment2 = fVar3.p1;
                        if (orderFragment2 != null && fVar3.getLifecycle().w.a(Lifecycle.State.STARTED)) {
                            orderFragment2.openDetailedPriceModal(s3jVar, h2);
                        }
                    } else if (ibk0Var instanceof w9k0) {
                        v9k0 v9k0Var = ((w9k0) ibk0Var).b;
                        this.n.c(this.a, v9k0Var != null ? new bsq(v9k0Var.a, v9k0Var.b) : null);
                    } else if (ibk0Var instanceof rak0) {
                        ((v2y0) this.o).a(this.a);
                    } else if (ibk0Var instanceof eak0) {
                        ((f) this.p).u0(this.a.b().a);
                    } else if (ibk0Var instanceof qak0) {
                        ss21 ss21Var = this.t;
                        o2y0 o2y0Var4 = this.a;
                        ss21Var.a(o2y0Var4.b());
                        pz40 pz40Var = (pz40) this.u.a.get(o2y0Var4);
                        if (pz40Var != null) {
                            TaxiOrder b = o2y0Var4.b();
                            Object[] objArr = b.h.b == DriveState.WAITING;
                            boolean H = b.H();
                            boolean z = b.V().R;
                            double d = b.V().N;
                            wf7.b.c(b.V().O);
                            if (!H && objArr != false) {
                                r3 = true;
                            }
                            ((r0) pz40Var).m(null, Boolean.valueOf(r3));
                        }
                    } else if (ibk0Var instanceof cak0) {
                        k2y0 k2y0Var = this.v;
                        o2y0 o2y0Var5 = this.a;
                        f fVar4 = (f) k2y0Var.a;
                        apf apfVar = fVar4.C1.c;
                        bub bubVar = new bub(2);
                        Iterator it = ((ArrayDeque) apfVar.c).iterator();
                        while (it.hasNext()) {
                            if (apf.r((tdj) it.next(), pp70.class, bubVar)) {
                                it.remove();
                            }
                        }
                        tdj tdjVar2 = (tdj) apfVar.w;
                        if (tdjVar2 != null ? apf.r(tdjVar2, pp70.class, bubVar) : false) {
                            apfVar.k();
                        }
                        if (o2y0Var5.b().V().R) {
                            fVar4.x0(o2y0Var5);
                            OrderFragment orderFragment3 = fVar4.p1;
                            if (orderFragment3 != null) {
                                orderFragment3.showChat(o2y0Var5, true);
                            }
                        }
                    } else if (ibk0Var instanceof y9k0) {
                        h2y0 h2y0Var = this.s;
                        o2y0 o2y0Var6 = this.a;
                        f fVar5 = (f) h2y0Var.a;
                        OrderFragment orderFragment4 = fVar5.p1;
                        if (orderFragment4 != null && fVar5.getLifecycle().w.a(Lifecycle.State.STARTED)) {
                            orderFragment4.openCostCenter(o2y0Var6);
                        }
                    } else if (ibk0Var instanceof z9k0) {
                        ((f) this.q.a).r0(this.a, ((dg7) e.d(this.r.b).a.getValue()).a());
                    } else if (ibk0Var instanceof fak0) {
                        this.n.d(new odf0(27, this));
                    } else if (ibk0Var instanceof b9k0) {
                        ((com.yandex.go.taxi.order.delegates.a) this.C).c(this.a.b(), null);
                    } else if (ibk0Var instanceof bbk0) {
                        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar2 = this.m;
                        String str6 = ((bbk0) ibk0Var).a;
                        aVar2.getClass();
                        aVar2.g(new wwb(str6, 29));
                        aVar2.b();
                        aVar2.f();
                    } else if (ibk0Var instanceof abk0) {
                        abk0 abk0Var = (abk0) ibk0Var;
                        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar3 = this.m;
                        int i = abk0Var.a;
                        float f = abk0Var.b;
                        float f2 = abk0Var.c;
                        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType = abk0Var.d;
                        String str7 = abk0Var.e;
                        ief iefVar3 = aVar3.a.b().V().K;
                        aVar3.c.e(new fmf(i, f, f2, str7, taxiOrderTipsValueType, iefVar3 != null ? gwk0.h(iefVar3) : null));
                    } else if (ibk0Var instanceof cbk0) {
                        cbk0 cbk0Var = (cbk0) ibk0Var;
                        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar4 = this.m;
                        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType2 = cbk0Var.a;
                        String str8 = cbk0Var.b;
                        aVar4.getClass();
                        o2y0 o2y0Var7 = aVar4.a;
                        r0 r0Var = o2y0Var7.a;
                        do {
                            value2 = r0Var.getValue();
                            taxiOrder2 = (TaxiOrder) value2;
                            taxiOrder2.S(diz0.b(taxiOrderTipsValueType2, str8));
                        } while (!r0Var.k(value2, taxiOrder2));
                        o2y0Var7.f();
                        ((b) aVar4.g).d(o2y0Var7.b().a, jsq.a(o2y0Var7.b()));
                        aVar4.h.g(o2y0Var7.b());
                        aVar4.b();
                        aVar4.f();
                    } else if (ibk0Var instanceof dbk0) {
                        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar5 = this.m;
                        o2y0 o2y0Var8 = aVar5.a;
                        r0 r0Var2 = o2y0Var8.a;
                        do {
                            value = r0Var2.getValue();
                            taxiOrder = (TaxiOrder) value;
                            taxiOrder.S(diz0.c());
                        } while (!r0Var2.k(value, taxiOrder));
                        o2y0Var8.f();
                        ((b) aVar5.g).d(o2y0Var8.b().a, jsq.a(o2y0Var8.b()));
                        aVar5.h.g(o2y0Var8.b());
                        aVar5.b();
                    } else if (ibk0Var instanceof lak0) {
                        lak0 lak0Var = (lak0) ibk0Var;
                        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar6 = this.m;
                        String str9 = lak0Var.a;
                        boolean z2 = lak0Var.b;
                        aVar6.getClass();
                        aVar6.g(new lo1(z2, str9, 8));
                    } else if (ibk0Var instanceof a9k0) {
                        qv10.B(((a9k0) ibk0Var).a, this.x.a.a, null);
                    } else if (ibk0Var instanceof fbk0) {
                        l1t l1tVar = this.z;
                        p1t p1tVar = (p1t) this.A.k.getValue();
                        if (p1tVar == null) {
                            a3y0 a3y0Var = (a3y0) this.N.getValue();
                            String l = a3y0Var.l(new String[]{"GEO_SHARING:MISSED_CONFIG"});
                            hst hstVar = jst.e;
                            String str10 = a3y0Var.a;
                            hstVar.getClass();
                            ist m = hstVar.m(l);
                            ke00 a = m.b.a();
                            if (a != null && a.b(15)) {
                                a.a(15, str10, null, "Missed GeoSharingConfig on share location toggled", m.a);
                            }
                        } else if (!p1tVar.a) {
                            ((m1t) l1tVar).a().M4();
                        } else if (p1tVar.c) {
                            ((m1t) l1tVar).a().M4();
                        } else {
                            boolean z3 = p1tVar.b;
                            if (z3) {
                                ((m1t) l1tVar).a().e3(false);
                            } else if (!z3) {
                                ((m1t) l1tVar).a().e3(true);
                            }
                        }
                    } else if (ibk0Var instanceof bak0) {
                        DetailsOpenReason detailsOpenReason2 = DetailsOpenReason.DETAILS_BUTTON;
                        ((i6y0) this.L).c(l76Var);
                        this.E.d(this.a.b().a, false, detailsOpenReason2, TaxiCardNavigationAction.EMPTY);
                    } else if (ibk0Var instanceof x9k0) {
                        g gVar = this.E;
                        o2y0 o2y0Var9 = this.a;
                        DetailsOpenReason detailsOpenReason3 = DetailsOpenReason.HEADER;
                        gVar.getClass();
                        boolean c = gVar.c(o2y0Var9.b());
                        com.yandex.go.taxi.order.multi.feed.domain.a aVar7 = gVar.j;
                        String str11 = o2y0Var9.b().a;
                        String d2 = o2y0Var9.d();
                        boolean z4 = o2y0Var9.b().b.g0;
                        clk0 clk0Var = aVar7.c;
                        if ((c ? TaxiOrderPresentationType.DETAILS : clk0Var.d() ? clk0Var.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING : aVar7.a.b(d2) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS).a() && gVar.e.b() == OrderScreen.ORDER_LIST) {
                            gVar.f(detailsOpenReason3, o2y0Var9.b().a);
                        } else {
                            gVar.d(o2y0Var9.b().a, false, detailsOpenReason3, TaxiCardNavigationAction.EMPTY);
                        }
                    } else if (ibk0Var instanceof k9k0) {
                        this.n.h(((k9k0) ibk0Var).a);
                    } else if (ibk0Var instanceof pak0) {
                        this.G.a(this.a);
                    } else if (ibk0Var instanceof zak0) {
                        rok0 rok0Var = ((zak0) ibk0Var).a;
                        r0 r0Var3 = this.H.a;
                        r0Var3.getClass();
                        r0Var3.m(null, rok0Var);
                    } else {
                        if (ibk0Var instanceof d9k0) {
                            return this.I.b(this.a, ((d9k0) ibk0Var).a, suspendLambda);
                        }
                        if (ibk0Var instanceof e9k0) {
                            return this.J.b(this.a, suspendLambda);
                        }
                        if (ibk0Var instanceof f9k0) {
                            return this.K.a(this.a.b().a, ((f9k0) ibk0Var).b, suspendLambda);
                        }
                        if (!(ibk0Var instanceof vak0)) {
                            w511.b();
                            return null;
                        }
                        vak0 vak0Var = (vak0) ibk0Var;
                        ((c) this.b).m(this.a.b().a, vak0Var.b, vak0Var.c, this.a.b().h.b == DriveState.COMPLETE ? AcceptancePaymentOrderContext.COMPLETE : AcceptancePaymentOrderContext.TRANSPORTING);
                    }
                }
            }
        }
        return zy11Var;
    }

    public final void b(int i) {
        Object value;
        Object value2;
        TaxiOrder taxiOrder;
        Object value3;
        TaxiOrder taxiOrder2;
        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar = this.m;
        ysg ysgVar = aVar.h;
        dm21 dm21Var = aVar.g;
        o2y0 o2y0Var = aVar.a;
        TaxiOrder b = o2y0Var.b();
        r0 r0Var = o2y0Var.a;
        if (b.s() != i) {
            do {
                value2 = r0Var.getValue();
                taxiOrder = (TaxiOrder) value2;
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.R(i);
                }
            } while (!r0Var.k(value2, taxiOrder));
            o2y0Var.f();
            b bVar = (b) dm21Var;
            bVar.d(o2y0Var.b().a, jsq.a(o2y0Var.b()));
            ysgVar.g(o2y0Var.b());
            if (diz0.e(aVar.a.b().y()) && uga1.c(i)) {
                do {
                    value3 = r0Var.getValue();
                    taxiOrder2 = (TaxiOrder) value3;
                    taxiOrder2.S(diz0.c());
                } while (!r0Var.k(value3, taxiOrder2));
                o2y0Var.f();
                bVar.d(o2y0Var.b().a, jsq.a(o2y0Var.b()));
                ysgVar.g(o2y0Var.b());
            }
            if (aVar.a.b().h.getB() != DriveState.COMPLETE) {
                aVar.e();
            }
        }
        com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a aVar2 = (com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a) this.B.get();
        if (aVar2.a.c() != DriveState.COMPLETE) {
            r0 r0Var2 = aVar2.b.a;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, ykk0.a((ykk0) value, 3, false, false, null, null, false, 62)));
        }
        ((ru.yandex.taxi.apprate.common.domain.a) this.F.get()).a(i, this.a.b().a);
    }
}
