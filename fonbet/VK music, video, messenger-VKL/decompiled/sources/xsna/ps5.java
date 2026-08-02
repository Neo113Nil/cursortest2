package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;

/* compiled from: UserProfileGiftsAdapter.kt */
/* loaded from: classes5.dex */
public final class ps5 implements VkCell.d {
    public final VKImageView a;

    public ps5(Context context) {
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setRound(true);
        this.a = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        vs5 vs5Var = fVar instanceof vs5 ? (vs5) fVar : null;
        if (vs5Var != null) {
            Drawable drawable = vs5Var.b;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            VKImageView vKImageView = this.a;
            vKImageView.F0(drawable, scaleType);
            vKImageView.o0(vs5Var.a, null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
