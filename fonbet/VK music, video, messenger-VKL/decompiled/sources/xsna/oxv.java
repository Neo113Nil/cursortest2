package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.api.di.UploadComponent;
import com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent;
import com.vk.voip.ui.di.VoipFirstCallCacheComponent;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import java.util.List;
import xsna.p2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class oxv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oxv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return ((UploadComponent) ((ImBridgeComponentImpl) this.c).e.getValue()).a();
            case 1:
                return go9.b("#starting env with db ", (String) this.c);
            case 2:
                gxw gxwVar = (gxw) this.c;
                xkg xkgVar = xkg.a;
                yre0 H4 = ((QueueSyncComponent) gxwVar.c().a(fpf0.a(QueueSyncComponent.class))).H4();
                vre0 i0 = ((QueueSyncComponent) gxwVar.c().a(fpf0.a(QueueSyncComponent.class))).i0();
                vx2.a.getClass();
                return new nng(i0, H4, vx2.b, new bpn0(new fr4(gxwVar, 6)), (VoipFirstCallCacheComponent) gxwVar.c().a(fpf0.a(VoipFirstCallCacheComponent.class)), ((VoipMiniAppCallComponent) gxwVar.c().a(fpf0.a(VoipMiniAppCallComponent.class))).P());
            case 3:
                c200 c200Var = (c200) this.c;
                List<String> list = p2i0.b;
                return p2i0.a.a(c200Var.b);
            case 4:
                return ((CommunityStrikesComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(CommunityStrikesComponent.class))).ge();
            case 5:
                return ((com.vk.toggle.e) this.c).a.getApiConfig();
            case 6:
                NewsFeedComponentImpl newsFeedComponentImpl = (NewsFeedComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                nwy nwyVar = newsFeedComponentImpl.c;
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                qcy<Object> qcyVar = qcyVarArr2[0];
                Context context = ((AppContextDiComponent) nwyVar.c()).a;
                nwy nwyVar2 = newsFeedComponentImpl.e;
                qcy<Object> qcyVar2 = qcyVarArr2[2];
                b25 s = ((BridgeComponent) nwyVar2.c()).s();
                nwy nwyVar3 = newsFeedComponentImpl.f;
                qcy<Object> qcyVar3 = qcyVarArr2[3];
                return new ixq(new qd60(context, s, ((CacheComponent) nwyVar3.c()).yc(), asu0.a.c(), BuildInfo.e));
            case 7:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                return new sp40(offlineAudioComponentImpl.a, offlineAudioComponentImpl.Ib());
            case 8:
                return Preference.h(((a0b0) this.c).a, 0, "audio_msg_player_default_config");
            case 9:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_OFFLINE_PLAYBACK_ERRORS_EVASION;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return (v7s0) ((bpn0) this.c).getValue();
        }
    }
}
