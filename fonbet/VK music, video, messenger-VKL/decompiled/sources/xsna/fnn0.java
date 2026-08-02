package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vkontakte.android.R;

/* compiled from: SwitchHolder.kt */
/* loaded from: classes16.dex */
public final class fnn0 extends j2j0<inn0> {
    public final VkSwitchItem o;

    public fnn0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.holder_switch, 0);
        VkSwitchItem vkSwitchItem = (VkSwitchItem) this.itemView.findViewById(R.id.settings_switch);
        this.o = vkSwitchItem;
        vkSwitchItem.setAlignSwitchToEnd(true);
        vkSwitchItem.setListener(new k6c0(this, 7));
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        this.o.setChecked(((inn0) obj).c);
    }
}
