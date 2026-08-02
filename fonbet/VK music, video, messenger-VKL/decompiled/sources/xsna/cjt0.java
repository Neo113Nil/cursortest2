package xsna;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.components.text.VkText;

/* compiled from: VideoSwipeButton.kt */
/* loaded from: classes2.dex */
public final class cjt0 extends LinearLayout {
    public final AppCompatImageView b;
    public final VkText c;
    public boolean d;

    public cjt0(Context context) {
        super(context, null, 0);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        setGravity(17);
        setForeground(e3m.e(R.attr.selectableItemBackgroundBorderless, context));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.b = appCompatImageView;
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setTextAppearance(com.vkontakte.android.R.style.VkUiTypography_Caption2);
        vkText.setTextColor(dhr0.Y(com.vkontakte.android.R.attr.vk_ui_text_contrast, context));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = iah0.a(4);
        vkText.setLayoutParams(marginLayoutParams);
        vkText.setVisibility(8);
        this.c = vkText;
        addView(appCompatImageView);
        addView(vkText);
    }

    public final boolean getAnimateClicks() {
        return this.d;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.d && isEnabled() && getVisibility() == 0) {
                animate().scaleX(1.0f).scaleY(1.0f).start();
            }
        } else if (isEnabled() && getVisibility() == 0) {
            if (this.d) {
                animate().scaleX(0.98f).scaleY(0.98f).start();
            }
            performHapticFeedback(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAnimateClicks(boolean z) {
        this.d = z;
    }

    public final void setIconTint(int i) {
        bwt0.o0(this.b, i);
    }

    public final void setIconTintRes(int i) {
        bwt0.o0(this.b, e3m.f(i, getContext()));
    }

    public final void setImageRes(int i) {
        this.b.setImageResource(i);
    }

    public final void setImageSize(int i) {
        AppCompatImageView appCompatImageView = this.b;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = i;
        layoutParams2.height = i;
        appCompatImageView.setLayoutParams(layoutParams2);
    }

    public final void setLabel(int i) {
        VkText vkText = this.c;
        if (i == 0) {
            vkText.setVisibility(8);
        } else {
            vkText.setVisibility(0);
            vkText.setText(i);
        }
    }
}
