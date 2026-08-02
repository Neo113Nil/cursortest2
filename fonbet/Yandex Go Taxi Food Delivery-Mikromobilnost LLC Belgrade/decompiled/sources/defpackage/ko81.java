package defpackage;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class ko81 {
    public final String a;
    public final qd81 b;
    public final qd81 c;
    public final int d;
    public final int e;

    public ko81(String str, qd81 qd81Var, qd81 qd81Var2, int i, int i2) {
        if (i != 0 && i2 != 0) {
            w511.q();
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            w511.q();
            throw null;
        }
        this.a = str;
        qd81Var.getClass();
        this.b = qd81Var;
        qd81Var2.getClass();
        this.c = qd81Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ko81.class == obj.getClass()) {
            ko81 ko81Var = (ko81) obj;
            if (this.d == ko81Var.d && this.e == ko81Var.e && this.a.equals(ko81Var.a) && this.b.equals(ko81Var.b) && this.c.equals(ko81Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + z2a1.a((((this.d + 527) * 31) + this.e) * 31, this.a)) * 31);
    }
}
