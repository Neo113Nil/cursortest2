package xsna;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FolderDialogsListUpdatesSource.kt */
/* loaded from: classes18.dex */
public final class qyr {
    public final io.reactivex.rxjava3.core.q<a1s> a;
    public final io.reactivex.rxjava3.internal.operators.observable.c0 b;
    public final int c;
    public final a1w d;
    public final d000 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final AtomicInteger g = new AtomicInteger(0);
    public final io.reactivex.rxjava3.subjects.f<zsm> h = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.core.w i = io.reactivex.rxjava3.schedulers.a.b();

    public qyr(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.c0 c0Var, int i, a1w a1wVar, d000 d000Var) {
        this.a = qVar;
        this.b = c0Var;
        this.c = i;
        this.d = a1wVar;
        this.e = d000Var;
    }
}
