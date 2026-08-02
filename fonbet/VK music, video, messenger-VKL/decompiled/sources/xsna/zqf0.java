package xsna;

import android.os.Looper;
import com.vk.catalog2.common.ui.holders.placeholder.UiBlockOnboardingBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.oauth.tinkoff.a;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.p600;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zqf0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public Object invoke() {
        switch (this.b) {
            case 0:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.PARTIAL_EXPAND_ENTER_PASSWORD, null, null, null, 12);
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return new lxq();
            case 3:
                SettingsFragmentInternalComponent.a aVar = SettingsFragmentInternalComponent.j;
                bpn0 bpn0Var = fxc0.a;
                return (g7s0) (bpn0Var != null ? bpn0Var : null).getValue();
            case 4:
                return new es();
            case 5:
                SchemeStat$EventItem schemeStat$EventItem = UiBlockOnboardingBannerVh.f;
                return new uft0();
            case 6:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 7:
                return (VideoMinimizablePlayerComponent) ((k7m) m7m.f(w1s0.b)).a(fpf0.a(VideoMinimizablePlayerComponent.class));
            case 8:
                int i = VideoCatalogSearchRootVh.S;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 9:
                return com.vk.toggle.d.H.b();
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.PLAYER_TECH_BUGREPORT;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                return new bsp(VkButton.Mode.values(), "com.vk.core.view.components.button.VkButton.Mode");
            case 12:
                return new Regex("(^|[a-z0-9.\\-]*\\.)(static)\\.(mvk|vk|vkontakte)\\.(com|ru|me)", RegexOption.IGNORE_CASE);
            default:
                p600.a aVar2 = p600.d;
                a.c cVar = a.c.a;
                aVar2.getClass();
                return new p600(cVar, Looper.getMainLooper());
        }
    }
}
