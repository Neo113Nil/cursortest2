package yads;

import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes10.dex */
public final class no0 implements bd2 {
    public final /* synthetic */ po0 a;

    public no0(po0 po0Var) {
        this.a = po0Var;
    }

    @Override // yads.bd2
    public final void a() {
        this.a.a.onPlayerError(new ExoPlaybackException(3, null, "Video load error occurred", 1001, null, -1, null, 4, null, false));
    }
}
