package defpackage;

/* loaded from: classes10.dex */
public final class e731 implements fk2 {
    public final String a;

    public e731(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e731) {
            return this.a.equals(((e731) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
