package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y9a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y9a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                m9t m9tVar = (m9t) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-620185887, intValue, -1, "com.vk.games.presentation.catalog.view.GamesCatalogAchievementsModalBottomSheetView.ThemedContent.<anonymous> (GamesCatalogAchievementsModalBottomSheetView.kt:28)");
                    }
                    n9t n9tVar = m9tVar.h1;
                    u4e u4eVar = m9tVar.i1;
                    boolean y = aVar.y(m9tVar);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new dnh(m9tVar, 23);
                        aVar.R(x);
                    }
                    k9t.b(n9tVar, u4eVar, (gzs) x, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                q8d0 q8d0Var = (q8d0) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(953390295, intValue2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockHeaderBaseRightActionsImpl.Content.<anonymous>.<anonymous> (PrimaryBlockHeaderBaseRightActionsImpl.kt:64)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1820128868, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronRightCircle28> (VkSdkIcons.kt:506)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_chevron_right_circle_28, 0, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q8d0Var.b(a, null, (gzs) ((zak0) q8d0Var.d).getValue(), (SemanticsConfiguration) ((zak0) q8d0Var.f).getValue(), aVar2, 8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 3:
                rg50 rg50Var = (rg50) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-510024805, intValue3, -1, "com.vk.catalog.mvi.block.impl.slider.SliderView.BlockView.ContentImpl.<anonymous>.<anonymous>.<anonymous> (SliderView.kt:334)");
                    }
                    zfr0.e(txj0.v(txj0.h(q630.a.a, ((azl) aVar3.r(uvi.h)).j1(rg50Var.getIntValue())), 70), 0L, null, aVar3, 0, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                jhk0 jhk0Var = (jhk0) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar4.J(q630Var) ? 4 : 2;
                }
                if (aVar4.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(340461026, intValue4, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.pages.<anonymous> (SpacingAndSeparatorScreenContent.kt:60)");
                    }
                    jhk0Var.e(q630Var, aVar4, intValue4 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }
}
