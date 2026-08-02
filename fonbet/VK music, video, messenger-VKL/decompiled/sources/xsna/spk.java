package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CustomizeTagHolder.kt */
/* loaded from: classes4.dex */
public final class spk extends vif0<FaveTag> {
    public final l2o0 n;
    public final VkCheckboxItem o;

    public spk(ViewGroup viewGroup, l2o0 l2o0Var) {
        super(viewGroup, R.layout.fave_customize_tag_holder, 0);
        this.n = l2o0Var;
        VkCheckboxItem vkCheckboxItem = (VkCheckboxItem) this.itemView;
        this.o = vkCheckboxItem;
        vkCheckboxItem.setType(VkCheckbox.Type.Square);
    }

    @Override // xsna.vif0
    public final void i6(FaveTag faveTag) {
        FaveTag faveTag2 = faveTag;
        if (faveTag2 != null) {
            tlo0.a aVar = tlo0.Companion;
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(faveTag2.c);
            aVar.getClass();
            tlo0.h hVar = new tlo0.h(i);
            VkCheckboxItem vkCheckboxItem = this.o;
            vkCheckboxItem.setTitle(hVar);
            vkCheckboxItem.setChecked(this.n.f.contains(faveTag2));
            vkCheckboxItem.setListener(new yi2(this, 14));
        }
    }
}
