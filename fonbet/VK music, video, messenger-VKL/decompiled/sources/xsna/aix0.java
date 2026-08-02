package xsna;

/* compiled from: WebSuperAppApi.kt */
/* loaded from: classes7.dex */
public final class aix0 implements sfn0 {
    public final /* synthetic */ yit a = new yit();

    @Override // xsna.sfn0
    public final io.reactivex.rxjava3.internal.operators.single.y a() {
        return this.a.a();
    }

    @Override // xsna.sfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(String str, String str2) {
        return this.a.b(str, str2);
    }

    @Override // xsna.sfn0
    public final io.reactivex.rxjava3.core.x<Boolean> c(String str, String str2) {
        tfx tfxVar = new tfx("superApp.closeOnboardingPanel", new igj0(4), new b690(7));
        tfx.o(tfxVar, "uid", str, 0, 0, 12);
        tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).m0().l(new mrc0(new zzs0(6), 14));
    }
}
