package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MusicPlaylistCellVh.kt */
/* loaded from: classes16.dex */
public final class a150 implements VkCell.d {
    public final ThumbsImageView a;

    public a150(Context context) {
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.playlist_image);
        thumbsImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bwt0.m0(e3m.a(R.dimen.music_playlist_image, context), e3m.a(R.dimen.music_playlist_image, context), thumbsImageView);
        thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
        thumbsImageView.setRadiusCorner(iah0.b(10.0f));
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_playlist_36);
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        thumbsImageView.setBackground(dhr0.t.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_tint));
        this.a = thumbsImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        c150 c150Var = fVar instanceof c150 ? (c150) fVar : null;
        if (c150Var != null) {
            Thumb thumb = c150Var.a;
            ThumbsImageView thumbsImageView = this.a;
            if (thumb != null) {
                thumbsImageView.setThumb(thumb);
            } else {
                thumbsImageView.setThumbs(c150Var.b);
            }
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
