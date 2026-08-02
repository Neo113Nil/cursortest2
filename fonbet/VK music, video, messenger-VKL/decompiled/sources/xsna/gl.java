package xsna;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes11.dex */
public final class gl extends dl {
    public static gl e;
    public static final ResolvedTextDirection f = ResolvedTextDirection.Rtl;
    public static final ResolvedTextDirection g = ResolvedTextDirection.Ltr;
    public ljo0 c;
    public igi0 d;

    @Override // xsna.dl
    public final int[] a(int i) {
        int i2;
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        if (str.length() <= 0) {
            return null;
        }
        String str2 = (String) this.a;
        if (str2 == null) {
            str2 = null;
        }
        if (i >= str2.length()) {
            return null;
        }
        try {
            igi0 igi0Var = this.d;
            if (igi0Var == null) {
                igi0Var = null;
            }
            zhf0 g2 = igi0Var.g();
            int round = Math.round(g2.d - g2.b);
            if (i <= 0) {
                i = 0;
            }
            ljo0 ljo0Var = this.c;
            if (ljo0Var == null) {
                ljo0Var = null;
            }
            int d = ljo0Var.b.d(i);
            ljo0 ljo0Var2 = this.c;
            if (ljo0Var2 == null) {
                ljo0Var2 = null;
            }
            float g3 = ljo0Var2.b.g(d) + round;
            ljo0 ljo0Var3 = this.c;
            ljo0 ljo0Var4 = ljo0Var3 == null ? null : ljo0Var3;
            if (ljo0Var3 == null) {
                ljo0Var3 = null;
            }
            if (g3 < ljo0Var4.b.g(ljo0Var3.b.f - 1)) {
                ljo0 ljo0Var5 = this.c;
                i2 = (ljo0Var5 != null ? ljo0Var5 : null).b.e(g3);
            } else {
                ljo0 ljo0Var6 = this.c;
                i2 = (ljo0Var6 != null ? ljo0Var6 : null).b.f;
            }
            return b(i, d(i2 - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // xsna.dl
    public final int[] c(int i) {
        int i2;
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        if (str.length() <= 0 || i <= 0) {
            return null;
        }
        try {
            igi0 igi0Var = this.d;
            if (igi0Var == null) {
                igi0Var = null;
            }
            zhf0 g2 = igi0Var.g();
            int round = Math.round(g2.d - g2.b);
            String str2 = (String) this.a;
            if (str2 == null) {
                str2 = null;
            }
            int length = str2.length();
            if (length <= i) {
                i = length;
            }
            ljo0 ljo0Var = this.c;
            if (ljo0Var == null) {
                ljo0Var = null;
            }
            int d = ljo0Var.b.d(i);
            ljo0 ljo0Var2 = this.c;
            if (ljo0Var2 == null) {
                ljo0Var2 = null;
            }
            float g3 = ljo0Var2.b.g(d) - round;
            if (g3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ljo0 ljo0Var3 = this.c;
                if (ljo0Var3 == null) {
                    ljo0Var3 = null;
                }
                i2 = ljo0Var3.b.e(g3);
            } else {
                i2 = 0;
            }
            String str3 = (String) this.a;
            if (i == (str3 != null ? str3 : null).length() && i2 < d) {
                i2++;
            }
            return b(d(i2, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int d(int i, ResolvedTextDirection resolvedTextDirection) {
        ljo0 ljo0Var = this.c;
        if (ljo0Var == null) {
            ljo0Var = null;
        }
        int f2 = ljo0Var.b.f(i);
        ljo0 ljo0Var2 = this.c;
        if (ljo0Var2 == null) {
            ljo0Var2 = null;
        }
        if (resolvedTextDirection != ljo0Var2.j(f2)) {
            ljo0 ljo0Var3 = this.c;
            return (ljo0Var3 != null ? ljo0Var3 : null).b.f(i);
        }
        return ljo0.g(this.c != null ? r5 : null, i) - 1;
    }
}
