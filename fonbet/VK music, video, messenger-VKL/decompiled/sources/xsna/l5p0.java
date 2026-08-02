package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;

/* compiled from: TooltipExtraView.kt */
/* loaded from: classes5.dex */
public final class l5p0 extends LinearLayout {
    public final VkButton b;
    public final VkButton c;

    public l5p0(NavigationDelegateActivity navigationDelegateActivity) {
        super(navigationDelegateActivity, null, 0);
        setOrientation(1);
        setGravity(1);
        float f = 2;
        float f2 = 8;
        setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        setBackgroundColor(e3m.f(R.attr.vk_ui_background_modal_inverse, navigationDelegateActivity));
        AppCompatTextView appCompatTextView = new AppCompatTextView(navigationDelegateActivity);
        appCompatTextView.setTextAppearance(R.style.VkUiTypography_SubheadMedium);
        appCompatTextView.setText(navigationDelegateActivity.getString(R.string.vkim_reset_counters_tooltip_title));
        appCompatTextView.setTextColor(e3m.f(R.attr.vk_ui_text_contrast_themed, navigationDelegateActivity));
        appCompatTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        appCompatTextView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(navigationDelegateActivity);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        float f3 = 12;
        layoutParams2.topMargin = iah0.a(f3);
        layoutParams2.gravity = 1;
        linearLayout.setLayoutParams(layoutParams2);
        VkButton vkButton = new VkButton(getContext(), null, 6, 0);
        VkButton.Size size = VkButton.Size.Small;
        vkButton.setSize(size);
        VkButton.Appearance appearance = VkButton.Appearance.Overlay;
        vkButton.setAppearance(appearance);
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setText(vkButton.getContext().getString(R.string.vkim_reset_counters_tooltip_confirm_positive));
        vkButton.setBackgroundTint(R.attr.vk_ui_background_content);
        vkButton.setTextTint(R.attr.vk_ui_text_primary);
        this.b = vkButton;
        VkButton vkButton2 = new VkButton(getContext(), null, 6, 0);
        vkButton2.setSize(size);
        vkButton2.setAppearance(appearance);
        vkButton2.setMode(VkButton.Mode.Secondary);
        vkButton2.setText(vkButton2.getContext().getString(R.string.vkim_reset_counters_tooltip_confirm_negative));
        vkButton2.setTextTint(R.attr.vk_ui_text_contrast_themed);
        vkButton2.setBackgroundTint(ColorStateList.valueOf(n8g.l(e3m.f(R.attr.vk_ui_text_contrast_themed, vkButton2.getContext()), 26)));
        this.c = vkButton2;
        linearLayout.addView(vkButton);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(iah0.a(f3));
        s3q0 s3q0Var = s3q0.a;
        linearLayout.addView(vkButton2, layoutParams3);
        addView(appCompatTextView);
        addView(linearLayout);
    }

    public final void setOnClickListenerNegativeBtn(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setOnClickListenerPositiveBtn(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }
}
