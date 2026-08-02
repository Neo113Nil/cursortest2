package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes10.dex */
public interface bl {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    zk a(zk zkVar);

    void a(ByteBuffer byteBuffer);

    void b();

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
