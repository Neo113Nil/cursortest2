package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DonutReaction.kt */
/* loaded from: classes18.dex */
public final class o2o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r27v6 */
    public static final void a(final Integer num, q630 q630Var, final gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        gzs<s3q0> gzsVar3;
        int i5;
        final q630 q630Var3;
        final gzs<s3q0> gzsVar4;
        boolean z;
        ?? r27;
        long j;
        long j2;
        gzs<s3q0> gzsVar5;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1677339981);
        if ((i & 6) == 0) {
            i3 = i | (M.J(num) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i4 = i3 | (M.J(q630Var2) ? 32 : 16);
        }
        int i7 = i4 | (M.y(gzsVar) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i5 = i7 | 3072;
            gzsVar3 = gzsVar2;
        } else {
            gzsVar3 = gzsVar2;
            i5 = i7 | (M.y(gzsVar3) ? 2048 : 1024);
        }
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            q630.a aVar2 = q630.a.a;
            q630 q630Var5 = i6 != 0 ? aVar2 : q630Var2;
            gzs<s3q0> gzsVar6 = i8 != 0 ? null : gzsVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1677339981, i5, -1, "com.vk.donut.design.compose.reaction.DonutReactionButton (DonutReaction.kt:45)");
            }
            String a = num != null ? xpm0.a(num.intValue()) : null;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = vog0.b(20);
                M.R(x2);
            }
            uog0 uog0Var = (uog0) x2;
            boolean z2 = (gzsVar == null && gzsVar6 == null) ? false : true;
            if (wlb0.h(M).s()) {
                M.K(-1985277100);
                z = z2;
                r27 = 0;
                j = wlb0.h(M).getBackground().D;
                M.j();
            } else {
                z = z2;
                r27 = 0;
                M.K(-1985212155);
                j = wlb0.h(M).getBackground().m;
                M.j();
            }
            if (wlb0.h(M).s()) {
                M.K(-1985090883);
                j2 = wlb0.h(M).q().g;
                M.j();
            } else {
                j2 = gub0.a(M, -1985035393, M).d;
                M.j();
            }
            long j3 = j2;
            q630 m = hr80.m(rte0.d(q630Var5, uog0Var), j, androidx.compose.ui.graphics.e.a);
            gzs<s3q0> gzsVar7 = z ? gzsVar : r27;
            if (gzsVar7 != null) {
                gzsVar5 = gzsVar6;
                q630 g = m.g(ojc.d(cuw.a(aVar2, sg50Var, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true)), sg50Var, null, false, null, gzsVar6, gzsVar7, 444));
                if (g != null) {
                    m = g;
                }
            } else {
                gzsVar5 = gzsVar6;
            }
            float f = 3;
            q630 G = s200.G(ahn.E(m, "donut_reaction_button"), 5, f, 4, f);
            dt1.a.getClass();
            float f2 = 2;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw r27;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(320798718, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DonutSmallColor20> (VkIcons.kt:2158)");
            }
            lg90 b = or.b(M, 612550947, R.drawable.vk_icon_donut_small_color_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, l5g.k, M, 3128, 4);
            if (a != null) {
                M.K(1100602894);
                q630Var4 = q630Var5;
                yqv0.c(a, null, j3, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).h0, M, 100663296, 48, 5882);
                M = M;
                mq.d(aVar2, f2, M, 6);
            } else {
                q630Var4 = q630Var5;
                M.K(1097069235);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var4;
            gzsVar4 = gzsVar5;
        } else {
            M.h();
            q630Var3 = q630Var2;
            gzsVar4 = gzsVar3;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n2o
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o2o.a(num, q630Var3, gzsVar, gzsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
