package defpackage;

/* loaded from: classes2.dex */
public final class msu0 {
    public final String a;

    public msu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msu0) && this.a.equals(((msu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnJustInteractCrossAction(__typename="), this.a, ')');
    }
}
