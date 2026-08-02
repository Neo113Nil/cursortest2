package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.log.L;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.superapp.vkworkout.di.VkWorkoutComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dp implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                boolean z = true;
                try {
                    z = gnj.a(((AccountManagerComponentImpl) obj).a).getBoolean("com.vk.accountmanager.enabled", true);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return Boolean.valueOf(z);
            case 1:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                bpn0 bpn0Var = offlineAudioComponentImpl.J;
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                gco gcoVar = k840.a.l;
                fq40 fq40Var = (fq40) offlineAudioComponentImpl.I.getValue();
                sg40 Ef = offlineAudioComponentImpl.Ef();
                wh40 wh40Var = (wh40) offlineAudioComponentImpl.w.getValue();
                abo l8 = offlineAudioComponentImpl.l8();
                com.vk.music.notifications.restriction.a aVar = k840.a.d;
                if (aVar == null) {
                    aVar = null;
                }
                return new mq40(new vh40(gcoVar, fq40Var, Ef, wh40Var, l8, aVar, offlineAudioComponentImpl.Ff(), offlineAudioComponentImpl.Ff()), (dq40) bpn0Var.getValue(), new yq40(offlineAudioComponentImpl.a, (vp40) offlineAudioComponentImpl.F.getValue(), (dq40) bpn0Var.getValue(), offlineAudioComponentImpl.b), offlineAudioComponentImpl.Ff());
            case 2:
                ParallelTaskRunner parallelTaskRunner = (ParallelTaskRunner) obj;
                parallelTaskRunner.g(parallelTaskRunner.j, RunStep.AfterColdStart, false, null);
                return s3q0.a;
            case 3:
                final VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar2 = VKApplication.c;
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                if (Preference.f("install_referrer_prefs").getBoolean("reported", false)) {
                    L.p("reportInstallIfApplicable: skipping reporting");
                } else {
                    n.submit(new Runnable() { // from class: xsna.e6x
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = vKApplication;
                            InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                            build.startConnection(new g6x(build, context));
                        }
                    });
                }
                return s3q0.a;
            default:
                VkWorkoutComponentImpl vkWorkoutComponentImpl = (VkWorkoutComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = VkWorkoutComponentImpl.f;
                return new com.vk.superapp.vkworkout.b(vkWorkoutComponentImpl.a.Wb(), vkWorkoutComponentImpl.Te());
        }
    }
}
