package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import java.util.Iterator;
import java.util.List;

/* compiled from: ProductFilterSegmentHolder.kt */
/* loaded from: classes18.dex */
public final class ood0 extends vfz<asd0> {
    public final izs<vcr<?>, s3q0> l;
    public final VkSegmentedControl m;
    public List<Integer> n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ood0(ViewGroup viewGroup, g22 g22Var) {
        super(r0);
        VkSegmentedControl vkSegmentedControl = new VkSegmentedControl(viewGroup.getContext(), null, 6);
        vkSegmentedControl.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        vkSegmentedControl.setSegmentSize(VkSegmentedControl.SegmentSize.Large);
        f4m.u(vkSegmentedControl, cn70.b(16), cn70.b(10), cn70.b(16), cn70.b(10));
        this.l = g22Var;
        VkSegmentedControl vkSegmentedControl2 = (VkSegmentedControl) this.itemView;
        this.m = vkSegmentedControl2;
        vkSegmentedControl2.setCustomTabView(new ba40(this, 17));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(asd0 asd0Var) {
        int intValue;
        asd0 asd0Var2 = asd0Var;
        List<Integer> list = this.n;
        List<Integer> list2 = asd0Var2.g;
        boolean f = epx.f(list, list2);
        VkSegmentedControl vkSegmentedControl = this.m;
        if (!f) {
            vkSegmentedControl.r();
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    int intValue2 = ((Number) it.next()).intValue();
                    TabLayout.g p = vkSegmentedControl.p();
                    p.p(intValue2);
                    vkSegmentedControl.i(p, false);
                }
            }
        }
        this.n = list2;
        Integer d = asd0Var2.d();
        if (d == null) {
            d = asd0Var2.b();
        }
        if (d != null && (intValue = d.intValue()) != vkSegmentedControl.getSelectedTabPosition()) {
            vkSegmentedControl.c(vkSegmentedControl.b(intValue), true);
        }
        vkSegmentedControl.setOnSelectTabPosition(new kp5(20, asd0Var2, this));
    }
}
