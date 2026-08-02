package xsna;

import android.app.NotificationManager;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.music.api.di.MusicCatalogSectionIdProviderComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((ClipEditComponent) r2.getValue()).d6();
            case 1:
                return ((SakAnalyticsComponent) m7m.a(((rdk) r2).a).a(fpf0.a(SakAnalyticsComponent.class))).Oe();
            case 2:
                return ((QueueSyncComponent) ((k7m) m7m.f((ruo) r2)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 3:
                return ((BridgeComponent) ((gxw) r2).c().a(fpf0.a(BridgeComponent.class))).A();
            case 4:
                return (NotificationManager) ((r7x) r2).a.getSystemService("notification");
            case 5:
                return ((NotificationListComponent) ((LinksBridgeComponentImpl) r2).h.getValue()).a();
            case 6:
                return ((MusicCatalogSectionIdProviderComponent) ((k7m) m7m.f((s750) r2)).mo408a(fpf0.a(MusicCatalogSectionIdProviderComponent.class))).A9();
            case 7:
                return new yt4((OfflineAudioDatabase_Impl) r2);
            case 8:
                aid0 aid0Var = (aid0) r2;
                xhd0 xhd0Var = aid0Var.b;
                ExecutorService b = xhd0Var.i.b();
                b320 b320Var = xhd0Var.j;
                guz guzVar = new guz(b, b320Var, xhd0Var.a);
                r3q r3qVar = xhd0Var.i;
                return aid0Var.h(guzVar, new uso0[]{new huz(r3qVar.b(), b320Var, xhd0Var.a), new LocalExifThumbnailProducer(r3qVar.e(), b320Var, xhd0Var.a)});
            case 9:
                qks0 qks0Var = (qks0) r2;
                if (qks0Var.a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_OVERLAY_AD;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                } else if (qks0Var.b) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SA_OVERLAY_AD;
                    videoFeatures2.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures2);
                }
                return Boolean.valueOf(z);
            case 10:
                List<ymy> c = ((v1v0) r2).c();
                ArrayList arrayList = new ArrayList(c5g.u(c, 10));
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ymy) it.next()).e());
                }
                return j5g.S0(arrayList);
            default:
                return ((CommunityStrikesComponent) ((k7m) m7m.f((kzv0) r2)).a(fpf0.a(CommunityStrikesComponent.class))).ge();
        }
    }
}
