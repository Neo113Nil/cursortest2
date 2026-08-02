package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivitiesTarget;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedActivitiesDelegate.kt */
/* loaded from: classes17.dex */
public final class xvq implements oj50<q4r, qvq, c2r> {
    public final tih0 a;

    public xvq(tih0 tih0Var) {
        this.a = tih0Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        SdkClipVideoFile sdkClipVideoFile;
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        tih0 tih0Var = this.a;
        if (tih0Var != null && (qvqVar instanceof qvq.a) && (q4rVar instanceof q4r.a)) {
            if (!(((qvq.a) qvqVar) instanceof qvq.a.C3575a)) {
                throw new NoWhenBranchMatchedException();
            }
            List<FeedItem> list = ((qvq.a.C3575a) qvqVar).b;
            ArrayList arrayList = new ArrayList();
            for (FeedItem feedItem : list) {
                SdkClipActivitiesTarget sdkClipActivitiesTarget = null;
                FeedItem.f fVar = feedItem instanceof FeedItem.f ? (FeedItem.f) feedItem : null;
                if (fVar != null && (sdkClipVideoFile = fVar.e) != null) {
                    sdkClipActivitiesTarget = new SdkClipActivitiesTarget(sdkClipVideoFile.I0(), sdkClipVideoFile.o0());
                }
                if (sdkClipActivitiesTarget != null) {
                    arrayList.add(sdkClipActivitiesTarget);
                }
            }
            a7f0.a.g(aVar, tih0Var.a(arrayList), new yad(aVar, 24), new sm(24), new gc(8), 1);
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
