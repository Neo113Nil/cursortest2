package defpackage;

/* loaded from: classes2.dex */
public final class c4k0 {
    public final String a;

    public c4k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4k0) && this.a.equals(((c4k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Light1(url="), this.a, ')');
    }
}
