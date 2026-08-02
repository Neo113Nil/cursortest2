package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import xsna.dll0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wkl0 implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wkl0(List list, izs izsVar, gzs gzsVar) {
        this.d = list;
        this.c = izsVar;
        this.e = gzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                dll0.a.b bVar = (dll0.a.b) this.d;
                tl1 tl1Var = (tl1) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1469539008, intValue, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsSuccess.<anonymous>.<anonymous>.<anonymous> (StorefrontAlbumsSuccess.kt:70)");
                    }
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new nac(izsVar, 6);
                        aVar.R(x);
                    }
                    xi1.f(tl1Var, bVar.a.b, ojc.c(q630.a.a, false, null, null, (gzs) x, 15), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                List list = (List) this.d;
                gzs gzsVar = (gzs) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1181402569, intValue2, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsModalChooseGroup.<anonymous> (TabbarSettingsModalChooseGroup.kt:49)");
                    }
                    yvn0.a(list, this.c, gzsVar, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wkl0(izs izsVar, dll0.a.b bVar, tl1 tl1Var) {
        this.c = izsVar;
        this.d = bVar;
        this.e = tl1Var;
    }
}
