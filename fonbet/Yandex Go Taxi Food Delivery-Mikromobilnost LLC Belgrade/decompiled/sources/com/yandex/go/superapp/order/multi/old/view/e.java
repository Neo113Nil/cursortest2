package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.linked_order.router.LinkedOrderScreen;
import com.yandex.go.superapp.order.multi.old.view.f;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.a3v;
import defpackage.a3y0;
import defpackage.a850;
import defpackage.dv6;
import defpackage.ev6;
import defpackage.g18;
import defpackage.g6y0;
import defpackage.hc00;
import defpackage.hc80;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i6y0;
import defpackage.ic00;
import defpackage.jl40;
import defpackage.kc00;
import defpackage.o400;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.poy;
import defpackage.pw1;
import defpackage.pzt0;
import defpackage.qa80;
import defpackage.ra80;
import defpackage.rwo0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xoy;
import defpackage.y680;
import defpackage.yvf0;
import defpackage.zkb1;
import defpackage.zl50;
import defpackage.zy11;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.widgets.domain.m;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ra80 ra80Var = (ra80) obj;
                final f fVar = this.b;
                g6y0 g6y0Var = fVar.c0;
                a3y0 a3y0Var = fVar.f0;
                i3y i3yVar = fVar.o0;
                oep0 oep0Var = fVar.A;
                yvf0 yvf0Var = fVar.K;
                a3v a3vVar = fVar.M;
                a850 a850Var = fVar.N;
                ra80 ra80Var2 = fVar.i0;
                if (ra80Var2 == null || !ra80Var2.equals(ra80Var)) {
                    OrderScreen orderScreen = ra80Var.a;
                    qa80 qa80Var = ra80Var.c;
                    OrderScreen orderScreen2 = OrderScreen.BUNDLED_ORDER_DETAILS;
                    if (orderScreen != orderScreen2 && fVar.g0 == orderScreen2) {
                        ((ev6) i3yVar.getValue()).i();
                    }
                    ra80 ra80Var3 = fVar.i0;
                    ra80Var.f = (ra80Var3 == null || ra80Var3.a == orderScreen || jl40.l(ra80Var3.c, qa80Var)) ? false : true;
                    fVar.W.f.b();
                    fVar.i0 = ra80Var;
                    switch (y680.a[orderScreen.ordinal()]) {
                        case 1:
                            String str = qa80Var.a;
                            ((i6y0) g6y0Var).b(zkb1.a(TaxiOrderSessionCheckpoint.SCREEN_TRACKING_HANDLED));
                            OrderScreen orderScreen3 = fVar.g0;
                            g18 g18Var = fVar.k0;
                            if (g18Var != null) {
                                g18Var.cancel();
                                fVar.k0 = null;
                            }
                            pzt0 pzt0Var = fVar.l0;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            tse Kg = fVar.Kg();
                            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                            OrderStackViewPresenter$onTaxiOrderTrackingHandled$1 orderStackViewPresenter$onTaxiOrderTrackingHandled$1 = new OrderStackViewPresenter$onTaxiOrderTrackingHandled$1(ra80Var, fVar, orderScreen3, str, null);
                            fVar = fVar;
                            fVar.l0 = tje.N(Kg, null, coroutineStart, orderStackViewPresenter$onTaxiOrderTrackingHandled$1, 1);
                            break;
                        case 2:
                            String str2 = qa80Var.a;
                            g18 g18Var2 = fVar.k0;
                            if (g18Var2 != null) {
                                g18Var2.cancel();
                                fVar.k0 = null;
                            }
                            boolean z2 = ra80Var.f;
                            zl50 zl50Var = new zl50(18, fVar, ra80Var);
                            pzt0 pzt0Var2 = fVar.l0;
                            if (pzt0Var2 != null) {
                                pzt0Var2.a(null);
                            }
                            if (z2) {
                                tse Jg = fVar.Jg();
                                sjh sjhVar = uyj.a;
                                fVar.l0 = tje.N(Jg, o400.a.x, null, new OrderStackViewPresenter$fetchAnimationType$1(fVar, str2, zl50Var, null), 2);
                            } else {
                                zl50Var.invoke(OrderStackMvpView.AnimationType.NONE);
                            }
                            hc80 hc80Var = fVar.G;
                            OrderScreen orderScreen4 = fVar.g0;
                            boolean z3 = orderScreen4 == OrderScreen.ORDER_DETAILS || orderScreen4 == OrderScreen.ORDER_TRACKING;
                            hc80Var.i = true;
                            boolean z4 = m.j;
                            if (z3 && !z4) {
                                hc80Var.e();
                            }
                            a850Var.i("multiorder", true);
                            break;
                        case 3:
                            String str3 = qa80Var.a;
                            ((i6y0) g6y0Var).b(zkb1.a(TaxiOrderSessionCheckpoint.SCREEN_DETAILS_HANDLED));
                            OrderScreen orderScreen5 = fVar.g0;
                            fVar.h0 = orderScreen5;
                            pzt0 pzt0Var3 = fVar.l0;
                            if (pzt0Var3 != null) {
                                pzt0Var3.a(null);
                            }
                            tse Jg2 = fVar.Jg();
                            CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
                            OrderStackViewPresenter$onOrderDetailsHandled$1 orderStackViewPresenter$onOrderDetailsHandled$1 = new OrderStackViewPresenter$onOrderDetailsHandled$1(ra80Var, fVar, orderScreen5, str3, null);
                            fVar = fVar;
                            fVar.l0 = tje.N(Jg2, null, coroutineStart2, orderStackViewPresenter$onOrderDetailsHandled$1, 1);
                            break;
                        case 4:
                            String str4 = qa80Var.a;
                            if (str4 != null && str4.length() != 0) {
                                OrderScreen orderScreen6 = fVar.g0;
                                if (orderScreen6 == OrderScreen.ORDER_DETAILS || orderScreen6 == OrderScreen.ORDER_TRACKING) {
                                    OrderStackMvpView orderStackMvpView = (OrderStackMvpView) fVar.Dg();
                                    int i2 = ra80Var.b;
                                    ic00 ic00Var = ((kc00) fVar.V).a;
                                    ic00Var.getClass();
                                    orderStackMvpView.h3(i2, ((ic00Var instanceof hc00) || !ra80Var.f) ? OrderStackMvpView.AnimationType.NONE : OrderStackMvpView.AnimationType.HORIZONTAL_TRANSLATION);
                                }
                                ((OrderStackMvpView) fVar.Dg()).u8();
                                a3vVar.b8(fVar);
                                xoy xoyVar = (xoy) yvf0Var.get();
                                fVar.n0 = xoyVar;
                                final int i3 = 0;
                                ((pep0) oep0Var).f(new rwo0(5, xoyVar, new OrderStackViewPresenter$onLinkedOrderHandled$1(0, fVar, f.class, "onLinkedOrderInfoClosed", "onLinkedOrderInfoClosed()V", 0)), new poy(str4, LinkedOrderScreen.ORDER_INFO, a3vVar), hxx.a);
                                fVar.k0 = new g18() { // from class: x680
                                    @Override // defpackage.g18
                                    public final void cancel() {
                                        int i4 = i3;
                                        f fVar2 = fVar;
                                        switch (i4) {
                                            case 0:
                                                xoy xoyVar2 = fVar2.n0;
                                                if (xoyVar2 != null) {
                                                    xoyVar2.i();
                                                    break;
                                                }
                                                break;
                                            default:
                                                xoy xoyVar3 = fVar2.n0;
                                                if (xoyVar3 != null) {
                                                    xoyVar3.i();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                break;
                            } else {
                                a3y0.d(a3y0Var, "onLinkedOrderHandled", new UnsupportedOperationException("Missed linked order id"), null, 4);
                                break;
                            }
                            break;
                        case 5:
                            final int i4 = 1;
                            String str5 = qa80Var.a;
                            if (str5 != null && str5.length() != 0) {
                                ((OrderStackMvpView) fVar.Dg()).u8();
                                a3vVar.b8(fVar);
                                xoy xoyVar2 = (xoy) yvf0Var.get();
                                fVar.n0 = xoyVar2;
                                ((pep0) oep0Var).f(new rwo0(5, xoyVar2, new OrderStackViewPresenter$onAmbulanceLinkedOrderHandled$1(0, fVar, f.class, "onLinkedOrderInfoClosed", "onLinkedOrderInfoClosed()V", 0)), new poy(str5, LinkedOrderScreen.AMBULANCE_ORDER, a3vVar), hxx.a);
                                fVar.k0 = new g18() { // from class: x680
                                    @Override // defpackage.g18
                                    public final void cancel() {
                                        int i42 = i4;
                                        f fVar2 = fVar;
                                        switch (i42) {
                                            case 0:
                                                xoy xoyVar22 = fVar2.n0;
                                                if (xoyVar22 != null) {
                                                    xoyVar22.i();
                                                    break;
                                                }
                                                break;
                                            default:
                                                xoy xoyVar3 = fVar2.n0;
                                                if (xoyVar3 != null) {
                                                    xoyVar3.i();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                break;
                            } else {
                                a3y0.d(a3y0Var, "onAmbulanceLinkedOrderHandled", new UnsupportedOperationException("Missed linked order id"), null, 4);
                                break;
                            }
                            break;
                        case 6:
                            if (fVar.g0 != orderScreen) {
                                ((OrderStackMvpView) fVar.Dg()).u8();
                                Object obj2 = ra80Var.e;
                                if (obj2 instanceof dv6) {
                                    z = true;
                                    ((pep0) oep0Var).f(new pw1(6, (ev6) i3yVar.getValue(), new OrderStackViewPresenter$onBundledOrderHandled$1(0, fVar, f.class, "onDetailsOrderClosed", "onDetailsOrderClosed()V", 0)), Optional.of(obj2), hxx.a);
                                } else {
                                    z = true;
                                    ((pep0) oep0Var).f(new pw1(6, (ev6) i3yVar.getValue(), new OrderStackViewPresenter$onBundledOrderHandled$2(0, fVar, f.class, "onDetailsOrderClosed", "onDetailsOrderClosed()V", 0)), Optional.empty(), hxx.a);
                                }
                                a850Var.i("bundled_order", z);
                                break;
                            }
                            break;
                        case 7:
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    fVar.g0 = orderScreen;
                    break;
                }
                break;
            default:
                break;
        }
        return zy11Var;
    }
}
