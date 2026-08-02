package xsna;

import androidx.compose.runtime.a;

/* compiled from: StorefrontServicesUtils.kt */
/* loaded from: classes18.dex */
public final class yol0 {
    public static final void a(final xvy xvyVar, final izs izsVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1001323385);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(5) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1001323385, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.handlePagination (StorefrontServicesUtils.kt:48)");
            }
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = bbk0.b(new pl80(xvyVar, z, 2));
                M.R(x);
            }
            Boolean bool = (Boolean) ((mtk0) x).getValue();
            boolean booleanValue = bool.booleanValue();
            boolean l = M.l(booleanValue) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new wol0(null, izsVar, booleanValue);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tol0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    yol0.a(xvy.this, izsVar, z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
