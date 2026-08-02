package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;
import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.nov;

/* compiled from: StoryMusicStickerRedesign.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class o7m0 extends nxt0 implements sov {
    public static final int i = iah0.a(24);
    public final MusicStickerStyleSwitchingView f;
    public StoryMusicInfo g;
    public MusicStickerStyle h;

    public o7m0(Context context, StoryMusicInfo storyMusicInfo, MusicStickerStyle musicStickerStyle) {
        super(context);
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = new MusicStickerStyleSwitchingView(context, null, 6);
        this.f = musicStickerStyleSwitchingView;
        this.g = storyMusicInfo;
        this.h = musicStickerStyleSwitchingView.getCurrentStyle();
        setInfo(storyMusicInfo);
        setStyle(musicStickerStyle);
        addView(musicStickerStyleSwitchingView);
        o();
    }

    private final int getMaxHeight() {
        return iah0.f().heightPixels;
    }

    private final int getMaxWidth() {
        return iah0.z(getContext()) - (i * 2);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        l0u0 l0u0Var = new l0u0(kd7.i(this, null), getMeasuredWidth() * 2, WebStickerType.MUSIC, "");
        l0u0Var.q = o7m0.class;
        l0u0Var.t = getInfo();
        l0u0Var.r = this;
        l0u0Var.s = new cm(27, this, l0u0Var);
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new o7m0(getContext(), getInfo(), getStyle()));
    }

    @Override // xsna.sov
    public final void c(StoryMusicInfo storyMusicInfo) {
        setInfo(storyMusicInfo);
    }

    @Override // xsna.h7m0
    public StoryMusicInfo getInfo() {
        return this.g;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.f.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.f.getMeasuredWidth();
    }

    public final MusicStickerStyle getStyle() {
        return this.f.getCurrentStyle();
    }

    public final void o() {
        this.f.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxHeight()), Integer.MIN_VALUE));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.f.layout(i2, i3, i4, i5);
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        o();
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.f;
        setMeasuredDimension(musicStickerStyleSwitchingView.getMeasuredWidth(), musicStickerStyleSwitchingView.getMeasuredHeight());
    }

    @Override // xsna.h7m0
    public void setInfo(StoryMusicInfo storyMusicInfo) {
        this.g = storyMusicInfo;
        this.f.setCurrentInfo(getInfo());
    }

    public final void setStyle(MusicStickerStyle musicStickerStyle) {
        MusicStickerStyle musicStickerStyle2 = this.h;
        this.h = musicStickerStyle;
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.f;
        musicStickerStyleSwitchingView.setCurrentStyle(musicStickerStyle);
        bwt0.p0(musicStickerStyleSwitchingView, musicStickerStyle.j());
        setStickerVisible(musicStickerStyle.j());
        if (musicStickerStyle2 != musicStickerStyle) {
            float originalWidth = getOriginalWidth();
            float originalHeight = getOriginalHeight();
            if (originalWidth != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && originalHeight != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                o();
                nov.a.i(this, (originalWidth - getOriginalWidth()) / 2.0f, (originalHeight - getOriginalHeight()) / 2.0f);
            }
        }
        setContentDescription(pdq.b(getContext(), getInfo(), musicStickerStyleSwitchingView.getCurrentStyle()));
    }
}
