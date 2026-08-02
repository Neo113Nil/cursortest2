package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class dj70 {
    public final CharSequence a;
    public final CharSequence b;
    public final wp2 c;
    public final wp2 d;
    public final boolean e;
    public final qwa0 f;
    public final String g;

    public dj70(CharSequence charSequence, CharSequence charSequence2, wp2 wp2Var, wp2 wp2Var2, boolean z, qwa0 qwa0Var, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = wp2Var;
        this.d = wp2Var2;
        this.e = z;
        this.f = qwa0Var;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj70)) {
            return false;
        }
        dj70 dj70Var = (dj70) obj;
        if (!jl40.l(this.a, dj70Var.a) || !jl40.l(this.b, dj70Var.b) || !jl40.l(this.c, dj70Var.c) || !jl40.l(this.d, dj70Var.d) || this.e != dj70Var.e) {
            return false;
        }
        l0s l0sVar = l0s.a;
        return l0sVar.equals(l0sVar) && jl40.l(this.f, dj70Var.f) && jl40.l(this.g, dj70Var.g);
    }

    public final int hashCode() {
        int hashCode = (((Boolean.hashCode(this.e) + n.b(this.d, n.b(this.c, smw0.b(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31) + 1389601466) * 31;
        qwa0 qwa0Var = this.f;
        return this.g.hashCode() + ((hashCode + (qwa0Var == null ? 0 : qwa0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "OrderButtonUiState(title=", ", subtitle=", ", textColor=");
        r.append(this.c);
        r.append(", backgroundColor=");
        r.append(this.d);
        r.append(", isEnabled=");
        r.append(this.e);
        r.append(", action=");
        r.append(l0s.a);
        r.append(", performanceAction=");
        r.append(this.f);
        r.append(", contentDescription=");
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
