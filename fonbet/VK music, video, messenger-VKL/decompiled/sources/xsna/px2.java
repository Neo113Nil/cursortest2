package xsna;

/* compiled from: ApiCommandExt.kt */
/* loaded from: classes11.dex */
public final class px2 {
    public static final io.reactivex.rxjava3.internal.operators.observable.l2 a(String str, nx2 nx2Var, l7r0 l7r0Var, rdx0 rdx0Var, sdx0 sdx0Var) {
        if (sdx0Var == null) {
            sdx0Var = new sdx0();
        }
        return new io.reactivex.rxjava3.internal.operators.observable.q(new ox2(str, nx2Var, l7r0Var, rdx0Var, sdx0Var)).r0(io.reactivex.rxjava3.schedulers.a.b());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 c(nx2 nx2Var, l7r0 l7r0Var) {
        return a("", nx2Var, l7r0Var, null, new sdx0()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
