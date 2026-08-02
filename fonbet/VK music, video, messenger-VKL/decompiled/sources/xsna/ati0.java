package xsna;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SessionCountConditionChecker.kt */
/* loaded from: classes2.dex */
public final class ati0 implements zqp0 {
    public final int a;
    public final AtomicInteger b = new AtomicInteger(0);

    public ati0(int i) {
        this.a = i;
    }

    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        AtomicInteger atomicInteger = this.b;
        boolean z = atomicInteger.incrementAndGet() >= this.a;
        if (z) {
            atomicInteger.set(0);
        }
        return z;
    }
}
