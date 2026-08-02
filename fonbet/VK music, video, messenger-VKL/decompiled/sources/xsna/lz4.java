package xsna;

import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import xsna.ihz;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes12.dex */
public final class lz4 {
    public boolean A;
    public long B;
    public final AudioTrackAudioOutput.c a;
    public final dvf b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final ry4 h;
    public float i;
    public long j;
    public long k;
    public long l;

    @Nullable
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public lz4(AudioTrackAudioOutput.c cVar, dvf dvfVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = cVar;
        this.b = dvfVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.h = new ry4(audioTrack, cVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = y2r0.M(i);
        this.g = M;
        this.f = M ? y2r0.b0(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = C.TIME_UNSET;
        this.v = C.TIME_UNSET;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = C.TIME_UNSET;
    }

    public final long a() {
        if (this.u != C.TIME_UNSET) {
            return Math.min(this.x, c());
        }
        long elapsedRealtime = this.b.elapsedRealtime();
        if (elapsedRealtime - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                        this.v = C.TIME_UNSET;
                    } else if (this.v == C.TIME_UNSET) {
                        this.v = elapsedRealtime;
                    }
                }
                long j = this.q;
                if (j > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j;
                        this.A = false;
                    } else {
                        this.r++;
                    }
                }
                this.q = playbackHeadPosition;
            }
            this.p = elapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        int i = this.t;
        int i2 = this.e;
        long max = Math.max(0L, (i == 0 ? this.u != C.TIME_UNSET ? y2r0.b0(i2, c()) : y2r0.b0(i2, a()) : y2r0.D(j + this.k, this.i)) - this.n);
        return this.u != C.TIME_UNSET ? Math.min(y2r0.b0(i2, this.x), max) : max;
    }

    public final long c() {
        AudioTrack audioTrack = this.d;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.w;
        }
        return this.w + y2r0.q(this.e, y2r0.D(y2r0.S(this.b.elapsedRealtime()) - this.u, this.i));
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == C.TIME_UNSET || j < j2) {
            return;
        }
        final long currentTimeMillis = this.b.currentTimeMillis() - y2r0.j0(y2r0.G(j - j2, this.i));
        this.j = C.TIME_UNSET;
        AudioTrackAudioOutput.this.i.f(-1, new ihz.a() { // from class: xsna.zy4
            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((AudioOutput.a) obj).b(currentTimeMillis);
            }
        });
    }
}
