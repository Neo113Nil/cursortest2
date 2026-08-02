package xsna;

/* compiled from: ImEngineChannelEventsProvider.kt */
/* loaded from: classes16.dex */
public final class c1w implements xeb {
    public final io.reactivex.rxjava3.disposables.b a;
    public final io.reactivex.rxjava3.subjects.f b;

    public c1w(a1w a1wVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.a = bVar;
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, a1wVar.l.a(), null, null, new w7u(fVar, 2)));
        this.b = fVar;
    }

    @Override // xsna.xeb
    public final void destroy() {
        this.a.dispose();
    }
}
