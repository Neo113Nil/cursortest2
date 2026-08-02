package xsna;

/* compiled from: StickersBonusInteractor.kt */
/* loaded from: classes5.dex */
public final class v8l0 {
    public final zq70 a;

    public v8l0(zq70 zq70Var, u8l0 u8l0Var) {
        this.a = zq70Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(Integer num, String str) {
        this.a.getClass();
        tfx tfxVar = new tfx("store.getStickersBonusHistoryRecords", new ky80(7), new ajl0(0));
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (num != null) {
            tfxVar.f(num.intValue(), 1, 100, "count");
        }
        return rsg0.T(yfb.x(tfxVar)).U(new ie40(new hyu(this, 20), 11)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.a.getClass();
        tfx tfxVar = new tfx("store.getStickersUserDiscounts", new caf0(1), new ck70(10));
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfx.o(tfxVar, "source", "bonus", 0, 0, 12);
        tfxVar.j("inactive", valueOf.booleanValue());
        tfxVar.f(20, 1, 100, "count");
        return rsg0.T(yfb.x(tfxVar)).U(new he40(new uuz(this, 26), 11)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
