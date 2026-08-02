package xsna;

import android.net.Uri;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.picture.VkImage;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import xsna.fvz;

/* compiled from: LocalMediaViewHolder.kt */
/* loaded from: classes4.dex */
public final class lvz extends vif0<fvz.a> {
    public final ImageView n;
    public final ImageView o;
    public final VkContentBadge p;
    public final VkImage q;
    public MediaStoreEntry r;

    public lvz(ViewGroup viewGroup, it7 it7Var, zqh zqhVar) {
        super(tf3.b(viewGroup, R.layout.media_picker_media_item, viewGroup, false));
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.checkbox);
        this.n = imageView;
        this.o = (ImageView) this.itemView.findViewById(R.id.video_icon);
        this.p = (VkContentBadge) this.itemView.findViewById(R.id.video_duration);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.preview_image);
        this.q = vkImage;
        abg0 abg0Var = dhr0.t;
        vkImage.setPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        vkImage.y0(iah0.b(0.5f), abg0Var.c(R.attr.vk_ui_image_border_alpha));
        imageView.setOnClickListener(new k1l(2, it7Var, this));
        bwt0.i0(this.itemView, new qb6(17, zqhVar, this));
        vkImage.setDontLoadAgainIfSameResource(true);
    }

    @Override // xsna.vif0
    public final void i6(fvz.a aVar) {
        fvz.a aVar2 = aVar;
        int i = aVar2.k;
        ImageView imageView = this.n;
        imageView.setImageResource(i);
        iut0.q(imageView, new cl(aVar2.c ? R.string.media_item_checked_checkbox_accessibly : R.string.media_item_unchecked_checkbox_accessibly));
        imageView.setContentDescription(aVar2.l);
        Uri uri = aVar2.h;
        Size i2 = aVar2.i.i();
        VkImage vkImage = this.q;
        vkImage.m0(uri, i2);
        vkImage.setContentDescription(aVar2.j);
        bwt0.p0(this.o, aVar2.e);
        boolean z = aVar2.f;
        VkContentBadge vkContentBadge = this.p;
        bwt0.p0(vkContentBadge, z);
        vkContentBadge.setText(aVar2.g);
        this.r = aVar2.b.ba();
    }

    public final MediaStoreEntry q6() {
        return this.r;
    }

    public final VkImage s6() {
        return this.q;
    }
}
