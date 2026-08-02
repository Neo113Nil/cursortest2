package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VoipShareLinkPagerTabView.kt */
/* loaded from: classes7.dex */
public final class u1x0 extends LinearLayout {
    public final TextView b;

    public u1x0(Context context) {
        super(context, null, 0);
        f4m.r(iah0.a(6), this);
        TextView textView = new TextView(context);
        addView(textView);
        textView.setTextAppearance(R.style.VkUiTypography_Headline1);
        abg0 abg0Var = dhr0.t;
        textView.setBackground(abg0Var.a(R.drawable.voip_bg_corner10));
        textView.setForeground(abg0Var.a(R.drawable.voip_bg_corner10_stroke05));
        float f = 8;
        float f2 = 4;
        textView.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        this.b = textView;
    }

    public final void setIsSelected(boolean z) {
        ColorStateList r;
        ColorStateList r2;
        int i;
        if (z) {
            dhr0 dhr0Var = dhr0.a;
            if (dhr0Var.c(getContext())) {
                Context context = getContext();
                dhr0Var.getClass();
                r = ColorStateList.valueOf(dhr0.f.a(R.attr.vk_ui_background_secondary, context));
            } else {
                Context context2 = getContext();
                dhr0Var.getClass();
                r = ColorStateList.valueOf(dhr0.f.a(R.attr.vk_ui_background_contrast_themed, context2));
            }
            if (dhr0Var.c(getContext())) {
                Context context3 = getContext();
                dhr0Var.getClass();
                r2 = ColorStateList.valueOf(dhr0.f.a(R.attr.vk_ui_separator_primary, context3));
            } else {
                Context context4 = getContext();
                dhr0Var.getClass();
                r2 = ColorStateList.valueOf(dhr0.f.a(R.attr.vk_ui_transparent, context4));
            }
            i = R.attr.vk_ui_text_accent_themed;
        } else {
            r = dhr0.r(R.attr.vk_ui_transparent);
            r2 = dhr0.r(R.attr.vk_ui_transparent);
            i = R.attr.vk_ui_text_secondary;
        }
        dhr0 dhr0Var2 = dhr0.a;
        TextView textView = this.b;
        Context context5 = textView.getContext();
        dhr0Var2.getClass();
        textView.setTextColor(dhr0.f.a(i, context5));
        textView.setBackgroundTintList(r);
        textView.setForegroundTintList(r2);
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
