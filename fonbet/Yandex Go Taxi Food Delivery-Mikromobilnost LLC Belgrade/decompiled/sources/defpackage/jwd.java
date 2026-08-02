package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jwd {
    public final CharSequence a;
    public final Integer b;

    public jwd(CharSequence charSequence, Integer num) {
        this.a = charSequence;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwd)) {
            return false;
        }
        jwd jwdVar = (jwd) obj;
        return jl40.l(this.a, jwdVar.a) && jl40.l(this.b, jwdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CompressionResistantAttributedText(text=" + ((Object) this.a) + ", priority=" + this.b + Extension.C_BRAKE;
    }
}
