package defpackage;

import com.yandex.plus.resources.core.a;

/* loaded from: classes2.dex */
public final class j8f0 {
    public final d9f0 a;
    public final a b;
    public final xbg0 c;

    public j8f0(d9f0 d9f0Var, a aVar, xbg0 xbg0Var) {
        this.a = d9f0Var;
        this.b = aVar;
        this.c = xbg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j8f0) {
            j8f0 j8f0Var = (j8f0) obj;
            return this.a.equals(j8f0Var.a) && this.b == j8f0Var.b && this.c == j8f0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, 400L);
    }

    public final String toString() {
        return "Content(productTextsContent=" + this.a + ", stringsResolver=" + this.b + ", debounceTimeMs=400, onClickListener=" + this.c + ')';
    }
}
