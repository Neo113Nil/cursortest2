package defpackage;

/* loaded from: classes2.dex */
public final class kkd {
    public final String a;

    public kkd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkd) && this.a.equals(((kkd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ForActiveTariff(name="), this.a, ')');
    }
}
