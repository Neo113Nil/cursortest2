package xsna;

/* compiled from: CameraEditorDeps.kt */
/* loaded from: classes16.dex */
public final class ei9 {
    public final kz8 a;
    public final v3l0 b;
    public final cng0 c;
    public final hhw d;

    public ei9(kz8 kz8Var, v3l0 v3l0Var, cng0 cng0Var, hhw hhwVar) {
        this.a = kz8Var;
        this.b = v3l0Var;
        this.c = cng0Var;
        this.d = hhwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei9)) {
            return false;
        }
        ei9 ei9Var = (ei9) obj;
        return epx.f(this.a, ei9Var.a) && epx.f(this.b, ei9Var.b) && epx.f(this.c, ei9Var.c) && epx.f(this.d, ei9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CameraEditorDeps(cadreUtil=" + this.a + ", stickerDialogUtil=" + this.b + ", rotationGuidesDrawerFactory=" + this.c + ", clipboardInsertionInteractor=" + this.d + ')';
    }
}
