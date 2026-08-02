package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes10.dex */
public interface og3 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    void b();

    ByteBuffer c();

    ng3 d(ng3 ng3Var);

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
