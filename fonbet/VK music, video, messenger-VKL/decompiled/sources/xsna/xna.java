package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: PodcastSliderCellVh.kt */
/* loaded from: classes16.dex */
public final class xna implements VkCell.d {
    public final ThumbsImageView a;

    public xna(Context context) {
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.image_thumb);
        thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
        thumbsImageView.setRadiusCorner(iah0.b(10.0f));
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_podcast_outline_28);
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        thumbsImageView.setBackground(dhr0.t.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_tint));
        this.a = thumbsImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if ((fVar instanceof zna ? (zna) fVar : null) != null) {
            this.a.setThumbs(((zna) fVar).a);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
