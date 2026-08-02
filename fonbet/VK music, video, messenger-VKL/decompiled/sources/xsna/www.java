package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.utils.StartUpMethodPriorityBackoffBaseImpl;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.network.di.NetworkComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import com.vk.toggle.features.ImFeatures;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.jz2;
import xsna.vx2;
import xsna.yx2;

/* compiled from: InitApiTaskLogic.kt */
/* loaded from: classes11.dex */
public final class www extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "api";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        StartUpMethodPriorityBackoffBaseImpl.Mode mode;
        StartUpMethodPriorityBackoffBaseImpl.Mode mode2;
        Context context;
        sxi0 sxi0Var;
        h360 h360Var;
        ns nsVar;
        w03 w03Var;
        bpn0 bpn0Var;
        k200 k200Var;
        r460 r460Var;
        d13 d13Var;
        Context context2;
        int i;
        jz2 jz2Var;
        ScheduledExecutorService scheduledExecutorService;
        boolean z;
        final mui0 J2 = ((SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class))).J2();
        sxi0 B2 = ((SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class))).B2();
        final mxi0 ie = ((StatInteractorComponent) c().a(fpf0.a(StatInteractorComponent.class))).ie();
        h360 vd = ((NetworkComponent) c().a(fpf0.a(NetworkComponent.class))).vd();
        oge0 J7 = ((PurchasesManagerComponent) c().a(fpf0.a(PurchasesManagerComponent.class))).J7();
        ns o1 = ((QueueSyncComponent) c().a(fpf0.a(QueueSyncComponent.class))).o1();
        d13 d13Var2 = new d13("VKApi");
        tdp tdpVar = new tdp();
        yx2 apiConfig = vd.getApiConfig();
        int i2 = u03.$EnumSwitchMapping$0[vd.f().ordinal()];
        if (i2 == 1) {
            mode = gz80.a <= 28 ? StartUpMethodPriorityBackoffBaseImpl.Mode.WAIT_RESPONSES : StartUpMethodPriorityBackoffBaseImpl.Mode.WAIT_REQUESTS;
        } else if (i2 == 2) {
            mode = StartUpMethodPriorityBackoffBaseImpl.Mode.DO_NOT_WAIT;
        } else if (i2 == 3) {
            mode = StartUpMethodPriorityBackoffBaseImpl.Mode.WAIT_REQUESTS;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            mode = StartUpMethodPriorityBackoffBaseImpl.Mode.WAIT_RESPONSES;
        }
        StartUpMethodPriorityBackoffBaseImpl.Mode mode3 = mode;
        vx2 vx2Var = vx2.a;
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        hcw hcwVar = new hcw(new k03(0));
        Context context4 = context3;
        Context context5 = e43.a;
        if (context5 != null) {
            mode2 = mode3;
            context = context5;
        } else {
            mode2 = mode3;
            context = null;
        }
        k200 k200Var2 = new k200(new t8u0(new sau0(new zcu0(new jql(context, o25.a())))));
        r460 r460Var2 = new r460();
        ImFeatures imFeatures = ImFeatures.IM_CMD_SHUTDOWN_CANCEL;
        imFeatures.getClass();
        nx70 nx70Var = com.vk.toggle.b.A.a(imFeatures) ? nx70.a : null;
        w03 w03Var2 = new w03(tdpVar);
        bpn0 bpn0Var2 = new bpn0(new l03(0));
        vtk0 vtk0Var = new vtk0();
        if (!apiConfig.a || (apiConfig.b.isEmpty() && apiConfig.e.isEmpty())) {
            sxi0Var = B2;
            h360Var = vd;
            nsVar = o1;
            w03Var = w03Var2;
            bpn0Var = bpn0Var2;
            k200Var = k200Var2;
            r460Var = r460Var2;
            d13Var = d13Var2;
            context2 = context4;
            i = 0;
            jz2Var = jz2.a.a;
        } else {
            asu0.a.getClass();
            ScheduledExecutorService u = asu0.u();
            m03 m03Var = new m03(0);
            w03Var = w03Var2;
            n03 n03Var = new n03(apiConfig, 0);
            Set<String> set = apiConfig.c;
            Set<String> set2 = apiConfig.e;
            if (gz80.a <= 28) {
                scheduledExecutorService = u;
                z = true;
            } else {
                scheduledExecutorService = u;
                z = false;
            }
            bpn0Var = bpn0Var2;
            d13Var = d13Var2;
            sxi0Var = B2;
            h360Var = vd;
            nsVar = o1;
            k200Var = k200Var2;
            r460Var = r460Var2;
            context2 = context4;
            i = 0;
            jz2Var = new erk0(scheduledExecutorService, m03Var, new StartUpMethodPriorityBackoffBaseImpl(n03Var, set, set2, z, mode2, d13Var));
        }
        List singletonList = Collections.singletonList(new ln30());
        List singletonList2 = Collections.singletonList(new on30());
        bpn0 bpn0Var3 = new bpn0(new gzs() { // from class: xsna.o03
            @Override // xsna.gzs
            public final Object invoke() {
                return new bk(mxi0.this, new s4(J2, 5), new bv0(1));
            }
        });
        hjv hjvVar = gjv.a;
        bjv bjvVar = new bjv(0, gjv.a, hjv.class, "getCurrentXScreen", "getCurrentXScreen()Ljava/lang/String;", 0);
        yx2.a aVar = apiConfig.f;
        int i3 = aVar.a;
        long j = aVar.b;
        p03 p03Var = new p03(i);
        q03 q03Var = new q03(i);
        r03 r03Var = new r03(i);
        s03 s03Var = new s03(i);
        d13 d13Var3 = d13Var;
        bpn0 bpn0Var4 = new bpn0(new pb8(8));
        bpn0 bpn0Var5 = new bpn0(new k03(15));
        vv8 vv8Var = new vv8(8);
        mer0 mer0Var = new mer0(context2, "com.vkontakte.android_pref_name");
        wv8 wv8Var = new wv8(10);
        long millis = TimeUnit.HOURS.toMillis(1L);
        long millis2 = TimeUnit.SECONDS.toMillis(2L);
        Context context6 = context2;
        VKApiConfig vKApiConfig = new VKApiConfig(context6, 0, k200Var, vtk0Var, hcwVar, bpn0Var4, "5.131", r460Var, d13Var3, w03Var, bpn0Var5, "", true, bpn0Var, 3, p03Var, q03Var, vv8Var, mer0Var, wv8Var, millis, millis, millis2, new vx5(), new kaq(millis, millis, millis2), jz2Var, r03Var, new bpn0(new qb8(10)), new bpn0(new qb8(10)), singletonList, bpn0Var3, s03Var, bjvVar, i3, j, new bpn0(new qb8(10)), singletonList2, nx70Var);
        dc3 dc3Var = new dc3(J2, sxi0Var, h360Var, J7);
        List<y0a0> singletonList3 = Collections.singletonList(ivg0.e);
        v03 v03Var = new v03(apiConfig);
        bpn0 bpn0Var6 = new bpn0(new t03(0));
        vx2Var.getClass();
        vx2.f.lock();
        try {
            cj00 cj00Var = new cj00(context6);
            String string = ((Bundle) ((bpn0) cj00Var.b).getValue()).getString("api_secret");
            if (string == null) {
                string = "";
            }
            vx2.c = string;
            vx2.b = ((Bundle) ((bpn0) cj00Var.b).getValue()).getInt("api_id");
            vx2.d = dc3Var;
            vx2.a(vKApiConfig, dc3Var, v03Var, bpn0Var6);
            vx2.a aVar2 = vx2.d;
            z230.a = dc3Var.e();
            z230.b = aVar2;
            xx2 xx2Var = new xx2(dc3Var);
            for (y0a0 y0a0Var : singletonList3) {
                y0a0Var.c = xx2Var;
                com.vk.core.utils.newtork.b.a.getClass();
                com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new q27(new kpy(y0a0Var, 2), 2));
            }
            hhx0.d = new wx2(dc3Var);
            com.vk.core.utils.newtork.b.a.getClass();
            com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new x240(new h460(1), 1));
            vx2.g.signal();
            vx2.f.unlock();
            nb3 nb3Var = nb3.a;
            c63 c63Var = c63.a;
            c63.a(new vb3());
            ub3 ub3Var = new ub3(nsVar);
            nb3.e = ub3Var;
            c63.a(ub3Var);
            return s3q0.a;
        } catch (Throwable th) {
            vx2.g.signal();
            vx2.f.unlock();
            throw th;
        }
    }
}
