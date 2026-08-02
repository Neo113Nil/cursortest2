package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FaveMiddleSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class qqq extends ybk0 {
    public final ImageView T;
    public final View U;

    public qqq(ViewGroup viewGroup) {
        super(R.layout.attach_snippet_fave_middle, viewGroup);
        this.T = (ImageView) this.itemView.findViewById(R.id.iv_snippet_status);
        this.U = this.itemView.findViewById(R.id.tv_new_label);
    }

    @Override // xsna.m56
    public final void T6(SnippetAttachment snippetAttachment) {
        String str;
        Image image;
        Product product;
        Price price;
        SnippetAttachment snippetAttachment2 = snippetAttachment;
        Photo photo = snippetAttachment2.p;
        boolean z = true;
        bwt0.p0(this.H, !snippetAttachment2.Gb() ? (str = snippetAttachment2.h) == null || str.length() == 0 : !((product = snippetAttachment2.r) == null || (price = product.b) == null || price.b != 0));
        View view = this.U;
        if (view != null) {
            NewsEntry t6 = t6();
            bwt0.p0(view, (t6 instanceof FaveEntry) && !((FaveEntry) t6).i.c);
        }
        super.b7(snippetAttachment2);
        if (photo != null) {
            Image image2 = photo.y;
            if (!image2.b.isEmpty() && !image2.equals(Image.d)) {
                z = false;
            }
        }
        bwt0.p0(this.T, z);
        FrescoImageView frescoImageView = this.D;
        ArrayList arrayList = null;
        frescoImageView.setLocalImage((fxj0) null);
        if (photo != null && (image = photo.y) != null) {
            arrayList = image.b;
        }
        frescoImageView.setRemoteImage((List<? extends fxj0>) arrayList);
    }
}
