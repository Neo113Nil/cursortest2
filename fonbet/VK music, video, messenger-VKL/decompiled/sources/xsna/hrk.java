package xsna;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;

/* compiled from: D2DOnboardingController.kt */
/* loaded from: classes7.dex */
public final class hrk {
    public final D2DOnboardingView a;
    public final VkSubnavigationBar b;
    public final uus0 c;
    public final Handler d;
    public final float e;
    public ValueAnimator f;
    public final sm9 g;

    public hrk(D2DOnboardingView d2DOnboardingView, VkSubnavigationBar vkSubnavigationBar, uus0 uus0Var) {
        this.a = d2DOnboardingView;
        this.b = vkSubnavigationBar;
        this.c = uus0Var;
        d2DOnboardingView.setOnTooltipClick(new i5f(this, 13));
        this.d = new Handler(Looper.getMainLooper());
        this.e = cn70.a() * 40.0f;
        this.g = new sm9(this, 6);
    }
}
