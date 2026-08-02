package xsna;

import android.content.Context;
import com.vk.asset.manager.api.di.VkAssetManagerComponent;
import com.vk.im.channelcreation.impl.di.ChannelCreationDiComponentImpl;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onepasspromo.impl.di.OnePassPromoComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.superapp.statinteractor.impl.di.StatInteractorComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.di.VoipFirstCallCacheImplComponent;
import com.vkontakte.android.VKApplication;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.ph20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rwe implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rwe(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new jed0();
            case 1:
                dhr0.a.getClass();
                Context E = dhr0.E();
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                caw cawVar = new caw(a1wVar);
                a1w a1wVar2 = q1w.a;
                return cvk.j(E, cawVar, new daw(a1wVar2 != null ? a1wVar2 : null));
            case 2:
                return new StringBuilder();
            case 3:
                k720 k720Var = k720.a;
                return k720.M("workouts_background_sync_schedule_key_superapp_v_", "workouts_sync_schedule_name");
            case 4:
                return new ph20.a();
            case 5:
                return new pn30(p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.MSG_PACK_SMALL_OBJECTS)));
            case 6:
                o2l.a.getClass();
                List c0 = drm0.c0(o2l.c("__dbg_test_xowner_allowed_methods", ""), new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    arrayList.add(drm0.p0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String str = (String) next;
                    if (str != null && !drm0.N(str)) {
                        arrayList2.add(next);
                    }
                }
                return j5g.S0(arrayList2);
            case 7:
                return new is90(((VoipCallComponent) ((k7m) m7m.f(OKVoipEngine.b)).a(fpf0.a(VoipCallComponent.class))).d1());
            case 8:
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new hk1();
            case 9:
                return new cs50((zix) yzc0.g.getValue());
            case 10:
                return new StatInteractorComponentImpl.a();
            case 11:
                VKApplication.a aVar = VKApplication.c;
                CoreFeatures coreFeatures = CoreFeatures.ONBOARDING_API_ENABLED;
                coreFeatures.getClass();
                if (com.vk.toggle.b.A.a(coreFeatures)) {
                    ((VkOnboardingComponent) m7m.e().a(fpf0.a(VkOnboardingComponent.class))).p3().init();
                }
                return s3q0.a;
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_D2D_DYNAM_TABS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new OnePassPromoComponentImpl.a();
            case 14:
                return new ChannelCreationDiComponentImpl.a();
            case 15:
                return (VkAssetManagerComponent) m7m.e().a(fpf0.a(VkAssetManagerComponent.class));
            case 16:
                return asu0.a.b(10, 0L, "vk-high-priority-serial-executor");
            case 17:
                return new VoipFirstCallCacheImplComponent.a();
            default:
                return new HashMap();
        }
    }

    public /* synthetic */ rwe(VKApplication vKApplication, int i) {
        this.b = i;
    }
}
