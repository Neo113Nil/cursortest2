package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.catalog2.common.dto.api.di.CatalogComponent;
import com.vk.clips.sdk.screens.feed.decoration.impl.di.ClipsDecorationComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.libvideo.impl.di.WatchLaterComponentImpl;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.superapp.statinteractor.impl.di.StatInteractorComponentImpl;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.VkAppMusicFragmentComponentImpl;
import xsna.k840;
import xsna.lhw0;
import xsna.y390;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b63 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ b63(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                return new mpf();
            case 2:
                return new ClipsDecorationComponentImpl.a(new com.vk.movika.sdk.base.logic.interactor.f(9));
            case 3:
                qcy<Object>[] qcyVarArr2 = GamesCatalogComponentImpl.s;
                return new ykg();
            case 4:
                return Boolean.valueOf(!Preference.f("multi_push_settings_prefs").getBoolean("is_multi_push_disabled", true));
            case 5:
                return new cny();
            case 6:
                return ((NotificationListComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(NotificationListComponent.class))).vc();
            case 7:
                return new VkAppMusicFragmentComponentImpl.a();
            case 8:
                dsw<UserId, v390> dswVar = y390.a;
                return y390.a.a();
            case 9:
                return Boolean.valueOf(fxc0.B().J().N1());
            case 10:
                return ow90.o;
            case 11:
                return new sqo();
            case 12:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_force_send_firebase", false));
            case 13:
                return new Handler(Looper.getMainLooper());
            case 14:
                VKApplication.a aVar = VKApplication.c;
                return new vng(((CatalogComponent) m7m.e().a(fpf0.a(CatalogComponent.class))).Ce());
            case 15:
                VideoFeatures videoFeatures = VideoFeatures.ONBOARDING_PROMO;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 16:
                ImFeatures.GROUPS_MESSENGER_DISABLED.getClass();
                return Boolean.valueOf(!com.vk.toggle.b.A.a(r0));
            case 17:
                return new StatInteractorComponentImpl.a();
            case 18:
                return new WatchLaterComponentImpl.a();
            case 19:
                return (String) com.vk.core.apps.a.c("", "com.vk.CLIENT_AGENT_SECRET");
            case 20:
                return k840.a.g().b();
            case 21:
                com.vk.voip.ui.c.b.getClass();
                return new lhw0.a(com.vk.voip.ui.c.H());
            case 22:
                return new gjt();
            default:
                return ((CommunityComponent) ((k7m) m7m.f(qfx0.d)).a(fpf0.a(CommunityComponent.class))).ke();
        }
    }
}
