package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Trace;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.donut.video.subscription.impl.data.db.CachedSubscriptionsDb;
import com.vk.donut.video.subscription.impl.di.DonutSubscriptionVideoComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.folders.impl.di.FoldersComponentImpl;
import com.vk.im.sync.api.di.ImSynchronizationComponent;
import com.vk.im.sync.impl.di.ImSynchronizationHelpersComponentImpl;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.api.di.UploadComponent;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import okhttp3.logging.HttpLoggingInterceptor;
import xsna.c200.b;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gb3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gb3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        androidx.media3.exoplayer.offline.c cVar;
        RuntimeException runtimeException;
        boolean z = false;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 1:
                return (CachedSubscriptionsDb) bhv0.a(((DonutSubscriptionVideoComponentImpl) this.c).a.a, "donut_subscription", CachedSubscriptionsDb.class).b();
            case 2:
                FoldersComponentImpl foldersComponentImpl = (FoldersComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = FoldersComponentImpl.e;
                return new dyr(foldersComponentImpl.a.s(), new com.vk.movika.sdk.base.ui.o0(17));
            case 3:
                return (UploadComponent) ((g8m) this.c).a(fpf0.a(UploadComponent.class));
            case 4:
                ImSynchronizationHelpersComponentImpl imSynchronizationHelpersComponentImpl = (ImSynchronizationHelpersComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ImSynchronizationHelpersComponentImpl.h;
                Context context = imSynchronizationHelpersComponentImpl.a.a;
                ImSynchronizationComponent imSynchronizationComponent = imSynchronizationHelpersComponentImpl.c;
                jxv Ea = imSynchronizationComponent.Ea();
                w0i0 V4 = imSynchronizationComponent.V4();
                nwy nwyVar = imSynchronizationHelpersComponentImpl.f;
                qcy<Object> qcyVar = ImSynchronizationHelpersComponentImpl.h[0];
                return new s2w(context, Ea, V4, (h9w) nwyVar.c(), imSynchronizationHelpersComponentImpl.b.getExperiments(), imSynchronizationHelpersComponentImpl.d.l(), imSynchronizationHelpersComponentImpl.e.K().t().b());
            case 5:
                final String concat = ((c7x) this.c).d.concat("-jobs-manager-internal");
                return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: xsna.d7x
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable, concat);
                    }
                });
            case 6:
                wjy.a aVar = (wjy.a) this.c;
                return ((Boolean) aVar.D.invoke()).booleanValue() ? new b360() : new a360(aVar.a);
            case 7:
                return new HttpLoggingInterceptor(((c200) this.c).new b());
            case 8:
                return new tz00(((MarketComponentImpl) this.c).a.Cf());
            case 9:
                return ((ClipsUploadVkComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            case 10:
                OfflineAudioDatabase a = OfflineAudioDatabase.j.a(((OfflineAudioComponentImpl) this.c).a);
                return new sh4(a.y(), a.C());
            case 11:
                gm80 gm80Var = (gm80) this.c;
                fxc0.B().B();
                bu70 bu70Var = gm80Var.a;
                bu70 bu70Var2 = bu70.a;
                synchronized (bu70Var) {
                    cVar = bu70.e;
                    if (cVar == null) {
                        runtimeException = cu70.a;
                        throw runtimeException;
                    }
                }
                return cVar;
            case 12:
                Object systemService = ((VKApplication) this.c).getSystemService("activity");
                if (systemService instanceof ActivityManager) {
                    return (ActivityManager) systemService;
                }
                return null;
            case 13:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.emailsStorageManager"));
                try {
                    ocp ocpVar = new ocp(bhl0Var.B());
                    bhl0Var.z(ocpVar);
                    return ocpVar;
                } finally {
                    Trace.endSection();
                }
            default:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.LAZY_SEARCH_CONTROLS;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
