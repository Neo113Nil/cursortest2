package defpackage;

import androidx.compose.ui.semantics.c;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes10.dex */
public final class ch extends zg {
    public static ch e;
    public static final ResolvedTextDirection f = ResolvedTextDirection.Rtl;
    public static final ResolvedTextDirection g = ResolvedTextDirection.Ltr;
    public dry0 c;
    public c d;

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
                try {
                    c cVar = this.d;
                    if (cVar == null) {
                        cVar = null;
                    }
                    zii0 g2 = cVar.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    dry0 dry0Var = this.c;
                    if (dry0Var == null) {
                        dry0Var = null;
                    }
                    int d = dry0Var.b.d(i);
                    dry0 dry0Var2 = this.c;
                    if (dry0Var2 == null) {
                        dry0Var2 = null;
                    }
                    float f2 = dry0Var2.b.f(d) + round;
                    dry0 dry0Var3 = this.c;
                    dry0 dry0Var4 = dry0Var3 == null ? null : dry0Var3;
                    if (dry0Var3 == null) {
                        dry0Var3 = null;
                    }
                    float f3 = dry0Var4.b.f(dry0Var3.b.f - 1);
                    dry0 dry0Var5 = this.c;
                    if (f2 < f3) {
                        i2 = (dry0Var5 != null ? dry0Var5 : null).b.e(f2);
                    } else {
                        i2 = (dry0Var5 != null ? dry0Var5 : null).b.f;
                    }
                    return c(i, e(i2 - 1, g) + 1);
                } catch (IllegalStateException unused) {
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
            try {
                c cVar = this.d;
                if (cVar == null) {
                    cVar = null;
                }
                zii0 g2 = cVar.g();
                int round = Math.round(g2.d - g2.b);
                String str2 = this.a;
                if (str2 == null) {
                    str2 = null;
                }
                int length = str2.length();
                if (length <= i) {
                    i = length;
                }
                dry0 dry0Var = this.c;
                if (dry0Var == null) {
                    dry0Var = null;
                }
                int d = dry0Var.b.d(i);
                dry0 dry0Var2 = this.c;
                if (dry0Var2 == null) {
                    dry0Var2 = null;
                }
                float f2 = dry0Var2.b.f(d) - round;
                if (f2 > 0.0f) {
                    dry0 dry0Var3 = this.c;
                    if (dry0Var3 == null) {
                        dry0Var3 = null;
                    }
                    i2 = dry0Var3.b.e(f2);
                } else {
                    i2 = 0;
                }
                String str3 = this.a;
                if (i == (str3 != null ? str3 : null).length() && i2 < d) {
                    i2++;
                }
                return c(e(i2, f), i);
            } catch (IllegalStateException unused) {
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

    public final void f(String str, dry0 dry0Var, c cVar) {
        this.a = str;
        this.c = dry0Var;
        this.d = cVar;
    }
}
