package xsna;

import android.widget.ImageView;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.core.view.components.tabs.VkTabs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class spv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ spv0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        VkTabs vkTabs;
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VkTabsVh vkTabsVh = (VkTabsVh) obj2;
                a7a a7aVar = (a7a) obj;
                boolean z = vkTabsVh.h;
                if (!z || a7aVar.b != 0) {
                    if (z) {
                        VkTabs vkTabs2 = vkTabsVh.j;
                        vkTabs = vkTabs2 != null ? vkTabs2 : null;
                        int i4 = a7aVar.b - 1;
                        int i5 = VkTabs.t;
                        vkTabs.l(i4, true);
                    } else {
                        VkTabs vkTabs3 = vkTabsVh.j;
                        vkTabs = vkTabs3 != null ? vkTabs3 : null;
                        int i6 = a7aVar.b;
                        int i7 = VkTabs.t;
                        vkTabs.l(i6, true);
                    }
                    break;
                } else {
                    VkTabs vkTabs4 = vkTabsVh.j;
                    (vkTabs4 != null ? vkTabs4 : null).j();
                    break;
                }
                break;
            case 1:
                ((gvw0) obj2).e = false;
                ((vq6) obj).invoke();
                break;
            default:
                c2x0 c2x0Var = (c2x0) obj2;
                int i8 = c2x0.o1;
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new iqa0(i3, c2x0Var, kd7.i((ImageView) obj, -1)));
                asu0 asu0Var = asu0.a;
                int i9 = 4;
                c2x0Var.k1.b(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.o(vVar.q(asu0Var.c()), new b2x0(new u5p0(c2x0Var, 25), i2)).m(asu0Var.d()), new vks0(new olt0(c2x0Var, 8), i9)), new psb(c2x0Var, i9)), new yjs0(8), new ntw0(c2x0Var, 2)));
                break;
        }
        return s3q0.a;
    }
}
