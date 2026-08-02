package defpackage;

/* loaded from: classes2.dex */
public final class d351 {
    public final String a;

    public d351(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d351) && this.a.equals(((d351) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnFillWidth(__typename="), this.a, ')');
    }
}
