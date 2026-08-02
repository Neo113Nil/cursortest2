package xsna;

import com.vk.ads.impl.di.AdchoiceComponentImpl;
import com.vk.camera.clips.drafts.sync.impl.di.ClipsDraftSyncComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.di.event.ImCoroutinesEventObserverComponentImpl;
import com.vk.libvideo.autoplay.b;
import com.vk.music.pref.MusicPrefsComponentImpl;
import com.vk.restriction.di.VideoRestrictionManagerComponentImpl;
import com.vk.search.integration.friends.impl.di.SearchFriendsIntegrationComponentImpl;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import com.vkontakte.android.task.di.components.music.MusicStorageTypeComponentImpl;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class y0f implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ y0f(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        boolean z2;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                return new ClipsDraftSyncComponentImpl.a();
            case 1:
                return new vjr(Preference.f("firebase_preferences"), Preference.f("firebase_preferences_bro_hosts"));
            case 2:
                qcy<Object>[] qcyVarArr = ImCoroutinesEventObserverComponentImpl.b;
                a1w a1wVar = q1w.a;
                return new yzv(a1wVar != null ? a1wVar : null);
            case 3:
                qcy<Object>[] qcyVarArr2 = MusicPrefsComponentImpl.b;
                asu0.a.getClass();
                asu0.o().submit(new i250(objArr == true ? 1 : 0));
                j250 j250Var = new j250();
                j250Var.b = UserId.d.b;
                return j250Var;
            case 4:
                return new MusicStorageTypeComponentImpl.a();
            case 5:
                FeedFeatures feedFeatures = FeedFeatures.FEED_REMOVE_CUSTOM_REACTIONS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 6:
                ow90 ow90Var = ow90.a;
                return Boolean.FALSE;
            case 7:
                qcy<Object>[] qcyVarArr3 = SuperAppMinimizablePlayerComponentImpl.g;
                return new ifs0();
            case 8:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 9:
                return dhr0.c.a;
            case 10:
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                b.d i = bVar.i(VideoFeatures.VIDEO_D2D_DYNAM_TABS);
                b.d i2 = bVar.i(VideoFeatures.FULLSCREEN_DOC2DOC);
                if (!p1p0.a(i)) {
                    i = i2;
                }
                VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_HORIZONTAL;
                videoFeatures.getClass();
                boolean a = bVar.a(videoFeatures);
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_META_CHANNEL_SCREEN;
                videoFeatures2.getClass();
                if (bVar.a(videoFeatures2)) {
                    VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_D2D_META_CHANNEL_BANNER;
                    videoFeatures3.getClass();
                    if (bVar.a(videoFeatures3)) {
                        z = true;
                        if (p1p0.a(i)) {
                            return new etn(a, 991);
                        }
                        JSONObject g = i != null ? i.g() : null;
                        boolean optBoolean = g != null ? g.optBoolean("tabs_enabled_discover") : false;
                        boolean optBoolean2 = g != null ? g.optBoolean("tabs_discover_compact") : false;
                        boolean optBoolean3 = g != null ? g.optBoolean("tabs_enabled_fullscreen_horizontal") : false;
                        boolean optBoolean4 = g != null ? g.optBoolean("d2d_entry_point_enabled_fullscreen_vertical") : false;
                        boolean optBoolean5 = g != null ? g.optBoolean("d2d_entry_point_enabled_fullscreen_horizontal") : false;
                        VideoFeatures videoFeatures4 = VideoFeatures.VIDEO_D2D_ONBOARDING;
                        b.d i3 = bVar.i(videoFeatures4);
                        JSONObject g2 = i3 != null ? i3.g() : null;
                        boolean a2 = bVar.a(videoFeatures4);
                        if (a2) {
                            if (g2 != null ? g2.optBoolean("debug") : false) {
                                z2 = true;
                                Integer valueOf = g2 == null ? Integer.valueOf(g2.optInt("intervalToHide", -1)) : null;
                                return new etn(optBoolean4, optBoolean5, optBoolean, optBoolean2, optBoolean3, a, a2, z2, (valueOf != null && valueOf.intValue() == -1) ? null : valueOf, z);
                            }
                        }
                        z2 = false;
                        if (g2 == null) {
                        }
                        if (valueOf != null) {
                            return new etn(optBoolean4, optBoolean5, optBoolean, optBoolean2, optBoolean3, a, a2, z2, (valueOf != null && valueOf.intValue() == -1) ? null : valueOf, z);
                        }
                        return new etn(optBoolean4, optBoolean5, optBoolean, optBoolean2, optBoolean3, a, a2, z2, (valueOf != null && valueOf.intValue() == -1) ? null : valueOf, z);
                    }
                }
                z = false;
                if (p1p0.a(i)) {
                }
            case 11:
                b.d i4 = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_SCREEN_CAST);
                if (!p1p0.a(i4)) {
                    return new sah0(false, false);
                }
                JSONObject g3 = i4 != null ? i4.g() : null;
                return new sah0(g3 != null ? g3.optBoolean("connect_by_code") : false, g3 != null ? g3.optBoolean("connect_from_search_enabled") : false);
            case 12:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_IM_NEW_CACHE_PLAN_VIDEOMSG);
            case 13:
                qcy<Object>[] qcyVarArr4 = VideoRestrictionManagerComponentImpl.c;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                return b.C1208b.a();
            case 14:
                return new SearchFriendsIntegrationComponentImpl.a();
            case 15:
                return new AdchoiceComponentImpl.a();
            case 16:
                dgn0.d();
                return ((SakAnalyticsComponent) m7m.e().a(fpf0.a(SakAnalyticsComponent.class))).Oe();
            default:
                return new oex0();
        }
    }

    public /* synthetic */ y0f(VKApplication vKApplication) {
        this.b = 8;
    }
}
