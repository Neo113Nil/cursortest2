package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.q630;
import xsna.rmw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m020 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m020(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        switch (this.b) {
            case 0:
                Pair pair = (Pair) this.c;
                q020 q020Var = (q020) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(797314493, intValue, -1, "com.vk.libvideo.design.compose.base.media.MediaImage.<anonymous>.<anonymous> (MediaView.kt:108)");
                }
                if (pair != null) {
                    aVar.K(1626983711);
                    lg90 lg90Var = (lg90) pair.i();
                    float f = q020Var.e;
                    wkj wkjVar = q020Var.c;
                    rmw.e eVar = (rmw.e) pair.j();
                    Object h = q020Var.c().h();
                    q630 q630Var = q630.a.a;
                    if (h != null) {
                        q630Var = qri.a(q630Var, a5x.a, new zt7(2, eVar, (izs) h));
                    }
                    r0v0.a(lg90Var, q630Var, q020Var.d, wkjVar, f, null, null, null, aVar, 8, 224);
                } else {
                    aVar.K(1622572101);
                }
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            default:
                m8d0 m8d0Var = (m8d0) this.c;
                wh50 wh50Var = m8d0Var.e;
                wh50 wh50Var2 = (wh50) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1880011884, intValue2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.Content.<anonymous>.<anonymous> (PrimaryBlockGoodsHeaderRightActionsImpl.kt:101)");
                }
                String str = (String) ((zak0) wh50Var).getValue();
                if (str != null) {
                    z = str.length() > 0;
                } else {
                    z = false;
                }
                boolean J = aVar2.J(m8d0Var);
                Object x = aVar2.x();
                Object obj4 = a.C0011a.a;
                if (J || x == obj4) {
                    x = new r9c0(m8d0Var, 3);
                    aVar2.R(x);
                }
                izs izsVar = (izs) x;
                boolean J2 = aVar2.J(m8d0Var);
                Object x2 = aVar2.x();
                if (J2 || x2 == obj4) {
                    x2 = new gib0(m8d0Var, 5);
                    aVar2.R(x2);
                }
                buv0 z2 = rdi.z(z, izsVar, (izs) x2, aVar2, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1586291574, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GearOutline24> (VkSdkIcons.kt:968)");
                }
                lg90 b = or.b(aVar2, 313051417, R.drawable.vk_icon_gear_outline_24, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 F = s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                String str2 = (String) ((zak0) wh50Var).getValue();
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
                VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size56;
                VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean s = ylu0Var.s();
                boolean y = aVar2.y(z2);
                Object x3 = aVar2.x();
                if (y || x3 == obj4) {
                    x3 = new s(18, z2, wh50Var2);
                    aVar2.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                boolean y2 = aVar2.y(z2);
                Object x4 = aVar2.x();
                if (y2 || x4 == obj4) {
                    x4 = new iia0(z2, 9);
                    aVar2.R(x4);
                }
                q630 g = o9v0.g(str3, z2, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, gzsVar, (gzs) x4, s, 257536);
                SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) m8d0Var.h).getValue();
                boolean y3 = aVar2.y(z2) | aVar2.J(m8d0Var);
                Object x5 = aVar2.x();
                if (y3 || x5 == obj4) {
                    x5 = new i66(z2, m8d0Var, wh50Var2, 1);
                    aVar2.R(x5);
                }
                m8d0Var.f(b, F, g, (gzs) x5, semanticsConfiguration, aVar2, 56, 8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
