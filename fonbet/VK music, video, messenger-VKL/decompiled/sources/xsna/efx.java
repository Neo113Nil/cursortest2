package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vkontakte.android.R;
import xsna.qhv0;

/* compiled from: InterestingStoryItemView.kt */
/* loaded from: classes6.dex */
public final class efx extends FrameLayout {
    public final VkEnhancedImageView b;
    public final VkText c;
    public final View d;

    public efx(Context context) {
        super(context);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius_paper);
        VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(context, null, 6, 0);
        vkEnhancedImageView.setFadeDuration(200);
        vkEnhancedImageView.setVkScaleType(qhv0.b.a);
        vkEnhancedImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = vkEnhancedImageView;
        VkText vkText = new VkText(context, null, 6, 0);
        int Y = dhr0.Y(R.attr.vk_ui_text_contrast, context);
        int color = context.getColor(R.color.vk_black_alpha35);
        vkText.setTextAppearance(R.style.VkUiTypography_SubheadMedium_Unscaled);
        vkText.setTextColor(Y);
        vkText.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, color);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388691;
        float f = 6;
        layoutParams.setMargins(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        vkText.setLayoutParams(layoutParams);
        this.c = vkText;
        View view = new View(context);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, n8g.l(-16777216, 180)}));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, iah0.a(80));
        layoutParams2.gravity = 80;
        view.setLayoutParams(layoutParams2);
        this.d = view;
        setOutlineProvider(new s0w0(dimensionPixelSize, 6));
        setClipToOutline(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(dimensionPixelSize);
        gradientDrawable2.setColor(-16777216);
        ColorStateList valueOf = ColorStateList.valueOf(dhr0.Y(R.attr.vk_ui_separator_primary_alpha, getContext()));
        setBackground(gradientDrawable);
        setForeground(new RippleDrawable(valueOf, null, gradientDrawable2));
        addView(vkEnhancedImageView);
        addView(view);
        addView(vkText);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = iah0.a(146);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iah0.a(100), 1073741824);
        if (getMeasuredHeight() < a) {
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(a, 1073741824));
        }
    }

    public final void setName(String str) {
        this.c.setText(str);
    }
}
