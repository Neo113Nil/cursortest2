package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class ch21 extends x5v {
    public final String b;
    public final String c;

    public ch21(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ch21.class != obj.getClass()) {
            return false;
        }
        ch21 ch21Var = (ch21) obj;
        return this.a.equals(ch21Var.a) && Objects.equals(this.b, ch21Var.b) && this.c.equals(ch21Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
