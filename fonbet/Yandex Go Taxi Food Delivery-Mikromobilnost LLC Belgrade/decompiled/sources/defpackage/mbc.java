package defpackage;

/* loaded from: classes2.dex */
public final class mbc implements za70 {
    public final lbc a;

    public mbc(lbc lbcVar) {
        this.a = lbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbc) && this.a.equals(((mbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(collectUserContacts=" + this.a + ')';
    }
}
