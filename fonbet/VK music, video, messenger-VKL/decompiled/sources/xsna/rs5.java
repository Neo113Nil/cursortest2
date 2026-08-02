package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;

/* compiled from: ProfileGiftsFragment.kt */
/* loaded from: classes15.dex */
public final class rs5 implements VkCell.d {
    public final VKImageView a;

    public rs5(Context context) {
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setRound(true);
        this.a = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        xs5 xs5Var = fVar instanceof xs5 ? (xs5) fVar : null;
        if (xs5Var != null) {
            Drawable drawable = xs5Var.b;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            VKImageView vKImageView = this.a;
            vKImageView.F0(drawable, scaleType);
            vKImageView.o0(xs5Var.a, null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
