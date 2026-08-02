package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: NewsInfoText.kt */
/* loaded from: classes16.dex */
public final class dc60 implements vbp0 {
    public final LinearLayout a;

    public dc60(Context context, UIBlockTopshelf.TopshelfItem topshelfItem) {
        String str;
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        UIBlockTopshelf.a aVar = topshelfItem.d;
        String g = aVar.c.g();
        if (g != null) {
            VkText vkText = new VkText(a.getContext(), null, 6, 0);
            vkText.setTextAppearance(vkText.getContext(), R.style.VkUiTypography_Title1);
            vkText.setEllipsize(TextUtils.TruncateAt.END);
            vkText.setMaxLines(2);
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, vkText.getContext()));
            vkText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            vkText.setText(g);
            a.addView(vkText);
        }
        String d = aVar.c.d();
        if (d != null) {
            VkText vkText2 = new VkText(a.getContext(), null, 6, 0);
            vkText2.setTextAppearance(vkText2.getContext(), R.style.VkUiTypography_Subhead);
            vkText2.setEllipsize(TextUtils.TruncateAt.END);
            vkText2.setMaxLines(3);
            vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, vkText2.getContext()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = e3m.a(R.dimen.video_topshelf_content_margin_between, vkText2.getContext());
            vkText2.setLayoutParams(layoutParams);
            vkText2.setText(d);
            a.addView(vkText2);
        }
        List<String> g2 = aVar.d.g();
        if (g2 != null && (str = (String) j5g.a0(g2)) != null) {
            VkText vkText3 = new VkText(a.getContext(), null, 6, 0);
            vkText3.setTextAppearance(vkText3.getContext(), R.style.VkUiTypography_Caption1Medium);
            vkText3.setMaxLines(1);
            vkText3.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, vkText3.getContext()));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = e3m.a(R.dimen.video_topshelf_content_margin_between, vkText3.getContext());
            vkText3.setLayoutParams(layoutParams2);
            vkText3.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(e3m.f(R.attr.vk_ui_overlay_primary, vkText3.getContext()));
            gradientDrawable.setCornerRadius(cn70.c(6));
            vkText3.setBackground(gradientDrawable);
            vkText3.setPadding(cn70.b(6), cn70.b(3), cn70.b(6), cn70.b(3));
            vkText3.setText(str);
            a.addView(vkText3);
        }
        a.setLayoutParams(new ConstraintLayout.b(-1, -2));
        this.a = a;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.a;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
