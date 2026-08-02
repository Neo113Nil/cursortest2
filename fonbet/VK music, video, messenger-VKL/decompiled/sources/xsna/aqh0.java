package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: SearchDatabaseViewContent.kt */
/* loaded from: classes5.dex */
public final class aqh0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1330672424);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1330672424, i, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.EmptyContent (SearchDatabaseViewContent.kt:362)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ldv0.d(txj0.f(aVar2, 1.0f), null, zra0.a.a(null, null, d370.N(R.string.vk_discover_search_empty_list, 0, M), null, M, 196608, 27), null, null, null, false, M, 6, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
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
            s.d = new hkb(i, 9);
        }
    }

    public static final void b(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1601609975);
        int i2 = i | (M.y(gzsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1601609975, i2, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.ErrorContent (SearchDatabaseViewContent.kt:398)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            gzsVar2 = gzsVar;
            ldv0.d(txj0.f(aVar3, 1.0f), null, zra0.a.a(null, null, d370.N(R.string.search_params_error_common_description, 0, M), null, M, 196608, 27), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.search_params_error_retry, 0, M), gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, aVar2, ((i2 << 3) & 112) | 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new hd4(gzsVar2, i, 7);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1397797559);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1397797559, i, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.LoadingContent (SearchDatabaseViewContent.kt:379)");
            }
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(txj0.f(aVar2, 1.0f), 32);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 24;
            q630 v = txj0.v(txj0.h(aVar2, f), f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            zfr0.e(v, ylu0Var.getIcon().b, null, M, 6, 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rei(i, 6);
        }
    }

    public static final void d(iph0 iph0Var, izs<? super iph0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        androidx.compose.runtime.a M = aVar.M(1445667779);
        int i2 = (M.J(iph0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1445667779, i2, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseListItemDraw (SearchDatabaseViewContent.kt:322)");
            }
            String str = iph0Var.c;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ow60(11);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, 12582912, 94);
            androidx.compose.runtime.a aVar2 = M;
            String str2 = iph0Var.d;
            if (str2 == null || str2.length() == 0) {
                aVar2.K(-2042759845);
                aVar2.j();
                h1Var = null;
            } else {
                aVar2.K(-2042709315);
                String str3 = iph0Var.d;
                Object x2 = aVar2.x();
                if (x2 == c0012a) {
                    x2 = new juz(26);
                    aVar2.R(x2);
                }
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str3, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar2, 12582960, 92);
                aVar2 = aVar2;
                aVar2.j();
                h1Var = b;
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, h1Var, null, null, aVar2, 196608, 28);
            if (iph0Var.e) {
                aVar2.K(2012327729);
                y0Var = e(aVar2);
                aVar2.j();
            } else {
                aVar2.K(-2042330310);
                aVar2.j();
                y0Var = null;
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x3 = aVar2.x();
            if (z || x3 == c0012a) {
                x3 = new cg1(22, izsVar, iph0Var);
                aVar2.R(x3);
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            wiu0.b(null, false, null, a2, y0Var, (gzs) x3, null, aVar3, 0, 71);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(iph0Var, izsVar, i, 8);
        }
    }

    public static final com.vk.core.compose.component.cell.content.y0 e(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1866648882, 0, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.selectedIcon (SearchDatabaseViewContent.kt:350)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
        }
        lg90 a = pg90.a(R.drawable.vk_icon_check_circle_on_24, 0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().a;
        float f = 24;
        long b = byc0.b(f, f);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new f1s(27);
            aVar.R(x);
        }
        com.vk.core.compose.component.cell.content.y0 a2 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(a, j, b, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar, 1573256, 24), null, null, null, aVar, 61);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
