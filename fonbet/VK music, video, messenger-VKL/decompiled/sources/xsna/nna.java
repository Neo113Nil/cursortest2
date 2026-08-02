package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.r5b0;

/* compiled from: CellMusicTrackLeftViewControllerFactory.kt */
/* loaded from: classes3.dex */
public final class nna implements VkCell.d {
    public final izs<MusicTrack, s3q0> a;
    public final ThumbsImageView b;
    public final ImageView c;
    public final FrameLayout d;

    /* JADX WARN: Multi-variable type inference failed */
    public nna(Context context, izs<? super MusicTrack, s3q0> izsVar) {
        this.a = izsVar;
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.audio_image);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        thumbsImageView.setLayoutParams(layoutParams);
        bwt0.m0(e3m.a(R.dimen.music_track_image, context), e3m.a(R.dimen.music_track_image, context), thumbsImageView);
        thumbsImageView.setBackgroundImageAttr(R.attr.vk_ui_image_placeholder);
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_song_outline_28);
        thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
        thumbsImageView.setRadiusCorner(iah0.b(10.0f));
        this.b = thumbsImageView;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.audio_playing_indicator);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        bwt0.m0(e3m.a(R.dimen.music_track_image, context), e3m.a(R.dimen.music_track_image, context), imageView);
        imageView.setBackground(dhr0.t.a(R.drawable.music_dark_round_rect_10dp));
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
        this.c = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bwt0.b0(17, frameLayout);
        frameLayout.addView(thumbsImageView);
        frameLayout.addView(imageView);
        this.d = frameLayout;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        pna pnaVar = fVar instanceof pna ? (pna) fVar : null;
        if (pnaVar != null) {
            MusicTrack musicTrack = pnaVar.a;
            ThumbsImageView thumbsImageView = this.b;
            thumbsImageView.setContentDescription(thumbsImageView.getContext().getString(musicTrack.Bb() == 1 ? R.string.music_talkback_track_cover_one_author : R.string.music_talkback_track_cover_many_authors, musicTrack.d, musicTrack.h));
            thumbsImageView.setThumb(musicTrack.Jb());
            thumbsImageView.setOnClickListener(new mna(0, this, pnaVar));
            jg8 jg8Var = pnaVar.c;
            if (jg8Var != null) {
                boolean booleanValue = ((Boolean) ((wzs) jg8Var.b).invoke(Integer.valueOf(pnaVar.b), musicTrack)).booleanValue();
                ImageView imageView = this.c;
                if (booleanValue) {
                    imageView.setVisibility(0);
                    imageView.setActivated(((u2b0) jg8Var.c).h());
                } else {
                    imageView.setVisibility(8);
                    imageView.setActivated(false);
                }
            }
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.d;
    }
}
