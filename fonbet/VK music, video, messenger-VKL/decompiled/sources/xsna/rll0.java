package xsna;

import androidx.compose.runtime.a;

/* compiled from: StorefrontContentUtils.kt */
/* loaded from: classes18.dex */
public final class rll0 {
    public static final void a(final xvy xvyVar, final izs izsVar, final boolean z, int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1747215089);
        if ((i2 & 6) == 0) {
            i3 = (M.J(xvyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1747215089, i4, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.HandlePagination (StorefrontContentUtils.kt:107)");
            }
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = bbk0.b(new gzs() { // from class: xsna.nll0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        xvy xvyVar2 = xvy.this;
                        xuy xuyVar = (xuy) j5g.k0(xvyVar2.j().f());
                        return Boolean.valueOf(xuyVar != null && z && xuyVar.getIndex() >= xvyVar2.j().d() + (-5));
                    }
                });
                M.R(x);
            }
            Boolean bool = (Boolean) ((mtk0) x).getValue();
            boolean booleanValue = bool.booleanValue();
            boolean l = M.l(booleanValue) | ((i4 & 112) == 32);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new pll0(null, izsVar, booleanValue);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i = 5;
        } else {
            M.h();
        }
        final int i5 = i;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.oll0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rll0.a(xvy.this, izsVar, z, i5, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
