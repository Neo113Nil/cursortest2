package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.a;
import com.yandex.bubbles.b;
import com.yandex.go.promocodes.base.impl.ui.share.v1.PromocodeSharingView;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.go.vault.ui.PrizeModalView;
import com.yandex.messaging.ui.pollinfo.c;
import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.card.internal.presentation.carddetails.ProCardRequisiteView;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshFragment;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import ru.yandex.taxi.cashback.login.PlusPortalLoginModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class d5b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5b0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f5b0 f5b0Var = (f5b0) obj;
                jcz0 jcz0Var = f5b0Var.e0().f;
                f5b0Var.e0();
                jcz0Var.c();
                break;
            case 1:
                ((l261) obj).c.setChecked(!r4.isChecked());
                break;
            case 2:
                PhotoFragment.getViewBinding$lambda$12$lambda$10((PhotoFragment) obj, view);
                break;
            case 3:
                ((PlayerControlView) obj).onFullscreenButtonClicked(view);
                break;
            case 4:
                PlayerControlView playerControlView = ((cyc0) obj).c;
                if (playerControlView.player != null && playerControlView.player.isCommandAvailable(29)) {
                    r001 trackSelectionParameters = playerControlView.player.getTrackSelectionParameters();
                    zxc0 zxc0Var = playerControlView.player;
                    int i2 = tw21.a;
                    zxc0Var.setTrackSelectionParameters(trackSelectionParameters.a().b(1).j(1).a());
                    playerControlView.settingsAdapter.b[1] = playerControlView.getResources().getString(i0i0.exo_track_selection_auto);
                    popupWindow = playerControlView.settingsWindow;
                    popupWindow.dismiss();
                    break;
                }
                break;
            case 5:
                gyc0 gyc0Var = (gyc0) obj;
                gyc0Var.Q.onSettingViewClicked(gyc0Var.F());
                break;
            case 6:
                PlayerControlView playerControlView2 = ((jyc0) obj).c;
                if (playerControlView2.player != null && playerControlView2.player.isCommandAvailable(29)) {
                    playerControlView2.player.setTrackSelectionParameters(playerControlView2.player.getTrackSelectionParameters().a().b(3).e().g(null).i().a());
                    popupWindow2 = playerControlView2.settingsWindow;
                    popupWindow2.dismiss();
                    break;
                }
                break;
            case 7:
                a aVar = (a) obj;
                aVar.n();
                if (view.getId() != i9h0.exo_overflow_show) {
                    if (view.getId() == i9h0.exo_overflow_hide) {
                        aVar.r.start();
                        break;
                    }
                } else {
                    aVar.q.start();
                    break;
                }
                break;
            case 8:
                PlusHomeWebView.setupSslErrorClick$lambda$8((PlusHomeWebView) obj, view);
                break;
            case 9:
                w7d0 w7d0Var = (w7d0) obj;
                if (w7d0Var.a().getVisibility() != 0) {
                    if (w7d0Var.a().getVisibility() != 0) {
                        w7d0Var.a().setVisibility(0);
                        w7d0Var.b().animate().rotationBy(-180.0f).start();
                        w7d0Var.a().requestFocus();
                        break;
                    }
                } else if (w7d0Var.a().getVisibility() == 0) {
                    w7d0Var.a().setVisibility(8);
                    w7d0Var.b().animate().rotationBy(180.0f).start();
                    break;
                }
                break;
            case 10:
                new DebugMenuDialogFragment().show(((TarifficatorScenarioActivity) obj).getSupportFragmentManager(), DebugMenuDialogFragment.TAG);
                break;
            case 11:
                ((lgd0) obj).b.invoke();
                break;
            case 12:
                PlusPortalLoginModalView._init_$lambda$0((PlusPortalLoginModalView) obj, view);
                break;
            case 13:
                vwd0 vwd0Var = (vwd0) obj;
                z83.i();
                int i3 = vwd0Var.W;
                if (i3 != -1) {
                    vwd0Var.N.invoke(Integer.valueOf(i3));
                    break;
                }
                break;
            case 14:
                ((c) obj).a.finish();
                break;
            case 15:
                ((com.yandex.messaging.ui.polloptioninfo.a) obj).b.finish();
                break;
            case 16:
                ((b) obj).a();
                break;
            case 17:
                PreselectNewBindFragment.onViewCreated$lambda$0((PreselectNewBindFragment) obj, view);
                break;
            case 18:
                ((PrizeModalView) obj).dismiss();
                break;
            case 19:
                ProCardRequisiteView._init_$lambda$1((ProCardRequisiteView) obj, view);
                break;
            case 20:
                ProductsFragment.onViewCreated$lambda$14((ProductsFragment) obj, view);
                break;
            case 21:
                PromocodeSharingView.onAttachedToWindow$lambda$0((PromocodeSharingView) obj, view);
                break;
            case 22:
                QrPaymentsSubscriptionFragment.render$lambda$5$lambda$4$lambda$2((QrPaymentsSubscriptionFragment) obj, view);
                break;
            case 23:
                QrRefreshFragment.onViewCreated$lambda$2((QrRefreshFragment) obj, view);
                break;
            case 24:
                QrSubscriptionsListFragment.getViewBinding$lambda$4$lambda$3((QrSubscriptionsListFragment) obj, view);
                break;
            case 25:
                ((com.yandex.messaging.input.quote.a) obj).a();
                break;
            case 26:
                RateView.onAttachedToWindow$onCarNumberClick((com.yandex.go.taxi.order.rate.c) obj, view);
                break;
            case 27:
                ((com.yandex.go.promocodes.referral.impl.ui.b) obj).a.Kg();
                break;
            case 28:
                ReportFormFragment.onViewCreated$lambda$3((ReportFormFragment) obj, view);
                break;
            default:
                y2j0 y2j0Var = (y2j0) obj;
                int F = y2j0Var.F();
                odf0 odf0Var = y2j0Var.O;
                if (odf0Var != null && F != -1) {
                    odf0Var.invoke(Integer.valueOf(F));
                    break;
                }
                break;
        }
    }
}
