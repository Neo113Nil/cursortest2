package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.f0r;
import xsna.qvq;
import xsna.s4r;
import xsna.ubx;
import xsna.wk50;

/* compiled from: FeedInitActionDelegate.kt */
/* loaded from: classes17.dex */
public final class l0r implements izs {
    public final /* synthetic */ f0r.u b;
    public final /* synthetic */ wk50.a c;

    public l0r(f0r.u uVar, wk50.a aVar) {
        this.b = uVar;
        this.c = aVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        SdkVideoFile sdkVideoFile = (SdkVideoFile) pair.d();
        PaginationKey paginationKey = (PaginationKey) pair.g();
        f0r.u uVar = this.b;
        List<? extends FeedItem> singletonList = Collections.singletonList(myc.d(uVar.g, sdkVideoFile, null, 6));
        f0r.m mVar = new f0r.m(PaginationKey.LoadedFull.b, paginationKey);
        s4r.a aVar = s4r.a.a;
        ubx.b bVar = ubx.b.a;
        wk50.a aVar2 = this.c;
        uVar.i(aVar2, singletonList, mVar, aVar, bVar, null, null);
        if (!(uVar.c instanceof ClipFeedTab.SingleClipByVideoId)) {
            aVar2.a(new qvq.q(sdkVideoFile));
        }
        return s3q0.a;
    }
}
