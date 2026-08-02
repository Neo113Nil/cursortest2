package xsna;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes11.dex */
public interface kq9<T> extends spj<T> {

    /* compiled from: CancellableContinuation.kt */
    /* loaded from: classes8.dex */
    public static final class a {
    }

    void D(Object obj);

    <R extends T> void F(R r, yzs<? super Throwable, ? super R, ? super kotlin.coroutines.d, s3q0> yzsVar);

    con0 K(Object obj, yzs yzsVar);

    boolean isActive();

    @ozl
    void p(T t, izs<? super Throwable, s3q0> izsVar);

    boolean z(Throwable th);
}
