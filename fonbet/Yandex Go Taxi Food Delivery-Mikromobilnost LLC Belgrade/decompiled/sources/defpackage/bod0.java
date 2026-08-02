package defpackage;

/* loaded from: classes2.dex */
public final class bod0 implements cod0 {
    public final String a;

    public bod0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bod0) && this.a.equals(((bod0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Unexpected(debugMessage="), this.a, ')');
    }
}
