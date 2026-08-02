package xsna;

import xsna.uyg0;

/* compiled from: NetworkKeyStore.kt */
/* loaded from: classes.dex */
public final class b460 implements uyg0.b {
    @Override // xsna.uyg0.b
    public final void b(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // xsna.uyg0.b
    public final void a() {
    }
}
