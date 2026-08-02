package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class frp implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Attachment c;

    public /* synthetic */ frp(int i, Attachment attachment) {
        this.b = i;
        this.c = attachment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Post post;
        switch (this.b) {
            case 0:
                Parcelable parcelable = (NewsEntry) obj;
                boolean z = parcelable instanceof fsx0;
                Attachment attachment = this.c;
                boolean z2 = true;
                if (!z || !((fsx0) parcelable).M6(attachment)) {
                    Post post2 = parcelable instanceof Post ? (Post) parcelable : null;
                    if (post2 == null || (post = post2.D) == null || !post.Eb(attachment)) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(epx.f(((ParsedAttachment) obj).b, this.c));
        }
    }
}
