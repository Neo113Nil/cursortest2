package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.yandex.go.intercity.flex.api.dashboard.analytics.IntercityDashboardFlexAnalytics$PaymentOpenReason;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import com.yandex.go.payments.summary.ui.PaymentMethodsListModalView;
import com.yandex.go.places.impl.ui.sorting.OrganizationsSortingModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.shortcuts.impl.repository.j;
import com.yandex.go.superapp.order.multi.old.view.OrdersListViewImpl;
import com.yandex.go.taxi.order.info.OrderInfoModalView;
import com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView;
import com.yandex.go.taxi.order.map.overlay.c;
import com.yandex.go.taxi.order.promotions.modal_default.OrderDefaultModalView;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.PersistentPreDrawListener;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.i;
import ru.yandex.taxi.parks.view.ParksContentView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.settings.profile.rating.PassengerRatingInfoDialog;
import ru.yandex.video.m3.ott.impl.OttTrackingReporterImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class op70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ op70(rp70 rp70Var, ht10 ht10Var) {
        this.a = 0;
        this.b = rp70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int b;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rp70) obj).f = false;
                break;
            case 1:
                ((OrderDefaultModalView) obj).onCloseButtonClick();
                break;
            case 2:
                ((i) obj).Og(false);
                break;
            case 3:
                f fVar = (f) ((x980) obj);
                fVar.getClass();
                fVar.r(new zo70(fVar, 3));
                break;
            case 4:
                OrderInfoModalView.showInnerView$lambda$0((OrderInfoModalView) obj);
                break;
            case 5:
                OrderMapCurtainHideFloatingButtonView.onAttachedToWindow$lambda$0((OrderMapCurtainHideFloatingButtonView) obj);
                break;
            case 6:
                ((c) obj).b0.start();
                break;
            case 7:
                d980 d980Var = (d980) obj;
                d980Var.i.d(d980Var);
                break;
            case 8:
                ((OrderFragment) ((nw70) ((lds) obj)).b).getOrderAddressPickerRouter().b(SourcePicker.A_FROM_ORDER, PointType.SOURCE);
                break;
            case 9:
                j jVar = (j) obj;
                r0 r0Var = jVar.c;
                ConcurrentHashMap concurrentHashMap = jVar.a;
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    View view = (View) concurrentHashMap.get((String) it.next());
                    if (view != null) {
                        Rect rect = jVar.b;
                        Rect rect2 = xw31.a;
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int i2 = iArr[0];
                        int width = view.getWidth() + i2;
                        int i3 = iArr[1];
                        int height = view.getHeight() + i3;
                        if (i2 >= rect.left && width <= rect.right && i3 >= rect.top && height <= rect.bottom) {
                            Boolean bool = Boolean.TRUE;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                        }
                    }
                }
                if (concurrentHashMap.keySet().isEmpty()) {
                    Boolean bool2 = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool2);
                    break;
                }
                break;
            case 10:
                OrdersListViewImpl.updateOrders$lambda$0((OrdersListViewImpl) obj);
                break;
            case 11:
                OrganizationCardsSliderModalView.onAttachedToWindow$lambda$0((OrganizationCardsSliderModalView) obj);
                break;
            case 12:
                OrganizationsSortingModalView.onAttachedToWindow$lambda$1((OrganizationsSortingModalView) obj);
                break;
            case 13:
                OttTrackingReporterImpl.reportPendingEvents$lambda$7((OttTrackingReporterImpl) obj);
                break;
            case 14:
                oj91.a((View) ((w040) ((r790) obj).b).d, 200L);
                break;
            case 15:
                ((y990) obj).c.a().h();
                break;
            case 16:
                ParksContentView._init_$lambda$0((ParksContentView) obj);
                break;
            case 17:
                PassengerRatingInfoDialog.onCreate$lambda$0((PassengerRatingInfoDialog) obj);
                break;
            case 18:
                qs90 qs90Var = (qs90) obj;
                qs90Var.a.setAlpha(0.0f);
                View view2 = qs90Var.a;
                view2.setVisibility(0);
                view2.setY(view2.getY() + 100.0f);
                view2.animate().setStartDelay(500L).alpha(1.0f).translationY(0.0f).setDuration(500L).start();
                break;
            case 19:
                PaymentMethodDetailsModalView.onAttachedToWindow$lambda$0((PaymentMethodDetailsModalView) obj);
                break;
            case 20:
                com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.c cVar = (com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.c) obj;
                ((pep0) cVar.Z).f(cVar.U, new epw(IntercityDashboardFlexAnalytics$PaymentOpenReason.CHANGE_PAYMENT), hxx.a);
                break;
            case 21:
                ((PaymentMethodsListModalView) obj).getPaymentMethodChooserView().getPaymentMethodList().smoothScrollToPosition(0);
                break;
            case 22:
                ((com.yandex.go.payments.paymentlist.navigation.f) obj).F.h();
                break;
            case 23:
                ((l2z) obj).invoke();
                break;
            case 24:
                ((jwa0) obj).c();
                break;
            case 25:
                PersistentPreDrawListener.onViewAttachedToWindow$lambda$0((PersistentPreDrawListener) obj);
                break;
            case 26:
                ((ru.yandex.taxi.summary.personalaction.popup.f) obj).r(new qu(9));
                break;
            case 27:
                ((com.yandex.go.shortcuts.impl.view.adapter.j) obj).a.performClick();
                break;
            case 28:
                a6b0 a6b0Var = (a6b0) obj;
                if (System.currentTimeMillis() - a6b0Var.e >= 500 && (b = a6b0Var.b()) != -1 && b != a6b0Var.d) {
                    a6b0Var.d = b;
                    a6b0Var.b.invoke(Integer.valueOf(b));
                    break;
                }
                break;
            default:
                o6j0 o6j0Var = (o6j0) obj;
                if (!o6j0Var.isCancelled()) {
                    try {
                        o6j0Var.get();
                        break;
                    } catch (Exception e) {
                        wfz.h(e);
                    }
                }
                break;
        }
    }

    public /* synthetic */ op70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
