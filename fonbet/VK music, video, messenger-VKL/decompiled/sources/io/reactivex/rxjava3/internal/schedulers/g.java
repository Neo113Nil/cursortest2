package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler.java */
/* loaded from: classes11.dex */
public final class g extends w {
    public static final RxThreadFactory c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory b = c;

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new h(this.b);
    }
}
