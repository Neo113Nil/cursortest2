package xsna;

import com.vk.music.player.PlaybackActionMeta;

/* compiled from: MusicSnippetsFeature.kt */
/* loaded from: classes3.dex */
public final class r650 implements gzs<s3q0> {
    public final /* synthetic */ l650 b;

    public r650(l650 l650Var) {
        this.b = l650Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        eck0 eck0Var = this.b.h;
        PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(0, 0L, 2, null);
        if (eck0Var.c.getState().i()) {
            eck0Var.m(playbackActionMeta);
        } else {
            eck0Var.j(playbackActionMeta.b);
        }
        return s3q0.a;
    }
}
