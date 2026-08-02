package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.z740;

/* compiled from: MultipleCoownershipView.kt */
/* loaded from: classes3.dex */
public final class y740 extends i6v0<z740, k740> {
    public final e40 f;

    public y740(Context context, m740 m740Var, e40 e40Var) {
        super(context, m740Var);
        this.f = e40Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((z740) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(z740.a.C4159a c4159a, izs<? super k740, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        int i2;
        q630.a aVar2;
        o740 o740Var;
        int i3;
        com.vk.core.compose.component.cell.content.x xVar;
        o740 o740Var2;
        wow wowVar;
        com.vk.core.compose.component.cell.content.x xVar2;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a M = aVar.M(1414728944);
        int i4 = i | (M.J(c4159a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1414728944, i4, -1, "com.vk.multiplecoownership.presentation.bottomsheet.MultipleCoownershipView.Content (MultipleCoownershipView.kt:60)");
            }
            wh50 c = jk50.c(c4159a.a, M);
            q630.a aVar3 = q630.a.a;
            float f = 12;
            q630 d = rte0.d(txj0.f(aVar3, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            long j = wlb0.h(M).getBackground().r;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(d, j, aVar4);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(((x740) c.getValue()).a, null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.feed_coowners_accessibility_close, 0, M);
            boolean z = (i4 & 896) == 256 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z || x == c0012a3) {
                x = new t2l(this, 23);
                M.R(x);
            }
            a.C0011a.C0012a c0012a4 = c0012a3;
            muv0.h(a2, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 1, hr80.m(aVar3, wlb0.h(M).getBackground().r, aVar4)), null, null, null, TopBar$Before.d.a.a(N, (gzs) x, null, null, M, 24576, 12), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8156);
            float f2 = 16;
            yqv0.c(((x740) c.getValue()).b, s200.H(aVar3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 8, 2), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).e0, M, 48, 0, 8184);
            androidx.compose.runtime.a aVar6 = M;
            aVar6.K(1815637814);
            ArrayList<o740> arrayList = ((x740) c.getValue()).e;
            wow wowVar2 = new wow(arrayList);
            char c3 = 18487;
            int i5 = -1161654135;
            int i6 = -1007329163;
            if (wowVar2 instanceof RandomAccess) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    o740 o740Var3 = (o740) wowVar2.b.get(i7);
                    aVar6.W(i6, o740Var3.a);
                    int i8 = i7;
                    int i9 = size;
                    wow wowVar3 = wowVar2;
                    androidx.compose.runtime.a aVar7 = aVar6;
                    int i10 = i5;
                    com.vk.core.compose.component.cell.content.t a3 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, o740Var3.b, null, null, aVar6, 0, 61), null, null, null, null, aVar7, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar7, 100663344, 252);
                    androidx.compose.runtime.a aVar8 = aVar7;
                    com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.a(o740Var3.c, null, null, 1, null, null, aVar7, 12610560, 102), null, null, null, aVar8, 196608, 30);
                    if (epx.f(((x740) c.getValue()).d, o740Var3.a)) {
                        aVar8.K(i10);
                        qzu0.a.getClass();
                        wowVar = wowVar3;
                        o740Var2 = o740Var3;
                        xVar2 = com.vk.core.compose.component.cell.content.p.a(qzu0.q(aVar8), 0L, 0L, null, null, null, aVar8, 1572872, 62);
                        aVar8 = aVar8;
                        aVar8.j();
                    } else {
                        o740Var2 = o740Var3;
                        wowVar = wowVar3;
                        aVar8.K(-1161476041);
                        aVar8.j();
                        xVar2 = null;
                    }
                    boolean y = aVar8.y(o740Var2) | ((i4 & 112) == 32);
                    Object x2 = aVar8.x();
                    if (y) {
                        c0012a2 = c0012a4;
                    } else {
                        c0012a2 = c0012a4;
                        if (x2 != c0012a2) {
                            c0012a4 = c0012a2;
                            androidx.compose.runtime.a aVar9 = aVar8;
                            wiu0.b(ojc.c(aVar3, false, null, null, (gzs) x2, 15), false, a3, a4, xVar2, null, null, aVar9, 0, 98);
                            aVar6 = aVar9;
                            aVar6.a0();
                            i7 = i8 + 1;
                            size = i9;
                            wowVar2 = wowVar;
                            i6 = -1007329163;
                            c3 = 18487;
                            i5 = -1161654135;
                        }
                    }
                    x2 = new com.vk.movika.sdk.base.flow.binding.j(18, izsVar, o740Var2);
                    aVar8.R(x2);
                    c0012a4 = c0012a2;
                    androidx.compose.runtime.a aVar92 = aVar8;
                    wiu0.b(ojc.c(aVar3, false, null, null, (gzs) x2, 15), false, a3, a4, xVar2, null, null, aVar92, 0, 98);
                    aVar6 = aVar92;
                    aVar6.a0();
                    i7 = i8 + 1;
                    size = i9;
                    wowVar2 = wowVar;
                    i6 = -1007329163;
                    c3 = 18487;
                    i5 = -1161654135;
                }
                c0012a = c0012a4;
                aVar2 = aVar3;
                i2 = 32;
            } else {
                c0012a = c0012a4;
                int i11 = 32;
                for (o740 o740Var4 : arrayList) {
                    aVar6.W(-1007329163, o740Var4.a);
                    androidx.compose.runtime.a aVar10 = aVar6;
                    com.vk.core.compose.component.cell.content.t a5 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, o740Var4.b, null, null, aVar6, 0, 61), null, null, null, null, aVar10, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar10, 100663344, 252);
                    androidx.compose.runtime.a aVar11 = aVar10;
                    com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(Cell$Middle.d.b.a(o740Var4.c, null, null, 1, null, null, aVar10, 12610560, 102), null, null, null, aVar11, 196608, 30);
                    if (epx.f(((x740) c.getValue()).d, o740Var4.a)) {
                        aVar11.K(-1161654135);
                        qzu0.a.getClass();
                        o740Var = o740Var4;
                        i3 = 32;
                        xVar = com.vk.core.compose.component.cell.content.p.a(qzu0.q(aVar11), 0L, 0L, null, null, null, aVar11, 1572872, 62);
                        aVar11 = aVar11;
                        aVar11.j();
                    } else {
                        o740Var = o740Var4;
                        i3 = 32;
                        aVar11.K(-1161476041);
                        aVar11.j();
                        xVar = null;
                    }
                    boolean y2 = aVar11.y(o740Var) | ((i4 & 112) == i3);
                    Object x3 = aVar11.x();
                    if (y2 || x3 == c0012a) {
                        x3 = new com.vk.movika.sdk.base.flow.binding.j(18, izsVar, o740Var);
                        aVar11.R(x3);
                    }
                    androidx.compose.runtime.a aVar12 = aVar11;
                    wiu0.b(ojc.c(aVar3, false, null, null, (gzs) x3, 15), false, a5, a6, xVar, null, null, aVar12, 0, 98);
                    aVar6 = aVar12;
                    aVar6.a0();
                    i11 = i3;
                }
                i2 = i11;
                aVar2 = aVar3;
            }
            aVar6.j();
            String str = ((x740) c.getValue()).c;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630 E = s200.E(txj0.f(aVar2, 1.0f), f2, f2);
            boolean z2 = (i4 & 112) == i2;
            Object x4 = aVar6.x();
            if (z2 || x4 == c0012a) {
                x4 = new ne1(izsVar, 3);
                aVar6.R(x4);
            }
            androidx.compose.runtime.a aVar13 = aVar6;
            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar13, 28080, 0, 0, 4190176);
            M = aVar13;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lye(this, c4159a, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(z740 z740Var, izs<? super k740, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(200464507);
        int i2 = (M.J(z740Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(200464507, i2, -1, "com.vk.multiplecoownership.presentation.bottomsheet.MultipleCoownershipView.ThemedContent (MultipleCoownershipView.kt:44)");
            }
            z740.a.b bVar = z740.a.b.a;
            z740.a aVar2 = (z740.a) d(bVar, (n0u0[]) Arrays.copyOf(new n0u0[]{z740Var.a}, 1), M, (((((i2 << 3) & 7168) | 6) >> 3) & 896) | 6).getValue();
            if (aVar2 instanceof z740.a.C4159a) {
                M.K(1295644201);
                h((z740.a.C4159a) aVar2, izsVar, M, i2 & 1008);
                M.j();
            } else {
                if (!epx.f(aVar2, bVar)) {
                    throw alb0.c(1295641741, M);
                }
                M.K(1295647028);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n77(this, z740Var, izsVar, i, 3);
        }
    }
}
