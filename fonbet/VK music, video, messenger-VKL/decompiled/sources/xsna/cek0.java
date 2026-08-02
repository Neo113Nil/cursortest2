package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: SocialNetView.kt */
@ozl
/* loaded from: classes17.dex */
public final class cek0 extends FrameLayout {
    public cek0(Context context, boolean z) {
        super(context);
        bwt0.Z(R.attr.vk_ui_image_placeholder, this);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        float f = 32;
        float f2 = 0;
        float f3 = 8;
        appCompatImageView.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f3));
        linearLayout.setGravity(17);
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.l0(appCompatImageView, R.drawable.vk_icon_globe_cross_outline_56, R.attr.vk_ui_icon_tertiary);
        linearLayout.addView(appCompatImageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setPadding(iah0.a(f), iah0.a(f3), iah0.a(f), iah0.a(f2));
        dhr0Var.m0(appCompatTextView, R.attr.vk_ui_text_primary);
        appCompatTextView.setGravity(17);
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(20.0f), 4);
        appCompatTextView.setText(context.getString(R.string.social_net_error_title));
        bwt0.p0(appCompatTextView, z);
        linearLayout.addView(appCompatTextView, new LinearLayout.LayoutParams(-1, -2));
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        float f4 = 16;
        appCompatTextView2.setPadding(iah0.a(f4), iah0.a(f3), iah0.a(f4), iah0.a(f2));
        dhr0Var.m0(appCompatTextView2, R.attr.vk_ui_text_secondary);
        appCompatTextView2.setGravity(17);
        com.vk.typography.b.k(appCompatTextView2, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
        appCompatTextView2.setText(context.getString(R.string.social_net_error_msg));
        bwt0.p0(appCompatTextView2, z);
        linearLayout.addView(appCompatTextView2, new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
