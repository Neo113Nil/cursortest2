package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.Subscription;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.wit0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t8c implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ t8c(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                v8c.e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1420755239, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.setup.ComposableSingletons$BiometricsLockSecuritySetupViewKt.lambda$-1420755239.<anonymous> (BiometricsLockSecuritySetupView.kt:77)");
                    }
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(263616386, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationConfirmationMethod120H> (VkIcons.kt:3676)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_illustration_confirmation_method_120h, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vjw.a(a, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
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
                        androidx.compose.runtime.b.f(-2143225303, intValue2, -1, "com.vk.ecomm.reviews.impl.communities.replies.ComposableSingletons$CommunityRepliesFragmentKt.lambda$-2143225303.<anonymous> (CommunityRepliesFragment.kt:332)");
                    }
                    zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar2, 6, 510);
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
                        androidx.compose.runtime.b.f(-1629894510, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$-1629894510.<anonymous> (VkSecondaryTabRow.kt:226)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                com.vk.core.compose.component.datetime.g gVar = (com.vk.core.compose.component.datetime.g) obj2;
                Boolean bool = (Boolean) ((zak0) gVar.i).getValue();
                bool.booleanValue();
                return e43.l(bool, gVar.a.b());
            case 5:
                ((Integer) obj2).getClass();
                g3x.j(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                return Integer.valueOf(((plv) obj2).a);
            case 7:
                VideoNotificationsStatus videoNotificationsStatus = (VideoNotificationsStatus) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return Subscription.a.a;
                }
                int i = videoNotificationsStatus != null ? wit0.a.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()] : -1;
                return new Subscription.Subscribed(i != 1 ? i != 2 ? i != 3 ? Subscription.Subscribed.Notifications.Preferred : Subscription.Subscribed.Notifications.None : Subscription.Subscribed.Notifications.Preferred : Subscription.Subscribed.Notifications.All);
            case 8:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(-1183632108);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1183632108, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:246)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.f1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar5.K(-1405009865);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1405009865, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:144)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.h;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var2;
        }
    }

    public /* synthetic */ t8c(int i, int i2) {
        this.b = i2;
    }
}
