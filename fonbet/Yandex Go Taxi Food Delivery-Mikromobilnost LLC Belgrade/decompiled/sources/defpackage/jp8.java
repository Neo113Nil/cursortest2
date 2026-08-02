package defpackage;

import com.ybsdk.feature.card.api.entities.CardTokenType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jp8 {
    public final String a;
    public final String b;
    public final CardTokenType c;
    public final String d;

    public jp8(String str, String str2, CardTokenType cardTokenType, String str3) {
        this.a = str;
        this.b = str2;
        this.c = cardTokenType;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp8)) {
            return false;
        }
        jp8 jp8Var = (jp8) obj;
        return jl40.l(this.a, jp8Var.a) && jl40.l(this.b, jp8Var.b) && this.c == jp8Var.c && jl40.l(this.d, jp8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardTokenEntity(token=", this.a, ", tokenId=", this.b, ", type=");
        v.append(this.c);
        v.append(", suffix=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
