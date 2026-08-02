package defpackage;

/* loaded from: classes2.dex */
public final class oeg {
    public final String a;
    public final ceg b;

    public oeg(String str, ceg cegVar) {
        this.a = str;
        this.b = cegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeg)) {
            return false;
        }
        oeg oegVar = (oeg) obj;
        return this.a.equals(oegVar.a) && this.b.equals(oegVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonOverlay(__typename=" + this.a + ", darkConfigurationOverlayFragment=" + this.b + ')';
    }
}
