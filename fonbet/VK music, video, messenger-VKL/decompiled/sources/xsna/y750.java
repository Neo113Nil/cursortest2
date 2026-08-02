package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;
import xsna.f5h0;

/* compiled from: MusicStickerAlbumView.kt */
/* loaded from: classes6.dex */
public final class y750 extends LinearLayout implements f850 {
    public static final int h = iah0.a(172);
    public static final int i = iah0.a(76);
    public static final float j = iah0.b(16.0f);
    public final y750 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final x750 g;

    public y750(Context context) {
        super(context, null, 0);
        this.b = this;
        f5x f5xVar = new f5x(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, f5xVar);
        this.d = msy.a(lazyThreadSafetyMode, new ag20(this, 8));
        this.e = msy.a(lazyThreadSafetyMode, new xis(this, 24));
        this.f = msy.a(lazyThreadSafetyMode, new m1y(this, 13));
        this.g = new x750(this, 0);
        View.inflate(context, R.layout.sticker_music_album, this);
    }

    public static s3q0 a(y750 y750Var) {
        bwt0.p0(y750Var.getProgressBar(), true);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKImageView getIvTrack() {
        return (VKImageView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getProgressBar() {
        return (View) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTvArtistName() {
        return (TextView) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTvTrackName() {
        return (TextView) this.d.getValue();
    }

    private final void setMusic(StoryMusicInfo storyMusicInfo) {
        MusicTrack musicTrack = storyMusicInfo.b;
        String Kb = musicTrack.Kb(h);
        if (Kb != null) {
            getIvTrack().setBackgroundDrawable(null);
            getIvTrack().getHierarchy().p(null, 1);
            getIvTrack().load(Kb);
            postDelayed(new pu5(this.g, 10), 800L);
        } else {
            VKImageView ivTrack = getIvTrack();
            Context context = getContext();
            e3m.a aVar = e3m.a;
            ivTrack.setBackgroundDrawable(m33.a(R.drawable.bg_music_sticker_album, context));
            Drawable e = enj.e(R.drawable.vk_icon_song_outline_24, R.attr.vk_ui_icon_tertiary, getContext());
            int i2 = i;
            getIvTrack().Q0(new y9g0(e, i2, i2), f5h0.e.a);
            getIvTrack().load(null);
        }
        getTvTrackName().setText(musicTrack.d);
        getTvArtistName().setText(musicTrack.h);
        setContentDescription(pdq.b(getContext(), storyMusicInfo, MusicStickerStyle.Album));
    }

    @Override // xsna.f850
    public final void c(StoryMusicInfo storyMusicInfo) {
        removeCallbacks(new sb(this.g, 6));
        bwt0.p0(getProgressBar(), false);
        if (storyMusicInfo != null) {
            setMusic(storyMusicInfo);
            return;
        }
        getIvTrack().setBackgroundDrawable(null);
        getIvTrack().getHierarchy().p(null, 1);
        getIvTrack().load(null);
        getTvTrackName().setText("");
        getTvArtistName().setText("");
        setContentDescription(null);
    }

    @Override // xsna.f850
    public y750 getView() {
        return this.b;
    }
}
