package defpackage;

/* loaded from: classes2.dex */
public final class meg {
    public final String a;
    public final bfc b;

    public meg(String str, bfc bfcVar) {
        this.a = str;
        this.b = bfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meg)) {
            return false;
        }
        meg megVar = (meg) obj;
        return this.a.equals(megVar.a) && this.b.equals(megVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundColors(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
