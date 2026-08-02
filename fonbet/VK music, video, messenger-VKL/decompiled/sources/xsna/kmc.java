package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vkontakte.android.R;

/* compiled from: ClipBeforeSlot.kt */
/* loaded from: classes16.dex */
public final class kmc implements Slot<Object> {
    public final VkAvatar b;
    public final VkDiagonalUserStack c;
    public final FrameLayout d;

    public kmc(Context context) {
        VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
        int a = e3m.a(R.dimen.vk_ui_avatar_s, context);
        vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(a, a));
        this.b = vkAvatar;
        VkDiagonalUserStack vkDiagonalUserStack = new VkDiagonalUserStack(context, null, 6);
        vkDiagonalUserStack.setSize(VkDiagonalUserStack.Size.Large);
        vkDiagonalUserStack.setVisibility(8);
        this.c = vkDiagonalUserStack;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(vkAvatar);
        frameLayout.addView(vkDiagonalUserStack);
        this.d = frameLayout;
    }

    @Override // com.vk.core.view.components.cell.slot.Slot
    public final View getView() {
        return this.d;
    }

    @Override // xsna.too0
    public final void Ng() {
    }

    @Override // com.vk.core.view.components.cell.slot.Slot
    public final void Ad(Slot.Size size) {
    }
}
