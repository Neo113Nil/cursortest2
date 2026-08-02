package yads;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class wg1 {
    public static final AtomicLong a = new AtomicLong();

    public static long a() {
        return a.getAndIncrement();
    }
}
