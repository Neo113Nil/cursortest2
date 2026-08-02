package xsna;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.toggle.b;
import com.vk.toggle.data.HostPushesMode;
import com.vk.toggle.features.VkcFeatures;
import java.util.Iterator;
import xsna.b4w0;

/* compiled from: HostPushSdkInitTask.kt */
/* loaded from: classes11.dex */
public final class fgv extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "HostPushSdkInit";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049 A[SYNTHETIC] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke() {
        int i;
        Iterator<E> it;
        Object obj;
        HostPushesMode hostPushesMode;
        String obj2;
        Application application = this.b;
        bpn0 bpn0Var = new bpn0(new egv(this, 0));
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        b.d i2 = com.vk.toggle.b.A.i(VkcFeatures.HOST_PUSHES);
        if (i2 != null && (obj2 = i2.c.toString()) != null) {
            try {
                i = Integer.parseInt(obj2);
            } catch (Throwable unused) {
            }
            HostPushesMode.Companion.getClass();
            it = HostPushesMode.h().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((HostPushesMode) obj).i() == i) {
                    break;
                }
            }
            hostPushesMode = (HostPushesMode) obj;
            if (hostPushesMode == null) {
                hostPushesMode = HostPushesMode.DISABLED;
            }
            boolean z = hostPushesMode != HostPushesMode.ENABLED || (hostPushesMode == HostPushesMode.ENABLED_WITHOUT_GOOGLE_SERVICES && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(application) != 0);
            zzp zzpVar = new zzp(bpn0Var);
            yhe0 yhe0Var = new yhe0();
            y3w0 y3w0Var = new y3w0(application, zzpVar, yhe0Var, z);
            synchronized (b4w0.E) {
                try {
                    boolean z2 = b4w0.G != null;
                    if (z2) {
                        Logger.DefaultImpls.warn$default(yhe0Var, "SDK has been already initialized", null, 2, null);
                    } else {
                        if (z2) {
                            hpj hpjVar = b4w0.b.a().D;
                            zvj.c(hpjVar, null);
                            iyx.d(hpjVar.b);
                        }
                        b4w0.G = new b4w0(y3w0Var);
                        b4w0.F.signalInitialized();
                        b4w0 a = b4w0.b.a();
                        myc0.h(a.D, null, null, new c4w0(a, null), 3);
                    }
                } finally {
                }
            }
            yhe0 yhe0Var2 = new yhe0();
            VkpnsPushConfig vkpnsPushConfig = new VkpnsPushConfig(application, yhe0Var2, z, VkpnsPushConfig.BackgroundWorkMode.SERVICE_WITH_PERIODIC_WORKER);
            synchronized (e5w0.y) {
                try {
                    boolean z3 = e5w0.A != null;
                    if (z3) {
                        Logger.DefaultImpls.warn$default(yhe0Var2, "SDK has been already initialized", null, 2, null);
                    } else {
                        if (z3) {
                            e5w0 e5w0Var = e5w0.A;
                            if (e5w0Var == null) {
                                throw new IllegalStateException("VkpnsPushProviderSdk.init() must be called before accessing its members");
                            }
                            hpj hpjVar2 = e5w0Var.x;
                            zvj.c(hpjVar2, null);
                            iyx.d(hpjVar2.b);
                            ((yfl0) e5w0Var.l.getValue()).a(new f5w0(e5w0Var));
                        }
                        e5w0.A = new e5w0(vkpnsPushConfig);
                        e5w0.z.signalInitialized();
                        e5w0 e5w0Var2 = e5w0.A;
                        if (e5w0Var2 == null) {
                            throw new IllegalStateException("VkpnsPushProviderSdk.init() must be called before accessing its members");
                        }
                        myc0.h(e5w0Var2.x, null, null, new h5w0(e5w0Var2, null), 3);
                    }
                } finally {
                }
            }
            return s3q0.a;
        }
        i = 0;
        HostPushesMode.Companion.getClass();
        it = HostPushesMode.h().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        hostPushesMode = (HostPushesMode) obj;
        if (hostPushesMode == null) {
        }
        if (hostPushesMode != HostPushesMode.ENABLED) {
        }
        zzp zzpVar2 = new zzp(bpn0Var);
        yhe0 yhe0Var3 = new yhe0();
        y3w0 y3w0Var2 = new y3w0(application, zzpVar2, yhe0Var3, z);
        synchronized (b4w0.E) {
        }
    }
}
