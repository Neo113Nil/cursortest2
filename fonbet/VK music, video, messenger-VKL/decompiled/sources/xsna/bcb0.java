package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: PlaylistCellViewHolder.kt */
/* loaded from: classes3.dex */
public final class bcb0 implements VkCell.d {
    public final ThumbsImageView a;

    public bcb0(Context context) {
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.playlist_image);
        thumbsImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bwt0.m0(e3m.a(R.dimen.music_playlist_image, context), e3m.a(R.dimen.music_playlist_image, context), thumbsImageView);
        thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
        thumbsImageView.setRadiusCorner(iah0.b(6.0f));
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_playlist_36);
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        thumbsImageView.setBackgroundImageAttr(R.attr.vk_ui_image_placeholder);
        this.a = thumbsImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        dcb0 dcb0Var = fVar instanceof dcb0 ? (dcb0) fVar : null;
        if (dcb0Var != null) {
            Thumb thumb = dcb0Var.a;
            ThumbsImageView thumbsImageView = this.a;
            if (thumb != null) {
                thumbsImageView.setThumb(thumb);
            } else {
                thumbsImageView.setThumbs(dcb0Var.b);
            }
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
