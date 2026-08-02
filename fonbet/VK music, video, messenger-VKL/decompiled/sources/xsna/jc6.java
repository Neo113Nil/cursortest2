package xsna;

import java.util.Locale;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public abstract class jc6 {
    public final k9x a;
    public final Locale b;
    public final xz8 c;
    public final wh50 d;
    public final wh50<zz8> e;

    public jc6(Long l, k9x k9xVar, eai0 eai0Var, Locale locale) {
        zz8 g;
        this.a = k9xVar;
        this.b = locale;
        xz8 xz8Var = new xz8(locale);
        this.c = xz8Var;
        this.d = androidx.compose.runtime.k.b(eai0Var);
        if (l != null) {
            g = xz8Var.f(l.longValue());
            if (!k9xVar.e(g.a)) {
                g = xz8Var.g(xz8Var.h());
            }
        } else {
            g = xz8Var.g(xz8Var.h());
        }
        this.e = androidx.compose.runtime.k.b(g);
    }

    public final long a() {
        return ((zz8) ((zak0) this.e).getValue()).e;
    }

    public final Locale b() {
        return this.b;
    }

    public final eai0 c() {
        return (eai0) ((zak0) this.d).getValue();
    }

    public final void d(long j) {
        zz8 f = this.c.f(j);
        if (this.a.e(f.a)) {
            ((zak0) this.e).setValue(f);
        }
    }
}
