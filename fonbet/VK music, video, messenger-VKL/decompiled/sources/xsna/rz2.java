package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ApiNewsfeedHeaterInteractor.kt */
/* loaded from: classes4.dex */
public final class rz2 implements zk60 {
    public final ac60 b;
    public final String c = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP);
    public final String d = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT);
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new d4(2));
    public final bpn0 f = new bpn0(new eb(this, 3));

    public rz2(ac60 ac60Var) {
        this.b = ac60Var;
    }

    @Override // xsna.zk60
    public final io.reactivex.rxjava3.internal.operators.observable.l2 a() {
        ce60.b.getClass();
        return ce60.l().U(new z7(new fb(this, 2), 3)).r0(asu0.a.c());
    }

    @Override // xsna.zk60
    public final io.reactivex.rxjava3.core.x<bl60> b(t460 t460Var) {
        ik60 ik60Var = new ik60(null, 0, Boolean.valueOf(t460Var.b.a), t460Var.a, ce60.b);
        if (ik60.x.compareAndSet(true, false)) {
            ik60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "initial");
        } else {
            ik60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "initial");
        }
        String str = t460Var.c;
        if (str != null && str.length() != 0) {
            ik60Var.K("device_info", str);
        }
        this.b.getClass();
        ik60Var.D(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), CommonUrlParts.REQUEST_ID);
        zvq zvqVar = new zvq();
        int i = 2;
        return rsg0.a0(ik60Var).U(new b8(new a8(zvqVar, 4), i)).U(new c8(new com.vk.movika.sdk.base.observable.a(this, 4), i)).K();
    }
}
