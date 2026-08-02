package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class as7 {
    public final String a;
    public final String b;

    public as7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as7)) {
            return false;
        }
        as7 as7Var = (as7) obj;
        return as7Var.a.equals(this.a) && as7Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
