package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes7.dex */
public interface lv81 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void a(ByteBuffer byteBuffer);

    mp81 b(mp81 mp81Var);

    void b();

    boolean c();

    void d();

    void flush();

    boolean isActive();
}
