package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class cd60 implements hd10, rb10 {
    public final /* synthetic */ int a;
    public final MediaCodec b;

    public /* synthetic */ cd60(MediaCodec mediaCodec, int i) {
        this.a = i;
        this.b = mediaCodec;
    }

    private final void n() {
    }

    private final void o() {
    }

    @Override // defpackage.hd10
    public final void a(int i, int i2, long j, int i3) {
        switch (this.a) {
            case 0:
                this.b.queueInputBuffer(i, 0, i2, j, i3);
                break;
            default:
                this.b.queueInputBuffer(i, 0, i2, j, i3);
                break;
        }
    }

    @Override // defpackage.hd10
    public void b(int i) {
        this.b.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.hd10
    public void c(int i, long j) {
        this.b.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.hd10
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.b.configure(mediaFormat, surface, mediaCrypto, i);
    }

    @Override // defpackage.hd10
    public int d() {
        return this.b.dequeueInputBuffer(0L);
    }

    @Override // defpackage.hd10
    public void e() {
        this.b.detachOutputSurface();
    }

    @Override // defpackage.rb10
    public void f(int i, ucf ucfVar, long j, int i2) {
        this.b.queueSecureInputBuffer(i, 0, ucfVar.i, j, i2);
    }

    @Override // defpackage.hd10
    public final void flush() {
        switch (this.a) {
            case 0:
                this.b.flush();
                break;
        }
    }

    @Override // defpackage.hd10
    public void g(Surface surface) {
        this.b.setOutputSurface(surface);
    }

    @Override // defpackage.hd10
    public ByteBuffer getInputBuffer(int i) {
        return this.b.getInputBuffer(i);
    }

    @Override // defpackage.hd10
    public PersistableBundle getMetrics() {
        return this.b.getMetrics();
    }

    @Override // defpackage.hd10
    public String getName() {
        return this.b.getName();
    }

    @Override // defpackage.hd10
    public ByteBuffer getOutputBuffer(int i) {
        return this.b.getOutputBuffer(i);
    }

    @Override // defpackage.hd10
    public MediaFormat getOutputFormat() {
        return this.b.getOutputFormat();
    }

    @Override // defpackage.hd10
    public void h(int i, MediaCodec.CryptoInfo cryptoInfo, long j, int i2) {
        this.b.queueSecureInputBuffer(i, 0, cryptoInfo, j, i2);
    }

    @Override // defpackage.hd10
    public MediaCodec i() {
        return this.b;
    }

    @Override // defpackage.rb10
    public void j() {
    }

    @Override // defpackage.hd10
    public void k(MediaCodec.Callback callback, Handler handler) {
        this.b.setCallback(callback, handler);
    }

    @Override // defpackage.hd10
    public int l(MediaCodec.BufferInfo bufferInfo) {
        return this.b.dequeueOutputBuffer(bufferInfo, 0L);
    }

    @Override // defpackage.hd10
    public void m(MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.b.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    @Override // defpackage.hd10
    public void release() {
        this.b.release();
    }

    @Override // defpackage.hd10
    public void reset() {
        this.b.reset();
    }

    @Override // defpackage.hd10
    public final void setParameters(Bundle bundle) {
        int i = this.a;
        MediaCodec mediaCodec = this.b;
        switch (i) {
            case 0:
                mediaCodec.setParameters(bundle);
                break;
            default:
                mediaCodec.setParameters(bundle);
                break;
        }
    }

    @Override // defpackage.hd10
    public void setVideoScalingMode(int i) {
        this.b.setVideoScalingMode(i);
    }

    @Override // defpackage.rb10
    public void shutdown() {
    }

    @Override // defpackage.hd10
    public final void start() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
        }
    }

    @Override // defpackage.hd10
    public void stop() {
        this.b.stop();
    }
}
