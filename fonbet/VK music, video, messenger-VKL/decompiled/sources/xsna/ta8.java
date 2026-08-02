package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.CallProducerButton;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ta8 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ta8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                jai jaiVar = (jai) this.c;
                xa8 xa8Var = (xa8) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-431986394, intValue, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:66)");
                    }
                    jaiVar.invoke(xa8Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                b8d.c((tlo0.h) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 2:
                kuh kuhVar = (kuh) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(249812987, intValue2, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.rightaction.CommunityProfileTopBarManageAction.Content.<anonymous>.<anonymous> (CommunityProfileTopBarManageAction.kt:55)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2048237034, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SettingsOutline28> (VkSdkIcons.kt:3322)");
                    }
                    lg90 b = or.b(aVar2, 429284277, R.drawable.vk_icon_settings_outline_28, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.edit_group, 0, aVar2);
                    gzs gzsVar = (gzs) ((zak0) kuhVar.f).getValue();
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new a60(20);
                        aVar2.R(x);
                    }
                    d.b.a.C0757a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar2, 12582920, 88).e(mtk0Var, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                j710.e((u710) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                d8d0 d8d0Var = (d8d0) this.c;
                ta10 ta10Var = (ta10) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-451657971, intValue3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockGoodsContentImpl.kt:82)");
                    }
                    d8d0Var.s(ta10Var, 0, aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 5:
                CallProducerButton callProducerButton = (CallProducerButton) this.c;
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1874546198, intValue4, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderImpl.bindButton.<anonymous> (ProductButtonsBinderImpl.kt:189)");
                    }
                    String str = callProducerButton.c;
                    String string = eVar.h.getContext().getString(R.string.ozon_primary_button_logo_accessibility_text);
                    boolean y = aVar4.y(eVar) | aVar4.y(callProducerButton);
                    Object x2 = aVar4.x();
                    if (y || x2 == a.C0011a.a) {
                        x2 = new mk(20, eVar, callProducerButton);
                        aVar4.R(x2);
                    }
                    bjd0.b(str, string, (gzs) x2, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((VkTopBar.e) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ta8(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ta8(kuh kuhVar, mtk0 mtk0Var) {
        this.b = 2;
        this.c = kuhVar;
        this.d = mtk0Var;
    }
}
