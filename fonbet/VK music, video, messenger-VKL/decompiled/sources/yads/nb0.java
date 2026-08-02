package yads;

import android.media.AudioTrack;

/* loaded from: classes10.dex */
public final class nb0 extends Thread {
    public final /* synthetic */ AudioTrack b;
    public final /* synthetic */ zb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(zb0 zb0Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.c = zb0Var;
        this.b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.b.flush();
            this.b.release();
        } finally {
            this.c.h.d();
        }
    }
}
