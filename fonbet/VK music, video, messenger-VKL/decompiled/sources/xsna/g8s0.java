package xsna;

import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.vfq0;

/* compiled from: VideoCapture.java */
/* loaded from: classes11.dex */
public final class g8s0 extends vfq0 {
    public static final c v = new c();
    public static final int[] w = {8, 6, 5, 4};
    public static final short[] x = {2, 3, 4};
    public HandlerThread l;
    public HandlerThread m;

    @NonNull
    public MediaCodec n;

    @NonNull
    public MediaCodec o;
    public Surface p;

    @NonNull
    public AudioRecord q;
    public int r;
    public int s;
    public int t;
    public unw u;

    /* compiled from: VideoCapture.java */
    public class a implements r.c {
        public final /* synthetic */ String a;
        public final /* synthetic */ Size b;

        public a(String str, Size size) {
            this.a = str;
            this.b = size;
        }

        @Override // androidx.camera.core.impl.r.c
        public final void onError() {
            g8s0 g8s0Var = g8s0.this;
            String str = this.a;
            if (g8s0Var.g(str)) {
                g8s0Var.u(str, this.b);
                g8s0Var.i();
            }
        }
    }

    /* compiled from: VideoCapture.java */
    public static final class b implements u.a<g8s0, androidx.camera.core.impl.v, b>, l.a<b> {
        public final androidx.camera.core.impl.n a;

        public b() {
            this(androidx.camera.core.impl.n.z());
        }

        @Override // androidx.camera.core.impl.l.a
        @NonNull
        public final b a(@NonNull Size size) {
            this.a.C(androidx.camera.core.impl.l.d, size);
            return this;
        }

        @Override // androidx.camera.core.impl.u.a
        @NonNull
        public final androidx.camera.core.impl.v b() {
            return new androidx.camera.core.impl.v(androidx.camera.core.impl.o.y(this.a));
        }

        @Override // androidx.camera.core.impl.l.a
        @NonNull
        public final b c(int i) {
            this.a.C(androidx.camera.core.impl.l.c, Integer.valueOf(i));
            return this;
        }

        @Override // xsna.hbq
        @NonNull
        public final androidx.camera.core.impl.m d() {
            return this.a;
        }

        public b(@NonNull androidx.camera.core.impl.n nVar) {
            Object obj;
            this.a = nVar;
            Object obj2 = null;
            try {
                obj = nVar.f(x3o0.p);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(g8s0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.n nVar2 = this.a;
            nVar2.C(x3o0.p, g8s0.class);
            try {
                obj2 = nVar2.f(x3o0.o);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.a.C(x3o0.o, g8s0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: VideoCapture.java */
    public static final class c {
        public static final androidx.camera.core.impl.v a;

        static {
            Size size = new Size(1920, 1080);
            b bVar = new b();
            androidx.camera.core.impl.a aVar = androidx.camera.core.impl.v.t;
            androidx.camera.core.impl.n nVar = bVar.a;
            nVar.C(aVar, 30);
            nVar.C(androidx.camera.core.impl.v.u, 8388608);
            nVar.C(androidx.camera.core.impl.v.v, 1);
            nVar.C(androidx.camera.core.impl.v.w, Integer.valueOf(RtpSenderHelper.AUDIO_BITRATE_MAX));
            nVar.C(androidx.camera.core.impl.v.x, 8000);
            nVar.C(androidx.camera.core.impl.v.y, 1);
            nVar.C(androidx.camera.core.impl.v.z, 1);
            nVar.C(androidx.camera.core.impl.v.A, 1024);
            nVar.C(androidx.camera.core.impl.l.f, size);
            nVar.C(androidx.camera.core.impl.u.l, 3);
            nVar.C(androidx.camera.core.impl.l.b, 1);
            a = new androidx.camera.core.impl.v(androidx.camera.core.impl.o.y(nVar));
        }
    }

    @Override // xsna.vfq0
    @Nullable
    public final androidx.camera.core.impl.u<?> d(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config a2 = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
        if (z) {
            v.getClass();
            a2 = Config.w(a2, c.a);
        }
        if (a2 == null) {
            return null;
        }
        return new androidx.camera.core.impl.v(androidx.camera.core.impl.o.y(((b) f(a2)).a));
    }

    @Override // xsna.vfq0
    @NonNull
    public final u.a<?, ?, ?> f(@NonNull Config config) {
        return new b(androidx.camera.core.impl.n.A(config));
    }

    @Override // xsna.vfq0
    public final void l() {
        this.l = new HandlerThread("CameraX-video encoding thread");
        this.m = new HandlerThread("CameraX-audio encoding thread");
        this.l.start();
        new Handler(this.l.getLooper());
        this.m.start();
        new Handler(this.m.getLooper());
    }

    @Override // xsna.vfq0
    public final void o() {
        v();
        this.l.quitSafely();
        this.m.quitSafely();
        MediaCodec mediaCodec = this.o;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.o = null;
        }
        AudioRecord audioRecord = this.q;
        if (audioRecord != null) {
            audioRecord.release();
            this.q = null;
        }
        if (this.p != null) {
            t(true);
        }
    }

    @Override // xsna.vfq0
    public final void q() {
        v();
    }

    @Override // xsna.vfq0
    @NonNull
    public final Size r(@NonNull Size size) {
        if (this.p != null) {
            this.n.stop();
            this.n.release();
            this.o.stop();
            this.o.release();
            t(false);
        }
        try {
            this.n = MediaCodec.createEncoderByType("video/avc");
            this.o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            u(c(), size);
            return size;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e.getCause());
        }
    }

    public final void t(boolean z) {
        unw unwVar = this.u;
        if (unwVar == null) {
            return;
        }
        MediaCodec mediaCodec = this.n;
        unwVar.a();
        r0t.e(this.u.e).addListener(new jaj0(z, mediaCodec, 2), xo9.t());
        if (z) {
            this.n = null;
        }
        this.p = null;
        this.u = null;
    }

    public final void u(@NonNull String str, @NonNull Size size) {
        AudioRecord audioRecord;
        androidx.camera.core.impl.v vVar = (androidx.camera.core.impl.v) this.f;
        this.n.reset();
        MediaCodec mediaCodec = this.n;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, ((Integer) vVar.f(androidx.camera.core.impl.v.u)).intValue());
        createVideoFormat.setInteger("frame-rate", ((Integer) vVar.f(androidx.camera.core.impl.v.t)).intValue());
        createVideoFormat.setInteger("i-frame-interval", ((Integer) vVar.f(androidx.camera.core.impl.v.v)).intValue());
        mediaCodec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        int i = 0;
        if (this.p != null) {
            t(false);
        }
        Surface createInputSurface = this.n.createInputSurface();
        this.p = createInputSurface;
        r.b c2 = r.b.c(vVar);
        unw unwVar = this.u;
        if (unwVar != null) {
            unwVar.a();
        }
        unw unwVar2 = new unw(this.p);
        this.u = unwVar2;
        ugz e = r0t.e(unwVar2.e);
        Objects.requireNonNull(createInputSurface);
        e.addListener(new gv2(createInputSurface, 18), xo9.t());
        c2.a(this.u);
        c2.e.add(new a(str, size));
        this.k = c2.b();
        try {
            for (int i2 : w) {
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i2)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i2);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        this.r = camcorderProfile.audioChannels;
                        this.s = camcorderProfile.audioSampleRate;
                        this.t = camcorderProfile.audioBitRate;
                        break;
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        androidx.camera.core.impl.v vVar2 = (androidx.camera.core.impl.v) this.f;
        this.r = ((Integer) vVar2.f(androidx.camera.core.impl.v.y)).intValue();
        this.s = ((Integer) vVar2.f(androidx.camera.core.impl.v.x)).intValue();
        this.t = ((Integer) vVar2.f(androidx.camera.core.impl.v.w)).intValue();
        this.o.reset();
        MediaCodec mediaCodec2 = this.o;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.s, this.r);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, this.t);
        mediaCodec2.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord2 = this.q;
        if (audioRecord2 != null) {
            audioRecord2.release();
        }
        short[] sArr = x;
        int length = sArr.length;
        while (true) {
            if (i >= length) {
                audioRecord = null;
                break;
            }
            short s = sArr[i];
            int i3 = this.r == 1 ? 16 : 12;
            int intValue = ((Integer) vVar.f(androidx.camera.core.impl.v.z)).intValue();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(this.s, i3, s);
                if (minBufferSize <= 0) {
                    minBufferSize = ((Integer) vVar.f(androidx.camera.core.impl.v.A)).intValue();
                }
                audioRecord = new AudioRecord(intValue, this.s, i3, s, minBufferSize * 2);
            } catch (Exception e2) {
                s100.a("VideoCapture", "Exception, keep trying.", e2);
            }
            if (audioRecord.getState() == 1) {
                break;
            } else {
                i++;
            }
        }
        this.q = audioRecord;
        if (audioRecord == null) {
            s100.a("VideoCapture", "AudioRecord object cannot initialized correctly!", null);
        }
    }

    public final void v() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            xo9.t().execute(new a72(this, 24));
        } else {
            this.c = vfq0.c.INACTIVE;
            j();
            throw null;
        }
    }
}
