package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: PlaylistVisualContentController.kt */
/* loaded from: classes16.dex */
public final class cfb0 implements VkTile.g {
    public final MusicPlaylistVkTileVh.c a;
    public final FrameLayout b;
    public final ThumbsImageView c;
    public final VKImageView d;

    public cfb0(Context context, MusicPlaylistVkTileVh.c cVar) {
        this.a = cVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        this.b = frameLayout;
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.playlist_image);
        thumbsImageView.setBorderLineWidth(cn70.a() * 0.5f);
        thumbsImageView.setRadiusCorner(cn70.a() * 8.0f);
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_playlist_outline_56);
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        thumbsImageView.setBackgroundAttrRes(R.attr.vk_ui_image_placeholder);
        this.c = thumbsImageView;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setBackground(m33.a(R.drawable.bg_white_circle, context));
        vKImageView.setImageTintList(ColorStateList.valueOf(-16777216));
        vKImageView.setScaleType(ImageView.ScaleType.CENTER);
        vKImageView.setOnClickListener(new en9(this, 10));
        this.d = vKImageView;
        frameLayout.addView(thumbsImageView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cn70.b(36), cn70.b(36), 8388693);
        layoutParams.setMarginEnd(cn70.b(8));
        layoutParams.bottomMargin = cn70.b(8);
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(vKImageView, layoutParams);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
        dfb0 dfb0Var = hVar instanceof dfb0 ? (dfb0) hVar : null;
        if (dfb0Var == null) {
            return;
        }
        androidx.constraintlayout.widget.b a = pq.a(constraintLayout);
        FrameLayout frameLayout = this.b;
        a.p(frameLayout.getId(), frameLayout.getResources().getDimensionPixelSize(R.dimen.music_playlist_slider_image_size));
        a.n(frameLayout.getId(), frameLayout.getResources().getDimensionPixelSize(R.dimen.music_playlist_slider_image_size));
        a.b(constraintLayout);
        Thumb thumb = dfb0Var.a;
        ThumbsImageView thumbsImageView = this.c;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            thumbsImageView.setThumbs(dfb0Var.b);
        }
        int i = dfb0Var.d ? 0 : 8;
        VKImageView vKImageView = this.d;
        vKImageView.setVisibility(i);
        vKImageView.setImageResource(dfb0Var.c ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final View getView() {
        return this.b;
    }
}
