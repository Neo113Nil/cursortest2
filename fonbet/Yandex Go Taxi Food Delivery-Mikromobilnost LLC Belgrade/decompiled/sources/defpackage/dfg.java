package defpackage;

/* loaded from: classes2.dex */
public final class dfg {
    public final String a;
    public final ceg b;

    public dfg(String str, ceg cegVar) {
        this.a = str;
        this.b = cegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfg)) {
            return false;
        }
        dfg dfgVar = (dfg) obj;
        return this.a.equals(dfgVar.a) && this.b.equals(dfgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonOverlay(__typename=" + this.a + ", darkConfigurationOverlayFragment=" + this.b + ')';
    }
}
