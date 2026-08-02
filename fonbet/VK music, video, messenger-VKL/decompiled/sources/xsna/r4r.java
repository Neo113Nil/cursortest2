package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;
import xsna.c2r;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedSubscriptionStatusUpdateActionDelegate.kt */
/* loaded from: classes17.dex */
public final class r4r implements oj50<q4r, qvq, c2r> {
    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.u) && (q4rVar instanceof q4r.a)) {
            xkh0 xkh0Var = ((qvq.u) qvqVar).b;
            UserId userId = xkh0Var.b;
            vkh0 vkh0Var = xkh0Var.a;
            SubscribeStatus.a aVar2 = SubscribeStatus.Companion;
            SubscribeStatus subscribeStatus = vkh0Var.a;
            aVar2.getClass();
            aVar.b(new c2r.j(userId, SubscribeStatus.a.c(subscribeStatus)));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
