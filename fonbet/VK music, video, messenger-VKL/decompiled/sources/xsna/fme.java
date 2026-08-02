package xsna;

import androidx.compose.runtime.a;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.home.HomeFragment2;
import xsna.dct0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fme implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fme(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(-383539080);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-383539080, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.onFocusSelectAll.<anonymous> (ClipsMyDescriptionEditView.kt:192)");
                }
                Object x = aVar.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(null);
                    aVar.R(x);
                }
                wh50 wh50Var2 = (wh50) x;
                if (((Boolean) wh50Var2.getValue()) != null) {
                    aVar.K(-1399589541);
                    Boolean bool = (Boolean) wh50Var2.getValue();
                    boolean J = aVar.J(wh50Var);
                    Object x2 = aVar.x();
                    if (J || x2 == c0012a) {
                        x2 = new gme(wh50Var, null);
                        aVar.R(x2);
                    }
                    bap.g(bool, (wzs) x2, aVar, 0);
                } else {
                    aVar.K(-1407330582);
                }
                aVar.j();
                Object x3 = aVar.x();
                if (x3 == c0012a) {
                    x3 = new com.vk.movika.sdk.base.observable.p(wh50Var2, 26);
                    aVar.R(x3);
                }
                q630 u = fvr.u(q630Var, (izs) x3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 1:
                wvq wvqVar = (wvq) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1191862237, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList.<anonymous>.<anonymous>.<anonymous> (FeedActionButtonsScreenContent.kt:81)");
                    }
                    wvqVar.d("VkActionButtonView", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                HomeFragment2 homeFragment2 = (HomeFragment2) this.c;
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                VkContextMenu vkContextMenu = homeFragment2.Y;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            default:
                ect0 ect0Var = (ect0) this.c;
                ((Integer) obj3).getClass();
                xn50.a.c(ect0Var, new dct0.b((cct0) obj2));
                ect0Var.dismiss();
                break;
        }
        return s3q0.a;
    }
}
