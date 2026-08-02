package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public final class f3t0 extends h3t0 {
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;

    public f3t0(AtomicInteger atomicInteger, int i) {
        this.b = atomicInteger;
        this.c = i;
    }

    @Override // defpackage.h3t0
    public final boolean a() {
        return this.b.get() > this.c;
    }
}
