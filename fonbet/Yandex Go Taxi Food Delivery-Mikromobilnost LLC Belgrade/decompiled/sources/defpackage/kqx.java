package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class kqx {
    public final String a;
    public final String b;

    static {
        tw21.Q(0);
        tw21.Q(1);
    }

    public kqx(String str, String str2) {
        this.a = tw21.X(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kqx.class == obj.getClass()) {
            kqx kqxVar = (kqx) obj;
            if (Objects.equals(this.a, kqxVar.a) && Objects.equals(this.b, kqxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
