package xsna;

import android.content.Context;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.core.preference.Preference;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponentImpl;
import com.vk.mapper.attachment.di.AttachmentMappersComponentImpl;
import com.vk.metrics.performance.images.ImageCacheSource;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.superapp.qr.web2app.QrWebToAppComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import xsna.l55;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y45 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ y45(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((TrustedHashComponent) ((k7m) m7m.f(new l55.h())).a(fpf0.a(TrustedHashComponent.class))).c();
            case 1:
                return pn00.k(new Pair(ImageCacheSource.IMAGES, new ConcurrentHashMap()), new Pair(ImageCacheSource.STICKERS, new ConcurrentHashMap()), new Pair(ImageCacheSource.OTHER, new ConcurrentHashMap()));
            case 2:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.FALSE;
            case 3:
                return new ImCommonCommandsFactoryComponentImpl.a();
            case 4:
                return Executors.newSingleThreadScheduledExecutor();
            case 5:
                k720 k720Var = k720.a;
                return k720.M("background_sync_update_key_superapp_v_", "sync_update_time");
            case 6:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 7:
                OKVoipEngine.b.getClass();
                return OKVoipEngine.E.getConversation();
            case 8:
                Preference.a.getClass();
                Context context = Preference.b;
                if (context == null) {
                    context = null;
                }
                return new ky6(new ib8(Preference.k(context), 10), Preference.n, Preference.c);
            case 9:
                return (YandexAdFeatureComponent) ((k7m) m7m.f(yzc0.b)).a(fpf0.a(YandexAdFeatureComponent.class));
            case 10:
                qcy<Object>[] qcyVarArr = QrWebToAppComponentImpl.d;
                return new loe0();
            case 11:
                QrWebToAppComponent.Companion.getClass();
                return QrWebToAppComponent.Companion.a();
            case 12:
                qcy<Object>[] qcyVarArr2 = StoryViewerComponentImpl.s;
                return new dnm0();
            case 13:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_CLIPS_BOTTOM_SHEET_REDESIGN;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 14:
                return new AttachmentMappersComponentImpl.a();
            case 15:
                return new NewsFeedBridgeComponentImpl.a();
            case 16:
                asu0.a.getClass();
                ExecutorService j = asu0.j();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(j, true);
            case 17:
                return new hqw0(new yp6(18));
            default:
                com.vk.voip.ui.c.b.getClass();
                return new mdh0(com.vk.voip.ui.c.F());
        }
    }
}
