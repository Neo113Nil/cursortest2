package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.OrganizationCardBottomPanelView;
import com.yandex.go.platform.navigation.impl.d;
import com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.a;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.yandex.messaging.internal.view.chat.input.b;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import com.yandex.messaging.ui.calls.feedback.PickFeedbackReasonsDialog;
import com.yandex.messaging.ui.settings.c;
import com.ybsdk.feature.cashback.impl.views.OpenCashbackSelectorButtonView;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;
import com.ybsdk.feature.main.internal.widgets.ProductCardView;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersBannerView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.feature.pin.internal.screens.checkpin.views.PinActionButtonView;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import java.util.HashMap;
import java.util.Objects;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.PhotoRecordingFragment;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.fragment.settings.ParksListFragment;
import ru.yandex.taxi.parks.view.ParksContentView;

/* loaded from: classes15.dex */
public final /* synthetic */ class fx00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fx00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((a) obj3).W.a((ex00) obj2);
                break;
            case 1:
                ((a) obj3).W.a((r27) obj2);
                break;
            case 2:
                ((MaterialTimePicker) obj3).lambda$onCreateView$0((ViewGroup) obj2, view);
                break;
            case 3:
                Object obj4 = ((b) obj2).Q;
                Objects.requireNonNull(obj4);
                ((xbb) obj3).accept(obj4);
                break;
            case 4:
                MerchantOffersBannerView.setOnBannerClickListener$lambda$3((MerchantOffersBannerView) obj3, (tls) obj2, view);
                break;
            case 5:
                ((BottomSheetDialog) obj3).cancel();
                ((xs10) obj2).b.a(MessageMenuReporter$Item.DELETE_CANCEL);
                break;
            case 6:
                MessageSelectionActionModeCallback.setupDialogViews$lambda$9((AlertDialog) obj3, (MessageSelectionActionModeCallback) obj2, view);
                break;
            case 7:
                ((tls) obj3).invoke(new vs40((lv90) obj2));
                break;
            case 8:
                d dVar = (d) obj3;
                com.yandex.go.platform.navigation.model.a aVar = (com.yandex.go.platform.navigation.model.a) obj2;
                if (!jl40.l(dVar.j, aVar)) {
                    dVar.e(aVar);
                    break;
                }
                break;
            case 9:
                OpenCashbackSelectorButtonView.render$lambda$6$lambda$5((OpenCashbackSelectorButtonView) obj3, (qaq0) obj2, view);
                break;
            case 10:
                OrganizationCardBottomPanelView.renderPromoInfo$lambda$0((kr) obj3, (OrganizationCardBottomPanelView) obj2, view);
                break;
            case 11:
                OrganizationCardBottomPanelView.renderButtons$lambda$0$0((OrganizationCardBottomPanelView) obj3, (ud6) obj2, view);
                break;
            case 12:
                qe90 qe90Var = (qe90) obj2;
                nw70 nw70Var = ((xe90) obj3).b;
                if (nw70Var != null) {
                    ParksContentView parksContentView = (ParksContentView) nw70Var.b;
                    ru.yandex.taxi.parks.a parksListPresenter = parksContentView.getParksListPresenter();
                    String str = qe90Var.a;
                    x770 x770Var = parksListPresenter.y;
                    x770Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("id", str);
                    x770Var.a.a("ParksList.Tapped", hashMap, 1, new HashMap());
                    obj = ((YandexTaxiFragment) ((ParksListFragment) ((aq80) parksContentView.getEventsListener()).a)).callback;
                    je90 je90Var = (je90) obj;
                    if (je90Var != null) {
                        ke90 ke90Var = new ke90(qe90Var.b, new ee90(je90Var.a, qe90Var.d, qe90Var.c));
                        fc9 fc9Var = je90Var.b;
                        fc9Var.E((m950) ((xcz) fc9Var.I).get(), ke90Var, sy60.Q2, hxx.a);
                        break;
                    }
                }
                break;
            case 13:
                ((yha0) obj3).w.invoke((med0) obj2);
                break;
            case 14:
                f5b0 f5b0Var = (f5b0) obj3;
                TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage = (TechPersonalMeetingEndedMessage) obj2;
                f5b0Var.e0().f.t(f5b0Var.e0().d, f5b0Var.i0, techPersonalMeetingEndedMessage.meetingId, techPersonalMeetingEndedMessage.reason, f5b0Var.R);
                break;
            case 15:
                c cVar = (c) obj3;
                p5b0 p5b0Var = (p5b0) obj2;
                vqb vqbVar = cVar.c;
                if (vqbVar != null) {
                    vqbVar.invoke(cVar.b.get(p5b0Var.F()));
                    break;
                }
                break;
            case 16:
                BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) obj2;
                if (((PFMCalendarView) obj3).hasValidRangeDate()) {
                    bottomSheetDialogView.dismiss();
                    break;
                }
                break;
            case 17:
                ((PFMCalendarView) obj3).render(y390.a((y390) obj2, q6i0.e));
                break;
            case 18:
                ((fbb0) obj3).invoke(((n70) obj2).Z());
                break;
            case 19:
                PhoneConfirmationFragment.setupViews$lambda$5$lambda$4((PhoneConfirmationFragment) obj3, (f461) obj2, view);
                break;
            case 20:
                PhotoFragment.getViewBinding$lambda$12$lambda$11((PhotoFragment) obj3, (e761) obj2, view);
                break;
            case 21:
                PhotoRecordingFragment.initView$lambda$5$lambda$3((PhotoRecordingFragment) obj3, (ijn) obj2, view);
                break;
            case 22:
                PickFeedbackReasonsDialog._init_$lambda$1((tls) obj3, (PickFeedbackReasonsDialog) obj2, view);
                break;
            case 23:
                PinActionButtonView.showContent$lambda$1((PinActionButtonView) obj3, (utb0) obj2, view);
                break;
            case 24:
                kxd0 kxd0Var = (kxd0) obj3;
                CheckBox checkBox = kxd0Var.U;
                checkBox.setChecked(!checkBox.isChecked());
                ((lbb0) obj2).invoke(Integer.valueOf(kxd0Var.F()), Boolean.valueOf(checkBox.isChecked()));
                break;
            case 25:
                ((uxe0) obj3).i.invoke((String) obj2);
                break;
            case 26:
                ProductCardView.setOnProductActionClickListener$lambda$0((ProductCardView) obj3, (tls) obj2, view);
                break;
            case 27:
                ProgressIndicator._set_onClickAction_$lambda$0((tls) obj3, (ProgressIndicator) obj2, view);
                break;
            case 28:
                lyf0 lyf0Var = (lyf0) obj2;
                tls tlsVar = ((com.yandex.messaging.ui.reactions.b) obj3).T;
                if (tlsVar != null) {
                    tlsVar.invoke(lyf0Var.b().userId);
                    break;
                }
                break;
            default:
                RateView.showQualityQuestionButton$lambda$0((RateView) obj3, (lgg0) obj2, view);
                break;
        }
    }
}
