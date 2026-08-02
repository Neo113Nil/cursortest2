package xsna;

/* compiled from: MethodSelectorRepositoryImpl.kt */
/* loaded from: classes15.dex */
public final class ck20 implements ak20 {
    public static final ck20 a = new ck20();
    public static gxo b;

    public static io.reactivex.rxjava3.internal.operators.single.o b(String str) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(com.vk.registration.funnels.a.b(vdx0Var.x().d(str, dgn0.e())).l(new mm6(new leq(14), 26)), new m5y(new rvq(9), 4));
    }

    @Override // xsna.ak20
    public final io.reactivex.rxjava3.core.x<gxo> a(String str) {
        return b(str);
    }
}
