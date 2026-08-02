package xsna;

import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.log.L;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class n21 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ n21(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(18381451, intValue, -1, "com.vk.ecomm.reviews.impl.communities.replies.ComposableSingletons$CommunityRepliesFragmentKt.lambda$18381451.<anonymous> (CommunityRepliesFragment.kt:331)");
                    }
                    emi.e.g(6, aVar, znk0.d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(165279142, intValue2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.ComposableSingletons$StorefrontContentKt.lambda$165279142.<anonymous> (StorefrontContent.kt:177)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(276227599, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkSegmentedControlKt.lambda$276227599.<anonymous> (VkSegmentedControl.kt:123)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                return new Pair((it80) obj, (it80) obj2);
            case 5:
                return (vqt) obj;
            case 6:
                mc90 mc90Var = (mc90) obj2;
                if (Float.isNaN(mc90Var.l())) {
                    L.l("PagerStateSaver: Save state: Profile PagerSaver currentPageOffsetFraction NaN");
                }
                return e43.l(Integer.valueOf(mc90Var.k()), Integer.valueOf(mc90Var.o()));
            case 7:
                f2h0 f2h0Var = (f2h0) obj;
                tho0 tho0Var = (tho0) obj2;
                return e43.a(i2h0.a(tho0Var.a, i2h0.a, f2h0Var), i2h0.a(new qko0(tho0Var.b), i2h0.p, f2h0Var));
            case 8:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(2059303797);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2059303797, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:146)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar5.K(1738070820);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1738070820, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:217)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.C0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var2;
        }
    }
}
