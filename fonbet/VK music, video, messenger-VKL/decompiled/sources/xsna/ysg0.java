package xsna;

/* compiled from: RxBus.kt */
/* loaded from: classes11.dex */
public final class ysg0<T> {
    public static final ysg0<Object> b = new ysg0<>();
    public final io.reactivex.rxjava3.subjects.f<T> a = new io.reactivex.rxjava3.subjects.f<>();

    public final void a(T t) {
        this.a.onNext(t);
    }
}
