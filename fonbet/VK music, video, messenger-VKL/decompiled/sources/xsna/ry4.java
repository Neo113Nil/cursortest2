package xsna;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes12.dex */
public final class ry4 {
    public final a a;
    public final int b;
    public final AudioTrackAudioOutput.c c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    /* compiled from: AudioTimestampPoller.java */
    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;
        public boolean f;
        public long g;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }
    }

    public ry4(AudioTrack audioTrack, AudioTrackAudioOutput.c cVar) {
        this.a = new a(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = cVar;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = C.TIME_UNSET;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }
}
