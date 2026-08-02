package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tca0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6g implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e6g(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        switch (i) {
            case 0:
                return com.vk.photo.editor.features.colorgrading.a.a((com.vk.photo.editor.features.colorgrading.a) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 8127);
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1332652733, intValue, -1, "com.vk.games.presentation.components.items.ComposableSingletons$FabWithNotificationDotKt.lambda$1332652733.<anonymous> (FabWithNotificationDot.kt:34)");
                    }
                    q630 D = s200.D(txj0.q(aVar, 28), 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1923516560, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-NotificationOutline56> (VkSdkIcons.kt:2746)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_notification_outline_56, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, null, D, ylu0Var.getIcon().b, aVar2, 440, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1041990638, intValue2, -1, "com.vk.catalog2.feature.music.ui.holder.ComposableSingletons$MusicOfflineSyncPlaceholderVhKt.lambda$-1041990638.<anonymous> (MusicOfflineSyncPlaceholderVh.kt:42)");
                    }
                    q630 f = txj0.f(s200.D(aVar, 32), 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar3, 48);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D2 = aVar3.D();
                    q630 c = qri.c(aVar3, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a2, cri.a.f);
                    k9q0.w(aVar3, D2, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    zfr0.e(null, wlb0.h(aVar3).getIcon().l, SpinnerSize.Size56, aVar3, 384, 1);
                    f9t.e(txj0.h(aVar, 12), aVar3, 6);
                    yqv0.c(d370.N(R.string.music_offline_migration_placeholder_title, 0, aVar3), null, wlb0.h(aVar3).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).z, aVar3, 0, 0, 8122);
                    f9t.e(txj0.h(aVar, 6), aVar3, 6);
                    yqv0.c(d370.N(R.string.music_offline_migration_placeholder_text, 0, aVar3), null, wlb0.h(aVar3).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).N, aVar3, 0, 0, 8122);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1826725713, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkScaffoldKt.lambda$1826725713.<anonymous> (VkScaffold.kt:52)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 4:
                return Boolean.FALSE;
            case 5:
                tca0.a.b bVar = (tca0.a.b) obj;
                tca0.a.b bVar2 = (tca0.a.b) obj2;
                return Boolean.valueOf(!bVar2.a && epx.f(bVar.b, bVar2.b) && bVar.c == bVar2.c && bVar.d == bVar2.d);
            case 6:
                Thread.sleep(((Long) obj).longValue());
                return s3q0.a;
            case 7:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(-377645509);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-377645509, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:182)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.T;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
            default:
                return new VoipActionsFeatureState.s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }
}
