package xsna;

/* compiled from: AboutAppRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class k2 implements j2 {
    @Override // xsna.j2
    public final io.reactivex.rxjava3.internal.operators.completable.p a(int i) {
        ufx ufxVar = new ufx("apps.setUnverifiedScreenShown", new u11(5), new v11(2));
        ufx.k(ufxVar, "app_id", i, 0, 8);
        return new io.reactivex.rxjava3.internal.operators.completable.p(rdx0.B(e370.e(ufxVar)));
    }

    @Override // xsna.j2
    public final io.reactivex.rxjava3.internal.operators.observable.i2 b(int i) {
        ufx ufxVar = new ufx("apps.getAboutScreen", new to(2), new t11(1));
        ufx.k(ufxVar, "app_id", i, 0, 8);
        return rdx0.B(e370.e(ufxVar));
    }
}
