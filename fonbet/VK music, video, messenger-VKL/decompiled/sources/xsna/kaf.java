package xsna;

/* compiled from: ClipsTracker.kt */
/* loaded from: classes17.dex */
public final class kaf implements hlh0 {
    public static final kaf a = new kaf();

    @Override // xsna.hlh0
    public final void a(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    @Override // xsna.hlh0
    public final void b(RuntimeException runtimeException) {
        com.vk.metrics.eventtracking.b.a.q(runtimeException);
    }
}
