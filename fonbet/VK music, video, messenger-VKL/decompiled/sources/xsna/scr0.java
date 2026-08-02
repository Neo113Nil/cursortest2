package xsna;

/* compiled from: VKImageLoader.java */
/* loaded from: classes2.dex */
public final class scr0 extends ic6<Void> {
    public final /* synthetic */ io.reactivex.rxjava3.core.b a;

    public scr0(io.reactivex.rxjava3.core.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.ic6
    public final void e(zuk<Void> zukVar) {
        this.a.onError(zukVar.b());
    }

    @Override // xsna.ic6
    public final void f(zuk<Void> zukVar) {
        this.a.onComplete();
    }
}
