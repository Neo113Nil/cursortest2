package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: ProfileFriendsListHeaderSearchVh.kt */
/* loaded from: classes4.dex */
public final class bxd0 extends vfz<axd0> {
    public final VkGroupHeader l;

    public bxd0(ViewGroup viewGroup) {
        super(R.layout.holder_profile_friends_header, viewGroup);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
        this.l = vkGroupHeader;
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
    }

    @Override // xsna.vfz
    public final void W5(axd0 axd0Var) {
        this.l.setTitle(new VkGroupHeader.d(axd0Var.b, null, null, null, 0, null, 510));
    }
}
