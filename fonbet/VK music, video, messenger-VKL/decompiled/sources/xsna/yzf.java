package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.TimeUnit;

/* compiled from: CodegenNewsfeedHeaterInteractor.kt */
/* loaded from: classes4.dex */
public final class yzf implements zk60, w8i {
    public final xzf b = new xzf(new bpn0(new no(this, 27)));
    public final String c = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP);
    public final String d = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT);
    public final bpn0 e = new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(9));

    @Override // xsna.zk60
    public final io.reactivex.rxjava3.internal.operators.observable.l2 a() {
        ce60.b.getClass();
        return ce60.l().U(new e10(new ka(this, 26), 18)).r0(asu0.a.c());
    }

    @Override // xsna.zk60
    public final io.reactivex.rxjava3.core.x<bl60> b(t460 t460Var) {
        return this.b.g(new iw60(null, 1, 0, t460Var.b.a, t460Var.c, TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), false, null, "initial", t460Var.a, null, false, null)).l(new c7(new i50(this, 16), 18));
    }
}
