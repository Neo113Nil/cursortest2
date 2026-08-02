package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Pair;

/* compiled from: LiveDescription.kt */
/* loaded from: classes16.dex */
public final class bjz implements vbp0 {
    public final LinearLayout a;

    public bjz(Context context, UIBlockTopshelf.TopshelfItem topshelfItem) {
        UIBlockTopshelf.a aVar = topshelfItem.d;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.topshelf_live_description_block);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
        VideoFile videoFile = topshelfItem.c;
        if (videoFile != null) {
            Pair pair = (!videoFile.v() || videoFile.X2()) ? new Pair(null, null) : videoFile.x0() ? new Pair(new VkContentBadge.Appearance.a(new z7g(R.color.vk_gray_40), new z7g(R.color.vk_red_nice), null, 12), linearLayout.getContext().getString(R.string.topshelf_badge_live)) : videoFile.Na() > 0 ? new Pair(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_contrast), new x7g(R.attr.vk_ui_icon_secondary), null, 12), pvo0.h((int) videoFile.Na(), StringUtils.COMMA, false, true, false, false, true, true, false)) : new Pair(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_contrast), new x7g(R.attr.vk_ui_icon_secondary), null, 12), linearLayout.getContext().getString(R.string.video_live_upcoming));
            VkContentBadge.Appearance.a aVar2 = (VkContentBadge.Appearance.a) pair.d();
            String str = (String) pair.g();
            VkContentBadge vkContentBadge = new VkContentBadge(linearLayout.getContext(), null, 6);
            vkContentBadge.setSize(VkContentBadge.Size.Medium);
            if (aVar2 != null) {
                vkContentBadge.setAppearance(aVar2);
            }
            if (str != null) {
                vkContentBadge.setText(str);
            }
            awt0.v(vkContentBadge, (str == null || aVar2 == null) ? false : true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.setMarginEnd(cn70.b(12));
            vkContentBadge.setLayoutParams(layoutParams);
            linearLayout.addView(vkContentBadge);
            VkText vkText = new VkText(linearLayout.getContext(), null, 6, 0);
            vkText.setTextAppearance(vkText.getContext(), R.style.VkUiTypography_FootnoteMedium);
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_tertiary, vkText.getContext()));
            vkText.setMaxLines(1);
            vkText.setEllipsize(TextUtils.TruncateAt.END);
            String g = aVar.c.g();
            vkText.setText(g == null ? aVar.c.d() : g);
            linearLayout.addView(vkText);
        }
        this.a = linearLayout;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.a;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
