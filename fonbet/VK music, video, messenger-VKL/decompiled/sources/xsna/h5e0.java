package xsna;

import com.vk.music.bottomsheets.domain.model.ConsumeReason;

/* compiled from: PromoInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class h5e0 implements g5e0 {
    public final b6e0 a;

    public h5e0(b6e0 b6e0Var) {
        this.a = b6e0Var;
    }

    @Override // xsna.g5e0
    public final io.reactivex.rxjava3.core.a a(final int i, ConsumeReason consumeReason) {
        final b6e0 b6e0Var = this.a;
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.z5e0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return io.reactivex.rxjava3.core.x.k(Boolean.valueOf(((com.vk.music.pref.a) b6e0.this.b.getValue()).r0().contains(Long.valueOf(i))));
            }
        }), new nm3(new k330(b6e0Var, i, consumeReason, 1), 27));
    }
}
