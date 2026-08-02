package xsna;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;
import xsna.fi20;

/* compiled from: Muxer.java */
/* loaded from: classes12.dex */
public interface dj50 extends AutoCloseable {

    /* compiled from: Muxer.java */
    public interface a {
        dj50 a(String str) throws MuxerException;

        com.google.common.collect.g b(int i);
    }

    int N0(androidx.media3.common.a aVar) throws MuxerException;

    void X1(fi20.a aVar);

    void f(int i, ByteBuffer byteBuffer, dm8 dm8Var) throws MuxerException;
}
