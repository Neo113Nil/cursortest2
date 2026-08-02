package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b4r {
    public final String a;
    public final String b;

    public b4r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4r)) {
            return false;
        }
        b4r b4rVar = (b4r) obj;
        return jl40.l(this.a, b4rVar.a) && jl40.l(this.b, b4rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FilterChatsCrossRefEntity(filterId=", this.a, ", chatId=", this.b, Extension.C_BRAKE);
    }
}
