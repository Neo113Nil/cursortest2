package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.camera2.internal.i;
import androidx.camera.camera2.internal.l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.BottomSheetFlexOverlayController;
import com.yandex.fintechsdk.core.ui.impl.api.bottomsheet.BottomSheetSetupHelper$setupRoundedCornersOutline$1;
import com.yandex.fintechsdk.core.ui.impl.api.bottomsheet.CustomBottomSheetBehavior;
import com.yandex.go.beginners.presentation.BeginnersOnboardingModalView;
import com.yandex.go.benefits_center.benefits.analytics.BenefitsCenterAnalytics$BenefitsCenterTappedType;
import com.yandex.go.benefits_center.benefits.router.d;
import com.yandex.go.navigator.settings.BaseSettingsModalView;
import com.yandex.go.order.bundle.map.impl.ui.BundledOrdersModalView;
import com.yandex.go.shortcuts.impl.view.adapter.b;
import com.yandex.go.taxi.order.bottom_modal.ui.mvp.BottomModalView;
import com.yandex.go.taxi.order.chat.call_feedback.ui.CallFeedbackQuestionModalView;
import com.yandex.go.taxi.order.map.curtain.view.BannerContainerView;
import com.yandex.voip_calls.calls_go.CallsGoActivity;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import retrofit2.Call;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.tooltips.BaseSummaryTooltipPopup;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final /* synthetic */ class js4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ js4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        u1w g;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        int height;
        CustomBottomSheetBehavior customBottomSheetBehavior;
        int i2 = this.a;
        int i3 = 1;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((BannerContainerView) obj).setVisibility(8);
                break;
            case 1:
                ((kr4) obj).b();
                break;
            case 2:
                ((BaseAddressSearchView) obj).closeKeyboard();
                break;
            case 3:
                ((ViewPagerFixedSizeLayout) obj).requestLayout();
                break;
            case 4:
                ((com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout) obj).requestLayout();
                break;
            case 5:
                b bVar = (b) obj;
                ViewGroup viewGroup = bVar.j0;
                if (viewGroup.getAlpha() < 0.001f) {
                    viewGroup.setVisibility(8);
                    bVar.q0();
                    break;
                }
                break;
            case 6:
                ((BaseSettingsModalView) obj).onBackPressed();
                break;
            case 7:
                BaseSettingsModalView.onAttachedToWindow$closeSettings((aa5) obj);
                break;
            case 8:
                ((BaseSummaryTooltipPopup) obj).dismiss();
                break;
            case 9:
                BaseWebChromeClient._init_$lambda$1((BaseWebChromeClient) obj);
                break;
            case 10:
                BeginnersOnboardingModalView.onAttachedToWindow$lambda$0((BeginnersOnboardingModalView) obj);
                break;
            case 11:
                hn5 hn5Var = (hn5) obj;
                tm5 tm5Var = hn5Var.b.D;
                BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType = BenefitsCenterAnalytics$BenefitsCenterTappedType.Reload;
                zn5 zn5Var = hn5Var.a;
                tm5.a(tm5Var, zn5Var.a, benefitsCenterAnalytics$BenefitsCenterTappedType);
                d.Q(hn5Var.b, zn5Var, false);
                break;
            case 12:
                ((db6) obj).h();
                break;
            case 13:
                ((eb6) obj).h();
                break;
            case 14:
                ((fb6) obj).h();
                break;
            case 15:
                hc6 hc6Var = (hc6) obj;
                ImageView imageView = hc6Var.b;
                NestedScrollViewAdvanced nestedScrollViewAdvanced = hc6Var.a;
                if ((nestedScrollViewAdvanced.canScrollVertically(1) && imageView.getVisibility() != 0) && !hc6Var.d) {
                    a aVar = hc6Var.c;
                    Context context = nestedScrollViewAdvanced.getContext();
                    int intValue = ((Number) hc6Var.f.getValue()).intValue();
                    Context context2 = nestedScrollViewAdvanced.getContext();
                    Drawable v = gtq0.v(aVar, context, intValue, new hgr0(0.0f, tje.w(-4, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowTop)), 0, 16);
                    hc6Var.d = true;
                    Rect rect = new Rect();
                    v.getPadding(rect);
                    imageView.setBackground(v);
                    xw31.E(imageView, Integer.valueOf(-rect.left), Integer.valueOf((-rect.top) - ((Number) hc6Var.e.getValue()).intValue()), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
                    imageView.setVisibility(0);
                    nestedScrollViewAdvanced.addScrollChangeListener(new x95(i3, hc6Var));
                    break;
                }
                break;
            case 16:
                BottomModalView.renderButton$lambda$0$onButtonClicked((vc6) obj);
                break;
            case 17:
                BottomSheetFlexOverlayController.showOverlay$lambda$5((ViewGroup) obj);
                break;
            case 18:
                ((eg6) obj).invoke();
                break;
            case 19:
                ((lu5) obj).invoke();
                break;
            case 20:
                og6 og6Var = (og6) obj;
                boolean z = og6Var.l;
                View view = og6Var.b;
                Activity activity = og6Var.a;
                if (z) {
                    i = 0;
                } else {
                    View decorView = activity.getWindow().getDecorView();
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    n751 a = op31.a(decorView);
                    i = ((a == null || (g = a.a.g(1)) == null) ? 0 : g.b) + 16;
                }
                if (activity.getWindow().getDecorView().getHeight() > 0) {
                    height = activity.getWindow().getDecorView().getHeight();
                } else {
                    currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    height = bounds.height();
                }
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = displayMetrics.widthPixels;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = height - i;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                view.setLayoutParams(layoutParams);
                if (og6Var.l && (customBottomSheetBehavior = og6Var.i) != null) {
                    customBottomSheetBehavior.O0 = true;
                    customBottomSheetBehavior.P(0);
                }
                CustomBottomSheetBehavior customBottomSheetBehavior2 = og6Var.i;
                if (customBottomSheetBehavior2 != null) {
                    customBottomSheetBehavior2.M0 = i;
                }
                BottomSheetBehavior bottomSheetBehavior = og6Var.h;
                if (bottomSheetBehavior == null) {
                    bottomSheetBehavior = null;
                }
                bottomSheetBehavior.P(i);
                og6Var.e.setAlpha(0.5f);
                og6Var.j = true;
                BottomSheetBehavior bottomSheetBehavior2 = og6Var.h;
                if ((bottomSheetBehavior2 == null ? null : bottomSheetBehavior2).k0 != 3) {
                    if (bottomSheetBehavior2 == null) {
                        bottomSheetBehavior2 = null;
                    }
                    bottomSheetBehavior2.W(3);
                }
                og6Var.j = false;
                view.requestLayout();
                if (!og6Var.l) {
                    view.setOutlineProvider(new BottomSheetSetupHelper$setupRoundedCornersOutline$1(activity.getResources().getDisplayMetrics().density * 24.0f));
                    view.setClipToOutline(true);
                    break;
                } else {
                    view.setOutlineProvider(null);
                    view.setClipToOutline(false);
                    FrameLayout frameLayout = (FrameLayout) og6Var.f.findViewById(og6Var.c);
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                        break;
                    }
                }
                break;
            case 21:
                ((BundledOrdersModalView) obj).onBackPressed();
                break;
            case 22:
                ((com.yandex.go.payments.shared.business.onboarding.b) obj).i.a(null);
                break;
            case 23:
                ((CallFeedbackQuestionModalView) obj).dismiss();
                break;
            case 24:
                zp1 zp1Var = (zp1) obj;
                ((Call) zp1Var.b).k0(zp1Var);
                break;
            case 25:
                ((CallsGoActivity) obj).finish();
                break;
            case 26:
                dm7 dm7Var = (dm7) obj;
                androidx.concurrent.futures.b bVar2 = dm7Var.g;
                if (bVar2 != null) {
                    bVar2.b(null);
                    dm7Var.g = null;
                    break;
                }
                break;
            case 27:
                ((CameraDevice) obj).close();
                break;
            case 28:
                sk7 sk7Var = (sk7) obj;
                if (!((AtomicBoolean) sk7Var.c).getAndSet(true)) {
                    ((l) ((c06) sk7Var.w).b).c.execute(new i(0, sk7Var));
                    break;
                }
                break;
            default:
                ((an7) obj).i.c();
                break;
        }
    }
}
