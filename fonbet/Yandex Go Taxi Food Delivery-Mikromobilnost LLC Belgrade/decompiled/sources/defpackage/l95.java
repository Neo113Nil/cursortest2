package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.BottomSheetFlexOverlayControllerFactory;
import com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment;
import com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.c;
import com.yandex.go.beginners.auth_postload.BeginnersFinalLoadingModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.BottomPanelButtonView;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.taxi.order.bottom_modal.ui.adapter.a;
import com.yandex.go.taxi.order.bottom_modal.ui.mvp.BottomModalView;
import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;
import com.yandex.messaging.internal.view.timeline.f;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.plus.core.gradient.api.LinearGradientDrawable;
import com.ybsdk.core.presentation.BaseThemeFragment;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import kotlinx.coroutines.flow.e;

/* loaded from: classes2.dex */
public final /* synthetic */ class l95 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l95(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View cardContentView;
        ab5 ab5Var;
        n4u0 themeType_delegate$lambda$1;
        View insetsType$lambda$0;
        c viewModel_delegate$lambda$0;
        View insetsType$lambda$02;
        bqr0 activityViewModel_delegate$lambda$0;
        View insetsType$lambda$03;
        a adapter_delegate$lambda$0;
        zy11 applyButtonAppearance$lambda$0;
        bkf customInsetsHandlingBehaviourProvider_delegate$lambda$0;
        flex.engine.a create$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new rpl0(((m95) obj).P());
            case 1:
                return new rpl0(((n95) obj).P());
            case 2:
                return new rpl0(((o95) obj).P());
            case 3:
                cardContentView = ((BaseSafetyCenterView) obj).getCardContentView();
                return cardContentView;
            case 4:
                return new vhi0(((com.yandex.messaging.internal.view.timeline.voice.a) obj).x2.a());
            case 5:
                cb5 cb5Var = (cb5) obj;
                Float valueOf = Float.valueOf(1.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                Context context = cb5Var.a.getView().getContext();
                float s = vng.s(lvg0.acquisition_sdk_plus_brand_button_corner_radius, context);
                int i2 = bb5.a[cb5Var.d.ordinal()];
                if (i2 == 1) {
                    ab5Var = new ab5(new LinearGradientDrawable(90.0f, scc.g(Integer.valueOf(Color.parseColor("#FF5C4D")), Integer.valueOf(Color.parseColor("#EB469F")), Integer.valueOf(Color.parseColor("#8341EF")), Integer.valueOf(Color.parseColor("#3F68F9"))), scc.g(valueOf2, Float.valueOf(0.27f), Float.valueOf(0.75f), valueOf)), b1i0.AcquisitionSdk_TextAppearance_Button_M, b1i0.AcquisitionSdk_TextAppearance_Label_S);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    ab5Var = new ab5(new LinearGradientDrawable(90.0f, scc.g(Integer.valueOf(Color.parseColor("#9C38FF")), Integer.valueOf(Color.parseColor("#9C38FF")), Integer.valueOf(Color.parseColor("#A832F7")), Integer.valueOf(Color.parseColor("#B72AEC")), Integer.valueOf(Color.parseColor("#C537D6")), Integer.valueOf(Color.parseColor("#D445BF")), Integer.valueOf(Color.parseColor("#E656A2")), Integer.valueOf(Color.parseColor("#EF7487")), Integer.valueOf(Color.parseColor("#FFA858"))), scc.g(valueOf2, Float.valueOf(0.38f), Float.valueOf(0.54f), Float.valueOf(0.66f), Float.valueOf(0.74f), Float.valueOf(0.81f), Float.valueOf(0.87f), Float.valueOf(0.93f), valueOf)), b1i0.AcquisitionSdk_Yango_TextAppearance_Button_Title5, b1i0.AcquisitionSdk_Yango_TextAppearance_Legals_Caption);
                }
                return new ab5(mm91.a(msa1.o(ab5Var.a, s), context.getColor(rpg0.acquisition_sdk_color_control_highlight), s, s, s, s), ab5Var.b, ab5Var.c);
            case 6:
                themeType_delegate$lambda$1 = BaseThemeFragment.themeType_delegate$lambda$1((BaseThemeFragment) obj);
                return themeType_delegate$lambda$1;
            case 7:
                insetsType$lambda$0 = BaseTrustedContactsModalView.insetsType$lambda$0((BaseTrustedContactsModalView) obj);
                return insetsType$lambda$0;
            case 8:
                f fVar = (f) obj;
                return new jm31(fVar.v0, (xav) fVar.K0.getValue());
            case 9:
                uc5 uc5Var = (uc5) obj;
                return e.R(uc5Var.y, ds31.a(uc5Var), wsr0.a(xsr0.a, 3), uc5Var.c.q(uc5Var.X()));
            case 10:
                kd5 kd5Var = (kd5) obj;
                return kd5Var.a ? kd5Var.e() : kd5Var.f();
            case 11:
                return (kk2) obj;
            case 12:
                viewModel_delegate$lambda$0 = BduiFragment.viewModel_delegate$lambda$0((BduiFragment) obj);
                return viewModel_delegate$lambda$0;
            case 13:
                insetsType$lambda$02 = BeginnersFinalLoadingModalView.insetsType$lambda$0((BeginnersFinalLoadingModalView) obj);
                return insetsType$lambda$02;
            case 14:
                return Boolean.valueOf(((tq5) obj).c);
            case 15:
                return Float.valueOf(((lx40) obj).c.getFloatValue());
            case 16:
                zy11 zy11Var = zy11.a;
                ((y4a0) obj).onSuccess(zy11Var);
                return zy11Var;
            case 17:
                activityViewModel_delegate$lambda$0 = BindCardActivity.activityViewModel_delegate$lambda$0((BindCardActivity) obj);
                return activityViewModel_delegate$lambda$0;
            case 18:
                com.yandex.plus.paymentsdk.internal.method.card.a aVar = (com.yandex.plus.paymentsdk.internal.method.card.a) obj;
                return aVar.a.a(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, new ev5(aVar, 0), true);
            case 19:
                com.yandex.plus.paymentsdk.internal.method.sbp.a aVar2 = (com.yandex.plus.paymentsdk.internal.method.sbp.a) obj;
                return aVar2.a.a(aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g, new ev5(aVar2, 1), false);
            case 20:
                ((ymu) ((hh5) obj).b).onSuccess(ac8.a);
                return zy11.a;
            case 21:
                ((ymu) ((sr4) obj).b).onSuccess(ac8.a);
                return zy11.a;
            case 22:
                ((dke) obj).invoke(null);
                return zy11.a;
            case 23:
                insetsType$lambda$03 = BottomModalView.insetsType$lambda$0((BottomModalView) obj);
                return insetsType$lambda$03;
            case 24:
                adapter_delegate$lambda$0 = BottomModalView.adapter_delegate$lambda$0((bts0) obj);
                return adapter_delegate$lambda$0;
            case 25:
                applyButtonAppearance$lambda$0 = BottomPanelButtonView.applyButtonAppearance$lambda$0((BottomPanelButtonView) obj);
                return applyButtonAppearance$lambda$0;
            case 26:
                customInsetsHandlingBehaviourProvider_delegate$lambda$0 = BottomSheetDialogView.customInsetsHandlingBehaviourProvider_delegate$lambda$0((BottomSheetDialogView) obj);
                return customInsetsHandlingBehaviourProvider_delegate$lambda$0;
            case 27:
                create$lambda$0 = BottomSheetFlexOverlayControllerFactory.create$lambda$0((BottomSheetFlexOverlayControllerFactory) obj);
                return create$lambda$0;
            case 28:
                md6 md6Var = (md6) obj;
                q3a0 a = ((f5g) ((w2a0) md6Var.b)).V().a();
                s2a0 V = ((f5g) ((w2a0) md6Var.b)).V();
                V.c = a;
                V.a.g(a);
                return zy11.a;
            default:
                return Integer.valueOf(((z69) obj).b.getIntValue());
        }
    }
}
