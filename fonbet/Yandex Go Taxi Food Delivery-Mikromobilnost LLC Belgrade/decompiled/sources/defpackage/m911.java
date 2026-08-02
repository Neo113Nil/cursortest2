package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m911 implements m1j {
    public final String a;
    public final k911 b;
    public final String c;

    public m911(String str, k911 k911Var, String str2) {
        this.a = str;
        this.b = k911Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m911)) {
            return false;
        }
        m911 m911Var = (m911) obj;
        return jl40.l(this.a, m911Var.a) && jl40.l(this.b, m911Var.b) && jl40.l(this.c, m911Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportStopItem(text=");
        sb.append(this.a);
        sb.append(", transportType=");
        sb.append(this.b);
        sb.append(", id=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
