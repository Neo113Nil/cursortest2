package xsna;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.multiaccount.impl.di.VkClientMultiAccountComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.rustore.di.RuStoreComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                BridgeComponentImpl bridgeComponentImpl = (BridgeComponentImpl) obj;
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return new nlu0(((ClipsViewerAdapterComponent) bridgeComponentImpl.d.getValue()).e0(), ((ClipCheckerComponent) bridgeComponentImpl.e.getValue()).B9(), ((ClipsConfigViewersComponent) bridgeComponentImpl.f.getValue()).getExperiments(), ((CacheComponent) bridgeComponentImpl.g.getValue()).yc());
            case 1:
                gxw gxwVar = (gxw) obj;
                return new olu0(new bpn0(new q12(gxwVar, 4)), new bpn0(new wh(gxwVar, 2)));
            case 2:
                return ((LinksBridgeComponentImpl) obj).x.a();
            case 3:
                return (StoriesComponent) ((g8m) obj).a(fpf0.a(StoriesComponent.class));
            case 4:
                return new l9r((File) ((tm70) obj).b.getValue(), 102400L);
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                gt70 gt70Var = new gt70();
                gt70Var.a = offlineAudioComponentImpl;
                return new fk80(gt70Var, new sgl(offlineAudioComponentImpl), offlineAudioComponentImpl.u3(), new ht70(offlineAudioComponentImpl));
            case 6:
                return ((SessionManagementComponent) ((k7m) m7m.f((cnj0) obj)).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 7:
                return ((RuStoreComponent) ((k7m) m7m.f((qmr0) obj)).a(fpf0.a(RuStoreComponent.class))).Bf();
            case 8:
                VkClientMultiAccountComponentImpl vkClientMultiAccountComponentImpl = (VkClientMultiAccountComponentImpl) obj;
                MultiAccountComponent multiAccountComponent = vkClientMultiAccountComponentImpl.b;
                return new llu0(multiAccountComponent.a(), vkClientMultiAccountComponentImpl.a.J2(), new nn(new q6x()), multiAccountComponent.c());
            case 9:
                return (o2i) ((kzv0) obj).h.getValue();
            default:
                dwx0 dwx0Var = (dwx0) obj;
                WorkDatabase workDatabase = dwx0Var.c;
                int i2 = Build.VERSION.SDK_INT;
                Context context = dwx0Var.a;
                String str = sqn0.g;
                if (i2 >= 34) {
                    nyx.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList b = sqn0.b(context, jobScheduler);
                if (b != null && !b.isEmpty()) {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        sqn0.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                workDatabase.D().k();
                i8h0.b(dwx0Var.b, workDatabase, dwx0Var.e);
                return s3q0.a;
        }
    }
}
