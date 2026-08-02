package xsna;

import com.vk.ads.stats.impl.di.AdPixelStatsComponentImpl;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.ecomm.checklist.impl.di.MarketChecklistComponentImpl;
import com.vk.im.engine.di.event.ImEventPublisherComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.libvideo.di.VideoHistoryRecordComponentImpl;
import com.vk.libvideo.seek.di.VideoSeekComponentImpl;
import com.vk.log.L;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.superapp.multiaccount.impl.MultiAccountComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.create.di.VoipStereoCreateRoomRouterComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.MenuComponentImpl;
import kotlin.collections.EmptySet;
import xsna.q97;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l67 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ l67(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return io.reactivex.rxjava3.subjects.d.O0(q97.c.a);
            case 1:
                return new ImEventPublisherComponentImpl.a();
            case 2:
                qcy<Object>[] qcyVarArr = MenuComponentImpl.d;
                return new MenuComponentImpl.d();
            case 3:
                return EmptySet.b;
            case 4:
                qcy<Object>[] qcyVarArr2 = MultiAccountComponentImpl.e;
                return new v240();
            case 5:
                return new CatalogLegacyComponentImpl.a();
            case 6:
                return Long.valueOf(com.vk.toggle.d.p().b);
            case 7:
                return new l5i();
            case 8:
                return String.valueOf(o25.a().c().b);
            case 9:
                qcy<Object>[] qcyVarArr3 = SakAnalyticsComponentImpl.f;
                return new fj80();
            case 10:
                return new MarketChecklistComponentImpl.a();
            case 11:
                return new w2n0(VkmSuccessRateEventBuilder.EventName.MENTION_MSG_OPEN);
            case 12:
                VKApplication.a aVar = VKApplication.c;
                int i = utj.s;
                Object obj = flv0.a;
                return s3q0.a;
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.MOVIE_SCREEN_DEEPLINK;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return new VideoSeekComponentImpl.a();
            case 15:
                return new VideoHistoryRecordComponentImpl.a();
            case 16:
                return new AdPixelStatsComponentImpl.a();
            case 17:
                boolean z = false;
                try {
                    z = Preference.j().getBoolean("oom_thread_create", false);
                } catch (Throwable th) {
                    L.i(th);
                }
                return Boolean.valueOf(z);
            case 18:
                return new VoipStereoCreateRoomRouterComponentStub.a();
            default:
                b = e8r.a.b(r1, PrivateSubdir.GAME_WEB_VIEW.h(), true);
                return b.a;
        }
    }
}
