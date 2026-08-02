package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: ImMusicTrackActionsFactoryProvider.kt */
/* loaded from: classes3.dex */
public final class v9w implements ea50 {
    public final u2b0 a;
    public final fy2 b;

    public v9w(u2b0 u2b0Var, fy2 fy2Var) {
        this.a = u2b0Var;
        this.b = fy2Var;
    }

    @Override // xsna.ea50
    public final gc40 a(MusicTrack musicTrack, ia50 ia50Var) {
        if (musicTrack.Vb()) {
            return new mkl(musicTrack, ia50Var, this.a, this.b);
        }
        throw new IllegalStateException("No actions factory for current state!");
    }
}
