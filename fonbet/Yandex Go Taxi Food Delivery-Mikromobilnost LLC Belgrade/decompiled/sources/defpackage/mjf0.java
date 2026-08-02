package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mjf0 extends pjf0 {
    public final int a;
    public final Integer b;

    public mjf0(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjf0)) {
            return false;
        }
        mjf0 mjf0Var = (mjf0) obj;
        return this.a == mjf0Var.a && jl40.l(this.b, mjf0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Failure(text=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
