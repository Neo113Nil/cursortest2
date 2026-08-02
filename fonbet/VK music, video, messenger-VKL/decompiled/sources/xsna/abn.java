package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DiskCacheReadProducer.java */
/* loaded from: classes12.dex */
public final class abn extends uk6 {
    public final /* synthetic */ AtomicBoolean a;

    public abn(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // xsna.vhd0
    public final void c() {
        this.a.set(true);
    }
}
