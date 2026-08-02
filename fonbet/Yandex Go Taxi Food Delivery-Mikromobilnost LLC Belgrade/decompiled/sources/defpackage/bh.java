package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes10.dex */
public final class bh extends zg {
    public static bh d;
    public static final ResolvedTextDirection e = ResolvedTextDirection.Rtl;
    public static final ResolvedTextDirection f = ResolvedTextDirection.Ltr;
    public dry0 c;

    @Override // defpackage.eh
    public final int[] a(int i) {
        int i2;
        String str = this.a;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            String str2 = this.a;
            if (str2 == null) {
                str2 = null;
            }
            if (i < str2.length()) {
                dry0 dry0Var = this.c;
                ResolvedTextDirection resolvedTextDirection = e;
                if (i < 0) {
                    if (dry0Var == null) {
                        dry0Var = null;
                    }
                    i2 = dry0Var.b.d(0);
                } else {
                    if (dry0Var == null) {
                        dry0Var = null;
                    }
                    int d2 = dry0Var.b.d(i);
                    i2 = e(d2, resolvedTextDirection) == i ? d2 : d2 + 1;
                }
                dry0 dry0Var2 = this.c;
                if (dry0Var2 == null) {
                    dry0Var2 = null;
                }
                if (i2 < dry0Var2.b.f) {
                    return c(e(i2, resolvedTextDirection), e(i2, f) + 1);
                }
            }
        }
        return null;
    }

    @Override // defpackage.eh
    public final int[] b(int i) {
        int i2;
        String str = this.a;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0 && i > 0) {
            String str2 = this.a;
            if (str2 == null) {
                str2 = null;
            }
            int length = str2.length();
            dry0 dry0Var = this.c;
            ResolvedTextDirection resolvedTextDirection = f;
            if (i > length) {
                if (dry0Var == null) {
                    dry0Var = null;
                }
                String str3 = this.a;
                if (str3 == null) {
                    str3 = null;
                }
                i2 = dry0Var.b.d(str3.length());
            } else {
                if (dry0Var == null) {
                    dry0Var = null;
                }
                int d2 = dry0Var.b.d(i);
                i2 = e(d2, resolvedTextDirection) + 1 == i ? d2 : d2 - 1;
            }
            if (i2 >= 0) {
                return c(e(i2, e), e(i2, resolvedTextDirection) + 1);
            }
        }
        return null;
    }

    public final int e(int i, ResolvedTextDirection resolvedTextDirection) {
        dry0 dry0Var = this.c;
        if (dry0Var == null) {
            dry0Var = null;
        }
        int k = dry0Var.k(i);
        dry0 dry0Var2 = this.c;
        if (dry0Var2 == null) {
            dry0Var2 = null;
        }
        ResolvedTextDirection l = dry0Var2.l(k);
        dry0 dry0Var3 = this.c;
        if (resolvedTextDirection != l) {
            return (dry0Var3 != null ? dry0Var3 : null).k(i);
        }
        return dry0.h(dry0Var3 != null ? dry0Var3 : null, i) - 1;
    }

    public final void f(String str, dry0 dry0Var) {
        this.a = str;
        this.c = dry0Var;
    }
}
