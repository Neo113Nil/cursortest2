package xsna;

import androidx.media3.common.PlaybackException;
import xsna.jza0;

/* compiled from: LoggingPlayerListener.kt */
/* loaded from: classes3.dex */
public final class g200 implements jza0.b {
    public final t6q b;

    public g200(t6q t6qVar) {
        this.b = t6qVar;
    }

    @Override // xsna.jza0.b
    public final void D(int i, jza0.c cVar, jza0.c cVar2) {
        bn40.f("reason=", Integer.valueOf(i));
        this.b.D(i, cVar, cVar2);
    }

    @Override // xsna.jza0.b
    public final void N(dip0 dip0Var) {
        bn40.f("trackGroups=", dip0Var.a);
    }

    @Override // xsna.jza0.b
    public final void a(int i) {
        bn40.f(lhg.a(i, "audioSessionId="));
        this.b.a(i);
    }

    @Override // xsna.jza0.b
    public final void f0(kr10 kr10Var, int i) {
        bn40.f("mediaItem=" + kr10Var + ", reason=" + i);
    }

    @Override // xsna.jza0.b
    public final void onIsLoadingChanged(boolean z) {
        bn40.f("isLoading=", Boolean.valueOf(z));
        this.b.onIsLoadingChanged(z);
    }

    @Override // xsna.jza0.b
    public final void onIsPlayingChanged(boolean z) {
        this.b.onIsPlayingChanged(z);
    }

    @Override // xsna.jza0.b
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        bn40.f("playWhenReady=" + z + ", reason=" + i);
    }

    @Override // xsna.jza0.b
    public final void onPlaybackStateChanged(int i) {
        bn40.f(lhg.a(i, "playbackState="));
    }

    @Override // xsna.jza0.b
    public final void onPlaybackSuppressionReasonChanged(int i) {
        bn40.f(lhg.a(i, "playbackSuppressionReason="));
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        bn40.c(playbackException, "code=", playbackException.d());
        this.b.onPlayerError(playbackException);
    }

    @Override // xsna.jza0.b
    public final void onPlayerStateChanged(boolean z, int i) {
        bn40.f("playWhenReady=", Boolean.valueOf(z), "playbackState=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? lhg.a(i, "Unknown state: ") : "STATE_ENDED" : "STATE_READY" : "STATE_BUFFERING" : "STATE_IDLE");
        this.b.onPlayerStateChanged(z, i);
    }

    @Override // xsna.jza0.b
    public final void onRepeatModeChanged(int i) {
        bn40.f("repeatMode=", Integer.valueOf(i));
    }

    @Override // xsna.jza0.b
    public final void v(jwa0 jwa0Var) {
        bn40.f("playbackParameters=", jwa0Var);
    }

    @Override // xsna.jza0.b
    public final void z(ewo0 ewo0Var, int i) {
        bn40.f("timeline=" + ewo0Var + ", reason=" + i);
    }
}
