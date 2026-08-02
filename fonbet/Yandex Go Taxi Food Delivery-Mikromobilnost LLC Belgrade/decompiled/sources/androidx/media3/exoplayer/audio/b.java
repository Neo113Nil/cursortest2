package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import defpackage.bh3;

/* loaded from: classes10.dex */
public final class b {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack.StreamEventCallback b;
    public final /* synthetic */ c c;

    public b(final c cVar) {
        this.c = cVar;
        this.b = new AudioTrack.StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$StreamEventCallbackV29$1
            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                c cVar2;
                bh3 bh3Var;
                if (audioTrack.equals(b.this.c.w) && (bh3Var = (cVar2 = b.this.c).s) != null && cVar2.W) {
                    bh3Var.K();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(b.this.c.w)) {
                    b.this.c.V = true;
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                c cVar2;
                bh3 bh3Var;
                if (audioTrack.equals(b.this.c.w) && (bh3Var = (cVar2 = b.this.c).s) != null && cVar2.W) {
                    bh3Var.K();
                }
            }
        };
    }
}
