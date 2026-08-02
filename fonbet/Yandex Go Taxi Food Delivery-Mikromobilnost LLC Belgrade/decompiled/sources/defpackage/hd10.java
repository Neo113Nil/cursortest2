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
public interface hd10 {
    void a(int i, int i2, long j, int i3);

    void b(int i);

    void c(int i, long j);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    int d();

    void e();

    void flush();

    void g(Surface surface);

    ByteBuffer getInputBuffer(int i);

    PersistableBundle getMetrics();

    String getName();

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(int i, MediaCodec.CryptoInfo cryptoInfo, long j, int i2);

    MediaCodec i();

    void k(MediaCodec.Callback callback, Handler handler);

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    void release();

    void reset();

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);

    void start();

    void stop();
}
