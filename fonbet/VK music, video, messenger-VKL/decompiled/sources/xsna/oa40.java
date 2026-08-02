package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: AudioBookCellVh.kt */
/* loaded from: classes16.dex */
public final class oa40 implements VkCell.d {
    public final FrameLayout a;

    public oa40(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.image_thumb);
        thumbsImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bwt0.m0(e3m.a(R.dimen.music_podcast_image, context), e3m.a(R.dimen.music_podcast_image, context), thumbsImageView);
        thumbsImageView.setRadiusCorner(iah0.b(10.0f));
        f4m.s(iah0.a(6), thumbsImageView);
        abg0 abg0Var = dhr0.t;
        thumbsImageView.setEmptyPlaceholder(new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder)));
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_tint));
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setId(R.id.free_badge);
        vkText.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(36), -2));
        f4m.t(iah0.a(8), vkText);
        f4m.s(iah0.a(2), vkText);
        vkText.setText(context.getString(R.string.audio_book_free_badge));
        vkText.setTextAppearance(R.style.VkUiTypography_Caption1Bold);
        vkText.setTextColor(context.getColor(R.color.vk_white));
        vkText.setBackgroundResource(R.drawable.audio_book_free_badge);
        vkText.setVisibility(8);
        vkText.setGravity(1);
        frameLayout.addView(thumbsImageView);
        frameLayout.addView(vkText);
        this.a = frameLayout;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        View childAt;
        qa40 qa40Var = fVar instanceof qa40 ? (qa40) fVar : null;
        if (qa40Var != null) {
            FrameLayout frameLayout = this.a;
            View childAt2 = frameLayout.getChildAt(0);
            ThumbsImageView thumbsImageView = childAt2 instanceof ThumbsImageView ? (ThumbsImageView) childAt2 : null;
            if (thumbsImageView == null || (childAt = frameLayout.getChildAt(1)) == null) {
                return;
            }
            Thumb thumb = qa40Var.a;
            if (thumb != null) {
                thumbsImageView.setThumb(thumb);
            }
            awt0.u(childAt, qa40Var.b);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
