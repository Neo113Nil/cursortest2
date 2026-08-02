package xsna;

import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.superapp.multiaccount.api.f;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.q630;
import xsna.rew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bv4 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bv4(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                sjo.b(((ImageView) obj).getDrawable(), ((kkm) obj2).f(R.attr.vk_legacy_accent), PorterDuff.Mode.SRC_IN);
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-710216692, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.chats.ComposableSingletons$CommunityProfileContentChatViewHolderKt.lambda$-710216692.<anonymous> (CommunityProfileContentChatViewHolder.kt:94)");
                    }
                    rrv0.d(null, null, null, null, imj0.c, aVar, 24576, 15);
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
                        androidx.compose.runtime.b.f(2095930546, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$FormFieldScreenContentKt.lambda$2095930546.<anonymous> (FormFieldScreenContent.kt:196)");
                    }
                    rzo0.a(54, 0, aVar2, "Lego View Form Field", s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a));
                    t8s.t(0, aVar2);
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
                        androidx.compose.runtime.b.f(-1406416085, intValue3, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1406416085.<anonymous> (Scaffold.kt:184)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1767370654, intValue4, -1, "com.vk.profile.user.impl.ui.wall.ComposableSingletons$UserProfileContentWallViewHolderKt.lambda$-1767370654.<anonymous> (UserProfileContentWallViewHolder.kt:191)");
                    }
                    tth.a(null, sdy.e, aVar4, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 5:
                vr00 vr00Var = (vr00) obj;
                ((Long) obj2).longValue();
                return vr00Var;
            case 6:
                return new Pair((f.c) obj, (List) obj2);
            case 7:
                ((Integer) obj2).getClass();
                wh80.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                return Integer.valueOf(((zox) obj).l0(((Integer) obj2).intValue()));
            case 9:
                Throwable th = (Throwable) obj2;
                if (th != null) {
                    L.i(th);
                }
                return s3q0.a;
            case 10:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar5.K(878105503);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(878105503, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:189)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.a0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var;
            case 11:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
            default:
                UserId userId = (UserId) obj2;
                return new rew0.a(fkq0.c(userId), userId, (List) obj);
        }
    }
}
