package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.donut.DonutUserStackClipPosition;
import com.vk.community.design.compose.donut.DonutUserStackSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DonutUserStackContent.kt */
/* loaded from: classes18.dex */
public final class h4o implements yah0 {
    public final List b;
    public final ListBuilder c;
    public final ListBuilder d;

    public h4o() {
        Boolean bool = Boolean.TRUE;
        this.b = e43.l(new Pair("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", bool), new Pair("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", bool), new Pair("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", Boolean.FALSE));
        ListBuilder e = e43.e();
        for (int i = 0; i < 3; i++) {
            e.add(new Pair("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", Boolean.FALSE));
        }
        this.c = e.g();
        ListBuilder e2 = e43.e();
        for (int i2 = 0; i2 < 3; i2++) {
            e2.add(new Pair("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", Boolean.TRUE));
        }
        this.d = e2.g();
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1560223273);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1560223273, i2, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content (DonutUserStackContent.kt:64)");
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D = p490.D(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Donut user stack", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(1);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            bap.g(s3q0.a, new e4o(ref$ObjectRef, rg50Var, null), M, 6);
            djn0.a(true, false, M, 54, 2);
            yqv0.c("Несколько донов", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.K(1704059818);
            for (DonutUserStackClipPosition donutUserStackClipPosition : DonutUserStackClipPosition.h()) {
                M.K(1704061819);
                for (DonutUserStackSize donutUserStackSize : DonutUserStackSize.h()) {
                    boolean z = (i2 & 458752) == 131072;
                    Object x2 = M.x();
                    if (z || x2 == c0012a) {
                        x2 = new nv2(15, this, rg50Var);
                        M.R(x2);
                    }
                    r4o.b(null, donutUserStackSize, donutUserStackClipPosition, null, (izs) x2, M, 0, 9);
                }
                M.j();
            }
            M.j();
            yqv0.c("Нет донов", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.K(1704078152);
            for (DonutUserStackClipPosition donutUserStackClipPosition2 : DonutUserStackClipPosition.h()) {
                M.K(1704080153);
                for (DonutUserStackSize donutUserStackSize2 : DonutUserStackSize.h()) {
                    boolean z2 = (i2 & 458752) == 131072;
                    Object x3 = M.x();
                    if (z2 || x3 == c0012a) {
                        x3 = new gb(16, this, rg50Var);
                        M.R(x3);
                    }
                    r4o.b(null, donutUserStackSize2, donutUserStackClipPosition2, null, (izs) x3, M, 0, 9);
                }
                M.j();
            }
            M.j();
            yqv0.c("Все доны", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.K(1704096393);
            for (DonutUserStackClipPosition donutUserStackClipPosition3 : DonutUserStackClipPosition.h()) {
                M.K(1704098394);
                for (DonutUserStackSize donutUserStackSize3 : DonutUserStackSize.h()) {
                    boolean z3 = (i2 & 458752) == 131072;
                    Object x4 = M.x();
                    if (z3 || x4 == c0012a) {
                        x4 = new ll1(8, this, rg50Var);
                        M.R(x4);
                    }
                    r4o.b(null, donutUserStackSize3, donutUserStackClipPosition3, null, (izs) x4, M, 0, 9);
                }
                M.j();
            }
            M.j();
            djn0.a(false, true, M, 390, 1);
            ae2.a(0, 6, M, new ml1(9, this, ref$ObjectRef), null, null);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d4o(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
