package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: VkSnackbarContent.kt */
/* loaded from: classes17.dex */
public final class okv0 {
    public static final void a(final wl20 wl20Var, final e7k0 e7k0Var, final g7k0 g7k0Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2091729524);
        if ((i & 6) == 0) {
            i2 = (M.J(wl20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(e7k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(g7k0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2091729524, i2, -1, "com.vk.core.compose.component.snackbar.MilkshakeSnackbarContent (VkSnackbarContent.kt:86)");
            }
            phu0.a(hr80.m(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, w65.k().b, 1, aVar2), w65.k().a(M), w65.k().a), w65.k().a, w65.k().a(M), 0L, null, 8, kai.c(1196031620, new f670(gzsVar, e7k0Var, wl20Var, g7k0Var), M), M, 1769472, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nkv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    okv0.a(wl20.this, e7k0Var, g7k0Var, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final wl20 wl20Var, q630 q630Var, final e7k0 e7k0Var, g7k0 g7k0Var, rv5 rv5Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        g7k0 g7k0Var2;
        int i3;
        rv5 rv5Var2;
        int i4;
        final g7k0 g7k0Var3;
        final rv5 rv5Var3;
        androidx.compose.runtime.a M = aVar.M(951969209);
        int i5 = i | (M.J(wl20Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= M.J(q630Var) ? 32 : 16;
        }
        int i7 = i5 | (M.J(e7k0Var) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 = i7 | 3072;
            g7k0Var2 = g7k0Var;
        } else {
            g7k0Var2 = g7k0Var;
            i3 = i7 | (M.J(g7k0Var2) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i4 = i3 | 24576;
            rv5Var2 = rv5Var;
        } else {
            rv5Var2 = rv5Var;
            i4 = i3 | (M.J(rv5Var2) ? 16384 : 8192);
        }
        int i10 = i4 | ((i2 & 32) != 0 ? 196608 : M.y(null) ? 131072 : 65536);
        if (M.t(i10 & 1, (74899 & i10) != 74898)) {
            if (i6 != 0) {
                q630Var = q630.a.a;
            }
            g7k0 g7k0Var4 = i8 != 0 ? null : g7k0Var2;
            rv5 rv5Var4 = i9 == 0 ? rv5Var2 : null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(951969209, i10, -1, "com.vk.core.compose.component.snackbar.VkSnackbarContent (VkSnackbarContent.kt:58)");
            }
            M.K(446285798);
            int i11 = i10 >> 3;
            a(wl20Var, e7k0Var, g7k0Var4, null, M, (i10 & 14) | 24576 | (i11 & 112) | (i11 & 896) | ((i10 >> 6) & 7168));
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rv5Var3 = rv5Var4;
            g7k0Var3 = g7k0Var4;
        } else {
            M.h();
            g7k0Var3 = g7k0Var2;
            rv5Var3 = rv5Var2;
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mkv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    okv0.b(wl20.this, q630Var2, e7k0Var, g7k0Var3, rv5Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
