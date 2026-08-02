package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jf9 {
    public final String a;
    public final b b;

    public jf9(String str, b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf9)) {
            return false;
        }
        jf9 jf9Var = (jf9) obj;
        return jl40.l(this.a, jf9Var.a) && jl40.l(this.b, jf9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "IdempotencyKey(orderId=" + this.a + ", payload=" + this.b + Extension.C_BRAKE;
    }
}
