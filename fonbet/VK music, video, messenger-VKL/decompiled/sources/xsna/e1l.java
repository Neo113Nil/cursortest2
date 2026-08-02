package xsna;

import java.util.Locale;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class e1l extends jc6 {
    public final wh50<rz8> f;
    public final wh50<rz8> g;
    public final wh50<efn> h;

    public e1l(Long l, Long l2, Long l3, k9x k9xVar, int i, eai0 eai0Var, Locale locale) {
        super(l3, k9xVar, eai0Var, locale);
        this.f = androidx.compose.runtime.k.b(null);
        this.g = androidx.compose.runtime.k.b(null);
        h(l, l2);
        this.h = androidx.compose.runtime.k.b(new efn(i));
    }

    public final int e() {
        return ((efn) ((zak0) this.h).getValue()).a;
    }

    public final Long f() {
        rz8 rz8Var = (rz8) ((zak0) this.g).getValue();
        if (rz8Var != null) {
            return Long.valueOf(rz8Var.e);
        }
        return null;
    }

    public final Long g() {
        rz8 rz8Var = (rz8) ((zak0) this.f).getValue();
        if (rz8Var != null) {
            return Long.valueOf(rz8Var.e);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.e(r8.b) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r0.e(r9.b) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Long l, Long l2) {
        rz8 rz8Var;
        rz8 rz8Var2;
        k9x k9xVar = this.a;
        xz8 xz8Var = this.c;
        if (l != null) {
            rz8Var = xz8Var.b(l.longValue());
        }
        rz8Var = null;
        if (l2 != null) {
            rz8Var2 = xz8Var.b(l2.longValue());
        }
        rz8Var2 = null;
        wh50<rz8> wh50Var = this.g;
        wh50<rz8> wh50Var2 = this.f;
        if (rz8Var == null || (rz8Var2 != null && rz8Var.e > rz8Var2.e)) {
            ((zak0) wh50Var2).setValue(null);
            ((zak0) wh50Var).setValue(null);
        } else {
            ((zak0) wh50Var2).setValue(rz8Var);
            ((zak0) wh50Var).setValue(rz8Var2);
        }
    }
}
