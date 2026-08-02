package defpackage;

/* loaded from: classes2.dex */
public final class dyw {
    public final String a;
    public final lxw b;

    public dyw(String str, lxw lxwVar) {
        this.a = str;
        this.b = lxwVar;
    }

    public final lxw a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyw)) {
            return false;
        }
        dyw dywVar = (dyw) obj;
        return this.a.equals(dywVar.a) && this.b.equals(dywVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalInvoice(__typename=" + this.a + ", invoice=" + this.b + ')';
    }
}
