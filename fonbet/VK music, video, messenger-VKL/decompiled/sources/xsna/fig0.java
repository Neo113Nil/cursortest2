package xsna;

/* compiled from: ReviewsFAQItem.kt */
/* loaded from: classes18.dex */
public final class fig0 implements hfz {
    public final boolean b;

    public fig0() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fig0) && this.b == ((fig0) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ReviewsFAQItem(isEnabled="), this.b, ')');
    }

    public fig0(boolean z) {
        this.b = z;
    }
}
