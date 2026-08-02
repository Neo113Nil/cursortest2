package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class j4c {
    public final int a;
    public final Integer b;

    public j4c(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4c)) {
            return false;
        }
        j4c j4cVar = (j4c) obj;
        return this.a == j4cVar.a && jl40.l(this.b, j4cVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "State(crossColor=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
