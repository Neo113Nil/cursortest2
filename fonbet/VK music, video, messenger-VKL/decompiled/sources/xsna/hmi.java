package xsna;

import androidx.compose.runtime.a;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetViewState;
import xsna.imi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hmi implements zzs {
    public final /* synthetic */ int b;

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long j;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                BottomSheetViewState bottomSheetViewState = (BottomSheetViewState) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(bottomSheetViewState) ? 32 : 16;
                }
                int i2 = i;
                if (aVar.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2059753144, i2, -1, "com.vk.libvideo.adfree.impl.ui.ComposableSingletons$VideoAdFreeBottomSheetKt.lambda$-2059753144.<anonymous> (VideoAdFreeBottomSheet.kt:97)");
                    }
                    boolean z = (i2 & 14) == 4;
                    Object x = aVar.x();
                    if (z || x == a.C0011a.a) {
                        x = new imi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(x);
                    }
                    z78.a(bottomSheetViewState, (izs) ((fcy) x), aVar, (i2 >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 32 : 16;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-720939172, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$-720939172.<anonymous> (VkSecondaryTabRow.kt:556)");
                    }
                    if (booleanValue) {
                        aVar2.K(-1332804569);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                    } else {
                        aVar2.K(-1332803383);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().p;
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Tab", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.P, aVar2, 6, 0, 8186);
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
}
