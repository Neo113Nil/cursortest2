package defpackage;

/* loaded from: classes7.dex */
public final class ol81 {
    public final String a;
    public final String b;
    public final String c;

    public ol81(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol81.class != obj.getClass()) {
            return false;
        }
        ol81 ol81Var = (ol81) obj;
        String str = ol81Var.a;
        int i = rf71.a;
        return this.a.equals(str) && rf71.o(this.b, ol81Var.b) && rf71.o(this.c, ol81Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
