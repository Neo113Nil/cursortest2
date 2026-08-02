package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m81 implements n81 {
    public final String a;
    public final v81 b;

    public m81(String str, v81 v81Var) {
        this.a = str;
        this.b = v81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m81)) {
            return false;
        }
        m81 m81Var = (m81) obj;
        return jl40.l(this.a, m81Var.a) && this.b.equals(m81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextButtonUiState(text=" + this.a + ", addressUiAction=" + this.b + Extension.C_BRAKE;
    }
}
