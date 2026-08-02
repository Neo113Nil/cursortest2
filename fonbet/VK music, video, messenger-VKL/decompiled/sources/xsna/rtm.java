package xsna;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DialogsListUpdatesSource.kt */
/* loaded from: classes18.dex */
public final class rtm {
    public final a1w a;
    public final Object b;
    public final d000 c;
    public final io.reactivex.rxjava3.subjects.f<zsm> d = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final AtomicInteger f = new AtomicInteger(0);
    public final io.reactivex.rxjava3.core.w g = io.reactivex.rxjava3.schedulers.a.b();

    public rtm(a1w a1wVar, Object obj, d000 d000Var) {
        this.a = a1wVar;
        this.b = obj;
        this.c = d000Var;
    }
}
