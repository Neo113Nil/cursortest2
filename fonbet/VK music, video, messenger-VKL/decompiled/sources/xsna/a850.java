package xsna;

import android.content.Context;
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

/* compiled from: MusicStickerHorizontalView.kt */
/* loaded from: classes6.dex */
public final class a850 extends LinearLayout implements f850 {
    public static final int f = iah0.a(48);
    public static final float g = iah0.b(8.0f);
    public final a850 b;
    public final Object c;
    public final Object d;
    public final Object e;

    public a850(Context context) {
        super(context, null, 0);
        this.b = this;
        vv20 vv20Var = new vv20(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, vv20Var);
        this.d = msy.a(lazyThreadSafetyMode, new vex(this, 7));
        this.e = msy.a(lazyThreadSafetyMode, new nly(this, 12));
        View.inflate(context, R.layout.sticker_music_horizontal, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKImageView getIvTrack() {
        return (VKImageView) this.c.getValue();
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
        String Kb = musicTrack.Kb(f);
        if (Kb != null) {
            getIvTrack().setBackgroundDrawable(null);
            getIvTrack().getHierarchy().p(null, 1);
            getIvTrack().load(Kb);
        } else {
            VKImageView ivTrack = getIvTrack();
            Context context = getContext();
            e3m.a aVar = e3m.a;
            ivTrack.setBackgroundDrawable(m33.a(R.drawable.bg_music_sticker_horizontal_placeholder, context));
            getIvTrack().Q0(enj.e(R.drawable.vk_icon_song_outline_24, R.attr.vk_ui_icon_tertiary, getContext()), f5h0.e.a);
            getIvTrack().load(null);
        }
        getTvTrackName().setText(musicTrack.d);
        getTvArtistName().setText(musicTrack.h);
        setContentDescription(pdq.b(getContext(), storyMusicInfo, MusicStickerStyle.Horizontal));
    }

    @Override // xsna.f850
    public final void c(StoryMusicInfo storyMusicInfo) {
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
    public a850 getView() {
        return this.b;
    }
}
