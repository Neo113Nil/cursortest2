package defpackage;

import androidx.camera.camera2.internal.s;
import androidx.camera.video.h;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.yandex.go.chargers.debt.screen.ChargersDebtModalView;
import com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView;
import com.yandex.go.chargers.error.ChargersErrorModalView;
import com.yandex.go.chargers.misc.support.b;
import com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishModalView;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.yandex.go.payments.shared.members.cardselector.CardSelectorView;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View;
import com.yandex.messaging.internal.view.input.channel.a;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import java.util.HashMap;
import ru.yandex.taxi.banners.CardBannerV1ModalView;
import ru.yandex.taxi.overdraft.ChangePaymentModalView;
import ru.yandex.taxi.plus.badge.CashbackAmountView;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes10.dex */
public final /* synthetic */ class dn7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dn7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((v8v) obj).clear();
                return;
            case 1:
                tis0 tis0Var = (tis0) obj;
                synchronized (tis0Var.w) {
                    try {
                        if (tis0Var.b) {
                            return;
                        }
                        sgb1.g(3, "CameraController");
                        ((dy40) tis0Var.c).m(new w9x0(0));
                        tis0Var.b = true;
                        return;
                    } finally {
                    }
                }
            case 2:
                dq7 dq7Var = (dq7) obj;
                iq7 iq7Var = dq7Var.c;
                h hVar = (h) iq7Var.n.remove(dq7Var);
                if (hVar == null || iq7Var.m != hVar) {
                    return;
                }
                iq7Var.m = null;
                return;
            case 3:
                ((rq7) obj).d();
                return;
            case 4:
                wq7 wq7Var = (wq7) obj;
                to7 to7Var = wq7Var.b;
                try {
                    o89 o89Var = wq7Var.f;
                    wq7Var.e = o89Var != null ? (i5f0) o89Var.get() : null;
                    to7Var.c();
                    return;
                } catch (Exception e) {
                    to7Var.b(e);
                    return;
                }
            case 5:
                ((gt7) obj).onOpenAvailable();
                return;
            case 6:
                ((androidx.camera.camera2.internal.h) obj).a();
                return;
            case 7:
                ((w4u) obj).n();
                return;
            case 8:
                CancelReasonsV1View._init_$lambda$4((KeyboardAwareRobotoEditText) obj);
                return;
            case 9:
                CancelledOrderCostModalView.onAttachedToWindow$lambda$0$0((CancelledOrderCostModalView) obj);
                return;
            case 10:
                m6f0 m6f0Var = (m6f0) ((j4n) ((sn7) obj).b).a;
                if (m6f0Var != null) {
                    n9j0 n9j0Var = m6f0Var.i;
                    n9j0Var.getClass();
                    tob1.b();
                    if (n9j0Var.g || n9j0Var.h) {
                        return;
                    }
                    n9j0Var.h = true;
                    return;
                }
                return;
            case 11:
                s sVar = (s) obj;
                synchronized (sVar.a) {
                    if (sVar.b.isEmpty()) {
                        return;
                    }
                    try {
                        sVar.p(sVar.b);
                        return;
                    } finally {
                        sVar.b.clear();
                    }
                }
            case 12:
                CardBannerV1ModalView.fullyVisibleViewChecker$lambda$0((CardBannerV1ModalView) obj);
                return;
            case 13:
                ((CardNumberPadView) obj).handleConfirmClicked();
                return;
            case 14:
                CardSelectorView._init_$lambda$0((CardSelectorView) obj);
                return;
            case 15:
                ((CarouselLayoutManager) obj).Q1();
                return;
            case 16:
                CashbackAmountView.startPromoAnimation$lambda$0((CashbackAmountView) obj);
                return;
            case 17:
                ((d49) obj).a();
                return;
            case 18:
                CashbackDashboardFragment.render$lambda$9$lambda$8((CashbackDashboardFragment) obj);
                return;
            case 19:
                CashbackHorizontalView.startPromoTextAnimation$lambda$0((CashbackHorizontalView) obj);
                return;
            case 20:
                ((a46) obj).r(new qu(i2));
                return;
            case 21:
                ChangePaymentModalView.lambda$1$0((ChangePaymentModalView) obj);
                return;
            case 22:
                a aVar = (a) obj;
                if (aVar.O != null) {
                    ((xhi0) aVar.D.get()).getClass();
                    return;
                }
                return;
            case 23:
                ((ex0) obj).invoke();
                return;
            case 24:
                ChargersDebtModalView.onAttachedToWindow$lambda$0((ChargersDebtModalView) obj);
                return;
            case 25:
                com.yandex.go.chargers.debt.notification.domain.a aVar2 = (com.yandex.go.chargers.debt.notification.domain.a) obj;
                em9 em9Var = aVar2.a;
                em9Var.a.a("Chargers.DebtStateBar.Tapped", b64.w(em9Var), 1, new HashMap());
                aVar2.e.a.g(zy11.a);
                return;
            case 26:
                ((b) obj).r(new qu(i2));
                return;
            case 27:
                ChargersDiscoveryModalView.onAttachedToWindow$onGeoClick((bx9) obj);
                return;
            case 28:
                ChargersErrorModalView._init_$backButtonClicked((ny9) obj);
                return;
            default:
                ChargersFinishModalView.onAttachedToWindow$closeButtonClicked((h1a) obj);
                return;
        }
    }
}
