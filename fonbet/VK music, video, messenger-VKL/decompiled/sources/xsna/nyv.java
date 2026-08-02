package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.ui.views.avatars.AvatarView;
import kotlin.NoWhenBranchMatchedException;
import xsna.lyv;

/* compiled from: ImCellAvatarViewController.kt */
/* loaded from: classes2.dex */
public final class nyv implements VkCell.d {
    public final AvatarView a;

    public nyv(Context context) {
        AvatarView avatarView = new AvatarView(context, null, 6, 0);
        avatarView.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        this.a = avatarView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if (fVar instanceof lyv) {
            lyv lyvVar = (lyv) fVar;
            boolean z = lyvVar instanceof lyv.a;
            AvatarView avatarView = this.a;
            if (z) {
                lyv.a aVar = (lyv.a) fVar;
                avatarView.X0(aVar.a, aVar.b);
            } else {
                if (!(lyvVar instanceof lyv.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                avatarView.T0(null, ((lyv.b) fVar).a);
            }
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
