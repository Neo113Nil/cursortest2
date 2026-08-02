package xsna;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMode;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;

/* compiled from: MarkerSpanView.kt */
/* loaded from: classes17.dex */
public final class no00 extends AppCompatImageView {
    public static final /* synthetic */ int f = 0;
    public VkOnboarding$HighlighterMarkerType b;
    public VkOnboarding$HighlighterMode c;
    public VkOnboarding$TintColor d;
    public boolean e;

    public final void U() {
        if (this.e) {
            Rect rect = new Rect();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new y7q(1, this, rect));
            xo2.h(ofFloat, new m1i(this, 26));
            ofFloat.start();
        }
    }

    public final void V() {
        Resources resources = getContext().getResources();
        int h = this.b.h();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        Drawable drawable = resources.getDrawable(h, theme);
        if (drawable != null) {
            drawable.setTint(Integer.hashCode(getContext().getColor(j0t.b(this.d, !dhr0.M()))));
            setImageDrawable(drawable);
        }
    }

    public final VkOnboarding$TintColor getColor() {
        return this.d;
    }

    public final VkOnboarding$HighlighterMode getMode() {
        return this.c;
    }

    public final VkOnboarding$HighlighterMarkerType getType() {
        return this.b;
    }

    public final void setColor(VkOnboarding$TintColor vkOnboarding$TintColor) {
        this.d = vkOnboarding$TintColor;
        V();
    }

    public final void setMode(VkOnboarding$HighlighterMode vkOnboarding$HighlighterMode) {
        this.c = vkOnboarding$HighlighterMode;
        V();
    }

    public final void setType(VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType) {
        this.b = vkOnboarding$HighlighterMarkerType;
        V();
    }
}
