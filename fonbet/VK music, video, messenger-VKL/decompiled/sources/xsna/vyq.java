package xsna;

import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.c2r;
import xsna.q4r;
import xsna.qvq;
import xsna.uyq;
import xsna.wk50;

/* compiled from: FeedExternalNpsActionDelegate.kt */
/* loaded from: classes17.dex */
public final class vyq implements oj50<q4r, qvq, c2r> {
    public final f4z a;
    public final hwc b;

    public vyq(f4z f4zVar, hwc hwcVar) {
        this.a = f4zVar;
        this.b = hwcVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.d) && (q4rVar instanceof q4r.a)) {
            qvq.d dVar = (qvq.d) qvqVar;
            if (dVar instanceof qvq.d.a) {
                SdkExternalNpsCondition sdkExternalNpsCondition = ((qvq.d.a) qvqVar).b;
                if (((q4r.a) q4rVar).b().get(sdkExternalNpsCondition.h()) != null) {
                    return;
                }
                aVar.b(new c2r.e.a(new FeedItem.e.a(sdkExternalNpsCondition)));
                hwc hwcVar = this.b;
                if (hwcVar != null) {
                    hwcVar.a.d(sdkExternalNpsCondition);
                    hwcVar.b.b(sdkExternalNpsCondition);
                    return;
                }
                return;
            }
            if (!(dVar instanceof qvq.d.b)) {
                if (!(dVar instanceof qvq.d.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.b(new e2r(((qvq.d.c) qvqVar).b.c));
            } else {
                c1r c1rVar = ((q4r.a) q4rVar).b().get(((qvq.d.b) qvqVar).b.h());
                FeedItem feedItem = c1rVar != null ? c1rVar.a : null;
                if (feedItem == null || !(feedItem instanceof FeedItem.e.a)) {
                    return;
                }
                this.a.b(new uyq.g.a.C3857a(new qvq.d.c((FeedItem.e.a) feedItem)));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
