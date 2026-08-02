package defpackage;

import android.animation.StateListAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardInsuranceComponent;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.go.taxi.order.multi.feed.ui.HandlerStickyView;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.shimmer.ShimmerDrawable;
import com.ybsdk.widgets.common.shimmer.ShimmerTextView;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate.ScootersPersonalGoalsPromoPlateView;
import ru.yandex.taxi.surge.dialog.TextBlockView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class kok0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ kok0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ButtonComponent optionsButtonComponent_delegate$lambda$0;
        int themeItemWidth_delegate$lambda$0;
        c5n0 scootersCardHeaderComponents_delegate$lambda$0;
        RobotoTextView insuranceV3TrailLabel_delegate$lambda$0;
        RecyclerView itemV1RecyclerView_delegate$lambda$0;
        BadgeView badgeViewLazy$lambda$0;
        Interpolator defaultInterpolator_delegate$lambda$1;
        Interpolator defaultInterpolator_delegate$lambda$0;
        mfb checkDrawableProvider_delegate$lambda$0;
        HandlerStickyView handlerView_delegate$lambda$0;
        ButtonComponent selectorView_delegate$lambda$0;
        RobotoTextView trailTextView_delegate$lambda$0;
        GoImageView trailIconView_delegate$lambda$0;
        Interpolator defaultInterpolator_delegate$lambda$02;
        StateListAnimator scaleAnimator_delegate$lambda$0;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                optionsButtonComponent_delegate$lambda$0 = RideCardTimelineBannerView.optionsButtonComponent_delegate$lambda$0(context);
                return optionsButtonComponent_delegate$lambda$0;
            case 1:
                themeItemWidth_delegate$lambda$0 = SavingsAccountThemeSelectorView.themeItemWidth_delegate$lambda$0(context);
                break;
            case 2:
                return new bad0(context);
            case 3:
                scootersCardHeaderComponents_delegate$lambda$0 = ScootersCardHeaderComponent.scootersCardHeaderComponents_delegate$lambda$0(context);
                return scootersCardHeaderComponents_delegate$lambda$0;
            case 4:
                insuranceV3TrailLabel_delegate$lambda$0 = ScootersCardInsuranceComponent.insuranceV3TrailLabel_delegate$lambda$0(context);
                return insuranceV3TrailLabel_delegate$lambda$0;
            case 5:
                itemV1RecyclerView_delegate$lambda$0 = ScootersFinishInfoCard.itemV1RecyclerView_delegate$lambda$0(context);
                return itemV1RecyclerView_delegate$lambda$0;
            case 6:
                return new x0o0(context);
            case 7:
                return new TransportNavigationStyleProvider(context);
            case 8:
                badgeViewLazy$lambda$0 = ScootersPersonalGoalsPromoPlateView.badgeViewLazy$lambda$0(context);
                return badgeViewLazy$lambda$0;
            case 9:
                defaultInterpolator_delegate$lambda$1 = ShimmerDrawable.defaultInterpolator_delegate$lambda$1(context);
                return defaultInterpolator_delegate$lambda$1;
            case 10:
                defaultInterpolator_delegate$lambda$0 = ShimmerTextView.defaultInterpolator_delegate$lambda$0(context);
                return defaultInterpolator_delegate$lambda$0;
            case 11:
                themeItemWidth_delegate$lambda$0 = SupportDetailsModalView.itemMargin_delegate$lambda$0(context);
                break;
            case 12:
                checkDrawableProvider_delegate$lambda$0 = TariffTrailView.checkDrawableProvider_delegate$lambda$0(context);
                return checkDrawableProvider_delegate$lambda$0;
            case 13:
                handlerView_delegate$lambda$0 = TaxiOrderTrackingView.handlerView_delegate$lambda$0(context);
                return handlerView_delegate$lambda$0;
            case 14:
                selectorView_delegate$lambda$0 = TextBlockView.selectorView_delegate$lambda$0(context);
                return selectorView_delegate$lambda$0;
            case 15:
                trailTextView_delegate$lambda$0 = TextBlockView.trailTextView_delegate$lambda$0(context);
                return trailTextView_delegate$lambda$0;
            case 16:
                trailIconView_delegate$lambda$0 = TextBlockView.trailIconView_delegate$lambda$0(context);
                return trailIconView_delegate$lambda$0;
            case 17:
                defaultInterpolator_delegate$lambda$02 = ToolbarView.defaultInterpolator_delegate$lambda$0(context);
                return defaultInterpolator_delegate$lambda$02;
            case 18:
                return new h441(context);
            case 19:
                scaleAnimator_delegate$lambda$0 = WebViewToolbar.scaleAnimator_delegate$lambda$0(context);
                return scaleAnimator_delegate$lambda$0;
            default:
                themeItemWidth_delegate$lambda$0 = WebViewToolbar.rippleResId_delegate$lambda$1(context);
                break;
        }
        return Integer.valueOf(themeItemWidth_delegate$lambda$0);
    }
}
