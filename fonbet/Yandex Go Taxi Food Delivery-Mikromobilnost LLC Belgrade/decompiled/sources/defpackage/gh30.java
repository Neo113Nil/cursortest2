package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gh30 implements wh30 {
    public final h711 a;

    public gh30(h711 h711Var) {
        this.a = h711Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh30) && jl40.l(this.a, ((gh30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnItemClicked(item=" + this.a + Extension.C_BRAKE;
    }
}
