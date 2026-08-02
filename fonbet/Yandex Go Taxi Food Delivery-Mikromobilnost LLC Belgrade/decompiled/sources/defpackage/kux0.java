package defpackage;

import android.os.SystemClock;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.go.parks.nearest.presentation.ui.TaxiNearestZoneErrorModalView;
import com.yandex.go.payments.cards.ui.TransportCardWidgetView;
import com.yandex.go.taxi.order.infosharing.ui.TaxiOrderScreenshotSharingModalView;
import com.yandex.go.taxi.order.titles.f;
import com.yandex.go.taxi.order.ui.recenter.TaxiOrderTrackingRecenterButton;
import com.yandex.go.taxi.order.view.tips.TipsInputModalView;
import com.yandex.go.telemetry.ui.TelemetryReportModalView;
import com.yandex.go.tips.ui.selector_v1.TipsSelectorModalView;
import com.yandex.go.tips.ui.selector_v2.TipsSettingsModalView;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import com.yandex.go.trusted_contacts.ui.error.TrustedContactsErrorModalView;
import com.yandex.messaging.ui.timeline.d;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.ybsdk.core.design.animation.ticker.TickerView;
import com.ybsdk.core.transfer.utils.TransferCommentView;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.order.modals.impl.presentation.TaxiOrderPopupView;
import ru.yandex.taxi.tollroad.alert.card.TollRoadInfoModalView;
import ru.yandex.video.m3.ott.ott.TimingsManager;
import ru.yandex.video.m3.player.impl.tracking.TrackingObserver;

/* loaded from: classes14.dex */
public final /* synthetic */ class kux0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kux0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pzt0 pzt0Var = ((n) obj).i;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                    break;
                }
                break;
            case 1:
                TaxiNearestZoneErrorModalView.onAttachedToWindow$lambda$0((TaxiNearestZoneErrorModalView) obj);
                break;
            case 2:
                ((f) obj).d();
                break;
            case 3:
                ((TaxiOrderPopupView) obj).dismiss();
                break;
            case 4:
                TaxiOrderScreenshotSharingModalView._init_$closeButtonClick((o5y0) obj);
                break;
            case 5:
                TaxiOrderTrackingRecenterButton._init_$lambda$0((TaxiOrderTrackingRecenterButton) obj);
                break;
            case 6:
                ((TelemetryReportModalView) obj).onBackPressed();
                break;
            case 7:
                TelemetryReportModalView.setupViews$collectReport((udy0) obj);
                break;
            case 8:
                ((TextInputLayout) obj).lambda$onGlobalLayout$1();
                break;
            case 9:
                h0z0 h0z0Var = (h0z0) obj;
                sls slsVar = h0z0Var.c;
                h0z0Var.c = null;
                if (slsVar != null) {
                    slsVar.invoke();
                    h0z0Var.d = SystemClock.uptimeMillis();
                    break;
                }
                break;
            case 10:
                TickerView.startNextAnimation$default((TickerView) obj, 0L, 1, null);
                break;
            case 11:
                ((d) obj).E.requestLayout();
                break;
            case 12:
                pbz0 pbz0Var = (pbz0) obj;
                int intValue = ((Number) pbz0Var.b.invoke()).intValue();
                if (intValue != -1) {
                    pbz0Var.a.findViewHolderForLayoutPosition(intValue);
                    break;
                }
                break;
            case 13:
                ((TimingsManager.PlayerObserverImpl) obj).sendTimingAsync();
                break;
            case 14:
                TipsInputModalView.onAttachedToWindow$cancelClicked((zfz0) obj);
                break;
            case 15:
                TipsSelectorModalView.onAttachedToWindow$lambda$1((TipsSelectorModalView) obj);
                break;
            case 16:
                TipsSettingsModalView.initView$lambda$3$1((ghz0) obj);
                break;
            case 17:
                ((TollRoadInfoModalView) obj).dismiss();
                break;
            case 18:
                ((c2n0) obj).r(new qu(9));
                break;
            case 19:
                TrackingObserver.scheduleWatchEvents$lambda$39$lambda$36((TrackingObserver) obj);
                break;
            case 20:
                TransactionsFeedFragment.renderScreen$lambda$15((g861) obj);
                break;
            case 21:
                TransferCommentView.onAttachedToWindow$lambda$8((TransferCommentView) obj);
                break;
            case 22:
                TransferMainFragment.renderButtonsAdapter$lambda$43$lambda$42$lambda$40$lambda$39((t961) obj);
                break;
            case 23:
                ((jl01) obj).invoke(null);
                break;
            case 24:
                TransferPhoneInputFragment.onResume$lambda$15((TransferPhoneInputFragment) obj);
                break;
            case 25:
                TransferRequirementModalView.setupListeners$lambda$0$onPassengerSelectorClicked((op01) obj);
                break;
            case 26:
                ((TransportCardWidgetView) obj).invalidate();
                break;
            case 27:
                TransportCardsActivity.onCreate$lambda$1((TransportCardsActivity) obj);
                break;
            case 28:
                ((TrustedContactsErrorModalView) obj).dismiss();
                break;
            default:
                ((sh11) obj).close();
                break;
        }
    }
}
