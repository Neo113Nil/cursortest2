package xsna;

import android.app.Application;
import android.content.Context;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.xjv0;

/* compiled from: InitAuthBeforeTaskLogic.kt */
/* loaded from: classes11.dex */
public final class axw extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "InitAuthBefore";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Application application = this.b;
        final wqu0 wqu0Var = new wqu0(application);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        asu0.h().execute(new Runnable() { // from class: xsna.yww
            @Override // java.lang.Runnable
            public final void run() {
                wqu0 wqu0Var2 = wqu0.this;
                wqu0Var2.c.getValue();
                hzg0 hzg0Var = wqu0Var2.b;
                hzg0Var.a();
                hzg0Var.b();
            }
        });
        rar0 rar0Var = new rar0(wqu0Var);
        SessionManagementComponent sessionManagementComponent = (SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class));
        pcu0 pcu0Var = new pcu0(this.b, new via(4), new wa3(7), sessionManagementComponent.J2(), sessionManagementComponent.B2(), new bpn0(new duq(this, 3)), new bpn0(new fat(this, 2)), ((TabbarCoreComponent) c().a(fpf0.a(TabbarCoreComponent.class))).y8(), new bpn0(new gat(this, 3)), new bpn0(new qy8(this, 6)), new bpn0(new b5o(this, 2)), new bpn0(new c5o(this, 3)), new bpn0(new i1q(this, 1)), new bpn0(new qx2(this, 4)));
        e2r0 e2r0Var = e2r0.b;
        zww zwwVar = new zww(this, 0);
        e2r0Var.getClass();
        e2r0.d = zwwVar;
        bg7 bg7Var = new bg7(e2r0Var, asu0.n(), asu0Var.c());
        r55 r55Var = r55.a;
        SessionManagementComponent sessionManagementComponent2 = (SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class));
        wg9 wg9Var = new wg9(this, 2);
        Context applicationContext = application.getApplicationContext();
        xjv0 stub = xjv0.a.a.getSTUB();
        tmu0 tmu0Var = new tmu0(0);
        r1d0 r1d0Var = new r1d0(1);
        List singletonList = Collections.singletonList(AccountProfileType.NORMAL);
        yui yuiVar = new yui(e43.l(e2r0Var, bg7Var));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        l2q l2qVar = new l2q(context, new t0f(3), new vwk(sessionManagementComponent2, 2), new bpn0(new yg9(this, 4)), rar0Var);
        ycu0 ycu0Var = new ycu0();
        gau gauVar = new gau();
        com.vk.auth.main.j jVar = new com.vk.auth.main.j();
        com.vk.auth.oauth.a aVar = new com.vk.auth.oauth.a(EmptyList.b);
        tby tbyVar = new tby();
        z25 z25Var = new z25(new e370());
        mui0 J2 = sessionManagementComponent2.J2();
        sxi0 B2 = sessionManagementComponent2.B2();
        zg9 zg9Var = new zg9(4);
        y140 y140Var = new y140(new b63(4), new to10(0), new m240(0), new aq0(10), new aq0(10));
        if (J2 == null) {
            throw new IllegalArgumentException("Provide SessionReadOnlyRepository to VkConnectCommonConfig");
        }
        if (B2 == null) {
            throw new IllegalArgumentException("Provide SessionWriteOnlyRepository to VkConnectCommonConfig");
        }
        r55.g = new umu0(applicationContext, pcu0Var, ycu0Var, yuiVar, gauVar, stub, new mq9(), jVar, wg9Var, aVar, tmu0Var, r1d0Var, z25Var, l2qVar, singletonList, J2, B2, y140Var, tbyVar, zg9Var);
        par0.a.getClass();
        par0.b = true;
        asu0.n().execute(new j6j(1, sessionManagementComponent, this));
        return s3q0.a;
    }
}
