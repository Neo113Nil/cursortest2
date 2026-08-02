package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: LiveSpectatorsItemViewHolder.kt */
/* loaded from: classes3.dex */
public final class rlz extends vfz<mlz> {
    public final izs<UserId, s3q0> l;
    public final VkAvatar m;
    public final VkText n;

    public rlz(ViewGroup viewGroup, rop ropVar) {
        super(R.layout.live_spectators_item, viewGroup);
        this.l = ropVar;
        this.m = (VkAvatar) this.itemView.findViewById(R.id.live_spectators_avatar);
        this.n = (VkText) this.itemView.findViewById(R.id.live_spectators_user_name);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(mlz mlzVar) {
        mlz mlzVar2 = mlzVar;
        this.itemView.setOnClickListener(new k1l(1, this, mlzVar2));
        this.m.o0(mlzVar2.c, null);
        this.n.setText(mlzVar2.d);
    }
}
