package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ByteArrayPool.kt */
/* loaded from: classes.dex */
public final class rt8 {
    public static final rt8 c = new rt8();
    public final ReentrantLock a = new ReentrantLock();
    public final sk3<byte[]> b = new sk3<>(10);
}
