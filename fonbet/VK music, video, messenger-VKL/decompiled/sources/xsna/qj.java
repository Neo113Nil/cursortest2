package xsna;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class qj implements hfz {
    public final boolean b;

    public qj(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj) && this.b == ((qj) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("AcceptTermsCardItem(checked="), this.b, ')');
    }
}
