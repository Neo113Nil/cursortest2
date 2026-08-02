package defpackage;

/* loaded from: classes2.dex */
public final class ni41 implements vi41 {
    public final String a;

    public ni41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni41) && this.a.equals(((ni41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Error(code="), this.a, ')');
    }
}
