package xsna;

import com.vk.core.compose.generated.VkTypographyToken;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fhi implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fhi(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1985671278, intValue, -1, "com.vk.ecomm.reviews.impl.marketitem.replies.presentation.ComposableSingletons$MarketItemReviewRepliesFragmentKt.lambda$1985671278.<anonymous> (MarketItemReviewRepliesFragment.kt:339)");
                    }
                    emi.e.g(6, aVar, aqw.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                return new com.vk.movika.sdk.android.defaultplayer.container.e(21, (ptk) obj, (ptk) obj2);
            case 2:
                ((Integer) obj2).getClass();
                xqc0.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-406957192);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-406957192, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:152)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
        }
    }
}
