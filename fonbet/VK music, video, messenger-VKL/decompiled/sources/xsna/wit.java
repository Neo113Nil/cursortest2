package xsna;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class wit implements qfn0 {
    @Override // xsna.qfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(long j, String str, String str2) {
        int i = (int) j;
        ufx ufxVar = new ufx("storage.set", new tf3(29), new uf3(27));
        ufx.n(ufxVar, "key", str, 100, 4);
        if (str2 != null) {
            ufx.n(ufxVar, "value", str2, 0, 12);
        }
        ufx.k(ufxVar, "app_id", i, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new pb(new ob(27), 21));
    }

    @Override // xsna.qfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(long j, String[] strArr) {
        List u0 = rl3.u0(strArr);
        int i = (int) j;
        ufx ufxVar = new ufx("storage.get", new ohl0(0), new cq(29));
        if (u0 != null) {
            ufxVar.h(ApiProtocol.PARAM_KEYS, u0);
        }
        ufx.k(ufxVar, "app_id", i, 0, 8);
        bx2 bx2Var = new bx2("5.285", new io.reactivex.rxjava3.internal.operators.observable.n0(2), ufxVar.b());
        bx2Var.i = ufxVar.c();
        bx2Var.j.putAll(ufxVar.getParamsMap());
        return rdx0.u(bx2Var).U(new iu4(new g54(26), 15));
    }

    @Override // xsna.qfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(int i, int i2, long j) {
        ufx ufxVar = new ufx("storage.getKeys", new igj0(2), new b690(5));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, i, 0, 8);
        ufxVar.f(i2, 0, 1000, "count");
        bx2 bx2Var = new bx2("5.285", new io.reactivex.rxjava3.internal.operators.observable.n0(2), ufxVar.b());
        bx2Var.i = ufxVar.c();
        bx2Var.j.putAll(ufxVar.getParamsMap());
        return rdx0.u(bx2Var).U(new pi0(new qb(29), 23));
    }
}
