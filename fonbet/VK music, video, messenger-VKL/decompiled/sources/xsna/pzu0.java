package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.a5x;
import xsna.q630;
import xsna.wkj;

/* compiled from: VkIcon.kt */
/* loaded from: classes17.dex */
public final class pzu0 {
    public static final q630 a = txj0.q(q630.a.a, 24);

    public static final void a(imw imwVar, q630 q630Var, long j, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            q630Var = q630.a.a;
        }
        q630 q630Var2 = q630Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(407400475, i, -1, "com.vk.core.compose.component.VkIcon (VkIcon.kt:35)");
        }
        b(mlr0.f(imwVar, aVar, 0), null, q630Var2, j, aVar, 56 | (i & 896), 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if ((r24 & 8) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L))) != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final lg90 lg90Var, final String str, q630 q630Var, long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        long j2;
        final q630 q630Var3;
        final long j3;
        androidx.compose.runtime.f s;
        ColorFilter porterDuffColorFilter;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1628441176);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && M.p(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                q630Var3 = q630Var2;
                j3 = j2;
            } else {
                M.V();
                int i5 = i & 1;
                q630 q630Var5 = q630.a.a;
                if (i5 == 0 || M.i()) {
                    if (i4 != 0) {
                        q630Var2 = q630Var5;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = l5g.c(14, ((l5g) M.r(yfj.a)).a, ((Number) M.r(hfj.a)).floatValue());
                        i3 &= -7169;
                    }
                    q630 q630Var6 = q630Var2;
                    int i6 = i3;
                    long j4 = j2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1628441176, i6, -1, "com.vk.core.compose.component.VkIcon (VkIcon.kt:67)");
                    }
                    boolean z = (((i6 & 7168) ^ 3072) > 2048 && M.p(j4)) || (i6 & 3072) == 2048;
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z || x == c0012a) {
                        if (l5g.d(j4, l5g.k)) {
                            x = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 29) {
                                se7.b();
                                porterDuffColorFilter = re7.b(f870.H(j4), z42.a(5));
                            } else {
                                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j4), z42.b(5));
                            }
                            x = new oe7(j4, 5, porterDuffColorFilter);
                        }
                        M.R(x);
                    }
                    d6g d6gVar = (d6g) x;
                    if (str != null) {
                        M.K(-1235093584);
                        boolean z2 = (i6 & 112) == 32;
                        Object x2 = M.x();
                        if (z2 || x2 == c0012a) {
                            x2 = new c0d(str, 1);
                            M.R(x2);
                        }
                        q630 b = egi0.b(q630Var5, false, (izs) x2);
                        M.j();
                        q630Var4 = b;
                    } else {
                        M.K(-1234954270);
                        M.j();
                        q630Var4 = q630Var5;
                    }
                    a5x.a aVar2 = a5x.a;
                    if (!mxj0.b(lg90Var.i(), 9205357640488583168L)) {
                        long i7 = lg90Var.i();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (i7 >> 32)))) {
                        }
                        ja8.a(ng90.a(q630Var6.g(q630Var5), lg90Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6gVar, 22).g(q630Var4), M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var6;
                        j3 = j4;
                    }
                    q630Var5 = a;
                    ja8.a(ng90.a(q630Var6.g(q630Var5), lg90Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6gVar, 22).g(q630Var4), M, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var3 = q630Var6;
                    j3 = j4;
                } else {
                    M.h();
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ozu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pzu0.b(lg90.this, str, q630Var3, j3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 3072) != 0) {
        }
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
