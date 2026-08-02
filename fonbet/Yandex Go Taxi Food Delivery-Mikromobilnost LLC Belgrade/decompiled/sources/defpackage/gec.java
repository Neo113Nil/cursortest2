package defpackage;

/* loaded from: classes2.dex */
public final class gec {
    public final String a;

    public gec(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gec) && this.a.equals(((gec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnCheckoutRgbaColor(rgba="), this.a, ')');
    }
}
