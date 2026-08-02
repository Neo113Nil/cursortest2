package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Price;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.qi6;

/* compiled from: FaveBigSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class rmq extends ybk0 {
    public static final /* synthetic */ int V = 0;
    public final ImageView T;
    public final View U;

    public rmq(ViewGroup viewGroup) {
        super(R.layout.attach_snippet_fave_big, viewGroup);
        this.T = (ImageView) this.itemView.findViewById(R.id.iv_snippet_status);
        this.U = this.itemView.findViewById(R.id.tv_new_label);
        this.D.l(gbg0.a(this.itemView.getResources(), 0.5f), ybk0.S);
        this.D.setCornerRadius(gbg0.a(this.itemView.getResources(), 4.0f));
        this.D.setBackgroundResource(R.drawable.fave_gray_rounded_bg);
    }

    @Override // xsna.m56
    public final void T6(SnippetAttachment snippetAttachment) {
        int a;
        int i;
        Product product;
        Price price;
        String str;
        TextView textView;
        SnippetAttachment snippetAttachment2 = snippetAttachment;
        int a2 = qi6.a.a(this.itemView.getContext()) - (this.itemView.getResources().getDimensionPixelOffset(R.dimen.post_side_padding_btn) * 2);
        Photo photo = snippetAttachment2.p;
        if (photo != null && !photo.y.b.isEmpty()) {
            ImageSize imageSize = snippetAttachment2.G;
            if (imageSize == null) {
                Photo photo2 = snippetAttachment2.p;
                imageSize = photo2 != null ? photo2.Eb(SnippetAttachment.H) : ImageSize.f;
            }
            Image image = imageSize.d;
            i = (Math.min(gbg0.a(this.itemView.getResources(), image.b), a2) - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight();
            a = (int) Math.rint(i / (image.b / image.c));
        } else if (fnj.d(this.itemView.getContext())) {
            i = (a2 - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight();
            a = iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
        } else {
            a = iah0.a(146);
            i = -1;
        }
        FrescoImageView frescoImageView = this.D;
        ViewGroup.LayoutParams layoutParams = frescoImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = a;
        }
        frescoImageView.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = this.F.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i;
        }
        TextView textView2 = this.G;
        textView2.setMaxLines(2);
        boolean z = false;
        this.H.setVisibility(((snippetAttachment2.Gb() || textView2.getPaint().measureText(snippetAttachment2.g) <= ((float) (i - (gbg0.a(this.itemView.getResources(), 12.0f) * 2)))) && (snippetAttachment2.Gb() || !((str = snippetAttachment2.h) == null || str.length() == 0)) && (!snippetAttachment2.Gb() || (product = snippetAttachment2.r) == null || (price = product.b) == null || price.b != 0)) ? 0 : 8);
        if (!TextUtils.isEmpty(snippetAttachment2.k) && (textView = this.L) != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
            if (snippetAttachment2.Gb()) {
                layoutParams3.removeRule(15);
                layoutParams3.addRule(8, R.id.attach_url_wrapper);
                layoutParams4.removeRule(16);
            } else {
                layoutParams4.addRule(16, R.id.attach_button);
                layoutParams3.removeRule(8);
                layoutParams3.addRule(15);
            }
            textView.setLayoutParams(layoutParams3);
            textView2.setLayoutParams(layoutParams4);
        }
        super.b7(snippetAttachment2);
        frescoImageView.setIgnoreTrafficSaverPredicate(new dmg(0, new qmq(this, rmq.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 1));
        frescoImageView.setLocalImage((fxj0) null);
        frescoImageView.setRemoteImage((List<? extends fxj0>) X6(snippetAttachment2));
        SnippetAttachment snippetAttachment3 = (SnippetAttachment) this.C;
        NewsEntry q6 = q6();
        if (snippetAttachment3 != null && (q6 instanceof FaveEntry)) {
            Photo photo3 = snippetAttachment3.p;
            boolean z2 = photo3 == null || photo3.y.b.isEmpty();
            ImageView imageView = this.N;
            if (imageView != null) {
                imageView.setImageDrawable(uko.d(R.drawable.vk_icon_more_vertical_24, z2 ? R.color.vk_steel_gray_300 : R.color.vk_white, this.itemView.getContext()));
            }
            bwt0.p0(this.T, z2);
        }
        View view = this.U;
        if (view != null) {
            NewsEntry q62 = q6();
            if ((q62 instanceof FaveEntry) && !((FaveEntry) q62).i.c) {
                z = true;
            }
            bwt0.p0(view, z);
        }
    }
}
