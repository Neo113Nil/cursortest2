package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.recyclerview.widget.x0;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.search.g;
import com.yandex.div.shimmer.ShimmerDrawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableImpl;
import com.yandex.go.beginners.presentation.services_info.views.ServiceMainInfoItemView;
import com.yandex.go.safety.center.share.ShareContactCircleButton;
import com.yandex.go.safety.center.share.notification.ShareNotificationView;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.LockOverlayView;
import com.yandex.plus.animation.taxi.TaxiAnimationLayout;
import com.yandex.plus.plaquesdk.design.SwitchComponent;
import com.ybsdk.core.design.animation.ticker.TickerView;
import com.ybsdk.feature.main.internal.screens.products.views.TsarButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerTextView;
import java.util.Iterator;
import java.util.List;
import ru.rt.ebs.cryptosdk.presentation.customView.TimerIndicatorView;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.stories.presentation.story.StoryContentView;
import ru.yandex.taxi.summary.solid.d;
import ru.yandex.taxi.widget.SingleShimmeringPaint;

/* loaded from: classes6.dex */
public final /* synthetic */ class mxp0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mxp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DrawerArrowDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ((FadeThroughDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((ImageButton) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                g gVar = (g) ((pgk0) obj).b;
                gVar.k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gVar.s.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((ServiceMainInfoItemView) obj).setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    TextView serviceName = ((lwq0) it.next()).getServiceName();
                    if (serviceName != null) {
                        serviceName.setTextColor(intValue);
                    }
                }
                break;
            case 6:
                ((ShareContactCircleButton) obj).updateProgress(valueAnimator);
                break;
            case 7:
                ((ShareNotificationView) obj).updateProgress(valueAnimator);
                break;
            case 8:
                ShimmerDrawable.updateListener$lambda$0((ShimmerDrawable) obj, valueAnimator);
                break;
            case 9:
                ((com.yandex.payment.sdk.transportcards.ui.ShimmerDrawable) obj).invalidateSelf();
                break;
            case 10:
                ((com.yandex.payment.sdk.flex.impl.extensions.shimmer.ShimmerDrawable) obj).invalidateSelf();
                break;
            case 11:
                ((com.ybsdk.widgets.common.shimmer.ShimmerDrawable) obj).invalidateSelf();
                break;
            case 12:
                ((ShimmerDrawableImpl) obj).invalidateSelf();
                break;
            case 13:
                ((ShimmerTextView) obj).invalidate();
                break;
            case 14:
                SingleShimmeringPaint.enableShimmering$lambda$0((SingleShimmeringPaint) obj, valueAnimator);
                break;
            case 15:
                SlotItemViewComponent.getChevronAnimator$lambda$2((SlotItemViewComponent) obj, valueAnimator);
                break;
            case 16:
                d dVar = (d) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.m.b.setTranslationY(floatValue);
                dVar.f.setTranslationY(floatValue);
                break;
            case 17:
                StoryContentView.translateContent$lambda$0((StoryContentView) obj, valueAnimator);
                break;
            case 18:
                ((SwitchComponent) obj).lambda$new$0(valueAnimator);
                break;
            case 19:
                ((x0) obj).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                TaxiAnimationLayout.createRotationAnimator$lambda$10$lambda$7((ImageView[]) obj, valueAnimator);
                break;
            case 21:
                TickerView._init_$lambda$0((TickerView) obj, valueAnimator);
                break;
            case 22:
                TimerIndicatorView.setTimerProgress$lambda$3$lambda$2((TimerIndicatorView) obj, valueAnimator);
                break;
            case 23:
                ((yx01) obj).f(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                TsarButtonView.startAppearingAnimation$lambda$5$lambda$3((TsarButtonView) obj, valueAnimator);
                break;
            case 25:
                wls wlsVar = (wls) obj;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    wlsVar.invoke(animatedValue, Float.valueOf(valueAnimator.getAnimatedFraction()));
                    break;
                }
                break;
            case 26:
                LockOverlayView lockOverlayView = ((a431) obj).Q;
                if (lockOverlayView == null) {
                    lockOverlayView = null;
                }
                lockOverlayView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 27:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ((ku31) obj).a;
                view.setScaleX(floatValue2);
                view.setScaleY(floatValue2);
                view.setPivotY(view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.invalidate();
                break;
            case 28:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = ((lu31) obj).a;
                view2.setScaleX(floatValue3);
                view2.setScaleY(floatValue3);
                view2.setPivotY(view2.getHeight());
                view2.setPivotX(view2.getWidth() / 2.0f);
                view2.invalidate();
                break;
            default:
                w4e0 w4e0Var = ((c) obj).e;
                if (w4e0Var != null) {
                    w4e0Var.t(valueAnimator.getAnimatedFraction() * (w4e0Var.l + w4e0Var.m));
                    break;
                }
                break;
        }
    }
}
