package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.ea90;

/* compiled from: FeedViewStateMapper.kt */
/* loaded from: classes17.dex */
public final class g5r {
    public final ClipFeedTab a;

    public g5r(ClipFeedTab clipFeedTab) {
        this.a = clipFeedTab;
    }

    public static FeedItem.Pagination a(ea90.a aVar, boolean z) {
        if (aVar instanceof ea90.a.c) {
            return new FeedItem.Pagination.b(z);
        }
        if (aVar instanceof ea90.a.C2790a) {
            return new FeedItem.Pagination.a(z);
        }
        if (epx.f(aVar, ea90.a.b.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
