package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e711 implements h711 {
    public final String a;
    public final k911 b;
    public final String c;

    public e711(String str, k911 k911Var, String str2) {
        this.a = str;
        this.b = k911Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e711)) {
            return false;
        }
        e711 e711Var = (e711) obj;
        return jl40.l(this.a, e711Var.a) && jl40.l(this.b, e711Var.b) && this.c.equals(e711Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.e(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.b;
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
