package xsna;

import androidx.compose.runtime.a;
import xsna.ili;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jji implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jji(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        long j;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                gna0 gna0Var = (gna0) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(gna0Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(92607173, i, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.ComposableSingletons$PinReviewManageServiceBottomSheetKt.lambda$92607173.<anonymous> (PinReviewManageServiceBottomSheet.kt:88)");
                    }
                    boolean z = (i & 14) == 4;
                    Object x = aVar.x();
                    if (z || x == a.C0011a.a) {
                        x = new m4g(z37Var, 6);
                        aVar.R(x);
                    }
                    zma0.a(gna0Var, (izs) x, aVar, (i >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                z37 z37Var2 = (z37) obj;
                jpl0 jpl0Var = (jpl0) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (aVar2.J(z37Var2) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= aVar2.J(jpl0Var) ? 32 : 16;
                }
                int i3 = i2;
                if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(795438331, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.ComposableSingletons$StorefrontScreenKt.lambda$795438331.<anonymous> (StorefrontScreen.kt:47)");
                    }
                    boolean z2 = (i3 & 14) == 4;
                    Object x2 = aVar2.x();
                    if (z2 || x2 == a.C0011a.a) {
                        x2 = new ili.a(1, z37Var2, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar2.R(x2);
                    }
                    uml0.b(jpl0Var, (izs) ((fcy) x2), aVar2, (i3 >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= aVar3.l(booleanValue) ? 32 : 16;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1420140049, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-1420140049.<anonymous> (VkAccentTabRow.kt:573)");
                    }
                    if (booleanValue) {
                        aVar3.K(1045018490);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                    } else {
                        aVar3.K(1045019676);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().p;
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Tab", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.P, aVar3, 6, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
