package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: GamesCatalogSectionHeaderLego.kt */
/* loaded from: classes17.dex */
public final class get {
    public static final void a(xdt xdtVar, rha rhaVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.semantics.a aVar3;
        androidx.compose.runtime.a M = aVar.M(748151595);
        int i2 = i | (M.J(xdtVar) ? 4 : 2) | (M.J(rhaVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(748151595, i2, -1, "com.vk.games.presentation.components.lego_items.GamesCatalogSectionHeaderLego (GamesCatalogSectionHeaderLego.kt:32)");
            }
            String O = d370.O(R.string.vk_accessibility_header, new Object[]{xdtVar.c}, M);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            if (xdtVar.d) {
                M.K(1599379141);
                b.c cVar = b.c.a;
                mlg0 a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                int i3 = i2 & 896;
                int i4 = i2 & 14;
                boolean y = M.y(yvjVar) | (i3 == 256) | (i4 == 4);
                Object x3 = M.x();
                if (y || x3 == obj) {
                    x3 = new vx(yvjVar, izsVar, xdtVar);
                    M.R(x3);
                }
                q630 b = ojc.b(q630Var, sg50Var, a, false, null, (gzs) x3, 28);
                String str = xdtVar.c;
                if (rhaVar.a) {
                    M.K(1600013556);
                    boolean J = M.J(O);
                    Object x4 = M.x();
                    if (J || x4 == obj) {
                        x4 = new z7o(O, 1);
                        M.R(x4);
                    }
                    aVar3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
                    M.j();
                } else {
                    M.K(1600125280);
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                    SemanticsConfiguration.Priority priority = SemanticsConfiguration.Priority.High;
                    boolean J2 = M.J(O);
                    Object x5 = M.x();
                    if (J2 || x5 == obj) {
                        x5 = new s45(O, 1);
                        M.R(x5);
                    }
                    aVar3 = new com.vk.core.compose.component.semantics.a((izs) x5, mode, priority);
                    M.j();
                }
                com.vk.core.compose.component.group.header.f a2 = f.a.a(str, null, null, null, null, null, aVar3, null, false, M, 805306368, 446);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2104985852, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LegoChevronRight24> (VkSdkIcons.kt:1482)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_lego_chevron_right_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().l;
                boolean z = (i3 == 256) | (i4 == 4);
                Object x6 = M.x();
                if (z || x6 == obj) {
                    x6 = new xk(14, izsVar, xdtVar);
                    M.R(x6);
                }
                com.vk.core.compose.component.group.header.g.b(a2, b, cVar, null, null, GroupHeader$Right.c.a(null, GroupHeader$Right.Icon.a.a(a3, j, null, (gzs) x6, GroupHeader$Right.Icon.ContainerSize.Medium, null, null, M, 100859912, 204), null, null, M, 13), false, M, 384, 88);
                aVar2 = M;
                aVar2.j();
            } else {
                M.K(1600886764);
                boolean J3 = M.J(O);
                Object x7 = M.x();
                if (J3 || x7 == obj) {
                    x7 = new det(O, 0);
                    M.R(x7);
                }
                com.vk.core.compose.component.group.header.g.b(f.a.a(xdtVar.c, null, null, null, null, null, null, null, false, M, 805306368, 510), egi0.b(q630Var, false, (izs) x7), null, null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new eet(xdtVar, rhaVar, izsVar, q630Var, i, 0);
        }
    }
}
