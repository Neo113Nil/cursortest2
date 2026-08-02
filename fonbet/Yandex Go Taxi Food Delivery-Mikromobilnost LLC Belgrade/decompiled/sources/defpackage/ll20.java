package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ll20 extends xl20 {
    public final int a;
    public final String b;
    public final hr20 c;

    public ll20(int i, String str, hr20 hr20Var) {
        this.a = i;
        this.b = str;
        this.c = hr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll20)) {
            return false;
        }
        ll20 ll20Var = (ll20) obj;
        return this.a == ll20Var.a && this.b.equals(ll20Var.b) && this.c.equals(ll20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "MobApiError(code=", ", message=", this.b, ", headers=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
