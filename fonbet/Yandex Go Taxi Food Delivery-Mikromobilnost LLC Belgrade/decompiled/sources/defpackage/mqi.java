package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mqi {
    public final String a;
    public final String b;
    public final Integer c;

    public mqi(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqi)) {
            return false;
        }
        mqi mqiVar = (mqi) obj;
        return jl40.l(this.a, mqiVar.a) && jl40.l(this.b, mqiVar.b) && jl40.l(this.c, mqiVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return oo31.j(b64.v("Answer(id=", this.a, ", text=", this.b, ", emojiDecimalCode="), this.c, Extension.C_BRAKE);
    }
}
