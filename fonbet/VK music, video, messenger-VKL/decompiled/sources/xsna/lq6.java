package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.registry.impl.app.di.CatalogRegistryComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.design.demo.di.DesignDemoComponentImpl;
import com.vk.ecomm.fave.impl.MarketFaveComponentImpl;
import com.vk.im.engine.di.event.ImCoroutinesEventObserverScopedComponentImpl;
import com.vk.profile.community.chats.impl.di.CommunityChatsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import xsna.asu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lq6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lq6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new oet0(BuildInfo.q(), 15);
            case 1:
                Set<Regex> set = aky.f;
                throw null;
            case 2:
                return new ImCoroutinesEventObserverScopedComponentImpl.a();
            case 3:
                b25 a = o25.a();
                bpn0 bpn0Var = xwk.b;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                bpn0 bpn0Var2 = g620.E;
                if (bpn0Var2 == null) {
                    bpn0Var2 = null;
                }
                bpn0 bpn0Var3 = pla.a;
                if (bpn0Var3 == null) {
                    bpn0Var3 = null;
                }
                bpn0 bpn0Var4 = sxc0.b;
                if (bpn0Var4 == null) {
                    bpn0Var4 = null;
                }
                bpn0 bpn0Var5 = xwk.a;
                if (bpn0Var5 == null) {
                    bpn0Var5 = null;
                }
                bpn0 bpn0Var6 = qhp0.c;
                if (bpn0Var6 == null) {
                    bpn0Var6 = null;
                }
                bpn0 bpn0Var7 = rwi.d;
                if (bpn0Var7 == null) {
                    bpn0Var7 = null;
                }
                return new dig(a, bpn0Var, bpn0Var2, bpn0Var3, bpn0Var4, bpn0Var5, bpn0Var6, bpn0Var7);
            case 4:
                return m5f0.a;
            case 5:
                return new MarketFaveComponentImpl.a();
            case 6:
                return new ConcurrentHashMap();
            case 7:
                VKApplication.a aVar = VKApplication.c;
                return ((AuthBridgeComponent) m7m.e().a(fpf0.a(AuthBridgeComponent.class))).s().c();
            case 8:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_FULL_VIEWED_INDICATION;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 9:
                return new CommunityChatsComponentImpl.a();
            case 10:
                return new DesignDemoComponentImpl.a();
            case 11:
                return new CatalogRegistryComponentImpl.a();
            case 12:
                asu0 asu0Var = asu0.a;
                asu0.a aVar2 = asu0.h;
                asu0Var.getClass();
                return asu0.E(aVar2, "vk-coroutines-computation-pool-thread-");
            case 13:
                return m1u.a("vk-network-knet");
            default:
                return new oit();
        }
    }

    public /* synthetic */ lq6(VKApplication vKApplication) {
        this.b = 7;
    }
}
