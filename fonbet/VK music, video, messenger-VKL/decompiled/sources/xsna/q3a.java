package xsna;

/* compiled from: CatalogCommandsBus.kt */
/* loaded from: classes.dex */
public class q3a {
    public final io.reactivex.rxjava3.subjects.f<n3a> a;

    public q3a() {
        this(null);
    }

    public io.reactivex.rxjava3.core.q<n3a> a() {
        return this.a;
    }

    public void b(n3a n3aVar, boolean z) {
        this.a.onNext(n3aVar);
    }

    public q3a(Object obj) {
        this.a = new io.reactivex.rxjava3.subjects.f<>();
    }
}
