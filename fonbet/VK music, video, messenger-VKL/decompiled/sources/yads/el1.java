package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public interface el1 {
    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    ByteBuffer a(int i);

    void a(int i, int i2, long j, int i3);

    void a(int i, long j);

    void a(int i, m20 m20Var, long j);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(dl1 dl1Var, Handler handler);

    void a(boolean z, int i);

    int b();

    ByteBuffer b(int i);

    void flush();

    void release();

    void setVideoScalingMode(int i);
}
