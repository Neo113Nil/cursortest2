package xsna;

/* compiled from: Observer.kt */
/* loaded from: classes5.dex */
public interface er70<T> {
    void a(ign ignVar);

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
