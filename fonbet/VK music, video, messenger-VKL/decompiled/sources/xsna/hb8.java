package xsna;

import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.multiaccount.impl.di.VkClientMultiAccountComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.player.cache.a;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.oauth.di.OAuthComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.trustedhash.di.TrustedHashComponentImpl;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import xsna.re50;
import xsna.yzc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class hb8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hb8(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        int i = 0;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return new khg(0);
            case 1:
                return new com.vk.pushes.receivers.c(i);
            case 2:
                return new pky();
            case 3:
                Features.Type type = Features.Type.FEATURE_CORE_PROXY_COMBINED_STATE;
                type.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(type));
            case 4:
                return ((NewsFeedComponent) ((k7m) m7m.f(ce60.b)).a(fpf0.a(NewsFeedComponent.class))).Y2();
            case 5:
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                return new sct0(new OKVoipEngine.l(oKVoipEngine, OKVoipEngine.class, "currentConversation", "getCurrentConversation()Lru/ok/android/externcalls/sdk/Conversation;", 0), ParticipantVideoViewManager.Companion.newInstance$default(ParticipantVideoViewManager.Companion, new OKVoipEngine.m(oKVoipEngine, OKVoipEngine.class, "currentConversation", "getCurrentConversation()Lru/ok/android/externcalls/sdk/Conversation;", 0), OKVoipEngine.n.b, new eu2(12), false, 8, null), new OKVoipEngine.o(1, oKVoipEngine, OKVoipEngine.class, "runOnEngineThread", "runOnEngineThread(Lkotlin/jvm/functions/Function0;)V", 0));
            case 6:
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                b.d i2 = bVar.i(MusicFeatures.AUDIO_PLAYER_VIDEO_BUFFERING);
                if (i2 == null || !i2.a) {
                    obj = qe50.a;
                } else {
                    b.d i3 = bVar.i(MusicFeatures.AUDIO_PLAYER_PREFETCH_CONFIG);
                    if (i3 != null) {
                        if (!i3.a) {
                            i3 = null;
                        }
                        if (i3 != null) {
                            i2 = i3;
                        }
                    }
                    JSONObject g = i2.g();
                    if (g != null) {
                        obj = new re50.a(swe0.g(g.optInt("prefetch_tracks_count", 3), 0, 10), swe0.g(g.optInt("cache_size_mb", 50), 50, 1024), swe0.g(g.optInt("first_phase_prefetch_tracks_count", 3), 0, 10));
                    } else {
                        obj = re50.b.a;
                    }
                }
                if (!(obj instanceof re50)) {
                    return a.b.a;
                }
                re50 re50Var = (re50) obj;
                return new a.C1333a(re50Var.b(), re50Var.a(), 0, 0, re50Var.d(), 12);
            case 7:
                return new ConcurrentHashMap();
            case 8:
                x84 x84Var = new x84(28);
                y84 y84Var = new y84(19);
                yzc0 yzc0Var = yzc0.b;
                return new tt80(((Boolean) yzc0.h.getValue()).booleanValue(), ((NewsFeedComponent) yzc0.d.getValue()).cc(), ((NewsfeedOptionalAdsComponent) yzc0.c.getValue()).d5(), new yzc0.a(y84Var), x84Var, new xzc0());
            case 9:
                return new OAuthComponentImpl.a();
            case 10:
                qcy<Object>[] qcyVarArr3 = StoryViewerComponentImpl.s;
                return new f8o0();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_DEEPLINK_NO_BG_LOAD;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                return new AuthBridgeComponentImpl.a();
            case 13:
                return new ChannelCreationInternalDiComponent.a();
            case 14:
                return new TrustedHashComponentImpl.a();
            case 15:
                qcy<Object>[] qcyVarArr4 = VkClientMultiAccountComponentImpl.g;
                return new ilu0();
            case 16:
                return asu0.a.b(5, 0L, "vk-push-queue-thread");
            default:
                return new HashMap();
        }
    }
}
