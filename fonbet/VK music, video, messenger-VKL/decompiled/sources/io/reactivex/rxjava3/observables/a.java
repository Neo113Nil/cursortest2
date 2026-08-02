package io.reactivex.rxjava3.observables;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.x1;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectableObservable.java */
/* loaded from: classes11.dex */
public abstract class a<T> extends q<T> {
    public final q<T> M0(int i, f<? super c> fVar) {
        if (i > 0) {
            return new io.reactivex.rxjava3.internal.operators.observable.f(this, i, fVar);
        }
        N0(fVar);
        return this;
    }

    public abstract void N0(f<? super c> fVar);

    public final x1 O0() {
        return new x1(this, 0L, TimeUnit.NANOSECONDS, null);
    }

    public abstract void P0();
}
