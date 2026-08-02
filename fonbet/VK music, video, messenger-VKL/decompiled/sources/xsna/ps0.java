package xsna;

import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.core.preference.Preference;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationComponentImpl;
import com.vk.im.chatmembers.stub.ChatMembersFeatureComponentStub;
import com.vk.music.subscription.impl.di.MusicSubscriptionComponentImpl;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.call.click.VoipStartCallClickAnalytics;
import com.vk.voip.ui.prodstat.analytics.contact.action.VoipContactsActionAnalytics;
import com.vk.voip.ui.prodstat.analytics.max.view.VoipMaxAppViewAnalytics;
import com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics;
import com.vk.voip.ui.prodstat.analytics.share.click.VoipShareLinkClickAnalytics;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ps0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ps0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 17;
        switch (this.b) {
            case 0:
                return Preference.j();
            case 1:
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                return new mbk();
            case 2:
                return new ImChatClipsDecorationComponentImpl.a();
            case 3:
                qcy<Object>[] qcyVarArr2 = GamesCatalogComponentImpl.s;
                return new wct();
            case 4:
                return ((MarketOrdersComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(MarketOrdersComponent.class))).S4();
            case 5:
                return new MusicSubscriptionComponentImpl.a(new bpn0(new sw1(15)), new t350(0, qni0.a, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0));
            case 6:
                bek0 b = com.vk.toggle.d.a.b();
                if (b == null) {
                    bek0.b.getClass();
                    b = bek0.c;
                }
                return new tsx(b.a, new de4(25));
            case 7:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_SNIPPET;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 8:
                return fo8.a("api.".concat(a0a.d), "/oauth");
            case 9:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 10:
                dhr0.a.getClass();
                return dhr0.E();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SCROLL_OPTIMIZATIONS_V2;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                return new ChatMembersFeatureComponentStub.a();
            case 13:
                return new ProtectAppComponentImpl.a();
            case 14:
                return (String) com.vk.core.apps.a.c(null, "com.vk.calls_api_key");
            case 15:
                qcy<Object>[] qcyVarArr3 = VoipAnalyticsInternalComponent.b;
                int i2 = 19;
                ArrayList u0 = j5g.u0(Collections.singletonList(new Pair(VoipContactsActionAnalytics.b, new bpn0(new yaa(new iid0(), 10)))), e43.l(new Pair(btw0.b, new bpn0(new v0f(16))), new Pair(srw0.b, new bpn0(new u35(i2))), new Pair(epw0.b, new bpn0(new w0f(i)))));
                und0 und0Var = new und0();
                int i3 = 9;
                int i4 = 12;
                return new jdw0(j5g.u0(Collections.singletonList(new Pair(VoipMaxAppViewAnalytics.d, new bpn0(new cuq(new nsd0(), i3)))), j5g.u0(e43.l(new Pair(ymw0.c, new bpn0(new duq(und0Var, i3))), new Pair(VoipStartCallClickAnalytics.c, new bpn0(new fat(und0Var, i4))), new Pair(itw0.c, new bpn0(new gat(und0Var, 14))), new Pair(VoipShareLinkClickAnalytics.c, new bpn0(new qy8(und0Var, i2))), new Pair(htw0.c, new bpn0(new yg9(und0Var, i4))), new Pair(j1x0.c, new bpn0(new uia(und0Var, 13))), new Pair(VoipSearchClickAnalytics.c, new bpn0(new ho4(und0Var, i3)))), u0)));
            case 16:
                return new gsw0(new om60(i));
            default:
                return new ijt();
        }
    }

    public /* synthetic */ ps0(Object obj, int i) {
        this.b = i;
    }
}
