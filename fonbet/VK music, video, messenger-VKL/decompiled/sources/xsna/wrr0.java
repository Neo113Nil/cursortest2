package xsna;

import android.view.View;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;

/* compiled from: VhInviteUser.kt */
/* loaded from: classes7.dex */
public final class wrr0 extends com.vk.voip.ui.settings.participants_view.n<CallSettingsItem.f> {
    public static final /* synthetic */ int r = 0;
    public final fuw0 p;
    public final VkCheckbox q;

    public wrr0(View view) {
        super(view);
        this.p = fuw0.a;
        this.q = (VkCheckbox) this.itemView.findViewById(R.id.voip_add);
        bwt0.i0(view, new gqe0(this, 16));
    }
}
