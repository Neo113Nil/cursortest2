package xsna;

import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kei implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= aVar.l(booleanValue) ? 32 : 16;
        }
        if (aVar.t(intValue & 1, (intValue & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(766645457, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.ComposableSingletons$CoverCropActivityKt.lambda$766645457.<anonymous> (CoverCropActivity.kt:284)");
            }
            String N = d370.N(R.string.user_profile_cover_preview_desktop, 0, aVar);
            if (booleanValue) {
                aVar.K(-1988084932);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().m;
            } else {
                aVar.K(-1988083746);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().p;
            }
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.c0, aVar, 0, 0, 8186);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
