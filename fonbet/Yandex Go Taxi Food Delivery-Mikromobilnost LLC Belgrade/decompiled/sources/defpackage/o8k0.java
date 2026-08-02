package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsWishSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme;
import com.ybsdk.core.common.utils.theme.LateInitColorCallbackImpl;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountScreenParams;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView;
import com.ybsdk.widgets.common.shimmer.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes3.dex */
public final /* synthetic */ class o8k0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8k0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.ybsdk.core.utils.ColorModel] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    @Override // defpackage.sls
    public final Object invoke() {
        xck0 buttonsAdapter_delegate$lambda$0;
        zy11 updatePlate$lambda$0$0;
        yss0 slotItemView_delegate$lambda$0;
        LottieAnimationView lottieAnimationView_delegate$lambda$0;
        zy11 onDraw$lambda$0;
        View showSourceBottomSheet$lambda$26;
        zy11 zy11Var;
        ListItemComponent circlePinAddressView_delegate$lambda$0;
        zy11 showShareDisabledTooltip$lambda$1;
        int numberOfItemsThatCanBeShownOnDisplay_delegate$lambda$2;
        ColorModel.Attr attr;
        zy11 onPeriodChange$lambda$1;
        View stateForRender$lambda$8;
        zy11 renderAccordingToViewState$lambda$15$lambda$12;
        zy11 renderAccordingToViewState$lambda$19$lambda$17;
        int i = this.a;
        zy11 zy11Var2 = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ArrayList) obj2).add((k8k0) obj);
                break;
            case 1:
                buttonsAdapter_delegate$lambda$0 = RideCardAiBubbleView.buttonsAdapter_delegate$lambda$0((Context) obj2, (RideCardAiBubbleView) obj);
                break;
            case 2:
                ((tls) obj2).invoke(((egk0) obj).b);
                break;
            case 3:
                updatePlate$lambda$0$0 = RideCardDriverSectionView.updatePlate$lambda$0$0((yzx) obj2, (zuc0) obj);
                break;
            case 4:
                slotItemView_delegate$lambda$0 = RideCardTimelineBannerView.slotItemView_delegate$lambda$0((bts0) obj2, (Context) obj);
                break;
            case 5:
                lottieAnimationView_delegate$lambda$0 = RideCardTipsWishSelectorView.lottieAnimationView_delegate$lambda$0((Context) obj2, (RideCardTipsWishSelectorView) obj);
                break;
            case 6:
                ((tls) obj2).invoke((kuk0) obj);
                break;
            case 7:
                onDraw$lambda$0 = RoundedCornersImageView.onDraw$lambda$0((RoundedCornersImageView) obj2, (Canvas) obj);
                break;
            case 8:
                showSourceBottomSheet$lambda$26 = RoundingFragment.showSourceBottomSheet$lambda$26((RoundingFragment) obj2, (mzk0) obj);
                break;
            case 9:
                vxq0 vxq0Var = ((w2l0) obj).b;
                ((tls) obj2).invoke(r2l0.a);
                break;
            case 10:
                x7l0 x7l0Var = (x7l0) obj;
                ((zls) obj2).invoke(Integer.valueOf(x7l0Var.c), x7l0Var.p, Boolean.valueOf(x7l0Var.q));
                break;
            case 11:
                hj0 hj0Var = (hj0) obj2;
                oz40 oz40Var = (oz40) obj;
                hj0Var.e.invoke();
                if (!hj0Var.a) {
                    hj0Var.d.invoke();
                    break;
                } else {
                    oz40Var.setValue(Boolean.TRUE);
                    break;
                }
            case 12:
                zy11Var = RouteSelectorDestinationFragment.setupInitialCameraPosition$lambda$0((RouteSelectorDestinationFragment) obj2, (zzs) obj);
                break;
            case 13:
                circlePinAddressView_delegate$lambda$0 = RouteSelectorModalView.circlePinAddressView_delegate$lambda$0((Context) obj2, (RouteSelectorModalView) obj);
                break;
            case 14:
                a aVar = (a) obj2;
                ht10 ht10Var = (ht10) obj;
                aVar.c = ht10Var;
                ArrayDeque arrayDeque = aVar.d;
                if (ht10Var != null) {
                    while (!arrayDeque.isEmpty()) {
                        a.c((xfl0) arrayDeque.removeFirst(), ht10Var);
                    }
                    break;
                }
                break;
            case 15:
                ((tls) obj2).invoke(new o700(((dme) obj).c));
                break;
            case 16:
                showShareDisabledTooltip$lambda$1 = SafetyCenterMainView.showShareDisabledTooltip$lambda$1((SafetyCenterMainView) obj2, (FrameLayout) obj);
                break;
            case 17:
                f7g f7gVar = (f7g) obj2;
                qvl0 qvl0Var = f7gVar.a;
                xf41 a = ((scg) ((ff41) f7gVar.b.get())).a();
                q5z.i(a);
                ((ag41) a).a((UiWebViewConfig) obj);
                break;
            case 18:
                ((d4) obj2).invoke();
                ((tj60) ((s6k0) obj).b).c("SavedToFavoriteNotification");
                break;
            case 19:
                numberOfItemsThatCanBeShownOnDisplay_delegate$lambda$2 = SavingsAccountThemeSelectorView.numberOfItemsThatCanBeShownOnDisplay_delegate$lambda$2((Context) obj2, (SavingsAccountThemeSelectorView) obj);
                break;
            case 20:
                b bVar = (b) obj;
                ThemedParams<String> backgroundColorParams = ((SavingsAccountScreenParams) obj2).getBackgroundColorParams();
                if (backgroundColorParams != null) {
                    String light = backgroundColorParams.getLight();
                    String dark = backgroundColorParams.getDark();
                    attr = new ColorModel.Attr(ung0.ybColor_background_primary);
                    ?? f = lvy0.f(light);
                    ColorModel f2 = lvy0.f(dark);
                    if (f != 0 && f2 != null) {
                        f = new ColorModel.LateInitColor(new LateInitColorCallbackImpl(f, f2));
                    } else if (f == 0) {
                        f = f2;
                    }
                    if (f != 0) {
                        attr = f;
                    }
                } else {
                    attr = null;
                }
                break;
            case 21:
                onPeriodChange$lambda$1 = SavingsIncomeProgressView.onPeriodChange$lambda$1((SavingsIncomeProgressView) obj2, (mpv) obj);
                break;
            case 22:
                stateForRender$lambda$8 = SbpAccountInfoFragment.getStateForRender$lambda$8((SbpAccountInfoFragment) obj2, (lem0) obj);
                break;
            case 23:
                renderAccordingToViewState$lambda$15$lambda$12 = SbpPartnersFragment.renderAccordingToViewState$lambda$15$lambda$12((SbpPartnersFragment) obj2, (mim0) obj);
                break;
            case 24:
                renderAccordingToViewState$lambda$19$lambda$17 = SbpPartnersFragment.renderAccordingToViewState$lambda$19$lambda$17((SbpPartnersFragment) obj2, (jim0) obj);
                break;
            case 25:
                ((AppAnalyticsReporter) ((com.ybsdk.feature.main.internal.screens.sbpPartners.a) obj2).H.a).G.q((String) obj, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.NO_APP_INSTALLED);
                break;
            case 26:
                luf lufVar = (luf) obj2;
                qim0 qim0Var = (qim0) obj;
                Uri uri = qim0Var.a;
                String str = qim0Var.b;
                if (str == null) {
                    str = "";
                }
                lufVar.invoke(new rm0(uri, str));
                break;
            case 27:
                ((luf) obj2).invoke(new hyj0((PaymentKitError) obj));
                break;
            case 28:
                ((luf) obj2).invoke(new hyj0((PaymentKitError) obj));
                break;
            default:
                ((tls) obj2).invoke(((okm0) obj).f);
                break;
        }
        return zy11Var2;
    }
}
