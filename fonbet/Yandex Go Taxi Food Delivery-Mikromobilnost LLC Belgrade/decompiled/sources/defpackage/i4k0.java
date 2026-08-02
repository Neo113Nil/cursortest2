package defpackage;

/* loaded from: classes2.dex */
public final class i4k0 {
    public final String a;

    public i4k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4k0) && this.a.equals(((i4k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnCheckoutTitleStrikeItem(text="), this.a, ')');
    }
}
