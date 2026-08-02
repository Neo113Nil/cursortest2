package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class cqj0 extends wgj0 {
    public final String a;
    public final List b;

    public cqj0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqj0)) {
            return false;
        }
        cqj0 cqj0Var = (cqj0) obj;
        return this.a.equals(cqj0Var.a) && this.b.equals(cqj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
