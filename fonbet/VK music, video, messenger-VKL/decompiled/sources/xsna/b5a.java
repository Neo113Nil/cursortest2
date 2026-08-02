package xsna;

/* compiled from: CatalogEventsBus.kt */
/* loaded from: classes16.dex */
public final class b5a {
    public final io.reactivex.rxjava3.subjects.f<u0a> a;

    public b5a() {
        this(null);
    }

    public final void a(u0a u0aVar) {
        this.a.onNext(u0aVar);
    }

    public b5a(Object obj) {
        this.a = new io.reactivex.rxjava3.subjects.f<>();
    }
}
