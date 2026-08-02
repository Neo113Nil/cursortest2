package xsna;

import android.net.Uri;
import android.widget.TextView;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import kotlin.Result;

/* compiled from: AnyAttachmentHolder.kt */
/* loaded from: classes4.dex */
public abstract class jw2 extends qi6<NewsEntry> {
    public Attachment C;

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Object failure;
        Attachment attachment = this.C;
        if (attachment != null) {
            d6i d6iVar = (d6i) this;
            boolean z = attachment instanceof GeoAttachment;
            HeaderPhotoView headerPhotoView = d6iVar.D;
            TextView textView = d6iVar.F;
            TextView textView2 = d6iVar.E;
            if (z) {
                GeoAttachment geoAttachment = (GeoAttachment) attachment;
                HeaderPhotoView.p(headerPhotoView, Integer.valueOf(R.drawable.vk_icon_location_map_outline_24), null, 29);
                xo9.A(textView2, geoAttachment.h);
                xo9.A(textView, geoAttachment.i);
                return;
            }
            if (attachment instanceof LinkAttachment) {
                LinkAttachment linkAttachment = (LinkAttachment) attachment;
                String str = linkAttachment.g;
                HeaderPhotoView.p(headerPhotoView, Integer.valueOf(R.drawable.vk_icon_external_link_outline_24), null, 29);
                if (str == null || str.length() == 0) {
                    str = d6iVar.v6(R.string.attach_link);
                }
                xo9.A(textView2, str);
                String str2 = linkAttachment.f.b;
                try {
                    failure = Uri.parse(str2).getAuthority();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                String str3 = (String) (failure instanceof Result.Failure ? null : failure);
                if (str3 != null) {
                    str2 = str3;
                }
                xo9.A(textView, str2);
            }
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof r74) {
            this.C = ((r74) u1c0Var).q;
        }
        super.a6(u1c0Var);
    }
}
