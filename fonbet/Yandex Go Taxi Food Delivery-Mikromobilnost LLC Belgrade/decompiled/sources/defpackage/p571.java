package defpackage;

import java.util.Objects;

/* loaded from: classes11.dex */
public final class p571 {
    public final String a;
    public final String b;

    public p571(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p571) {
            p571 p571Var = (p571) obj;
            if (Objects.equals(this.a, p571Var.a) && Objects.equals(this.b, p571Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 37);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[packageName=");
        sb.append(this.a);
        sb.append(",libraryName=");
        return oyr.t(sb, this.b, "]");
    }
}
