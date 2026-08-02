package xsna;

import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetState;
import kotlin.Pair;
import xsna.dcm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vv7 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vv7(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                wv7.e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj).getClass();
                return ((r2a) ((ttk0) obj2).getValue()).w();
            case 2:
                return new Pair((it80) obj, (it80) obj2);
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1527418771, intValue, -1, "com.vk.catalog2.feature.music.ui.holder.ComposableSingletons$MusicOfflineSyncPlaceholderVhKt.lambda$-1527418771.<anonymous> (MusicOfflineSyncPlaceholderVh.kt:41)");
                    }
                    rrv0.d(null, null, null, null, dii.a, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                ((Boolean) obj2).booleanValue();
                return s3q0.a;
            case 5:
                pco pcoVar = (pco) obj;
                pco pcoVar2 = (pco) obj2;
                float f = 0;
                return pn00.k(new Pair(BottomSheetState.Collapsed, new pco(pcoVar.b - Math.min(f, pcoVar2.b))), new Pair(BottomSheetState.Expanded, new pco(((pco) jw5.v(new pco(f), new pco(pcoVar.b - pcoVar2.b))).b)));
            case 6:
                return dcm.a.a((dcm.a) obj2, null, false, false, 13);
            case 7:
                return (VKList) obj2;
            case 8:
                return (rtt) obj;
            case 9:
                ((Integer) obj2).getClass();
                evn0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-792972326);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-792972326, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:183)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.U;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
        }
    }
}
