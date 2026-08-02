package xsna;

/* compiled from: ContactsHideNewLocalContacts.kt */
/* loaded from: classes2.dex */
public final class dbj extends le6<s3q0> {
    public final String b = "ContactsListComponent";

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().w().j(false);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbj) && epx.f(this.b, ((dbj) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return tq.f(new StringBuilder("ContactsHideNewLocalContacts(changerTag="), this.b, ')');
    }
}
