package xsna;

import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.feed.blacklist.impl.di.BlacklistComponentImpl;
import com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.search.integration.impl.di.SearchComponentImpl;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.data.MusicAutoDownloadTrigger;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.onelog.UploadService;
import xsna.bf5;
import xsna.pe50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cu2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cu2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Long c;
        Lazy lazy;
        pe50 aVar;
        JSONObject g;
        Object obj = null;
        switch (this.b) {
            case 0:
                return new io.reactivex.rxjava3.subjects.f();
            case 1:
                nb3.a.getClass();
                SakFeatures.a aVar2 = SakFeatures.b;
                aVar2.getClass();
                if (SakFeatures.c == null) {
                    aVar2 = null;
                }
                ToggleManager toggleManager = aVar2 != null ? SakFeatures.c : null;
                b.d i = toggleManager != null ? toggleManager.i(SakFeatures.Type.CORE_DURING_UPDATE_TOGGLES) : null;
                return Long.valueOf((!p1p0.a(i) || i == null || (c = i.c()) == null) ? -1L : c.longValue());
            case 2:
                return new z0f();
            case 3:
                return Long.valueOf(qni0.a());
            case 4:
                return new OfflineAudioComponentImpl.a();
            case 5:
                NetworkType.Companion.getClass();
                lazy = NetworkType.EMPTY_TRANSPORT$delegate;
                return new NetworkState("", (Set) lazy.getValue(), -1, false, NetworkState.a.e);
            case 6:
                return Boolean.valueOf(com.vk.toggle.d.s().b);
            case 7:
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i2 = com.vk.toggle.b.A.i(MusicFeatures.AUDIO_AUTO_DOWNLOAD);
                int i3 = 10080;
                if (i2 == null || !i2.a) {
                    if (i2 != null && (g = i2.g()) != null) {
                        i3 = swe0.g(g.optInt("cleanup_delay_minutes", 10080), 1, 241920);
                    }
                    aVar = new pe50.a(i3);
                } else {
                    JSONObject g2 = i2.g();
                    if (g2 != null) {
                        int g3 = swe0.g(g2.optInt("cache_size_mb", 512), 0, 1024);
                        String optString = g2.optString(UploadService.EXTRA_TRIGGER, MusicAutoDownloadTrigger.LISTENING.i());
                        int g4 = swe0.g(g2.optInt("percent_duration_to_buffer", 50), 0, 100);
                        int g5 = swe0.g(g2.optInt("cleanup_delay_minutes", 10080), 1, 241920);
                        MusicAutoDownloadTrigger.Companion.getClass();
                        aVar = new pe50.b.a(g3, MusicAutoDownloadTrigger.a.a(optString), g4, g5);
                    } else {
                        aVar = pe50.b.C3509b.a;
                    }
                }
                if (!(aVar instanceof pe50.b)) {
                    if (aVar instanceof pe50.a) {
                        return new bf5.b(((pe50.a) aVar).a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                pe50.b bVar = (pe50.b) aVar;
                int a = bVar.a();
                MusicAutoDownloadTrigger.a aVar3 = com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger.Companion;
                String i4 = bVar.c().i();
                aVar3.getClass();
                Iterator<E> it = com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (epx.f(((com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger) next).i(), i4)) {
                            obj = next;
                        }
                    }
                }
                com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger musicAutoDownloadTrigger = (com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger) obj;
                if (musicAutoDownloadTrigger == null) {
                    musicAutoDownloadTrigger = com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger.DISABLED;
                }
                return new bf5.a(a, musicAutoDownloadTrigger, bVar.d(), aVar.b());
            case 8:
                asu0.a.getClass();
                return asu0.n();
            case 9:
                qcy<Object>[] qcyVarArr2 = SuperAppMinimizablePlayerComponentImpl.g;
                return new SuperAppMinimizablePlayerComponentImpl.a();
            case 10:
                VKApplication.a aVar4 = VKApplication.c;
                return ((NewsFeedComponent) m7m.e().a(fpf0.a(NewsFeedComponent.class))).xb();
            case 11:
                return dhr0.c.b;
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOVIES_AND_SERIALS_PROMO;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new SearchComponentImpl.a();
            case 14:
                return new BlacklistComponentImpl.a();
            default:
                return ((NotificationsSettingsComponent) ((k7m) m7m.f(qfx0.d)).a(fpf0.a(NotificationsSettingsComponent.class))).a();
        }
    }

    public /* synthetic */ cu2(VKApplication vKApplication) {
        this.b = 10;
    }
}
