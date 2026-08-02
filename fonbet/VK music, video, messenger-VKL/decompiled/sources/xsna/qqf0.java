package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.navigation.impl.di.VkAnalyticsComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.preinflate.DiscoveryAsyncPrefetch;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qqf0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String D;
        String str = null;
        switch (this.b) {
            case 0:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.d(SchemeStatSak$EventScreen.LK_PASSWORD, null, null, 12);
                return s3q0.a;
            case 1:
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().E().b();
                return s3q0.a;
            case 2:
                return Preference.j();
            case 3:
                int i = VideoMinimizableDiscoveryFragment.p1;
                DiscoveryAsyncPrefetch.Companion.getClass();
                b.d i2 = com.vk.toggle.b.A.i(VideoFeatures.DISCOVERY_ITEMS_PREINFLATE);
                if (i2 == null) {
                    return DiscoveryAsyncPrefetch.NONE;
                }
                if (!p1p0.a(i2)) {
                    return DiscoveryAsyncPrefetch.NONE;
                }
                JSONObject g = i2.g();
                if (g != null && (D = f370.D(g, "prefetchMode")) != null) {
                    str = D.toLowerCase(Locale.ROOT);
                }
                return epx.f(str, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW) ? DiscoveryAsyncPrefetch.VIEW : epx.f(str, "view_holder") ? DiscoveryAsyncPrefetch.VIEW_HOLDER : DiscoveryAsyncPrefetch.NONE;
            case 4:
                int i3 = VideoSkippablePartView.C;
                dhr0.a.getClass();
                return dhr0.s();
            case 5:
                qcy<Object>[] qcyVarArr = VkAnalyticsComponentImpl.b;
                return new a8u0();
            default:
                return tlo0.Companion.serializer();
        }
    }

    public /* synthetic */ qqf0(m9l0 m9l0Var) {
        this.b = 1;
    }
}
