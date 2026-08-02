package xsna;

import android.content.Context;
import androidx.compose.material.DrawerValue;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uhd implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uhd(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                fid.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                return com.vk.photo.editor.features.colorgrading.a.a((com.vk.photo.editor.features.colorgrading.a) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), null, null, 7167);
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(573680000, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.ComposableSingletons$CommunityProfileContentGoodsViewHolderKt.lambda$573680000.<anonymous> (CommunityProfileContentGoodsViewHolder.kt:329)");
                    }
                    rrv0.d(null, null, null, null, rdi.c, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                return (DrawerValue) ((zak0) ((klo) obj2).a.f).getValue();
            case 4:
                int intValue2 = ((Integer) obj2).intValue();
                e3m.a aVar2 = e3m.a;
                return m33.a(intValue2, (Context) obj);
            case 5:
                ((Integer) obj2).getClass();
                g3x.h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((ProgressWheel) obj).setBarColor(((kkm) obj2).f(R.attr.vk_ui_icon_accent));
                return s3q0.a;
            case 7:
                zho0 zho0Var = (zho0) obj2;
                return e43.a(Float.valueOf(zho0Var.a), Float.valueOf(zho0Var.b));
            case 8:
                ((ScrollToBottomView) obj).a(((kkm) obj2).f(R.attr.vk_legacy_accent));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                soj0.e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (booleanValue && booleanValue2) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 11:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(492090369);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(492090369, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:220)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.F0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar4.K(472549247);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(472549247, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:200)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.l0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
        }
    }

    public /* synthetic */ uhd(int i, int i2) {
        this.b = i2;
    }
}
