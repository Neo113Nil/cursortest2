package defpackage;

import com.yandex.messaging.TokenType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c5g0 {
    public final String a;
    public final TokenType b;

    public c5g0(String str, TokenType tokenType) {
        this.a = str;
        this.b = tokenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5g0)) {
            return false;
        }
        c5g0 c5g0Var = (c5g0) obj;
        return jl40.l(this.a, c5g0Var.a) && this.b == c5g0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PushToken(token=" + this.a + ", tokenType=" + this.b + Extension.C_BRAKE;
    }
}
