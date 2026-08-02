package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.wizard.accountsaving.b;
import com.yandex.go.payments.shared.wizard.accountsaving.c;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.go.scooters.onboarding.agreement.ScootersAgreementModalView;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.internal.view.stickers.panel.a;
import com.yandex.messaging.internal.view.timeline.overlay.e;
import com.yandex.messaging.views.StatesButton;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerErrorFragment;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameFragment;
import com.ybsdk.feature.settings.internal.view.SettingsThemeView;
import com.ybsdk.screens.spoilerOnboarding.SpoilerOnboardingFragment;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.paymentmethod.SbpInfoView;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.scooters.presentation.personal_goals.ScootersRideFinishPersonalGoalsModalView;

/* loaded from: classes15.dex */
public final /* synthetic */ class eaj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eaj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nu10 h0;
        jcz0 jcz0Var;
        jcz0 jcz0Var2;
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                RequiredAltChoiceOptionSelectorView.setDeliveryIntervalsClickListeners$lambda$0((RequiredAltChoiceOptionSelectorView) obj, view);
                break;
            case 1:
                ((ybf) obj).invoke();
                break;
            case 2:
                RouteSelectorModalView.onAttachedToWindow$lambda$1((RouteSelectorModalView) obj, view);
                break;
            case 3:
                b bVar = ((c) obj).c;
                jzl0 jzl0Var = bVar.x;
                boolean z = !jzl0Var.c;
                jzl0Var.c = z;
                vnr0 vnr0Var = bVar.B;
                String str = bVar.E.b().a;
                fga0 fga0Var = vnr0Var.b;
                SharedAccount o = fga0Var.o(str);
                if (o == null) {
                    unr0.D(new Object[]{str, "FamilyAccount.PaymentMethodSwitch"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                } else {
                    y9p y9pVar = vnr0Var.l;
                    String str2 = o.b;
                    boolean e = o.e(fga0Var.w());
                    String valueOf = String.valueOf(z);
                    y9pVar.getClass();
                    y9p.c(y9pVar, "FamilyAccount.PaymentMethodSwitch", str2, str, e, null, valueOf, 16);
                }
                bVar.Kg();
                break;
            case 4:
                SavingsAccountCloseDepositFragment.showBottomSheet$lambda$15$lambda$12((SavingsAccountCloseDepositFragment) obj, view);
                break;
            case 5:
                SavingsAccountNameFragment.getViewBinding$lambda$2$lambda$0((SavingsAccountNameFragment) obj, view);
                break;
            case 6:
                SbpChallengerErrorFragment.initBinding$lambda$0((SbpChallengerErrorFragment) obj, view);
                break;
            case 7:
                SbpInfoView._init_$lambda$0((SbpInfoView) obj, view);
                break;
            case 8:
                ScootersAgreementModalView.access$getBinding((ScootersAgreementModalView) obj).b.toggle();
                break;
            case 9:
                ScootersRideFinishPersonalGoalsModalView.onAttachedToWindow$lambda$0((ScootersRideFinishPersonalGoalsModalView) obj, view);
                break;
            case 10:
                SearchModalView._init_$lambda$2((SearchModalView) obj, view);
                break;
            case 11:
                xc5 xc5Var = (xc5) ((zbq0) obj).a();
                rwo W = xc5Var.W();
                sv90 sv90Var = qv90.a;
                PsdkScreen psdkScreen = PsdkScreen.LEGAL_AGREEMENT;
                sv90Var.getClass();
                ((y22) W).a(sv90.w0(psdkScreen));
                xc5Var.c.l(c950.e);
                break;
            case 12:
                SelectPaymentMethodView.lambda$3$lambda$1((SelectPaymentMethodView) obj, view);
                break;
            case 13:
                ((u5r0) obj).invoke(view);
                break;
            case 14:
                ((u5r0) obj).invoke(view);
                break;
            case 15:
                ((a5p0) obj).invoke(view);
                break;
            case 16:
                ((a5p0) obj).invoke(view);
                break;
            case 17:
                SettingsThemeView._init_$lambda$2((SettingsThemeView) obj, view);
                break;
            case 18:
                ShimmersFragment.initBackButton$lambda$4((ShimmersFragment) obj, view);
                break;
            case 19:
                ShortcutsModalView.initializeBackButton$lambda$0$0((ShortcutsModalView) obj, view);
                break;
            case 20:
                lhs0 lhs0Var = (lhs0) obj;
                if (!lhs0Var.o0()) {
                    if (lhs0Var.e0().f != null && lhs0Var.v3 != null && (h0 = lhs0Var.h0()) != null && (jcz0Var = lhs0Var.e0().f) != null) {
                        jcz0Var.d(lhs0Var.x2, lhs0Var.c0, lhs0Var.v3, h0);
                        break;
                    }
                } else {
                    lhs0Var.m0(null, null);
                    break;
                }
                break;
            case 21:
                ((SlidableFlexView) obj).onBackPressed();
                break;
            case 22:
                SliderButtonView._init_$lambda$0((SliderButtonView) obj, view);
                break;
            case 23:
                blt0 blt0Var = (blt0) ((h3y) obj).get();
                blt0Var.getClass();
                tje.e();
                b00 b00Var = blt0Var.w;
                ((Handler) b00Var.a.get()).post(new pz(b00Var, blt0Var.c, i2));
                break;
            case 24:
                SpoilerOnboardingFragment.onViewCreated$lambda$3$lambda$0((SpoilerOnboardingFragment) obj, view);
                break;
            case 25:
                StadiumButtonView.enableClicks$lambda$11((StadiumButtonView) obj, view);
                break;
            case 26:
                e eVar = (e) obj;
                if (eVar.G && (jcz0Var2 = eVar.E) != null) {
                    jcz0Var2.j(((MessageRef) eVar.L.key()).chatId);
                    break;
                }
                break;
            case 27:
                ((StatesButton) obj).onClick();
                break;
            case 28:
                xbu0 xbu0Var = (xbu0) obj;
                sbu0 sbu0Var = xbu0Var.T;
                if (sbu0Var != null) {
                    sbu0Var.i(xbu0Var.Q, xbu0Var.R);
                    break;
                }
                break;
            default:
                ncu0 ncu0Var = (ncu0) obj;
                int i3 = ncu0Var.T;
                hhs0 hhs0Var = ncu0Var.R;
                if (hhs0Var != null) {
                    n5x0 n5x0Var = ((a) hhs0Var.b).D;
                    n5x0 n5x0Var2 = n5x0Var != null ? n5x0Var : null;
                    n5x0Var2.e = i3;
                    int k = n5x0Var2.c.k(i3);
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) n5x0Var2.a.getLayoutManager();
                    if (linearLayoutManager != null) {
                        linearLayoutManager.r(k, 0);
                    }
                    n5x0Var2.b();
                    break;
                }
                break;
        }
    }
}
