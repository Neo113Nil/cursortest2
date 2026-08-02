package xsna;

import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: StartupTrackerTaskLogic.kt */
/* loaded from: classes11.dex */
public final class grk0 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "StartupTracker";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Application application = this.b;
        boolean h = BuildInfo.h();
        bpn0 bpn0Var = new bpn0(new u0f(7));
        ReentrantLock reentrantLock = rhr.c;
        reentrantLock.lock();
        try {
            rhr.b = bpn0Var;
            rhr.e = h;
            if (bl20.a == null) {
                Preference.a.getClass();
                Preference.w(application);
                bl20.a = Preference.f("analytics");
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            com.vk.metrics.eventtracking.a aVar = new com.vk.metrics.eventtracking.a();
            synchronized (bVar) {
                try {
                    VkMainTracker vkMainTracker = com.vk.metrics.eventtracking.b.c;
                    if (vkMainTracker != null) {
                        vkMainTracker.h(null);
                    }
                    com.vk.metrics.eventtracking.b.c = aVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.b(new vkr(new g4k(new uia(this, 8), new bpn0(new b63(12)))));
            rhp0 rhp0Var = new rhp0();
            rhp0Var.a.putString("APP_VERSION", BuildInfo.a());
            rhp0Var.a.putBoolean("IS_DEBUG", BuildInfo.h());
            VKApplication.c.getClass();
            rhp0Var.a.putString("MY_TRACKER_ID", VKApplication.e);
            bVar.c(this.b, rhp0Var.a, new y56(9));
            Bundle bundle = new rhp0().a;
            bundle.putLong(CommonConstant.RETKEY.USERID, 0L);
            bundle.putString("USER_NAME", "no_auth");
            bundle.putString("STORE_NAME", null);
            bVar.f(bundle);
            bVar.f(rhp0.b);
            return s3q0.a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
