package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.superapp.api.dto.app.catalog.footer.UserStackFooter;
import com.vkontakte.android.R;
import java.util.List;
import xsna.tlo0;
import xsna.x7a;

/* compiled from: FooterUserStackViewHolder.kt */
/* loaded from: classes6.dex */
public final class a7s extends e9r0<x7a.a.C3978a> {
    public static final int o = iah0.a(24);
    public final VkUserStack m;
    public final bpn0 n;

    public a7s(ViewGroup viewGroup) {
        super(R.layout.vk_item_apps_catalog_user_stack_footer, viewGroup);
        this.m = (VkUserStack) this.itemView;
        this.n = new bpn0(new i9(24));
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        qzq0 qzq0Var = (qzq0) this.n.getValue();
        UserStackFooter userStackFooter = ((x7a.a.C3978a) obj).d;
        List<ProfileItem> list = userStackFooter.d;
        qzq0Var.getClass();
        List<? extends ayv0> a = qzq0.a(o, list);
        VkUserStack vkUserStack = this.m;
        vkUserStack.setAvatars(a);
        tlo0.a aVar = tlo0.Companion;
        String str = userStackFooter.c;
        aVar.getClass();
        vkUserStack.setText(new tlo0.h(str));
        vkUserStack.setAvatarsPosition(VkUserStack.AvatarsPosition.Right);
    }
}
