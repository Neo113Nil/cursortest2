package xsna;

import java.util.Locale;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class d0l extends jc6 {
    public final wh50<rz8> f;
    public final wh50<efn> g;

    public d0l(Long l, Long l2, k9x k9xVar, int i, eai0 eai0Var, Locale locale) {
        super(l2, k9xVar, eai0Var, locale);
        rz8 rz8Var = null;
        if (l != null) {
            rz8 b = this.c.b(l.longValue());
            if (k9xVar.e(b.b)) {
                rz8Var = b;
            }
        }
        this.f = androidx.compose.runtime.k.b(rz8Var);
        this.g = androidx.compose.runtime.k.b(new efn(i));
    }

    public final int e() {
        return ((efn) ((zak0) this.g).getValue()).a;
    }

    public final Long f() {
        rz8 rz8Var = (rz8) ((zak0) this.f).getValue();
        if (rz8Var != null) {
            return Long.valueOf(rz8Var.e);
        }
        return null;
    }
}
