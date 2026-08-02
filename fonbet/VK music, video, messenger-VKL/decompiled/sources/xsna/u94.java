package xsna;

import android.content.Context;
import app.effectum.filter.di.FiltersComponentImpl;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.audience.impl.di.AudienceResearchComponentImpl;
import com.vk.contacts.e;
import com.vk.core.apps.BuildInfo;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.music.di.VkAppPlayerUIComponentImpl;
import com.vk.narratives.impl.di.NarrativeComponentImpl;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.regex.Pattern;
import xsna.dhr0;
import xsna.q6r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u94 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ u94(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AudienceResearchComponentImpl.d;
                ha4 ha4Var = new ha4();
                vx2.a.getClass();
                return new ja4(ha4Var, new ra4(vx2.b()));
            case 1:
                return new fwe();
            case 2:
                return new e.c();
            case 3:
                return new NarrativeComponentImpl.a();
            case 4:
                return Pattern.compile("\\d{8}");
            case 5:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_NEW_IMAGE_CLIENT);
            case 6:
                qcy<Object>[] qcyVarArr2 = ReviewsComponentImpl.l;
                return new hyh();
            case 7:
                return new ce3((s1w0) jgn0.d.getValue());
            case 8:
                qcy<Object>[] qcyVarArr3 = TabbarSettingsComponentImpl.p;
                return new hwn0();
            case 9:
                return ((AccountManagerComponent) j6i.b(m7m.f(new q6r0.d()), AccountManagerComponent.class)).Kd();
            case 10:
                VKApplication.a aVar = VKApplication.c;
                boolean z = (BuildInfo.h() || BuildInfo.i()) && ((Boolean) com.vk.core.apps.a.m.getValue()).booleanValue();
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_log_to_file", false) || z);
            case 11:
                Context context = e43.a;
                return new dhr0.f(context != null ? context : null, dhr0.C().c);
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOV_STANDALONE_ASP_RATIO;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.MAX_AD_BANNER);
                if (i == null) {
                    return null;
                }
                if (!i.a) {
                    i = null;
                }
                if (i != null) {
                    return i.c.toString();
                }
                return null;
            case 14:
                return new FiltersComponentImpl.a();
            case 15:
                return (ImEngineLifecycleComponent) m7m.e().a(fpf0.a(ImEngineLifecycleComponent.class));
            case 16:
                qcy<Object>[] qcyVarArr4 = VkAppPlayerUIComponentImpl.k;
                return new kau0();
            case 17:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                return Integer.valueOf(((Number) com.vk.core.apps.a.c(-1, "com.vk.bugtracker.android.appIdentifier")).intValue());
            case 18:
                asu0.a.getClass();
                bpn0 bpn0Var = asu0.D;
                dsu0 dsu0Var = (dsu0) bpn0Var.getValue();
                boolean z2 = dsu0Var != null ? dsu0Var.c : false;
                return new g7o0(z2);
            case 19:
                qcy<Object>[] qcyVarArr5 = VoipCallComponentImpl.B;
                return new uvw0();
            case 20:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.j0();
            default:
                return new vit();
        }
    }

    public /* synthetic */ u94(jau0 jau0Var) {
        this.b = 15;
    }
}
