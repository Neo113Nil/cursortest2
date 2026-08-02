package xsna;

import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import com.vk.phoneactualization.api.di.PhoneActualizationComponent;
import com.vk.profile.community.creationonboarding.impl.di.CreationOnboardingComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.story.settings.impl.di.StoriesSettingsComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.topics.impl.di.TopicsComponentImpl;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vk.voip.ui.c;
import com.vkontakte.android.VKApplication;
import xsna.l55;
import xsna.q6r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j55 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ j55(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return ((PhoneActualizationComponent) ((k7m) m7m.f(new l55.f())).a(fpf0.a(PhoneActualizationComponent.class))).getEntryPoint();
            case 1:
                return new ClipsInterestsComponentImpl.a();
            case 2:
                return new CreationOnboardingComponentImpl.a();
            case 3:
                return new StoriesSettingsComponentImpl.a();
            case 4:
                return rl3.y0(new CronetHttpLogger$DebugType[]{CronetHttpLogger$DebugType.CLIENT_BUILDER, CronetHttpLogger$DebugType.NATIVE_BUFFER, CronetHttpLogger$DebugType.EXEC_POOL});
            case 5:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_PROTOCOL_TYPE);
            case 6:
                return new lwv(null);
            case 7:
                return fhg.a;
            case 8:
                b = e8r.a.b(r1, PrivateSubdir.OFFLINE_MUSIC_PRIVATE.h(), true);
                return b.a;
            case 9:
                qcy<Object>[] qcyVarArr = ReviewsComponentImpl.l;
                return new qzh();
            case 10:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                t6g0 t6g0Var = t6g0.b;
                return t6g0.b();
            case 11:
                StoriesFeatures storiesFeatures = StoriesFeatures.IGNORE_MARK_SKIPPED;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 12:
                qcy<Object>[] qcyVarArr3 = TabbarSettingsComponentImpl.p;
                return new nun0();
            case 13:
                qcy<Object>[] qcyVarArr4 = TopicsComponentImpl.c;
                return new q9p0();
            case 14:
                return ((SessionManagementComponent) j6i.b(m7m.f(new q6r0.b()), SessionManagementComponent.class)).B2();
            case 15:
                VKApplication.a aVar = VKApplication.c;
                return new ahv0();
            case 16:
                return new azs0();
            case 17:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.ENGINE_WATCHDOG);
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
            case 18:
                vx2.a.getClass();
                return vx2.b();
            case 19:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.FALSE, "com.vk.STANDALONE_MESSENGER");
                bool.getClass();
                return bool;
            case 20:
                return new ghg();
            case 21:
                qcy<Object>[] qcyVarArr5 = VoipCallComponentImpl.B;
                BuildInfo.Client client = BuildInfo.a;
                return new e29(new up2());
            case 22:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                return new r4x0(cVar, com.vk.voip.ui.c.F(), new c.d());
            default:
                return new sni(16);
        }
    }
}
