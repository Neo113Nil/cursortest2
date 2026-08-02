package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.links.LinkedTextView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: DonutPlaceholderView.kt */
/* loaded from: classes4.dex */
public final class f1o extends LinearLayout implements too0 {
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final LinkedTextView d;
    public final VkSimpleButton e;
    public Drawable f;
    public int g;
    public int h;
    public float i;
    public int j;
    public int k;
    public int l;

    public f1o(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Title2Medium));
        this.c = appCompatTextView;
        LinkedTextView linkedTextView = new LinkedTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Headline1Normal), null, 6, 0);
        this.d = linkedTextView;
        VkSimpleButton vkSimpleButton = new VkSimpleButton(context, null, 6);
        vkSimpleButton.setMode(VkButton.Mode.Primary);
        vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
        this.e = vkSimpleButton;
        e3m.a aVar = e3m.a;
        this.f = m33.a(R.drawable.vk_icon_donut_color_56, context);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.episode_placeholder_icon_size);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.episode_placeholder_title_margin_top);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.episode_placeholder_title_text_size);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.episode_placeholder_subtitle_margin_top);
        this.k = getResources().getDimensionPixelSize(R.dimen.episode_placeholder_button_margin_top);
        this.l = getResources().getDimensionPixelSize(R.dimen.episode_placeholder_padding_horizontal);
        appCompatImageView.setImageDrawable(this.f);
        int i = this.g;
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.h, 0, 0);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_muted);
        appCompatTextView.setTextSize(0, this.i);
        appCompatTextView.setLineSpacing(getResources().getDimensionPixelSize(R.dimen.episode_placeholder_title_line_spacing), 1.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, this.j, 0, 0);
        linkedTextView.setLayoutParams(layoutParams2);
        linkedTextView.setGravity(17);
        jno0.c(linkedTextView, R.attr.vk_ui_text_secondary);
        linkedTextView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.episode_placeholder_subtitle_text_size));
        linkedTextView.setLetterSpacing(0.01f);
        linkedTextView.setClickable(true);
        linkedTextView.setFocusable(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, this.k, 0, 0);
        vkSimpleButton.setLayoutParams(layoutParams3);
        setOrientation(1);
        setGravity(17);
        int i2 = this.l;
        setPadding(i2, 0, i2, 0);
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(linkedTextView);
        addView(vkSimpleButton);
    }

    @Override // xsna.too0
    public final void Ng() {
        jno0.c(this.c, R.attr.vk_ui_text_muted);
        jno0.c(this.d, R.attr.vk_ui_text_secondary);
        this.e.a();
    }

    public final void setButtonMarginTop(int i) {
        this.k = i;
        f4m.t(i, this.e);
    }

    public final void setHorizontalPadding(int i) {
        this.l = i;
        f4m.x(i, this);
        f4m.w(i, this);
    }

    public final void setIconSize(int i) {
        this.g = i;
        bwt0.m0(i, i, this.b);
    }

    public final void setSubtitleMarginTop(int i) {
        this.j = i;
        f4m.t(i, this.d);
    }

    public final void setTitleMarginTop(int i) {
        this.h = i;
        f4m.t(i, this.c);
    }

    public final void setTitleTextSize(float f) {
        this.i = f;
        this.c.setTextSize(0, f);
    }

    public final void setTitleVisibility(boolean z) {
        bwt0.p0(this.c, z);
    }
}
