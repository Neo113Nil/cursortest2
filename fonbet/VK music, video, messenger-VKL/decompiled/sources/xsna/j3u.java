package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;

/* compiled from: GoApiNewsfeedHeaterInteractor.kt */
/* loaded from: classes4.dex */
public final class j3u implements zk60 {
    public final String b = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP);
    public final String c = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT);
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.v(15));
    public final bpn0 e = new bpn0(new cfl(this, 12));

    public j3u(sua suaVar) {
    }

    @Override // xsna.zk60
    public final io.reactivex.rxjava3.internal.operators.observable.l2 a() {
        ce60.b.getClass();
        return ce60.l().U(new ft0(new srg(this, 17), 29)).r0(asu0.a.c());
    }

    @Override // xsna.zk60
    public final io.reactivex.rxjava3.core.x<bl60> b(t460 t460Var) {
        boolean z = t460Var.b.a;
        String str = t460Var.c;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        jk60 jk60Var = new jk60(gcd0.g(null), 0, Boolean.valueOf(z), t460Var.a, ce60.b);
        jk60Var.D(micros, CommonUrlParts.REQUEST_ID);
        if (jk60.x.compareAndSet(true, false)) {
            jk60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "initial");
        } else {
            jk60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "initial");
        }
        jk60Var.K("device_info", str);
        return rsg0.w0(jk60Var).l(new i3u(new udo(this, 12), 0));
    }
}
