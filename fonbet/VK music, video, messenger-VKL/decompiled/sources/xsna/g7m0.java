package xsna;

import android.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import xsna.nov;

/* compiled from: StoryMusicSticker.kt */
/* loaded from: classes6.dex */
public final class g7m0 extends kr9 implements u570 {
    public final StoryMusicInfo h;

    public g7m0(MusicTrack musicTrack) {
        this.h = new StoryMusicInfo(musicTrack, "", 0, 0, 0, null, false, 0, false, false, null, false, false, 8160, null);
    }

    @Override // xsna.kr9, xsna.nov
    public final boolean A0(float f, float f2) {
        return false;
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        g7m0 g7m0Var = new g7m0(this.h.b);
        nov.a.b(this, g7m0Var);
        return g7m0Var;
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
    }
}
