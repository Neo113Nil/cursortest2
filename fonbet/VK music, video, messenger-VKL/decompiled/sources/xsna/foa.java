package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.r5b0;

/* compiled from: RadioStationCellVh.kt */
/* loaded from: classes16.dex */
public final class foa implements VkCell.d {
    public final ThumbsImageView a;
    public final ImageView b;
    public final FrameLayout c;

    public foa(Context context) {
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.radio_logo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        thumbsImageView.setLayoutParams(layoutParams);
        bwt0.m0(e3m.a(R.dimen.music_playlist_image, context), e3m.a(R.dimen.music_playlist_image, context), thumbsImageView);
        thumbsImageView.setRadiusCorner(iah0.b(10.0f));
        thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
        abg0 abg0Var = dhr0.t;
        thumbsImageView.setBorderLineColor(abg0Var.c(R.attr.vk_ui_separator_primary_alpha));
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_radiowaves_around_outline_28);
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_icon_accent);
        thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_background_modal));
        this.a = thumbsImageView;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        bwt0.m0(e3m.a(R.dimen.music_playlist_image, context), e3m.a(R.dimen.music_playlist_image, context), imageView);
        imageView.setBackground(abg0Var.a(R.drawable.music_dark_round_rect_10dp));
        float b = iah0.b(10.0f);
        r5b0.b bVar = new r5b0.b(context);
        bVar.a(R.integer.music_playing_drawable_rect_count);
        bVar.g(R.dimen.music_playing_drawable_rect_width);
        bVar.d(R.dimen.music_playing_drawable_rect_corners);
        bVar.e(R.dimen.music_playing_drawable_rect_height);
        bVar.f(R.dimen.music_playing_drawable_rect_min_height);
        bVar.c(R.color.music_playing_drawable_rect_white);
        bVar.b(R.dimen.music_playing_drawable_gap);
        bVar.j = new float[]{b, iah0.b(16.0f), iah0.b(18.0f), b};
        imageView.setImageDrawable(new r5b0(bVar));
        imageView.setContentDescription(context.getString(R.string.music_talkback_album_cover));
        this.b = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bwt0.b0(17, frameLayout);
        frameLayout.addView(thumbsImageView);
        frameLayout.addView(imageView);
        this.c = frameLayout;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        MusicTrack b;
        MusicTrack b2;
        boa boaVar = fVar instanceof boa ? (boa) fVar : null;
        if (boaVar != null) {
            u2b0 u2b0Var = boaVar.b;
            this.a.setThumb(boaVar.a);
            int i = u2b0Var.m0() != PlayState.STOPPED && (b = u2b0Var.b()) != null && b.Wb() && (b2 = u2b0Var.b()) != null && b2.b == boaVar.c.y.b ? 0 : 8;
            ImageView imageView = this.b;
            imageView.setVisibility(i);
            imageView.setActivated(u2b0Var.m0() == PlayState.PLAYING);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.c;
    }
}
