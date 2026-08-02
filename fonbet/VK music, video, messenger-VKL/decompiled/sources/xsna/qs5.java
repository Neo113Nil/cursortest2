package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public final class qs5 implements VkCell.d {
    public final VKImageView a;

    public qs5(Context context) {
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setRound(true);
        this.a = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        ws5 ws5Var = fVar instanceof ws5 ? (ws5) fVar : null;
        if (ws5Var != null) {
            this.a.o0(ws5Var.a, null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
