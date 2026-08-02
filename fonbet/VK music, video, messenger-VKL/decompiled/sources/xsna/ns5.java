package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ImageControllerHelper.kt */
/* loaded from: classes17.dex */
public final class ns5 implements VkCell.d {
    public final Drawable a;
    public final VkAvatar b;

    public ns5(Context context) {
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.user_placeholder, context);
        this.a = a;
        VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
        vkAvatar.setPlaceholderImage(a);
        this.b = vkAvatar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        us5 us5Var = fVar instanceof us5 ? (us5) fVar : null;
        if (us5Var != null) {
            this.b.setContent(new c.d(us5Var.a, null));
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.b;
    }
}
