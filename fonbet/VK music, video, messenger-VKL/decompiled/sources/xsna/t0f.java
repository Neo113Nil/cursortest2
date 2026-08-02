package xsna;

import android.content.Context;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.music.analytics.di.MusicAnalyticsComponentImpl;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class t0f implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ t0f(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        gpf gpfVar;
        switch (this.b) {
            case 0:
                return new ClipsPlaylistsComponentImpl.a();
            case 1:
                Context context = com.vk.core.dynamic_loader.b.c;
                Context context2 = context != null ? context : null;
                synchronized (kq01.class) {
                    try {
                        if (kq01.b == null) {
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext != null) {
                                context2 = applicationContext;
                            }
                            kq01.b = new gpf(new yuz0(context2));
                        }
                        gpfVar = kq01.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                mlk0 mlk0Var = (mlk0) ((j601) gpfVar.a).zza();
                mlk0Var.d(com.vk.core.dynamic_loader.b.f);
                return mlk0Var;
            case 2:
                return new zys();
            case 3:
                String h = o25.a().h();
                UserId c = o25.a().c();
                o25.a().getClass();
                return new w25(o25.a().I(), o25.a().r(), o25.a().v(), c, h, "");
            case 4:
                return ((NotificationsSettingsComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(NotificationsSettingsComponent.class))).a();
            case 5:
                return new MusicAnalyticsComponentImpl.a();
            case 6:
                CoreFeatures coreFeatures = CoreFeatures.FOLDABLE_FLOW;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 7:
                asu0.a.getClass();
                return new qcn((ExecutorService) asu0.Q.getValue());
            case 8:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_HORIZONTAL_VIEW;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 9:
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                return new hvl0();
            case 10:
                return fo8.a("api.".concat(a0a.d), "/oauth");
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return (AudioModelsComponent) m7m.e().a(fpf0.a(AudioModelsComponent.class));
            case 12:
                VKApplication.a aVar2 = VKApplication.c;
                asu0.a.getClass();
                asu0.h().submit(new twv(2));
                return s3q0.a;
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ARTIST_MIMIC_DESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.IM_TRACER_SYSTRACE_PROFILER_CONFIG);
                if (i == null) {
                    return null;
                }
                if (!i.a) {
                    i = null;
                }
                if (i != null) {
                    return i.c.toString();
                }
                return null;
            case 15:
                return new AdsComponentImpl.a();
            case 16:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.FALSE, "com.vk.android_auto");
                bool.getClass();
                return bool;
            case 17:
                return new k8n0();
            case 18:
                bpn0 bpn0Var = jfv0.d;
                return "0";
            case 19:
                com.vk.voip.ui.c.p.getClass();
                Context context3 = e43.a;
                return new gvw0(context3 != null ? context3 : null);
            default:
                return new dit();
        }
    }

    public /* synthetic */ t0f(VKApplication vKApplication) {
        this.b = 11;
    }
}
