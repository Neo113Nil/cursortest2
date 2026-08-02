package xsna;

import android.app.Application;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import xsna.wmi0;

/* compiled from: PreferenceInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class kyc0 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "initPrefs";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        b61 b61Var = uz70.a;
        Preference preference = Preference.a;
        asu0.a.getClass();
        ExecutorService h = asu0.h();
        myc0 myc0Var = new myc0();
        uz70.b(preference, new b61(this.b, h, new hyc0(), myc0Var, new wv8(5)));
        hzg0 hzg0Var = pjp.a;
        ExecutorService h2 = asu0.h();
        Application application = this.b;
        pjp.b(application, h2, true);
        wmi0 wmi0Var = wmi0.a;
        int i = BuildInfo.e;
        jyc0 jyc0Var = new jyc0(com.vk.metrics.eventtracking.b.a);
        l03 l03Var = new l03(7);
        q7y0 q7y0Var = new q7y0();
        wmi0.c = application;
        wmi0.d = new wmi0.a(application, i);
        wmi0.e = new ConcurrentHashMap();
        wmi0.f = jyc0Var;
        wmi0.h = l03Var;
        wmi0.g = q7y0Var;
        wmi0.i = true;
        ((CacheComponent) c().a(fpf0.a(CacheComponent.class))).yc().c(new tv8(new sv8(CacheTarget.SYSTEM, "SerializerCache", new m03(6), new i2a(1))));
        ((SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class))).J2().f(new ayi0() { // from class: xsna.iyc0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                ni0 ni0Var = new ni0(15, uxi0Var, kyc0.this);
                if (!i0q0.b()) {
                    ni0Var.invoke();
                } else {
                    asu0.a.getClass();
                    asu0.n().execute(new oh(ni0Var, 11));
                }
            }
        });
        return s3q0.a;
    }
}
