package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ExpandableTextContent.kt */
/* loaded from: classes18.dex */
public final class c9q implements yah0 {
    public final wh50 b = androidx.compose.runtime.k.b(ibo0.Medium);
    public final wh50 c;
    public final wh50 d;

    public c9q() {
        Boolean bool = Boolean.FALSE;
        this.c = androidx.compose.runtime.k.b(bool);
        this.d = androidx.compose.runtime.k.b(bool);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2120723607);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
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
                androidx.compose.runtime.b.f(-2120723607, i2, -1, "com.vk.design.demo.presentation.screens.ExpandableTextContent.Content (ExpandableTextContent.kt:55)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D = p490.D(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), p490.x(M), 14);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("ExpandableText", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new y8q(0, gzsVar);
                M.R(x);
            }
            muv0.h(a2, null, null, null, e.a.a((gzs) x, "Назад", null, null, null, M, 196656, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
            M = M;
            djn0.a(true, true, M, 438, 0);
            int i4 = (i2 >> 15) & 14;
            d(i4, M);
            float f2 = 28;
            f9t.e(txj0.h(aVar2, f2), M, 6);
            e(i4, M);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            c(i4, M);
            b(i4, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z8q(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(530443608);
        int i3 = i & 1;
        int i4 = 0;
        int i5 = 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(530443608, i, -1, "com.vk.design.demo.presentation.screens.ExpandableTextContent.AlwaysExpandableTextCompose (ExpandableTextContent.kt:180)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630.a aVar2 = q630.a.a;
            float f = 1.0f;
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.w);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            rzo0.a(6, 2, M, "Always expandable text (compose only)", null);
            M.K(-867113876);
            Iterator it = j5g.H0(ibo0.h(), 4).iterator();
            while (it.hasNext()) {
                us2 b = ws2.b(d9q.a((ibo0) it.next()), M, i4);
                int i6 = i5;
                q630 f2 = txj0.f(aVar2, f);
                boolean y = M.y(context);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new v8q(context, i4);
                    M.R(x);
                }
                psu0.b(b, (gzs) x, f2, 0L, null, null, 0L, 3, 0, null, null, M, 12583296, 1912);
                i5 = i6;
                f = f;
                aVar2 = aVar2;
                i4 = i4;
                context = context;
            }
            i2 = i5;
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 1;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new joa(this, i, i2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-166055192);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-166055192, i2, -1, "com.vk.design.demo.presentation.screens.ExpandableTextContent.Controls (ExpandableTextContent.kt:152)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                wow wowVar = new wow(ibo0.h());
                M.R(wowVar);
                x = wowVar;
            }
            List<T> list = ((wow) x).b;
            ibo0 ibo0Var = (ibo0) ((zak0) this.b).getValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new r9k(this, 6);
                M.R(x2);
            }
            y9i0.b("Text", list, ibo0Var, (izs) x2, txj0.f(q630.a.a, 1.0f), M, 24630, 0);
            boolean booleanValue = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
            boolean z2 = i3 == 4;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new uoh(this, 11);
                M.R(x3);
            }
            zov0.b(booleanValue, "isExpanded", (izs) x3, null, null, false, false, M, 48, 120);
            boolean booleanValue2 = ((Boolean) ((zak0) this.d).getValue()).booleanValue();
            boolean z3 = i3 == 4;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new zkh(this, 12);
                M.R(x4);
            }
            zov0.b(booleanValue2, "collapseAvailable", (izs) x4, null, null, false, false, M, 48, 120);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b9q(this, i, 0);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1017224409);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1017224409, i2, -1, "com.vk.design.demo.presentation.screens.ExpandableTextContent.ExpandableTextCompose (ExpandableTextContent.kt:92)");
            }
            us2 b = ws2.b(d9q.a((ibo0) ((zak0) this.b).getValue()), M, 0);
            boolean booleanValue = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
            q630 E = s200.E(txj0.f(q630.a.a, 1.0f), kqu0.b, kqu0.c);
            long j = wlb0.h(M).getText().f;
            frv0 frv0Var = wlb0.l(M).P;
            long j2 = wlb0.h(M).getText().f;
            frv0 frv0Var2 = wlb0.l(M).P;
            boolean booleanValue2 = ((Boolean) ((zak0) this.d).getValue()).booleanValue();
            long j3 = wlb0.h(M).getText().m;
            frv0 frv0Var3 = wlb0.l(M).d0;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new w8q(this, 0);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new n5i(this, 10);
                M.R(x2);
            }
            aVar2 = M;
            psu0.e(b, booleanValue, gzsVar, E, j, frv0Var, frv0Var3, j3, 3, 0, "Показать ещё", "Скрыть", j2, frv0Var2, booleanValue2, (gzs) x2, aVar2, 100663296, 54, 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new x8q(this, i, 0);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1941638968);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1941638968, i2, -1, "com.vk.design.demo.presentation.screens.ExpandableTextContent.ExpandableTextView (ExpandableTextContent.kt:122)");
            }
            q630 E = s200.E(txj0.f(q630.a.a, 1.0f), kqu0.b, kqu0.c);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new t1e(this, 18);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new m4g(this, 18);
                M.R(x2);
            }
            ae2.a(0, 0, M, izsVar, (izs) x2, E);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9q(this, i, 0);
        }
    }
}
