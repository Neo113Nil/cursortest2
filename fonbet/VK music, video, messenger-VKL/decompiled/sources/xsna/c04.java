package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.util.ArrayDeque;

/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: classes12.dex */
public final class c04 extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;

    @Nullable
    public MediaFormat h;

    @Nullable
    public MediaFormat i;

    @Nullable
    public MediaCodec.CodecException j;

    @Nullable
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;

    @Nullable
    public IllegalStateException n;

    @Nullable
    public MediaCodecRenderer.a o;
    public final Object a = new Object();
    public final kdc d = new kdc();
    public final kdc e = new kdc();
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();
    public final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    public c04(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = arrayDeque.getLast();
        }
        kdc kdcVar = this.d;
        kdcVar.c = kdcVar.b;
        kdc kdcVar2 = this.e;
        kdcVar2.c = kdcVar2.b;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException != null) {
            this.n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        j.a aVar;
        synchronized (this.a) {
            this.d.a(i);
            MediaCodecRenderer.a aVar2 = this.o;
            if (aVar2 != null && (aVar = MediaCodecRenderer.this.K) != null) {
                aVar.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        j.a aVar;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                MediaCodecRenderer.a aVar2 = this.o;
                if (aVar2 != null && (aVar = MediaCodecRenderer.this.K) != null) {
                    aVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
