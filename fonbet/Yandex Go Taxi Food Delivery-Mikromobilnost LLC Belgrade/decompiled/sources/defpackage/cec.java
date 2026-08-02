package defpackage;

/* loaded from: classes2.dex */
public final class cec {
    public final String a;

    public cec(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cec) && this.a.equals(((cec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Fallback(rgba="), this.a, ')');
    }
}
