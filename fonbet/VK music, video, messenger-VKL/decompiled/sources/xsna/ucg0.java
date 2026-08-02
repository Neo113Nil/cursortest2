package xsna;

import android.view.View;

/* compiled from: RestrictionConfirmedActionImpl.kt */
/* loaded from: classes3.dex */
public final class ucg0 implements tcg0 {
    @Override // xsna.tcg0
    public final io.reactivex.rxjava3.disposables.c a(View view, l6n0 l6n0Var) {
        io.reactivex.rxjava3.disposables.c subscribe = wjs0.b.b0(ayr0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pmu(new e810(l6n0Var, 23), 17));
        hg1.b(view, subscribe);
        return subscribe;
    }
}
