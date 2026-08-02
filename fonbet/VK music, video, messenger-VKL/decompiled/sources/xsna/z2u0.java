package xsna;

import android.view.ViewGroup;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewerImageItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class z2u0 extends vfz<y2u0> {
    public final VKEnhancedImageView l;

    public z2u0(ViewGroup viewGroup) {
        super(R.layout.viewer_image_item_view_holder, viewGroup);
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) this.itemView;
        this.l = vKEnhancedImageView;
        vKEnhancedImageView.setWithImageDownscale(false);
        vKEnhancedImageView.p.c(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        vKEnhancedImageView.t = true;
        vKEnhancedImageView.invalidate();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(y2u0 y2u0Var) {
        ArrayList arrayList = y2u0Var.b;
        VKEnhancedImageView vKEnhancedImageView = this.l;
        vKEnhancedImageView.setRemoteImage((List<? extends fxj0>) arrayList);
        vKEnhancedImageView.setContentDescription(b6().getString(R.string.accessibility_photo) + " " + (getPosition() + 1));
    }
}
