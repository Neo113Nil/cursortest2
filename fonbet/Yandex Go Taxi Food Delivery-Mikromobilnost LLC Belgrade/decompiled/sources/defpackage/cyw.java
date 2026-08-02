package defpackage;

/* loaded from: classes2.dex */
public final class cyw implements za70 {
    public final dyw a;

    public cyw(dyw dywVar) {
        this.a = dywVar;
    }

    public final dyw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyw) && this.a.equals(((cyw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(externalInvoice=" + this.a + ')';
    }
}
