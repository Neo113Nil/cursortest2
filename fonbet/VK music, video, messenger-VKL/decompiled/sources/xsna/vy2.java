package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.bridges.di.BridgeComponent;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.toggle.features.FeedFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vy2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vy2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        yxq xzfVar;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new mkx(new u8y((VKApiConfig) obj2), ((wy2) obj).r());
            case 1:
                bpn0 bpn0Var = (bpn0) obj2;
                NewsFeedComponentImpl newsFeedComponentImpl = (NewsFeedComponentImpl) obj;
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                FeedFeatures feedFeatures = FeedFeatures.API_GO_REQUEST;
                feedFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(feedFeatures)) {
                    xzfVar = new sua();
                } else {
                    FeedFeatures feedFeatures2 = FeedFeatures.FEED_CODEGEN_NEWSFEED;
                    feedFeatures2.getClass();
                    xzfVar = bVar.a(feedFeatures2) ? new xzf(bpn0Var) : new xa4(7);
                }
                fw60 fw60Var = new fw60(xzfVar);
                nwy nwyVar = newsFeedComponentImpl.e;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[2];
                ss60 ss60Var = new ss60((BridgeComponent) nwyVar.c(), newsFeedComponentImpl.Df(), asu0.a.c(), newsFeedComponentImpl.a);
                rte0 rte0Var = new rte0();
                kh60 kh60Var = new kh60();
                yk60 yk60Var = yk60.a;
                return new em60(fw60Var, ss60Var, rte0Var, kh60Var, newsFeedComponentImpl.Df(), new x19(), new lbs());
            default:
                ((VkMainTracker) obj2).v((Event) obj);
                return s3q0.a;
        }
    }
}
