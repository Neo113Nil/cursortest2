package xsna;

import android.content.Context;

/* compiled from: LocationUpdatesDelegate.kt */
/* loaded from: classes5.dex */
public final class hzz implements fuq<com.vk.search.params.impl.presentation.modal.location.mvi.model.a, tyz> {
    public final Context a;
    public final h18 b;
    public final io.reactivex.rxjava3.subjects.f<s3q0> c = new io.reactivex.rxjava3.subjects.f<>();

    public hzz(Context context, h18 h18Var) {
        this.a = context;
        this.b = h18Var;
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends com.vk.search.params.impl.presentation.modal.location.mvi.model.a> d() {
        return this.c.s0(new c8(new o3w(this, 6), 17));
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends tyz> e() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
