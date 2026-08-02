package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public interface pb10 {
    void A(ob10 ob10Var, Handler handler);

    void a(int i, int i2, long j, int i3);

    void b(int i);

    void c(int i, long j);

    void e();

    void f(int i, ucf ucfVar, long j, int i2);

    void flush();

    void g(Surface surface);

    ByteBuffer getInputBuffer(int i);

    PersistableBundle getMetrics();

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    default boolean i(nb10 nb10Var) {
        return false;
    }

    void release();

    int s(MediaCodec.BufferInfo bufferInfo);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);

    int y();
}
