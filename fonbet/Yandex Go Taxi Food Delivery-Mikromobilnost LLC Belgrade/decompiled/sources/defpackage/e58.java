package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e58 {
    public final Integer a;
    public final String b;
    public final int c;

    public e58(int i, Integer num, String str) {
        this.a = num;
        this.b = str;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final Integer b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e58)) {
            return false;
        }
        e58 e58Var = (e58) obj;
        return jl40.l(this.a, e58Var.a) && jl40.l(this.b, e58Var.b) && this.c == e58Var.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarIconStrategy(localCarImageColor=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", drawableRes=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
