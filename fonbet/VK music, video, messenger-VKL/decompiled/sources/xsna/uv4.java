package xsna;

import com.vk.audio.AudioMessageSource;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: AudioRecorder.kt */
/* loaded from: classes15.dex */
public final class uv4 {
    public final Object a;
    public io.reactivex.rxjava3.subjects.f<Integer> b = new io.reactivex.rxjava3.subjects.f<>();
    public io.reactivex.rxjava3.subjects.f<b> c = new io.reactivex.rxjava3.subjects.f<>();
    public String d = "";
    public Throwable e;
    public volatile boolean f;

    /* compiled from: AudioRecorder.kt */
    public final class a implements yu4 {
        public a() {
        }

        @Override // xsna.yu4
        public final void a(String str, File file, boolean z) {
            uv4 uv4Var = uv4.this;
            if (epx.f(uv4Var.d, str)) {
                e();
                uv4Var.c.onNext(new b(file, false, false, false, 0L, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                uv4Var.c.onComplete();
            }
        }

        @Override // xsna.yu4
        public final void b(Exception exc, String str) {
            uv4 uv4Var = uv4.this;
            if (str == null) {
                uv4Var.c.onError(new RuntimeException("Audio message failed sessionId=null", exc));
            } else if (epx.f(uv4Var.d, str)) {
                e();
                uv4Var.c.onError(new RuntimeException("Audio message failed", exc));
            } else {
                e();
                uv4Var.c.onError(new RuntimeException("Audio message failed sessionId=".concat(str), exc));
            }
        }

        @Override // xsna.yu4
        public final void c(String str, long j, double d) {
            uv4 uv4Var = uv4.this;
            if (epx.f(uv4Var.d, str)) {
                double abs = Math.abs(xq4.B);
                uv4Var.b.onNext(Integer.valueOf((int) ((Math.max(abs - Math.abs(d), ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * 100) / abs)));
            }
        }

        @Override // xsna.yu4
        public final void d(String str, File file, boolean z, boolean z2, boolean z3, long j, byte[] bArr, AudioMessageSource audioMessageSource) {
            uv4 uv4Var = uv4.this;
            if (epx.f(uv4Var.d, str)) {
                e();
                uv4Var.c.onNext(new b(file, z, z2, z3, j, bArr, audioMessageSource == null ? AudioMessageSource.PUSH_TO_TALK : audioMessageSource, 128));
                uv4Var.c.onComplete();
            }
        }

        public final void e() {
            uv4 uv4Var = uv4.this;
            uv4Var.d = "";
            uv4Var.e = null;
            uv4Var.b().m.remove(this);
        }
    }

    /* compiled from: AudioRecorder.kt */
    public static final class b {
        public final File a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final byte[] f;
        public final AudioMessageSource g;
        public final boolean h;

        public b(File file, boolean z, boolean z2, boolean z3, long j, byte[] bArr, AudioMessageSource audioMessageSource, int i) {
            z = (i & 2) != 0 ? false : z;
            z2 = (i & 4) != 0 ? false : z2;
            z3 = (i & 8) != 0 ? false : z3;
            j = (i & 16) != 0 ? 0L : j;
            bArr = (i & 32) != 0 ? new byte[0] : bArr;
            audioMessageSource = (i & 64) != 0 ? AudioMessageSource.PUSH_TO_TALK : audioMessageSource;
            boolean z4 = (i & 128) == 0;
            this.a = file;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = j;
            this.f = bArr;
            this.g = audioMessageSource;
            this.h = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && epx.f(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            int hashCode = (Arrays.hashCode(this.f) + bh10.a(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
            AudioMessageSource audioMessageSource = this.g;
            return Boolean.hashCode(this.h) + ((hashCode + (audioMessageSource == null ? 0 : audioMessageSource.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(file=");
            sb.append(this.a);
            sb.append(", showWaveForm=");
            sb.append(this.b);
            sb.append(", send=");
            sb.append(this.c);
            sb.append(", longPress=");
            sb.append(this.d);
            sb.append(", duration=");
            sb.append(this.e);
            sb.append(", waveform=");
            sb.append(Arrays.toString(this.f));
            sb.append(", source=");
            sb.append(this.g);
            sb.append(", canceled=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }

    public uv4(mq4 mq4Var) {
        this.a = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.d(mq4Var, 3));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(String str) {
        this.e = new Throwable("cancelRecording " + this.d, this.e);
        if (this.d.length() == 0) {
            tv4.b(str, com.vk.metrics.eventtracking.b.a);
        }
        if (this.a.isInitialized()) {
            xq4 b2 = b();
            b2.e.i(new vq4(b2, 1, null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xq4 b() {
        return (xq4) this.a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c() {
        return this.a.isInitialized() && b().t != null;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 d(String str, boolean z) {
        Throwable th = new Throwable(tdj.a(new StringBuilder("startRecording oldSession="), this.d, ", newSession=", str));
        io.reactivex.rxjava3.subjects.f<b> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        return new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(fVar, new pp3(new sv4(this, th, str, z), 1), io.reactivex.rxjava3.internal.functions.a.c), new cm4(this, 1)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final void e(String str, boolean z, boolean z2, boolean z3) {
        if (this.d.length() == 0) {
            tv4.b(str, com.vk.metrics.eventtracking.b.a);
        }
        if (!c() && !this.f) {
            tv4.b(str, com.vk.metrics.eventtracking.b.a);
        }
        this.e = new Throwable("stopRecording " + this.d, this.e);
        if (z2) {
            xq4 b2 = b();
            b2.getClass();
            b2.e.i(new vq4(b2, z3 ? 3 : 2, z ? AudioMessageSource.PUSH_TO_TALK : AudioMessageSource.HANDS_FREE));
        } else {
            xq4 b3 = b();
            b3.e.i(new vq4(b3, 4, AudioMessageSource.RAISE_TO_TALK));
        }
        this.b.onComplete();
    }
}
