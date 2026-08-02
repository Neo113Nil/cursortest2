package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class jom implements lom {
    public final int a;
    public final Integer b;

    public jom(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jom)) {
            return false;
        }
        jom jomVar = (jom) obj;
        return this.a == jomVar.a && jl40.l(this.b, jomVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Counter(counter=" + this.a + ", maxCounter=" + this.b + Extension.C_BRAKE;
    }
}
