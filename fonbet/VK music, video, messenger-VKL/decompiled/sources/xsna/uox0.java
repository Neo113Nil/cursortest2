package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.pox0;
import xsna.q630;
import xsna.ty6;

/* compiled from: WidgetTable.kt */
/* loaded from: classes17.dex */
public final class uox0 {
    public static final void a(List list, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1810206389);
        int i2 = (M.J(list) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1810206389, i2, -1, "com.vk.community.design.compose.widget.table.HeadRow (WidgetTable.kt:60)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, txj0.f(q630.a.a, 1.0f));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, -1803990272, list);
            while (a2.hasNext()) {
                b((pox0.f.a) a2.next(), M, 6);
            }
            M.j();
            M.G();
            ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Secondary, null, M, 54, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo3(list, i, 15);
        }
    }

    public static final void b(pox0.f.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(1840513757);
        int i2 = (M.J(aVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1840513757, i2, -1, "com.vk.community.design.compose.widget.table.HeadRowItem (WidgetTable.kt:114)");
            }
            float f = aVar.c;
            if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            xpy xpyVar = new xpy(f, true);
            String str = aVar.a;
            int i3 = aVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3 = M;
            yqv0.c(str, xpyVar, j, null, null, 0, i3, null, 2, false, 0, 2, null, wuv0Var.m0, aVar3, 100663296, 48, 5816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new zg7(aVar, i, 13);
        }
    }

    public static final void c(final pox0.f.b.a aVar, final float f, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        long j;
        androidx.compose.runtime.a M = aVar2.M(353715592);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(353715592, i2, -1, "com.vk.community.design.compose.widget.table.RichColumnItem (WidgetTable.kt:132)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, q630Var);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.t), bVar, M, 48);
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
            ldu0.b(phw.a.a(fwu0.l(aVar.c, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), f, null, null, null, false, null, null, null, M, i2 & 112, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            String str = aVar.a;
            frv0 frv0Var = wlb0.l(M).m0;
            if (z) {
                j = gub0.a(M, 1084868410, M).f;
                M.j();
            } else {
                j = gub0.a(M, 1084933975, M).m;
                M.j();
            }
            yqv0.c(str, xpyVar, j, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var, M, 100663296, 48, 5880);
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
            s.d = new wzs() { // from class: xsna.tox0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uox0.c(pox0.f.b.a.this, f, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final pox0.f.b bVar, final List list, final float f, izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        float f2;
        izs izsVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        final pox0.f.b bVar2 = bVar;
        final List list2 = list;
        final izs izsVar3 = izsVar;
        final int i2 = i;
        androidx.compose.runtime.a M = aVar.M(-49808271);
        int c = M.c();
        int i3 = (i2 & 6) == 0 ? (M.J(bVar2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= M.J(list2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i3 |= M.n(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar3) ? 2048 : 1024;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-49808271, i4, -1, "com.vk.community.design.compose.widget.table.RowItem (WidgetTable.kt:82)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, c2, cri.a.d);
            M.K(-1687896986);
            M.K(-1162826637);
            int i5 = 0;
            for (Object obj : bVar2.a) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                pox0.f.b.a aVar4 = (pox0.f.b.a) obj;
                pox0.f.a aVar5 = (pox0.f.a) j5g.b0(i5, new wow(list2));
                if (aVar5 == null) {
                    M.C(c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s != null) {
                        final float f3 = f2;
                        wzsVar = new wzs() { // from class: xsna.rox0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).intValue();
                                uox0.d(pox0.f.b.this, list2, f3, izsVar3, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                                return s3q0.a;
                            }
                        };
                        s.d = wzsVar;
                    }
                    return;
                }
                izs izsVar4 = izsVar3;
                boolean z = aVar4.b != null;
                M.K(-1162819539);
                float f4 = aVar5.c;
                if (f4 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                if (f4 > Float.MAX_VALUE) {
                    f4 = Float.MAX_VALUE;
                }
                q630 xpyVar = new xpy(f4, true);
                if (z) {
                    boolean J = M.J(aVar4) | ((i4 & 7168) == 2048);
                    Object x = M.x();
                    if (J || x == a.C0011a.a) {
                        x = new km1(27, aVar4, izsVar4);
                        M.R(x);
                    }
                    xpyVar = xpyVar.g(ojc.c(aVar2, false, null, null, (gzs) x, 15));
                }
                M.j();
                if (aVar4.c != null) {
                    M.K(-1722842762);
                    androidx.compose.runtime.a aVar6 = M;
                    c(aVar4, f, z, xpyVar, aVar6, (i4 >> 3) & 112);
                    M = aVar6;
                    M.j();
                } else {
                    M.K(-1722611099);
                    e(aVar5.b, 0, M, aVar4.a, xpyVar, z);
                    M.j();
                }
                bVar2 = bVar;
                list2 = list;
                i2 = i;
                izsVar3 = izsVar4;
                i5 = i6;
                f2 = f;
            }
            izsVar2 = izsVar3;
            M.j();
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar3;
            M.h();
        }
        s = M.s();
        if (s != null) {
            final izs izsVar5 = izsVar2;
            wzsVar = new wzs() { // from class: xsna.sox0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    uox0.d(pox0.f.b.this, list, f, izsVar5, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void e(int i, int i2, androidx.compose.runtime.a aVar, String str, q630 q630Var, boolean z) {
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-687283300);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-687283300, i3, -1, "com.vk.community.design.compose.widget.table.SimpleColumnItem (WidgetTable.kt:165)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 1, q630Var);
            if (z) {
                M.K(-747314670);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().f;
                M.j();
            } else {
                M.K(-747257041);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().m;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, F, j, null, null, 0, i, null, 2, false, 0, 2, null, wuv0Var.m0, aVar2, (i3 & 14) | 100663296 | ((i3 << 15) & 3670016), 48, 5816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yd0(i, i2, str, q630Var, z);
        }
    }

    public static final void f(pox0.f fVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        List list = fVar.b;
        androidx.compose.runtime.a M = aVar.M(1000962516);
        int i2 = i | (M.J(fVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1000962516, i2, -1, "com.vk.community.design.compose.widget.table.WidgetTable (WidgetTable.kt:43)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((pox0.f.a) it.next()).a.length() > 0) {
                        M.K(356590949);
                        a(list, M, 0);
                        break;
                    }
                }
            }
            M.K(354482360);
            M.j();
            M.K(-819778706);
            Iterator it2 = fVar.c.iterator();
            while (it2.hasNext()) {
                d((pox0.f.b) it2.next(), fVar.b, fVar.d, izsVar, M, (i2 << 6) & 7168);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ejh(i, 4, fVar, izsVar, q630Var2);
        }
    }
}
