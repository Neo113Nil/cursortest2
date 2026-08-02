package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: KidsText.kt */
/* loaded from: classes16.dex */
public final class wiy implements vbp0 {
    public final LinearLayout a;

    public wiy(Context context, UIBlockTopshelf.TopshelfKids topshelfKids, boolean z) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setTextAppearance(context, R.style.VkUiTypography_Title1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vkText.setEllipsize(truncateAt);
        vkText.setMaxLines(2);
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = e3m.a(R.dimen.video_topshelf_content_margin_between, context);
        vkText.setLayoutParams(layoutParams);
        UIBlockTopshelf.a aVar = topshelfKids.d;
        vkText.setText(aVar.c.g());
        a.addView(vkText);
        VkText vkText2 = new VkText(context, null, 6, 0);
        vkText2.setTextAppearance(context, R.style.VkUiTypography_Subhead);
        vkText2.setEllipsize(truncateAt);
        vkText2.setMaxLines(3);
        vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = e3m.a(R.dimen.video_topshelf_content_margin_between, context);
        vkText2.setLayoutParams(layoutParams2);
        vkText2.setText(aVar.c.d());
        a.addView(vkText2);
        a.setLayoutParams(new ConstraintLayout.b(z ? e3m.a(R.dimen.video_topshelf_tablet_texts_width, context) : -1, -2));
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
