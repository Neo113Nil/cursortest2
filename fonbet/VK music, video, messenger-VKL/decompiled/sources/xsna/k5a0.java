package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.im.Image;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PhotoAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class k5a0 extends p1u0<SimpleAttachListItem> {
    public final a1y a;
    public final boolean b;

    /* compiled from: PhotoAttachViewTypeDelegate.kt */
    public final class a extends vfz<SimpleAttachListItem> {
        public final VkEnhancedImageView l;

        public a(View view) {
            super(view);
            this.l = (VkEnhancedImageView) view.findViewById(R.id.photo_image_view);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(SimpleAttachListItem simpleAttachListItem) {
            List<Image> list = ((AttachImage) simpleAttachListItem.b.d).q.b;
            VkEnhancedImageView vkEnhancedImageView = this.l;
            vkEnhancedImageView.setRemoteImages(list);
            k5a0 k5a0Var = k5a0.this;
            bwt0.i0(vkEnhancedImageView, new sf4(16, k5a0Var, this));
            bwt0.k0(vkEnhancedImageView, new qb6(23, k5a0Var, this));
            vkEnhancedImageView.setContentDescription(vkEnhancedImageView.getContext().getString(R.string.vkim_msg_photo_single));
            ViewGroup.LayoutParams layoutParams = vkEnhancedImageView.getLayoutParams();
            FlexboxLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof FlexboxLayoutManager.LayoutParams ? (FlexboxLayoutManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f = 1.0f;
                layoutParams2.h = 1;
            }
        }
    }

    public k5a0(a1y a1yVar, boolean z) {
        this.a = a1yVar;
        this.b = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends SimpleAttachListItem> b(ViewGroup viewGroup) {
        return new a(bwt0.I(this.b ? R.layout.vkim_history_attach_photo_square : R.layout.vkim_history_attach_photo, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof SimpleAttachListItem) && (((SimpleAttachListItem) hfzVar).b.d instanceof AttachImage);
    }
}
