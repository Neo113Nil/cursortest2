package xsna;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: VideoBannerTrapLoader.kt */
/* loaded from: classes7.dex */
public final class d5s0 {
    public final lyr0 a;
    public final vyr0 b;
    public final a5s0 c;
    public final e5s0 d;
    public final Object e;
    public final hpj f;
    public final io.reactivex.rxjava3.subjects.d<Boolean> g;

    public d5s0(lyr0 lyr0Var, vyr0 vyr0Var) {
        a5s0 a5s0Var = new a5s0();
        e5s0 e5s0Var = new e5s0();
        this.a = lyr0Var;
        this.b = vyr0Var;
        this.c = a5s0Var;
        this.d = e5s0Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new t970(15));
        this.f = zvj.a(hqu0.b());
        this.g = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
    }

    public final io.reactivex.rxjava3.core.q<List<hfz>> a() {
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(this.a.b(), this.g, new bx80(new zdi(3), 15));
        m.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(m, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).s0(new cfz(new lyl0(this, 10), 17)).p0(EmptyList.b);
    }
}
