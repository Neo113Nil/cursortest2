package androidx.media3.exoplayer.mediacodec.wrapper;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import defpackage.ac10;
import defpackage.ad10;
import defpackage.cc10;
import defpackage.dc10;
import defpackage.ec10;
import defpackage.fc10;
import defpackage.gkb1;
import defpackage.hd10;
import defpackage.ic10;
import defpackage.jc10;
import defpackage.kc10;
import defpackage.lc10;
import defpackage.mc10;
import defpackage.nc10;
import defpackage.pc10;
import defpackage.qc10;
import defpackage.rc10;
import defpackage.sc10;
import defpackage.tb10;
import defpackage.uc10;
import defpackage.vbb;
import defpackage.vc10;
import defpackage.wc10;
import defpackage.xc10;
import defpackage.yb10;
import defpackage.yc10;
import defpackage.zb10;
import defpackage.zc10;
import defpackage.zy11;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.b;

/* loaded from: classes10.dex */
public final class a implements hd10 {
    public final String a;
    public final vbb b;
    public final tb10 c;
    public final MediaCodec d;
    public final int e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;

    public a(String str, vbb vbbVar, tb10 tb10Var) {
        Object failure;
        this.a = str;
        this.b = vbbVar;
        this.c = tb10Var;
        try {
            failure = MediaCodec.createByCodecName(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            f(a, new kc10(this.a, (String) this.b.b));
            throw null;
        }
        b.b(failure);
        MediaCodec mediaCodec = (MediaCodec) failure;
        this.d = mediaCodec;
        int hashCode = mediaCodec.hashCode();
        this.e = hashCode;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.c.onCreated(new fc10(hashCode, new kc10(this.a, (String) this.b.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // defpackage.hd10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, long j, int i3) {
        int i4;
        Object failure;
        Throwable a;
        try {
            i4 = i3;
        } catch (Throwable th) {
            th = th;
            i4 = i3;
        }
        try {
            this.d.queueInputBuffer(i, 0, i2, j, i4);
            failure = zy11.a;
        } catch (Throwable th2) {
            th = th2;
            failure = new Result.Failure(th);
            if (!(failure instanceof Result.Failure)) {
            }
            a = Result.a(failure);
            if (a != null) {
            }
        }
        if (!(failure instanceof Result.Failure)) {
            if ((i4 & 4) != 0) {
                this.f.compareAndSet(true, false);
                this.c.onExecuting(new yb10(this.e, rc10.a));
            }
        }
        a = Result.a(failure);
        if (a != null) {
            return;
        }
        f(a, qc10.a);
        throw null;
    }

    @Override // defpackage.hd10
    public final void b(int i) {
        Object failure;
        try {
            this.d.releaseOutputBuffer(i, false);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, uc10.a);
        throw null;
    }

    @Override // defpackage.hd10
    public final void c(int i, long j) {
        Object failure;
        try {
            this.d.releaseOutputBuffer(i, j);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, uc10.a);
        throw null;
    }

    @Override // defpackage.hd10
    public final void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        Object failure;
        try {
            this.d.configure(mediaFormat, surface, mediaCrypto, i);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        vbb vbbVar = this.b;
        if (!z) {
            this.c.onStopped(new dc10(this.e, new jc10(vbbVar)));
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, new jc10(vbbVar));
        throw null;
    }

    @Override // defpackage.hd10
    public final int d() {
        Object failure;
        try {
            failure = Integer.valueOf(this.d.dequeueInputBuffer(0L));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        lc10 lc10Var = lc10.a;
        if (!z) {
            ((Number) failure).intValue();
            if (this.f.compareAndSet(false, true)) {
                this.c.onExecuting(new ac10(this.e, lc10Var));
            }
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            b.b(failure);
            return ((Number) failure).intValue();
        }
        f(a, lc10Var);
        throw null;
    }

    @Override // defpackage.hd10
    public final void e() {
        Object failure;
        try {
            this.d.detachOutputSurface();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, nc10.a);
        throw null;
    }

    public final void f(Throwable th, gkb1 gkb1Var) {
        Object failure;
        Object failure2;
        MediaCodec mediaCodec = this.d;
        try {
            failure = mediaCodec.getInputFormat();
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        MediaFormat mediaFormat = (MediaFormat) failure;
        try {
            failure2 = mediaCodec.getOutputFormat();
        } catch (Throwable th3) {
            failure2 = new Result.Failure(th3);
        }
        this.c.onStopped(new ec10(this.e, this.a, this.b, gkb1Var, mediaFormat, (MediaFormat) (failure2 instanceof Result.Failure ? null : failure2), th));
        throw th;
    }

    @Override // defpackage.hd10
    public final void flush() {
        Object failure;
        try {
            this.d.flush();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        pc10 pc10Var = pc10.a;
        if (!z) {
            this.c.onExecuting(new zb10(this.e, pc10Var));
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, pc10Var);
        throw null;
    }

    @Override // defpackage.hd10
    public final void g(Surface surface) {
        Object failure;
        try {
            this.d.setOutputSurface(surface);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, new wc10(surface.isValid()));
        throw null;
    }

    @Override // defpackage.hd10
    public final ByteBuffer getInputBuffer(int i) {
        return this.d.getInputBuffer(i);
    }

    @Override // defpackage.hd10
    public final PersistableBundle getMetrics() {
        return this.d.getMetrics();
    }

    @Override // defpackage.hd10
    public final String getName() {
        return this.d.getName();
    }

    @Override // defpackage.hd10
    public final ByteBuffer getOutputBuffer(int i) {
        return this.d.getOutputBuffer(i);
    }

    @Override // defpackage.hd10
    public final MediaFormat getOutputFormat() {
        return this.d.getOutputFormat();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // defpackage.hd10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, MediaCodec.CryptoInfo cryptoInfo, long j, int i2) {
        int i3;
        Object failure;
        Throwable a;
        try {
            i3 = i2;
        } catch (Throwable th) {
            th = th;
            i3 = i2;
        }
        try {
            this.d.queueSecureInputBuffer(i, 0, cryptoInfo, j, i3);
            failure = zy11.a;
        } catch (Throwable th2) {
            th = th2;
            failure = new Result.Failure(th);
            if (!(failure instanceof Result.Failure)) {
            }
            a = Result.a(failure);
            if (a != null) {
            }
        }
        if (!(failure instanceof Result.Failure)) {
            if ((i3 & 4) != 0) {
                this.f.compareAndSet(true, false);
                this.c.onExecuting(new yb10(this.e, rc10.a));
            }
        }
        a = Result.a(failure);
        if (a != null) {
            return;
        }
        f(a, sc10.a);
        throw null;
    }

    @Override // defpackage.hd10
    public final MediaCodec i() {
        return this.d;
    }

    @Override // defpackage.hd10
    public final void k(final MediaCodec.Callback callback, Handler handler) {
        Object failure;
        try {
            this.d.setCallback(new MediaCodec.Callback(callback) { // from class: androidx.media3.exoplayer.mediacodec.wrapper.MediaCodecWrapperImpl$MediaCodecCallback
                private final MediaCodec.Callback delegate;

                {
                    this.delegate = callback;
                }

                @Override // android.media.MediaCodec.Callback
                public void onError(MediaCodec codec, MediaCodec.CodecException e) {
                    this.delegate.onError(codec, e);
                }

                @Override // android.media.MediaCodec.Callback
                public void onInputBufferAvailable(MediaCodec codec, int index) {
                    if (a.this.f.compareAndSet(false, true)) {
                        a aVar = a.this;
                        aVar.c.onExecuting(new ac10(aVar.e, lc10.a));
                    }
                    this.delegate.onInputBufferAvailable(codec, index);
                }

                @Override // android.media.MediaCodec.Callback
                public void onOutputBufferAvailable(MediaCodec codec, int index, MediaCodec.BufferInfo info) {
                    this.delegate.onOutputBufferAvailable(codec, index, info);
                }

                @Override // android.media.MediaCodec.Callback
                public void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
                    this.delegate.onOutputFormatChanged(codec, format);
                }
            }, handler);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            this.g.set(true);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, ic10.a);
        throw null;
    }

    @Override // defpackage.hd10
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        Object failure;
        try {
            failure = Integer.valueOf(this.d.dequeueOutputBuffer(bufferInfo, 0L));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            b.b(failure);
            return ((Number) failure).intValue();
        }
        f(a, mc10.a);
        throw null;
    }

    @Override // defpackage.hd10
    public final void m(MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.d.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    @Override // defpackage.hd10
    public final void release() {
        this.d.release();
        this.c.onReleased(new cc10(this.e, this.a));
    }

    @Override // defpackage.hd10
    public final void reset() {
        Object failure;
        try {
            this.d.reset();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        vc10 vc10Var = vc10.a;
        if (!z) {
            this.c.onStopped(new fc10(this.e, vc10Var));
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, vc10Var);
        throw null;
    }

    @Override // defpackage.hd10
    public final void setParameters(Bundle bundle) {
        Object failure;
        try {
            this.d.setParameters(bundle);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, new xc10(bundle));
        throw null;
    }

    @Override // defpackage.hd10
    public final void setVideoScalingMode(int i) {
        Object failure;
        try {
            this.d.setVideoScalingMode(i);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, new yc10(i));
        throw null;
    }

    @Override // defpackage.hd10
    public final void start() {
        Object failure;
        try {
            this.d.start();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        zc10 zc10Var = zc10.a;
        if (!z) {
            boolean z2 = this.g.get();
            int i = this.e;
            tb10 tb10Var = this.c;
            if (z2) {
                tb10Var.onExecuting(new ac10(i, zc10Var));
            } else {
                tb10Var.onExecuting(new zb10(i, zc10Var));
            }
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, zc10Var);
        throw null;
    }

    @Override // defpackage.hd10
    public final void stop() {
        Object failure;
        try {
            this.d.stop();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        ad10 ad10Var = ad10.a;
        if (!z) {
            this.c.onStopped(new fc10(this.e, ad10Var));
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return;
        }
        f(a, ad10Var);
        throw null;
    }
}
