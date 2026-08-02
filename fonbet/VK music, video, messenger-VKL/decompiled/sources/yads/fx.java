package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class fx extends ix {
    public final String a;

    public fx(String str) {
        super(0);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx) && epx.f(this.a, ((fx) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("Gdpr(value=", this.a, ")");
    }
}
