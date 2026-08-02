package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public final class jr40 {
    public final String a;
    public final String b;
    public final List c;

    public jr40(String str, String str2, List list) {
        this.a = str == null ? "" : str;
        this.b = str2 == null ? "" : str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jr40.class.equals(obj.getClass())) {
            return false;
        }
        jr40 jr40Var = (jr40) obj;
        if (this.a.equals(jr40Var.a)) {
            return this.b.equals(jr40Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.b;
    }
}
