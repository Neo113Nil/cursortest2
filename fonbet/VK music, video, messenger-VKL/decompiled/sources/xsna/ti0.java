package xsna;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AdStatPixelsExecutor.kt */
/* loaded from: classes17.dex */
public final class ti0 {
    public final oi0 a;
    public final com.vk.api.sdk.b b;
    public final io.reactivex.rxjava3.subjects.f c;
    public final ConcurrentHashMap d;

    /* compiled from: AdStatPixelsExecutor.kt */
    public static final class a extends Throwable {
    }

    public ti0(oi0 oi0Var, com.vk.api.sdk.b bVar) {
        this.a = oi0Var;
        this.b = bVar;
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        this.c = fVar;
        this.d = new ConcurrentHashMap();
        io.reactivex.rxjava3.core.g<T> D0 = fVar.D0(BackpressureStrategy.BUFFER);
        pi0 pi0Var = new pi0(new com.vk.movika.sdk.base.observable.p(this, 2), 0);
        io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
        new io.reactivex.rxjava3.internal.operators.mixed.b(D0, pi0Var, ErrorMode.IMMEDIATE).subscribe();
    }
}
