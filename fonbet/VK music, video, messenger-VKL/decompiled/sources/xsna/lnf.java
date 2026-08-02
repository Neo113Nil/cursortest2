package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.vk.attachpicker.di.GalleryPickerComponentImpl;
import com.vk.auth.oauth.component.impl.di.OAuthUiComponentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.ecomm.storefrontservices.impl.di.StorefrontServicesComponentImpl;
import com.vk.fave.di.FaveComponentImpl;
import com.vk.im.engine.di.ImConfigurationComponentImpl;
import com.vk.profile.community.details.impl.di.CommunityDetailsComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.lang.reflect.Method;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lnf implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lnf(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ksk();
            case 1:
                return new CommunityDetailsComponentImpl.a();
            case 2:
                return new GalleryPickerComponentImpl.a();
            case 3:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_ZSTD);
            case 4:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                qcy<Object>[] qcyVarArr = ImConfigurationComponentImpl.c;
                a1w a1wVar = q1w.a;
                return new g1w(a1wVar != null ? a1wVar : null);
            case 6:
                return fmk0.a;
            case 7:
                qcy<Object>[] qcyVarArr2 = OAuthUiComponentImpl.b;
                return new exu0();
            case 8:
                qcy<Object>[] qcyVarArr3 = ReviewsComponentImpl.l;
                return new u410(vua0.b());
            case 9:
                return new StorefrontServicesComponentImpl.a();
            case 10:
                qcy<Object>[] qcyVarArr4 = StoriesComponentImpl.N;
                return new vf6(new c80(2), new c6(28), new s7c0(8), new hwi0(7));
            case 11:
                return Boolean.valueOf(i7r0.a(dgn0.c().i().e.getValue()).length() > 0);
            case 12:
                VKApplication.a aVar = VKApplication.c;
                return ((BridgeComponent) m7m.e().a(fpf0.a(BridgeComponent.class))).s();
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RESTRICTION_DOWNLOAD_IN_VK_APP;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures) && BuildInfo.s()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 14:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.FEATURE_IM_PERF_CONFIG);
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
            case 15:
                return new FaveComponentImpl.a();
            case 16:
                asu0.a.getClass();
                return asu0.h();
            case 17:
                return new su2();
            case 18:
                mxv c = g2v.c();
                Context context = e43.a;
                return Boolean.valueOf(c.f(context != null ? context : null));
            case 19:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.j0();
            default:
                return new zit();
        }
    }

    public /* synthetic */ lnf(VKApplication vKApplication) {
        this.b = 12;
    }
}
