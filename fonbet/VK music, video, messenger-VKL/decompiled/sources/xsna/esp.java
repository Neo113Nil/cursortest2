package xsna;

/* compiled from: EnvironmentBgSyncStateObserverImpl.kt */
/* loaded from: classes2.dex */
public final class esp {
    public final w2w a;
    public final io.reactivex.rxjava3.disposables.c b;
    public final io.reactivex.rxjava3.subjects.f<ixv> c;

    public esp(w2w w2wVar, ehu ehuVar) {
        this.a = w2wVar;
        io.reactivex.rxjava3.subjects.f<ixv> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = io.reactivex.rxjava3.kotlin.c.f(3, fVar.p(new dsp()), null, null, new s55(1, this, esp.class, "setEnvironmentState", "setEnvironmentState(Lcom/vk/im/engine/models/ImBgSyncStatus;)V", 0, 7));
        this.c = fVar;
    }
}
