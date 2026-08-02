package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.ud90;
import xsna.wd90;

/* compiled from: TopshelfPagination.kt */
/* loaded from: classes2.dex */
public final class scp0 {
    public static final void a(final int i, final gzs gzsVar, final gzs gzsVar2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        gzs gzsVar3;
        gzs gzsVar4;
        androidx.compose.runtime.a M = aVar.M(-605776021);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            gzsVar3 = gzsVar;
            i3 |= M.y(gzsVar3) ? 32 : 16;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((i2 & 384) == 0) {
            gzsVar4 = gzsVar2;
            i3 |= M.y(gzsVar4) ? 256 : 128;
        } else {
            gzsVar4 = gzsVar2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-605776021, i3, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.pagination.TopshelfPagination (TopshelfPagination.kt:32)");
            }
            if (i <= 1) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    final gzs gzsVar5 = gzsVar3;
                    final gzs gzsVar6 = gzsVar4;
                    s.d = new wzs() { // from class: xsna.ocp0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            scp0.a(i, gzsVar5, gzsVar6, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            final int intValue = ((Number) gzsVar.invoke()).intValue();
            float f = swe0.f(((Number) gzsVar2.invoke()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            if (intValue < 0 || intValue >= i) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s2 = M.s();
                if (s2 != null) {
                    s2.d = new wzs() { // from class: xsna.pcp0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            scp0.a(i, gzsVar, gzsVar2, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1673221095, 0, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.pagination.paginationStyle (TopshelfPagination.kt:67)");
            }
            M.K(461337090);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().l;
            ud90.b a = ud90.a(0, M);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            final rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(intValue);
                M.R(x2);
            }
            final rg50 rg50Var2 = (rg50) x2;
            final int intValue2 = Math.abs(rg50Var2.getIntValue() - intValue) > 1 ? rg50Var.getIntValue() + 1 : rg50Var.getIntValue();
            boolean o = M.o(intValue) | M.o(intValue2);
            Object x3 = M.x();
            if (o || x3 == c0012a) {
                x3 = new gzs() { // from class: xsna.qcp0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        rg50.this.C(intValue);
                        rg50Var.C(intValue2);
                        return s3q0.a;
                    }
                };
                M.R(x3);
            }
            bap.i((gzs) x3, M, 0);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.c, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.W(1116167096, Integer.valueOf(intValue2));
            oav0.b(new wd90.b(f), i, intValue, null, j, a, null, 0, M, (i3 << 3) & 112, 200);
            M.a0();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s3 = M.s();
        if (s3 != null) {
            s3.d = new wzs() { // from class: xsna.rcp0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    scp0.a(i, gzsVar, gzsVar2, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
