package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import xsna.tlo0;

/* compiled from: ProductFilterCheckboxItemHolder.kt */
/* loaded from: classes18.dex */
public final class dod0 extends vfz<tnd0> {
    public final izs<vcr<?>, s3q0> l;
    public final VkCheckboxItem m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dod0(ViewGroup viewGroup, g22 g22Var) {
        super(r0);
        VkCheckboxItem vkCheckboxItem = new VkCheckboxItem(viewGroup.getContext(), null, 6, 0);
        vkCheckboxItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCheckboxItem.setType(VkCheckbox.Type.Square);
        this.l = g22Var;
        this.m = (VkCheckboxItem) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(tnd0 tnd0Var) {
        tnd0 tnd0Var2 = tnd0Var;
        tlo0.f fVar = tnd0Var2.e;
        VkCheckboxItem vkCheckboxItem = this.m;
        vkCheckboxItem.setTitle(fVar);
        vkCheckboxItem.setSubtitle(tnd0Var2.f);
        Boolean d = tnd0Var2.d();
        if (d == null) {
            d = tnd0Var2.b();
        }
        vkCheckboxItem.setChecked(d.booleanValue());
        vkCheckboxItem.setListener(new cod0(tnd0Var2, this));
    }
}
