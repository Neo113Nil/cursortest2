package xsna;

import android.media.MediaFormat;
import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import xsna.k0h0;

/* compiled from: SilentAudioSource.kt */
/* loaded from: classes3.dex */
public final class rmj0 implements xx4 {
    public final int b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, a.b);
    public final int d = 44100;
    public final int e = 2;
    public final long f = Long.MAX_VALUE;
    public final bpn0 g = new bpn0(new qmj0(0));

    /* compiled from: SilentAudioSource.kt */
    public static final class a implements gzs {
        public static final a b = new a();

        @Override // xsna.gzs
        public final Object invoke() {
            throw new IllegalStateException("Tried to get format of SilentAudioSource");
        }
    }

    /* compiled from: SilentAudioSource.kt */
    public static final class b implements k0h0.b {
        public final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        public final int b = 1;
        public final boolean c = true;
        public final boolean d = true;

        @Override // xsna.k0h0.b
        public final long a() {
            return 0L;
        }

        @Override // xsna.k0h0.b
        public final boolean b() {
            return this.d;
        }

        @Override // xsna.k0h0.b
        public final boolean c() {
            return this.c;
        }

        @Override // xsna.k0h0.b
        public final ByteBuffer getData() {
            return this.a;
        }

        @Override // xsna.k0h0.b
        public final int getFlags() {
            return this.b;
        }

        @Override // xsna.k0h0.b
        public final int getSize() {
            return 0;
        }
    }

    public rmj0(int i) {
        this.b = i;
    }

    @Override // xsna.xx4
    public final int c() {
        return this.d;
    }

    @Override // xsna.k0h0
    public final boolean d(long j, long j2) {
        return true;
    }

    @Override // xsna.xx4
    public final long f() {
        return this.f;
    }

    @Override // xsna.k0h0
    public final k0h0.b g() {
        return (k0h0.b) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k0h0
    public final MediaFormat getFormat() {
        this.c.getValue();
        throw new KotlinNothingValueException();
    }

    @Override // xsna.xx4
    public final int h() {
        return this.e;
    }

    @Override // xsna.k0h0
    public final boolean i() {
        return true;
    }

    @Override // xsna.k0h0
    public final int m() {
        return this.b;
    }

    @Override // xsna.k0h0
    public final void release() {
    }

    @Override // xsna.xx4
    public final void a(AudioPcm audioPcm) {
    }

    @Override // xsna.k0h0
    public final void seekTo(long j) {
    }
}
