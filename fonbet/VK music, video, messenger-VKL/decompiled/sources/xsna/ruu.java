package xsna;

import com.vk.profile.user.impl.ui.b;

/* compiled from: FeatureDelegate.kt */
/* loaded from: classes5.dex */
public interface ruu {
    default <T> io.reactivex.rxjava3.core.q<T> K(io.reactivex.rxjava3.core.q<T> qVar, b.r rVar) {
        gf0 gf0Var = new gf0(new bp7(14, this, rVar), 24);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, gf0Var, io.reactivex.rxjava3.internal.functions.a.c).G(new g57(this, 4));
    }

    izs<com.vk.profile.user.impl.ui.b, s3q0> L();

    void r(r9c0 r9c0Var);
}
