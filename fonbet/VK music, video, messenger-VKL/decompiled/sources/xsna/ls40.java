package xsna;

/* compiled from: MusicPickerItems.kt */
/* loaded from: classes4.dex */
public final class ls40 {
    public final z87 a;
    public final gzs<s3q0> b;
    public final tzo c;
    public final j4 d;
    public final a97 e;
    public final b97 f;

    public ls40(z87 z87Var, z8c z8cVar, tzo tzoVar, j4 j4Var, a97 a97Var, b97 b97Var) {
        this.a = z87Var;
        this.b = z8cVar;
        this.c = tzoVar;
        this.d = j4Var;
        this.e = a97Var;
        this.f = b97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls40)) {
            return false;
        }
        ls40 ls40Var = (ls40) obj;
        return this.a.equals(ls40Var.a) && epx.f(this.b, ls40Var.b) && this.c.equals(ls40Var.c) && this.d.equals(ls40Var.d) && this.e.equals(ls40Var.e) && this.f.equals(ls40Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gzs<s3q0> gzsVar = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MusicPickerBottomPanelCallbacks(onCancel=" + this.a + ", onOpen=" + this.b + ", onSave=" + this.c + ", onAttachPlaylist=" + this.d + ", onOpenSnippetSettings=" + this.e + ", onHideTooltip=" + this.f + ')';
    }
}
