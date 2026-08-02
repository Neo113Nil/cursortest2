package xsna;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PriorityThreadFactory.kt */
/* loaded from: classes.dex */
public final class jcd0 implements ThreadFactory {
    public final String b;
    public final AtomicInteger c = new AtomicInteger(1);

    public jcd0(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new qye(11, this, runnable), na8.a(this.c.getAndIncrement(), this.b, "-"));
    }
}
