package xsna;

import android.os.Trace;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.donut.video.subscription.impl.data.db.CachedSubscriptionsDb;
import com.vk.donut.video.subscription.impl.di.DonutSubscriptionVideoComponentImpl;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.posting.impl.di.Posting2ComponentImpl;
import com.vk.tabbar.core.impl.di.TabbarCoreComponentImpl;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import xsna.k840;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g3o implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g3o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                nwy nwyVar = ((DonutSubscriptionVideoComponentImpl) obj).d;
                qcy<Object> qcyVar = DonutSubscriptionVideoComponentImpl.f[1];
                return ((CachedSubscriptionsDb) nwyVar.c()).y();
            case 1:
                return (DialogsScreenFeatureComponent) ((g8m) obj).a(fpf0.a(DialogsScreenFeatureComponent.class));
            case 2:
                final String concat = ((c7x) obj).d.concat("-jobs-notify-builder");
                return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: xsna.e7x
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable, concat);
                    }
                });
            case 3:
                KnetExecutorType knetExecutorType = (KnetExecutorType) ((wjy.a) obj).h.invoke();
                knetExecutorType.getClass();
                if (knetExecutorType != KnetExecutorType.CRONET_H2 && knetExecutorType != KnetExecutorType.CRONET_QUIC) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return ((ClipsUploadSdkUploaderComponent) m7m.a(((nx50) obj).b).a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb();
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                r5v0 r5v0Var = k840.a.h;
                return new jq40((r5v0Var != null ? r5v0Var : null).a.a, offlineAudioComponentImpl, offlineAudioComponentImpl.u3());
            case 6:
                fxc0.B().B();
                return ((gm80) obj).a.c(null).a;
            case 7:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.groupsStorageManager"));
                try {
                    gru gruVar = new gru(bhl0Var.B());
                    bhl0Var.z(gruVar);
                    return gruVar;
                } finally {
                    Trace.endSection();
                }
            case 8:
                TabbarCoreComponentImpl tabbarCoreComponentImpl = (TabbarCoreComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = TabbarCoreComponentImpl.g;
                return new dun0(tabbarCoreComponentImpl.o6(), tabbarCoreComponentImpl.b.D(), tabbarCoreComponentImpl.a.J2(), new gun0(), tabbarCoreComponentImpl.c.md(), tabbarCoreComponentImpl.d.t().b());
            case 9:
                return Boolean.valueOf(((qks0) obj).a);
            default:
                return new Posting2ComponentImpl.a(((jau0) obj).b);
        }
    }
}
