package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Price;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SmallSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class t3k0 extends ybk0 {
    public static final /* synthetic */ int U = 0;
    public final ImageView T;

    public t3k0(ViewGroup viewGroup) {
        super(R.layout.attach_snippet_small, viewGroup);
        this.T = (ImageView) this.itemView.findViewById(R.id.iv_link_state);
        this.D.l(gbg0.a(this.itemView.getResources(), 0.5f), ybk0.S);
        this.D.m(gbg0.a(this.itemView.getResources(), 2.0f), 0, gbg0.a(this.itemView.getResources(), 2.0f), 0);
    }

    @Override // xsna.m56
    public final void T6(SnippetAttachment snippetAttachment) {
        String str;
        Product product;
        Price price;
        SnippetAttachment snippetAttachment2 = snippetAttachment;
        boolean z = true;
        bwt0.p0(this.H, !snippetAttachment2.Gb() ? (str = snippetAttachment2.h) == null || str.length() == 0 : !((product = snippetAttachment2.r) == null || (price = product.b) == null || price.b != 0));
        ImageView imageView = this.T;
        if (imageView != null) {
            Photo photo = snippetAttachment2.p;
            if (photo != null && !photo.y.b.isEmpty()) {
                z = false;
            }
            bwt0.p0(imageView, z);
        }
        super.b7(snippetAttachment2);
        cq6 cq6Var = new cq6(0, new s3k0(this, t3k0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 5);
        FrescoImageView frescoImageView = this.D;
        frescoImageView.setIgnoreTrafficSaverPredicate(cq6Var);
        frescoImageView.setLocalImage((fxj0) null);
        frescoImageView.setRemoteImage((List<? extends fxj0>) X6(snippetAttachment2));
    }
}
