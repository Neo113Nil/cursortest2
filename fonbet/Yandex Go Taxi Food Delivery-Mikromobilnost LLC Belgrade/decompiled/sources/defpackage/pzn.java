package defpackage;

/* loaded from: classes.dex */
public final class pzn {
    public final String a;

    public pzn(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ny61.t("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzn)) {
            return false;
        }
        return this.a.equals(((pzn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return oyr.t(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
