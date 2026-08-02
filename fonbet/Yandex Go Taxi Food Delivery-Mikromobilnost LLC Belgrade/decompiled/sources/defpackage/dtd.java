package defpackage;

/* loaded from: classes2.dex */
public final class dtd implements za70 {
    public final htd a;

    public dtd(htd htdVar) {
        this.a = htdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtd) && this.a.equals(((dtd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(upsaleComposites=" + this.a + ')';
    }
}
