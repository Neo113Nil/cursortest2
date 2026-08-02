package xsna;

/* compiled from: Subscriber.java */
/* loaded from: classes11.dex */
public interface axm0<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(jxm0 jxm0Var);
}
