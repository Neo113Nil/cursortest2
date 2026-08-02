package defpackage;

/* loaded from: classes2.dex */
public final class b7e0 {
    public final String a;
    public final i1e b;

    public b7e0(String str, i1e i1eVar) {
        this.a = str;
        this.b = i1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7e0)) {
            return false;
        }
        b7e0 b7e0Var = (b7e0) obj;
        return this.a.equals(b7e0Var.a) && this.b.equals(b7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonOverlay(__typename=" + this.a + ", configurationOverlayFragment=" + this.b + ')';
    }
}
