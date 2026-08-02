package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.c;
import com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementView;
import com.yandex.go.flex.common.facade.routers.views.FullscreenFlexView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.order_tracking.eats.presentation.ui.EatsOrderDetailsModalView;
import com.yandex.messaging.internal.view.input.edit.a;
import com.yandex.messaging.internal.view.timeline.k;
import com.yandex.messaging.ui.calls.feedback.PickFeedbackReasonsDialog;
import com.yandex.messaging.views.ExpandedBottomSheetDialog;
import com.yandex.payment.divkit.select.DkCvvInputView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment;
import com.ybsdk.feature.divkit.internal.ui.DivActionsView;
import com.ybsdk.feature.divkit.internal.ui.DivCustomPlusBadgeView;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.GuidelineItemView;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import java.util.Objects;
import ru.rt.ebs.cryptosdk.presentation.error.failedVerifcation.FailedVerificationFragment;
import ru.yandex.taxi.delivery.ui.setuprequierements.DeliverySetupRequirementsModalView;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchView;
import ru.yandex.taxi.vendor_api.google.bank_card.GmsBankCardRecognitionActivity;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

/* loaded from: classes15.dex */
public final /* synthetic */ class cmi implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cmi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CircleButtonImageView circleButtonImageView;
        CircleButtonImageView circleButtonImageView2;
        co7 co7Var;
        CircleButtonImageView circleButtonImageView3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DeliveryRentRequirementView.bind$lambda$2((DeliveryRentRequirementView) obj, view);
                break;
            case 1:
                DeliverySetupRequirementsModalView.onAttachedToWindow$lambda$0((DeliverySetupRequirementsModalView) obj, view);
                break;
            case 2:
                ((r0d0) obj).invoke();
                break;
            case 3:
                DiffRateCalendarFragment.getViewBinding$lambda$9$lambda$8((DiffRateCalendarFragment) obj, view);
                break;
            case 4:
                DiscountsModalView.initUi$lambda$2((DiscountsModalView) obj, view);
                break;
            case 5:
                DivActionsView.createActionText$lambda$4$lambda$3((String) obj, view);
                break;
            case 6:
                DivBottomSheetView.render$lambda$8$lambda$3((DivBottomSheetView) obj, view);
                break;
            case 7:
                DivCustomPlusBadgeView.createClickInterceptorWrapper$lambda$2((DivCustomPlusBadgeView) obj, view);
                break;
            case 8:
                DkCvvInputView._init_$lambda$1((DkCvvInputView) obj, view);
                break;
            case 9:
                DocumentBottomSheetFragment.setupCancelOnTouchOutside$lambda$9((DocumentBottomSheetFragment) obj, view);
                break;
            case 10:
                ((c) obj).t();
                break;
            case 11:
                mym mymVar = (mym) obj;
                mzm mzmVar = mymVar.R;
                int E = mymVar.E();
                jzm jzmVar = mymVar.S;
                mzmVar.e(E, jzmVar != null ? jzmVar : null);
                break;
            case 12:
                nym nymVar = (nym) obj;
                mzm mzmVar2 = nymVar.Q;
                int E2 = nymVar.E();
                kzm kzmVar = nymVar.R;
                mzmVar2.e(E2, kzmVar != null ? kzmVar : null);
                break;
            case 13:
                ((EatsOrderDetailsModalView) obj).onBackPressed();
                break;
            case 14:
                wln wlnVar = ((amn) obj).c;
                wlnVar.D.m(wlnVar.G.b, wlnVar.H, wlnVar.J, SharedPaymentAnalytics$Button.SET_LIMIT);
                bmn bmnVar = wlnVar.J;
                boolean z = bmnVar.m;
                boolean z2 = !z;
                bmnVar.m = z2;
                bmnVar.n = z2;
                bmnVar.i = true;
                bmnVar.h = "";
                wlnVar.Og();
                if (!z) {
                    ((uln) wlnVar.Dg()).Uf();
                    break;
                } else {
                    ((uln) wlnVar.Dg()).closeKeyboard();
                    break;
                }
            case 15:
                ((a) obj).I.a();
                break;
            case 16:
                ktn ktnVar = (ktn) obj;
                mtn mtnVar = ktnVar.T;
                tsn tsnVar = mtnVar.c;
                Object obj2 = ktnVar.Q;
                Objects.requireNonNull(obj2);
                tsnVar.b((String) obj2);
                mtnVar.a.edit().putInt("emoji_sticker_current_position", 0).apply();
                break;
            case 17:
                tsn tsnVar2 = ((rtn) obj).b;
                if (tsnVar2 != null) {
                    tsnVar2.a();
                    break;
                }
                break;
            case 18:
                sun sunVar = (sun) obj;
                view.sendAccessibilityEvent(16384);
                stn stnVar = sunVar.O;
                tun tunVar = sunVar.S;
                stnVar.invoke(sunVar, tunVar != null ? tunVar : null);
                break;
            case 19:
                ((ExpandedBottomSheetDialog) obj).lambda$wrapInBottomSheet$0(view);
                break;
            case 20:
                ExplorerButtonView.setupClickListeners$lambda$1((ExplorerButtonView) obj, view);
                break;
            case 21:
                FailedVerificationFragment.initView$lambda$3$lambda$1((FailedVerificationFragment) obj, view);
                break;
            case 22:
                FamilyFragment.onViewCreated$lambda$6((FamilyFragment) obj, view);
                break;
            case 23:
                euq euqVar = (euq) obj;
                new PickFeedbackReasonsDialog(euqVar.a, kotlin.collections.a.m0(euqVar.z, euqVar.y), v4r0.h(euqVar.B, euqVar.A), new dzm(22, euqVar)).show();
                break;
            case 24:
                FullscreenDestinationSearchView.onAttachedToWindow$lambda$0$1((FullscreenDestinationSearchView) obj, view);
                break;
            case 25:
                ((FullscreenFlexView) obj).onBackPressed();
                break;
            case 26:
                FundIncomeWidgetView.setCallbacks$lambda$1((FundIncomeWidgetView) obj, view);
                break;
            case 27:
                GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity = (GmsBankCardRecognitionActivity) obj;
                circleButtonImageView = gmsBankCardRecognitionActivity.btnFlashLight;
                if (circleButtonImageView == null) {
                    circleButtonImageView = null;
                }
                circleButtonImageView2 = gmsBankCardRecognitionActivity.btnFlashLight;
                if (circleButtonImageView2 == null) {
                    circleButtonImageView2 = null;
                }
                circleButtonImageView.setSelected(!circleButtonImageView2.isSelected());
                co7Var = gmsBankCardRecognitionActivity.camera;
                if (co7Var == null) {
                    co7Var = null;
                }
                qp7 b = co7Var.b();
                circleButtonImageView3 = gmsBankCardRecognitionActivity.btnFlashLight;
                b.f((circleButtonImageView3 != null ? circleButtonImageView3 : null).isSelected());
                gmsBankCardRecognitionActivity.setFlashlightAccessibilityStateDescription();
                break;
            case 28:
                GuidelineItemView._init_$lambda$1((GuidelineItemView) obj, view);
                break;
            default:
                k kVar = (k) obj;
                Context context = kVar.a.getContext();
                new AlertDialog.Builder(context).setTitle(oyh0.messaging_hidden_message_dialog_title_text).setNegativeButton(oyh0.messaging_hidden_message_dialog_positive_button_text, new p97(7, kVar)).setPositiveButton(oyh0.messaging_hidden_message_dialog_negative_button_text, kVar.C0).setView(LayoutInflater.from(context).inflate(olh0.msg_d_hidden_message, (ViewGroup) null)).show();
                break;
        }
    }
}
