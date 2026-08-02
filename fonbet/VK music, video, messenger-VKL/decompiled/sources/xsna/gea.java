package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gea implements io.reactivex.rxjava3.core.u {
    public final /* synthetic */ kea a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ gea(kea keaVar, boolean z) {
        this.a = keaVar;
        this.b = z;
    }

    @Override // io.reactivex.rxjava3.core.u
    public final io.reactivex.rxjava3.core.t a(io.reactivex.rxjava3.core.q qVar) {
        io.reactivex.rxjava3.core.q g;
        com.vk.lists.c cVar = this.a.d;
        return (cVar == null || (g = cVar.g(qVar, true, this.b)) == null) ? qVar : g;
    }
}
