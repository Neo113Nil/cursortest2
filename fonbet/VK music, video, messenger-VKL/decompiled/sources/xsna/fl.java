package xsna;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes11.dex */
public final class fl extends dl {
    public static fl d;
    public static final ResolvedTextDirection e = ResolvedTextDirection.Rtl;
    public static final ResolvedTextDirection f = ResolvedTextDirection.Ltr;
    public ljo0 c;

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
        ResolvedTextDirection resolvedTextDirection = e;
        if (i < 0) {
            ljo0 ljo0Var = this.c;
            if (ljo0Var == null) {
                ljo0Var = null;
            }
            i2 = ljo0Var.b.d(0);
        } else {
            ljo0 ljo0Var2 = this.c;
            if (ljo0Var2 == null) {
                ljo0Var2 = null;
            }
            int d2 = ljo0Var2.b.d(i);
            i2 = d(d2, resolvedTextDirection) == i ? d2 : d2 + 1;
        }
        ljo0 ljo0Var3 = this.c;
        if (ljo0Var3 == null) {
            ljo0Var3 = null;
        }
        if (i2 >= ljo0Var3.b.f) {
            return null;
        }
        return b(d(i2, resolvedTextDirection), d(i2, f) + 1);
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
        String str2 = (String) this.a;
        if (str2 == null) {
            str2 = null;
        }
        int length = str2.length();
        ResolvedTextDirection resolvedTextDirection = f;
        if (i > length) {
            ljo0 ljo0Var = this.c;
            if (ljo0Var == null) {
                ljo0Var = null;
            }
            String str3 = (String) this.a;
            if (str3 == null) {
                str3 = null;
            }
            i2 = ljo0Var.b.d(str3.length());
        } else {
            ljo0 ljo0Var2 = this.c;
            if (ljo0Var2 == null) {
                ljo0Var2 = null;
            }
            int d2 = ljo0Var2.b.d(i);
            i2 = d(d2, resolvedTextDirection) + 1 == i ? d2 : d2 - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return b(d(i2, e), d(i2, resolvedTextDirection) + 1);
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
