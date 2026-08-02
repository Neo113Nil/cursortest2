package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: VkAnimatedActionButtonView.kt */
/* loaded from: classes18.dex */
public final class q8u0 extends FrameLayout {
    public final VkText b;
    public final AnimatorSet c;
    public final GradientDrawable d;
    public final RippleDrawable e;
    public int f;
    public tlo0 g;

    public q8u0(Context context) {
        super(context, null, 0);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet.addListener(new ohk(this, 2));
        this.c = animatorSet;
        GradientDrawable a = ful0.a(0);
        a.setCornerRadius(iah0.a(8));
        a.setColor(0);
        this.d = a;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(n8g.l(-16777216, 42)), a, new ColorDrawable(-1));
        this.e = rippleDrawable;
        e3m.f(R.attr.vk_ui_text_primary, context);
        LayoutInflater.from(context).inflate(R.layout.pds_animated_action_button, (ViewGroup) this, true);
        this.b = (VkText) findViewById(R.id.pds_animated_action_button_text);
        setBackground(rippleDrawable);
        setClickable(true);
        setFocusable(true);
    }

    public final tlo0 getText() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.c;
        animatorSet.cancel();
        animatorSet.removeAllListeners();
    }

    public final void setText(tlo0 tlo0Var) {
        this.g = tlo0Var;
        boolean z = tlo0Var != null;
        VkText vkText = this.b;
        f4m.E(vkText, z);
        vkText.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }
}
