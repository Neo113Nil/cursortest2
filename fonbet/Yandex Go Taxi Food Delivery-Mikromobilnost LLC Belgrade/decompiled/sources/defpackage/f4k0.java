package defpackage;

/* loaded from: classes2.dex */
public final class f4k0 {
    public final String a;

    public f4k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4k0) && this.a.equals(((f4k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnCheckoutTitleHighlightItem(text="), this.a, ')');
    }
}
