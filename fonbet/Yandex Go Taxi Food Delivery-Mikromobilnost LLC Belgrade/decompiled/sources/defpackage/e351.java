package defpackage;

/* loaded from: classes2.dex */
public final class e351 {
    public final String a;

    public e351(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e351) && this.a.equals(((e351) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnFitWidth(__typename="), this.a, ')');
    }
}
