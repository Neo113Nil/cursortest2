package yads;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public abstract class a31 {
    public static final AtomicLong a = new AtomicLong();

    public static final long a() {
        return a.getAndIncrement();
    }
}
