package xsna;

import com.vk.biometric.auth.impl.di.BiometricAuthComponentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.core.traffic.TrafficLightAsyncImpl;
import com.vk.dialogslist.impl.di.DialogsListInternalFeatureComponentStub;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.im.sync.impl.di.ImSynchronizationHelpersComponentImpl;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.playlist.di.MusicPlaylistComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.superapp.miniappsads.optionalformats.impl.di.AdvertisementOptionalFormatsComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.Executors;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dr6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dr6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new Regex("@\\w+");
            case 1:
                return new ClipsCoauthorsInternalComponent.a();
            case 2:
                qcy<Object>[] qcyVarArr = ImSynchronizationHelpersComponentImpl.h;
                return new i9w();
            case 3:
                return ukg.a;
            case 4:
                return new zh3(4);
            case 5:
                qcy<Object>[] qcyVarArr2 = MarketComponentImpl.l;
                return new y110(new hy2(17));
            case 6:
                return EmptySet.b;
            case 7:
                return new k840.a.C3168a((AudioModelsComponent) k840.a.b().a(fpf0.a(AudioModelsComponent.class)));
            case 8:
                return new MusicPlaylistComponentImpl.a();
            case 9:
                return new TrafficLightAsyncImpl();
            case 10:
                qcy<Object>[] qcyVarArr3 = NewsFeedComponentImpl.D;
                return new n73();
            case 11:
                FeedFeatures feedFeatures = FeedFeatures.DS_REPOST_HEADER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                qcy<Object>[] qcyVarArr4 = OfflineAudioComponentImpl.M;
                return new kc50();
            case 13:
                qni0 qni0Var = qni0.a;
                return Boolean.FALSE;
            case 14:
                CoreFeatures coreFeatures = CoreFeatures.KBH_ACTIVE_ONLY;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 15:
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                return asu0.q();
            case 16:
                VKApplication.a aVar2 = VKApplication.c;
                gjk0 b = com.vk.toggle.d.r.b();
                if (b == null) {
                    gjk0.c.getClass();
                    b = gjk0.d;
                }
                return Boolean.valueOf(b.a);
            case 17:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SEARCH_EMPTY_VKUI;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                return new uft0();
            case 19:
                return new int[]{0, 0};
            case 20:
                return new AdvertisementOptionalFormatsComponentImpl.a();
            case 21:
                return new BiometricAuthComponentImpl.a();
            case 22:
                return new DialogsListInternalFeatureComponentStub.a();
            case 23:
                return asu0.a.z(1, "vk-low-priority-thread");
            default:
                return Executors.newSingleThreadScheduledExecutor(new wer0(1));
        }
    }
}
