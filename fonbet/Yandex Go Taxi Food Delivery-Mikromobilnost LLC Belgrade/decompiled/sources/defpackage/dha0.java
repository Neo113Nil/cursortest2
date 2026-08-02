package defpackage;

/* loaded from: classes2.dex */
public final class dha0 {
    public final String a;

    public dha0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dha0) && this.a.equals(((dha0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Dark(url="), this.a, ')');
    }
}
