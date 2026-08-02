package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Triple;
import xsna.cri;
import xsna.dhx0;
import xsna.dt1;
import xsna.kpv;
import xsna.q630;
import xsna.rco0;
import xsna.sqt0;
import xsna.xpv;
import xsna.zjo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bb9 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bb9(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (fjw0) obj;
            case 1:
                return new Pair((gny) obj, (gny) obj2);
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1363194043, intValue, -1, "com.vk.attachpicker.collages.ComposableSingletons$CollageOnboardingBottomSheetKt.lambda$1363194043.<anonymous> (CollageOnboardingBottomSheet.kt:80)");
                    }
                    zfr0.f(SpinnerState.Loading, null, null, 0L, null, null, aVar, 6, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(401664218, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkPictureKt.lambda$401664218.<anonymous> (VkPicture.kt:244)");
                    }
                    q630 D = s200.D(q630.a.a, 8);
                    a.j g = androidx.compose.foundation.layout.a.g(4);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar2, 6);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c = qri.c(aVar2, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D2, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    float f = xcv0.a;
                    long j = l5g.h;
                    rco0 b = rco0.a.b(new y7z(e43.l(new l5g(j), new l5g(l5g.c(13, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), null, 0L, 9187343241974906880L, 0), "VK", aVar2, 3126);
                    dhx0 a2 = dhx0.a.a(aVar2);
                    PictureRadius pictureRadius = PictureRadius.Medium;
                    gdv0.c(b, f, null, pictureRadius, a2, null, null, aVar2, 3120, 100);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1183641094, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserCircleOutline28> (VkSdkIcons.kt:3570)");
                    }
                    lg90 b2 = or.b(aVar2, -170149470, R.drawable.vk_icon_user_circle_outline_28, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    xpv a3 = xpv.a.a(b2, ylu0Var.getIcon().n, null, aVar2, 24584, 12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(797276564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircle24> (VkSdkIcons.kt:796)");
                    }
                    lg90 a4 = pg90.a(R.drawable.vk_icon_error_circle_24, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gdv0.c(a3, f, null, pictureRadius, kpv.a.a(a4, l5g.k, 0L, null, false, null, null, aVar2, 100663352, 252), null, null, aVar2, 3120, 100);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-326620644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Play12> (VkSdkIcons.kt:2862)");
                    }
                    lg90 b3 = or.b(aVar2, 2040453711, R.drawable.vk_icon_play_12, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gdv0.d(xpv.a.a(b3, ylu0Var2.getIcon().a, null, aVar2, 24584, 12), byc0.b(120, 80), Collections.singletonList(dhx0.a.a(aVar2)), null, null, null, null, aVar2, 48, 120);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((sti) obj).a(new we80((sl50) obj2));
                return s3q0.a;
            case 5:
                zjo0 zjo0Var = (zjo0) obj2;
                return e43.a(i2h0.a(new zjo0.a(zjo0Var.a), k2h0.e, (f2h0) obj), Boolean.valueOf(zjo0Var.b));
            case 6:
                return Boolean.valueOf(epx.f(((it80) obj).a, ((it80) obj2).a));
            case 7:
                Pair pair = (Pair) obj2;
                Boolean bool = (Boolean) pair.d();
                bool.booleanValue();
                return new Triple((Long) obj, bool, (sqt0.c) pair.g());
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(-802742887);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-802742887, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:173)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.K;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
        }
    }
}
