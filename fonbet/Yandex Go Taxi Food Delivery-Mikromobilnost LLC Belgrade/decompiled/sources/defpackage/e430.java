package defpackage;

import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class e430 {
    public static final e430 d = new e430(new m37(b.f()), "", "");
    public final m37 a;
    public final String b;
    public final String c;

    public e430(m37 m37Var, String str, String str2) {
        this.a = m37Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e430)) {
            return false;
        }
        e430 e430Var = (e430) obj;
        return this.a.equals(e430Var.a) && this.b.equals(e430Var.b) && this.c.equals(e430Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModeStyle(buttonStyle=");
        sb.append(this.a);
        sb.append(", mapStyle=");
        sb.append(this.b);
        sb.append(", style=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
