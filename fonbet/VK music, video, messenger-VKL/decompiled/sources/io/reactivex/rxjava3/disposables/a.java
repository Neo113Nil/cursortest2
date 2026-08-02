package io.reactivex.rxjava3.disposables;

/* compiled from: ActionDisposable.java */
/* loaded from: classes11.dex */
public final class a extends e<io.reactivex.rxjava3.functions.a> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.rxjava3.disposables.e
    public final void a(io.reactivex.rxjava3.functions.a aVar) {
        try {
            aVar.run();
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "ActionDisposable(disposed=" + h() + ", " + get() + ")";
    }
}
