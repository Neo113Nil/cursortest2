package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SpacingAndSeparatorScreenContent.kt */
/* loaded from: classes18.dex */
public final class jhk0 implements yah0 {
    public final List b = e43.l(new a("Simple", new jai(-1435070331, new fhk0(this, 0), true)), new a("Column (Padding)", new jai(588429220, new t26(this, 4), true)), new a("Column (No padding)", new jai(-1683038525, new gd3(this, 3), true)), new a("Row (Padding)", new jai(340461026, new y9a(this, 4), true)), new a("Row (No padding)", new jai(-1931006719, new hhk0(this, 0), true)));
    public final List c;
    public final List d;
    public final long e;

    /* compiled from: SpacingAndSeparatorScreenContent.kt */
    public static final class a {
        public final String a;
        public final jai b;

        public a(String str, jai jaiVar) {
            this.a = str;
            this.b = jaiVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Page(name=" + this.a + ", implementation=" + this.b + ')';
        }
    }

    public jhk0() {
        pco pcoVar = new pco(1);
        float f = 2;
        pco pcoVar2 = new pco(f);
        float f2 = 4;
        pco pcoVar3 = new pco(f2);
        float f3 = 6;
        pco pcoVar4 = new pco(f3);
        float f4 = 8;
        pco pcoVar5 = new pco(f4);
        float f5 = 12;
        pco pcoVar6 = new pco(f5);
        float f6 = 16;
        pco pcoVar7 = new pco(f6);
        float f7 = 20;
        pco pcoVar8 = new pco(f7);
        float f8 = 24;
        pco pcoVar9 = new pco(f8);
        float f9 = 32;
        this.c = e43.l(pcoVar, pcoVar2, pcoVar3, pcoVar4, pcoVar5, pcoVar6, pcoVar7, pcoVar8, pcoVar9, new pco(f9));
        this.d = e43.l(new pco(0), new pco(f), new pco(f2), new pco(f3), new pco(f4), new pco(10), new pco(f5), new pco(f6), new pco(f7), new pco(f8), new pco(f9), new pco(40));
        this.e = l5g.c(14, l5g.e, 0.1f);
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1432629081);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 196608) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (65539 & i3) != 65538)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1432629081, i3, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.Content (SpacingAndSeparatorScreenContent.kt:106)");
            }
            boolean z = (458752 & i3) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new x1e0(this, 9);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(aVar3, j, aVar2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Spacing & Separator", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, ((i3 << 6) & 896) | 1572872, 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            u6u0.b(b, kai.c(344761887, new q3b0(1, this, b), M), txj0.f(aVar3, 1.0f), 0L, false, null, M, Tensorflow.FRAME_WIDTH);
            a aVar5 = (a) j5g.b0(b.k(), new wow(this.b));
            if (aVar5 == null) {
                M.K(1804180168);
            } else {
                M.K(889483353);
                jai jaiVar = aVar5.b;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                jaiVar.invoke(txj0.f(new xpy(1.0f, true), 1.0f), M, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ihk0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jhk0.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1431841272);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i3 = 3;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1431841272, i2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.ColumnNoPaddingPage (SpacingAndSeparatorScreenContent.kt:191)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = 40;
            dt1.a.getClass();
            a.j i4 = androidx.compose.foundation.layout.a.i(f, dt1.a.l);
            q630 D = s200.D(p490.D(q630Var, p490.x(M), 14), f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(i4, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-1043624655);
            Iterator it = g((i2 >> 3) & 14).iterator();
            while (it.hasNext()) {
                ijv0.a(SeparatorDpi.At1x, SeparatorAppearance.Primary, false, hr80.m(q630.a.a, this.e, androidx.compose.ui.graphics.e.a), new pco(((pco) it.next()).b), M, 438, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y70(this, q630Var, i, i3);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-238728135);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-238728135, i2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.ColumnPaddingPage (SpacingAndSeparatorScreenContent.kt:170)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = 40;
            dt1.a.getClass();
            a.j i3 = androidx.compose.foundation.layout.a.i(f, dt1.a.l);
            q630 D = s200.D(p490.D(q630Var, p490.x(M), 14), f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(i3, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-710137679);
            Iterator it = g((i2 >> 3) & 14).iterator();
            while (it.hasNext()) {
                ijv0.a(SeparatorDpi.At1x, SeparatorAppearance.Primary, true, hr80.m(q630.a.a, this.e, androidx.compose.ui.graphics.e.a), new pco(((pco) it.next()).b), M, 438, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gga(this, q630Var, i, 5);
        }
    }

    public final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1180137488);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1180137488, i2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.RowNoPaddingPage (SpacingAndSeparatorScreenContent.kt:231)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = 40;
            dt1.a.getClass();
            a.j h = androidx.compose.foundation.layout.a.h(f, dt1.a.o);
            q630 D = s200.D(p490.r(q630Var, p490.x(M), 14), f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(h, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-2137696663);
            Iterator it = g((i2 >> 3) & 14).iterator();
            while (it.hasNext()) {
                ijv0.b(SeparatorDpi.At1x, SeparatorAppearance.Primary, false, hr80.m(q630.a.a, this.e, androidx.compose.ui.graphics.e.a), new pco(((pco) it.next()).b), M, 438);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9g(this, q630Var, i, 5);
        }
    }

    public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1039220817);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i3 = 1;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1039220817, i2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.RowPaddingPage (SpacingAndSeparatorScreenContent.kt:211)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = 40;
            dt1.a.getClass();
            a.j h = androidx.compose.foundation.layout.a.h(f, dt1.a.o);
            q630 D = s200.D(p490.r(q630Var, p490.x(M), 14), f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(h, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-1707923095);
            Iterator it = g((i2 >> 3) & 14).iterator();
            while (it.hasNext()) {
                ijv0.b(SeparatorDpi.At1x, SeparatorAppearance.Primary, true, hr80.m(q630.a.a, this.e, androidx.compose.ui.graphics.e.a), new pco(((pco) it.next()).b), M, 438);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qig(this, q630Var, i, i3);
        }
    }

    public final void f(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(746379971);
        int i2 = (i & 6) == 0 ? (M.J(q630Var) ? 4 : 2) | i : i;
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            int i4 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(746379971, i2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.SeparatorPage (SpacingAndSeparatorScreenContent.kt:147)");
            }
            float f = 40;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            q630 D = s200.D(p490.D(q630Var, p490.x(M), 14), f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(42100789);
            Iterator it = SeparatorAppearance.h().iterator();
            while (it.hasNext()) {
                SeparatorAppearance separatorAppearance = (SeparatorAppearance) it.next();
                M.K(42102821);
                for (SeparatorDpi separatorDpi : SeparatorDpi.h()) {
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, i3);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630.a aVar4 = q630.a.a;
                    q630 c2 = qri.c(M, aVar4);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a3, cri.a.f);
                    k9q0.w(M, D3, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    StringBuilder sb = new StringBuilder();
                    sb.append(separatorAppearance);
                    sb.append(' ');
                    sb.append(separatorDpi);
                    String sb2 = sb.toString();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, i3, i4, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar6 = M;
                    SeparatorAppearance separatorAppearance2 = separatorAppearance;
                    yqv0.c(sb2, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, aVar6, 0, 0, 8190);
                    M = aVar6;
                    f9t.e(txj0.h(aVar4, kqu0.p), M, 0);
                    ijv0.c(separatorDpi, separatorAppearance2, null, M, 0, 4);
                    aVar6.G();
                    it = it;
                    i3 = 0;
                    separatorAppearance = separatorAppearance2;
                    i4 = i4;
                }
                M.j();
            }
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ema(this, q630Var, i, 5);
        }
    }

    public final List g(int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(27123803, i, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.getThemedSpacings (SpacingAndSeparatorScreenContent.kt:252)");
        }
        boolean d = androidx.compose.runtime.b.d();
        List list = this.c;
        if (d) {
            androidx.compose.runtime.b.e();
        }
        return list;
    }
}
