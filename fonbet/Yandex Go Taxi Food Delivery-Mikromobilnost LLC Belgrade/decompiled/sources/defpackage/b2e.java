package defpackage;

/* loaded from: classes2.dex */
public final class b2e {
    public final String a;
    public final i1e b;

    public b2e(String str, i1e i1eVar) {
        this.a = str;
        this.b = i1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2e)) {
            return false;
        }
        b2e b2eVar = (b2e) obj;
        return this.a.equals(b2eVar.a) && this.b.equals(b2eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonOverlay(__typename=" + this.a + ", configurationOverlayFragment=" + this.b + ')';
    }
}
