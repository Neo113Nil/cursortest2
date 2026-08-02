package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.qi6;

/* compiled from: FaveBigProductSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class pmq extends wk6 {
    public final TextView S;

    public pmq(ViewGroup viewGroup) {
        super(viewGroup);
        this.S = (TextView) this.itemView.findViewById(R.id.tv_new_label);
        this.D.m(gbg0.a(this.itemView.getResources(), 4.0f), gbg0.a(this.itemView.getResources(), 4.0f), gbg0.a(this.itemView.getResources(), 4.0f), gbg0.a(this.itemView.getResources(), 4.0f));
    }

    @Override // xsna.wk6
    public final void X6() {
        super.X6();
        NewsEntry q6 = q6();
        bwt0.p0(this.S, (q6 instanceof FaveEntry) && !((FaveEntry) q6).i.c);
    }

    @Override // xsna.wk6, xsna.m56
    /* renamed from: Y6 */
    public final void T6(SnippetAttachment snippetAttachment) {
        int min;
        int rint;
        Image image;
        Photo photo = snippetAttachment.p;
        ImageSize imageSize = null;
        ArrayList arrayList = (photo == null || (image = photo.y) == null) ? null : image.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            ImageSize imageSize2 = snippetAttachment.G;
            if (imageSize2 == null) {
                Photo photo2 = snippetAttachment.p;
                imageSize2 = photo2 != null ? photo2.Eb(SnippetAttachment.H) : ImageSize.f;
            }
            imageSize = imageSize2;
        }
        int a = qi6.a.a(this.itemView.getContext()) - (this.itemView.getResources().getDimensionPixelOffset(R.dimen.post_side_padding_btn) * 2);
        if (imageSize != null) {
            com.vk.dto.common.im.Image image2 = imageSize.d;
            min = (Math.min(gbg0.a(this.itemView.getResources(), image2.b), a) - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight();
            rint = (int) Math.rint(min / (image2.b / image2.c));
        } else if (fnj.d(this.itemView.getContext())) {
            min = (a - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight();
            rint = iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
        } else {
            rint = iah0.a(146);
            min = -1;
        }
        FrescoImageView frescoImageView = this.D;
        ViewGroup.LayoutParams layoutParams = frescoImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = min;
            layoutParams.height = rint;
        }
        frescoImageView.requestLayout();
        super.T6(snippetAttachment);
    }
}
