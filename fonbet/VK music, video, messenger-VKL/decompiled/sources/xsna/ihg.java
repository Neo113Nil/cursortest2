package xsna;

import com.vk.common.links.generator.impl.di.LinksGeneratorComponentImpl;
import com.vk.log.L;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.protect.di.ProtectAppComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.statinteractor.impl.di.StatInteractorComponentImpl;
import com.vk.superapp.vkhealth.impl.di.VkHealthComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.toggle.internal.ToggleManager;
import com.vk.video.ui.share.impl.di.VideoShareComponentImpl;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.calls.join.impl.di.VoipCallsJoinRouterComponentImpl;
import com.vkontakte.android.VKApplication;
import kotlin.collections.EmptySet;
import xsna.qmr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ihg implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ihg(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        b.d i;
        String d;
        switch (this.b) {
            case 0:
                return new s24();
            case 1:
                return ((MusicPrefsComponent) ((k7m) m7m.f(bzu.b)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 2:
                return jmg.a;
            case 3:
                z100 z100Var = L.g;
                return (z100Var != null ? z100Var : null).g.invoke();
            case 4:
                return EmptySet.b;
            case 5:
                CoreFeatures coreFeatures = CoreFeatures.NEW_NETWORK_CALLBACK;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 6:
                return new h9t();
            case 7:
                return ((SessionManagementComponent) m7m.e().a(fpf0.a(SessionManagementComponent.class))).J2();
            case 8:
                qcy<Object>[] qcyVarArr = SilentAuthByLoginComponentImpl.e;
                return new vmj0();
            case 9:
                qcy<Object>[] qcyVarArr2 = StatInteractorComponentImpl.b;
                return new gsk0(asu0.C());
            case 10:
                VKApplication.a aVar = VKApplication.c;
                return ((ProtectAppComponent) m7m.e().a(fpf0.a(ProtectAppComponent.class))).u8();
            case 11:
                return new qmr0.a();
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_CHOICES_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new VideoShareComponentImpl.a();
            case 14:
                return new LinksGeneratorComponentImpl.a();
            case 15:
                return new VkHealthComponentImpl.a();
            case 16:
                SakFeatures.a aVar2 = SakFeatures.b;
                aVar2.getClass();
                if (SakFeatures.c == null) {
                    aVar2 = null;
                }
                ToggleManager toggleManager = aVar2 != null ? SakFeatures.c : null;
                return (toggleManager == null || (i = toggleManager.i(SakFeatures.Type.SAK_LIBVERIFY_AB_SUFFIX)) == null || (d = i.d()) == null) ? "" : d;
            case 17:
                return new VoipCallsJoinRouterComponentImpl.a();
            default:
                cd9 e = a201.b().e();
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                return new nmw0(cVar, e, ((VoipCallComponent) ((k7m) m7m.f(cVar)).a(fpf0.a(VoipCallComponent.class))).a4());
        }
    }

    public /* synthetic */ ihg(Object obj, int i) {
        this.b = i;
    }
}
