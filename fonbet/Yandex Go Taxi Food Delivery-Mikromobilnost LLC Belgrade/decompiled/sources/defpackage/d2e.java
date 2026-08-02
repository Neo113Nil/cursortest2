package defpackage;

/* loaded from: classes2.dex */
public final class d2e {
    public final String a;

    public d2e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2e) && this.a.equals(((d2e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("TextStyle(color="), this.a, ')');
    }
}
