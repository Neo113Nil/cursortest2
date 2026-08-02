package io.reactivex.rxjava3.disposables;

/* compiled from: RunnableDisposable.java */
/* loaded from: classes11.dex */
public final class f extends e<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.rxjava3.disposables.e
    public final void a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + h() + ", " + get() + ")";
    }
}
