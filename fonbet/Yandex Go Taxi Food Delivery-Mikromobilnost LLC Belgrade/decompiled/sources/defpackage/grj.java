package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class grj {
    public final dmf0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final int d;
    public final boolean e;

    public grj(dmf0 dmf0Var, String str, String str2, int i, boolean z) {
        this.a = dmf0Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grj)) {
            return false;
        }
        grj grjVar = (grj) obj;
        return this.a.equals(grjVar.a) && jl40.l(this.b, grjVar.b) && jl40.l(this.c, grjVar.c) && this.d == grjVar.d && this.e == grjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oyr.b(this.d, smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action(action=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", active=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
