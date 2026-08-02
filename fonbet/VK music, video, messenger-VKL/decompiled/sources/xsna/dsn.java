package xsna;

import com.unity3d.services.UnityAdsConstants;
import org.chromium.net.NetError;
import xsna.q630;

/* compiled from: Divider.kt */
/* loaded from: classes11.dex */
public final class dsn {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, long j, float f, float f2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        androidx.compose.runtime.f s;
        float f5;
        float f6;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1249392198);
        if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (M.p(j2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f3 = f;
            i3 |= M.n(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= M.n(f4) ? 2048 : 1024;
                if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if ((i2 & 2) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                            }
                            k9g k9gVar = (k9g) M.r(l9g.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = l5g.c(14, k9gVar.a(), 0.12f);
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if (i6 != 0) {
                            f3 = 1;
                        }
                        if (i4 != 0) {
                            f5 = 0;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1249392198, i3, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                            }
                            q630 q630Var2 = q630.a.a;
                            if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                q630Var2 = s200.H(q630Var2, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                            }
                            if (pco.b(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                M.K(-455913241);
                                M.j();
                                f6 = f3;
                            } else {
                                M.K(-455979798);
                                f6 = 1.0f / ((azl) M.r(uvi.h)).getDensity();
                                M.j();
                            }
                            ja8.a(hr80.m(txj0.h(txj0.f(q630Var.g(q630Var2), 1.0f), f6), j2, androidx.compose.ui.graphics.e.a), M, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            f4 = f5;
                        }
                    } else {
                        M.h();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                    }
                    f5 = f4;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630 q630Var22 = q630.a.a;
                    if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    if (pco.b(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    }
                    ja8.a(hr80.m(txj0.h(txj0.f(q630Var.g(q630Var22), 1.0f), f6), j2, androidx.compose.ui.graphics.e.a), M, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    f4 = f5;
                } else {
                    M.h();
                }
                s = M.s();
                if (s != null) {
                    final long j3 = j2;
                    final float f7 = f3;
                    final float f8 = f4;
                    s.d = new wzs() { // from class: xsna.asn
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            dsn.a(q630.this, j3, f7, f8, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            f4 = f2;
            if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
