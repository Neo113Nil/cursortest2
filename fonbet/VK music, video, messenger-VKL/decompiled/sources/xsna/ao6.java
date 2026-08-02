package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vkontakte.android.R;

/* compiled from: BaseStickerButtonView.kt */
/* loaded from: classes6.dex */
public abstract class ao6 extends FrameLayout {
    public ao6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(TextView textView) {
        textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_contrast, textView.getContext()));
        textView.setTextAppearance(R.style.VkUiTypography_DisplayTitle4Medium_Unscaled);
    }

    public abstract int getButtonCornerRadius();

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() || motionEvent.getAction() != 1) {
            if (isEnabled()) {
                return super.onTouchEvent(motionEvent);
            }
            return true;
        }
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        rect.offset(0, iah0.a(20));
        VkTooltip.a aVar = new VkTooltip.a(getContext());
        aVar.c = getContext().getString(R.string.sticker_button_limit_tooltip);
        aVar.f = VkTooltip.TooltipGravity.TOP;
        aVar.e = VkTooltip.Appearance.Neutral;
        aVar.o = 2000L;
        aVar.a(rect);
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.52f);
    }

    public ao6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setElevation(iah0.a(4));
        float f = 10;
        float f2 = 8;
        setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getButtonCornerRadius());
        int Y = dhr0.Y(R.attr.vk_ui_image_placeholder_alpha, getContext());
        int Y2 = dhr0.Y(R.attr.vk_ui_image_border_alpha, getContext());
        gradientDrawable.setColor(Y);
        gradientDrawable.setStroke(iah0.a(1), Y2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(getButtonCornerRadius());
        gradientDrawable2.setColor(-16777216);
        ColorStateList valueOf = ColorStateList.valueOf(dhr0.Y(R.attr.vk_ui_separator_primary_alpha, getContext()));
        setBackground(gradientDrawable);
        setForeground(new RippleDrawable(valueOf, null, gradientDrawable2));
        setClickable(true);
        setFocusable(true);
    }
}
