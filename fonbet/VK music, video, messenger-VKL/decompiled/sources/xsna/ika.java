package xsna;

import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ika implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ika(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar.t(intValue & 1, (intValue & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1971512503, intValue, -1, "com.vk.ecomm.categories.impl.presentation.ui.TabBarSegment.<anonymous> (CategoriesTabBar.kt:45)");
                    }
                    q630 E = s200.E(q630.a.a, kqu0.v, kqu0.s);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, E, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.O, aVar, 100663296, 48, 5880);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) this.c;
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                gzs gzsVar = (gzs) obj4;
                k3p0 c = toolbarRedesignVh.c();
                c.getClass();
                return new s7p0(new gko(intValue2), c.a.getString(intValue3), true, gzsVar, (Integer) obj3);
        }
    }
}
