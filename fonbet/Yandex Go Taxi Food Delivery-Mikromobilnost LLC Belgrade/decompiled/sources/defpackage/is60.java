package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class is60 {
    public static final is60 c = new is60(null);
    public final String a;
    public boolean b;

    public is60(String str) {
        this.a = str;
        this.b = !(str == null || str.length() == 0);
    }

    public final String a() {
        String str = this.a;
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof is60)) {
            return false;
        }
        is60 is60Var = (is60) obj;
        return is60Var.b == this.b && is60Var.a().equals(a());
    }

    public final int hashCode() {
        return Objects.hash(a(), Boolean.valueOf(this.b));
    }

    public is60() {
        this(null);
    }
}
