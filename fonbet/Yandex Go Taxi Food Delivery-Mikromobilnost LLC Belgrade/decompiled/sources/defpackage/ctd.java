package defpackage;

/* loaded from: classes2.dex */
public final class ctd {
    public final String a;

    public ctd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctd) && this.a.equals(((ctd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Benefit(text="), this.a, ')');
    }
}
