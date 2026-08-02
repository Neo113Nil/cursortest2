package xsna;

import android.hardware.SensorManager;
import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.TaskExecutorType;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.api.di.UploadComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bp implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AccountManagerComponentImpl accountManagerComponentImpl = (AccountManagerComponentImpl) obj;
                qcy<Object>[] qcyVarArr = AccountManagerComponentImpl.h;
                mp c = accountManagerComponentImpl.c();
                pon0 pon0Var = accountManagerComponentImpl.b;
                mxi0 ie = accountManagerComponentImpl.d.getValue().ie();
                r55 r55Var = r55.a;
                return new wcu0(c, pon0Var, ie, r55.d());
            case 1:
                return (SensorManager) ((wpj) obj).a.getSystemService("sensor");
            case 2:
                return ((nx50) obj).F0().Ac();
            case 3:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                nwy nwyVar = ((NewsFeedComponentImpl) obj).g;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[4];
                return new b0c0(new lj70(((NewsfeedMappersComponent) nwyVar.c()).K8()));
            case 4:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                return new eu70((sp40) offlineAudioComponentImpl.E.getValue(), (jc50) offlineAudioComponentImpl.H.getValue());
            case 5:
                ParallelTaskRunner parallelTaskRunner = (ParallelTaskRunner) obj;
                TaskExecutorType taskExecutorType = TaskExecutorType.PRIORITIZED_POOL;
                return new mh90(new nh90(parallelTaskRunner, taskExecutorType), parallelTaskRunner.b, parallelTaskRunner.c, taskExecutorType);
            case 6:
                return new fac((a2o) obj);
            case 7:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_TREE_COMMENTS;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                return ((UploadComponent) ((k7m) m7m.f((kzv0) obj)).a(fpf0.a(UploadComponent.class))).a();
            default:
                VkWorkoutComponentImpl vkWorkoutComponentImpl = (VkWorkoutComponentImpl) obj;
                qcy<Object>[] qcyVarArr4 = VkWorkoutComponentImpl.f;
                s2w0 s2w0Var = new s2w0();
                x1w0 x1w0Var = new x1w0();
                hzx0 hzx0Var = new hzx0();
                izx0 izx0Var = new izx0();
                k0v k0vVar = new k0v();
                a0v a0vVar = new a0v();
                d2w0 d2w0Var = new d2w0();
                VkHealthPermissionsComponent vkHealthPermissionsComponent = vkWorkoutComponentImpl.a;
                m2w0 m2w0Var = new m2w0(new i9u(vkHealthPermissionsComponent.Wb()), a0vVar, hzx0Var, izx0Var);
                return new g2w0(s2w0Var, new gpt(m2w0Var), new ipt(m2w0Var), new cut(d2w0Var, vkHealthPermissionsComponent.Wb()), new zpw(m2w0Var, s2w0Var, vkWorkoutComponentImpl.b.W4()), k0vVar, x1w0Var);
        }
    }
}
