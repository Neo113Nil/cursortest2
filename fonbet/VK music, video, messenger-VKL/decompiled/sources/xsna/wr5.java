package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.ui.views.online.OnlineView;
import com.vkontakte.android.R;

/* compiled from: AvatarPicture.kt */
/* loaded from: classes7.dex */
public final class wr5 implements VkCell.d {
    public final VKAvatarView a;
    public final OnlineView b;
    public final AppCompatImageView c;

    @SuppressLint({"InflateParams"})
    public final View d;

    public wr5(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.voip_cell_default_avatar_left, (ViewGroup) null);
        this.a = (VKAvatarView) inflate.findViewById(R.id.call_avatar);
        this.b = (OnlineView) inflate.findViewById(R.id.call_online);
        this.c = (AppCompatImageView) inflate.findViewById(R.id.call_badge);
        this.d = inflate;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if (fVar instanceof xr5) {
            xr5 xr5Var = (xr5) fVar;
            this.a.Y0(xr5Var.a);
            this.b.setMode(xr5Var.b);
            boolean z = xr5Var.c != null;
            AppCompatImageView appCompatImageView = this.c;
            awt0.v(appCompatImageView, z);
            Drawable drawable = xr5Var.c;
            if (drawable != null) {
                appCompatImageView.setImageDrawable(drawable);
            }
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.d;
    }
}
