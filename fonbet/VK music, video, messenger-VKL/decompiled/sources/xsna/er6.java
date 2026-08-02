package xsna;

import android.util.LruCache;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.optional.impl.di.OptionalAdsFeatureComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.followersmode.impl.di.FollowersModeComponentImpl;
import com.vk.log.L;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.core.di.PlayerComponentImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.tabbar.core.impl.di.TabbarCoreComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptySet;
import xsna.k840;
import xsna.sbf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class er6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ er6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExecutorService b;
        switch (this.b) {
            case 0:
                return new zdt0(new lt0(8));
            case 1:
                return new LruCache(200);
            case 2:
                return z6u0.a;
            case 3:
                return EmptySet.b;
            case 4:
                return ((OfflineAudioComponent) k840.a.b().a(fpf0.a(OfflineAudioComponent.class))).U8();
            case 5:
                return new PlayerComponentImpl.a();
            case 6:
                sbf0 sbf0Var = sbf0.e;
                return sbf0.a.a();
            case 7:
                return (NewsfeedOptionalAdsComponent) ((k7m) m7m.f(yzc0.b)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 8:
                return Boolean.valueOf(SakFeatures.Type.FEATURE_SIGN_ANONYMOUS_TOKEN.h());
            case 9:
                qcy<Object>[] qcyVarArr = TabbarCoreComponentImpl.g;
                return new fun0();
            case 10:
                r63 r63Var = UiTracker.c;
                if (r63Var == null) {
                    r63Var = null;
                }
                r63Var.getClass();
                u83 u83Var = new u83();
                StringBuilder sb = new StringBuilder("init screen tracker: tracked ");
                sb.append(u83Var.m());
                sb.append(" / ");
                L.e(h5s.c(MobileOfficialAppsCoreNavStat$EventScreen.values().length, " screens", sb));
                return u83Var;
            case 11:
                return Boolean.valueOf(dhr0.M());
            case 12:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 13:
                VKApplication.a aVar2 = VKApplication.c;
                gjk0 b2 = com.vk.toggle.d.r.b();
                if (b2 == null) {
                    gjk0.c.getClass();
                    b2 = gjk0.d;
                }
                return b2.b;
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SEASONS_IN_CATALOG_PLAYLIST;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                asu0.a.getClass();
                return new OptionalAdsFeatureComponentImpl.a(asu0.h());
            case 16:
                return new FollowersModeComponentImpl.a();
            case 17:
                return new UxPollsComponentImpl.a(new bpn0(new z0h0(14)));
            case 18:
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-emoji-thread");
                return b;
            default:
                return Preference.j().getString("apiHost", "internal." + "api.".concat(a0a.d));
        }
    }

    public /* synthetic */ er6(VKApplication vKApplication) {
        this.b = 12;
    }
}
