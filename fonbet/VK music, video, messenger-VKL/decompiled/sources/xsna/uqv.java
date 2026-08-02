package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.a5x;
import xsna.q630;
import xsna.wkj;

/* compiled from: Icon.kt */
/* loaded from: classes11.dex */
public final class uqv {
    public static final q630 a = txj0.q(q630.a.a, i3k0.d);

    public static final void a(final imw imwVar, final String str, q630 q630Var, long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final q630 q630Var2;
        final long j2;
        q630 q630Var3;
        long j3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-126890956);
        int i5 = i | (M.J(imwVar) ? 4 : 2) | (M.J(str) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
        } else {
            i3 = i5 | (M.J(q630Var) ? 256 : 128);
        }
        int i7 = i3 | 1024;
        if (M.t(i7 & 1, (i7 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var3 = i6 != 0 ? q630.a.a : q630Var;
                j3 = ((l5g) M.r(zfj.a)).a;
                i4 = i7 & (-7169);
            } else {
                M.h();
                i4 = i7 & (-7169);
                q630Var3 = q630Var;
                j3 = j;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-126890956, i4, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
            }
            b(mlr0.f(imwVar, M, i4 & 14), str, q630Var3, j3, M, (i4 & 112) | 8 | (i4 & 896), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
            j2 = j3;
        } else {
            M.h();
            q630Var2 = q630Var;
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, q630Var2, j2, i, i2) { // from class: xsna.rqv
                public final /* synthetic */ String c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;

                {
                    this.f = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    uqv.a(imw.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I, this.f);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0155, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r10 & 4294967295L))) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final lg90 lg90Var, final String str, q630 q630Var, final long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        ColorFilter porterDuffColorFilter;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-2142239481);
        if ((i & 6) == 0) {
            i3 = (M.y(lg90Var) ? 4 : 2) | i;
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
            if ((i & 3072) == 0) {
                i3 |= M.p(j) ? 2048 : 1024;
            }
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                M.V();
                int i5 = i & 1;
                q630 q630Var5 = q630.a.a;
                if (i5 != 0 && !M.i()) {
                    M.h();
                } else if (i4 != 0) {
                    q630Var2 = q630Var5;
                }
                q630 q630Var6 = q630Var2;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
                }
                boolean z = (((i3 & 7168) ^ 3072) > 2048 && M.p(j)) || (i3 & 3072) == 2048;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    if (l5g.d(j, l5g.k)) {
                        x = null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        x = new oe7(j, 5, porterDuffColorFilter);
                    }
                    M.R(x);
                }
                d6g d6gVar = (d6g) x;
                if (str != null) {
                    M.K(-536990979);
                    boolean z2 = (i3 & 112) == 32;
                    Object x2 = M.x();
                    if (z2 || x2 == c0012a) {
                        x2 = new arf(str, 20);
                        M.R(x2);
                    }
                    q630Var4 = egi0.b(q630Var5, false, (izs) x2);
                    M.j();
                } else {
                    M.K(-536832197);
                    M.j();
                    q630Var4 = q630Var5;
                }
                a5x.a aVar2 = a5x.a;
                if (!mxj0.b(lg90Var.i(), 9205357640488583168L)) {
                    long i6 = lg90Var.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (i6 >> 32)))) {
                    }
                    q630Var3 = q630Var6;
                    ja8.a(ng90.a(q630Var6.g(q630Var5), lg90Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6gVar, 22).g(q630Var4), M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                q630Var5 = a;
                q630Var3 = q630Var6;
                ja8.a(ng90.a(q630Var6.g(q630Var5), lg90Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6gVar, 22).g(q630Var4), M, 0);
                if (androidx.compose.runtime.b.d()) {
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.tqv
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uqv.b(lg90.this, str, q630Var3, j, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
