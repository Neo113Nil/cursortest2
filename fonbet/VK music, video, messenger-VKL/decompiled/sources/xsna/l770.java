package xsna;

/* compiled from: NotificationActionDelegate.kt */
/* loaded from: classes4.dex */
public final class l770 {
    public final m770 a;
    public final gj70 b;
    public final vi70 c;
    public final ed70 d;
    public final zos e;
    public final z410 f;

    public l770(m770 m770Var, gj70 gj70Var, vi70 vi70Var, ed70 ed70Var, zos zosVar, z410 z410Var) {
        this.a = m770Var;
        this.b = gj70Var;
        this.c = vi70Var;
        this.d = ed70Var;
        this.e = zosVar;
        this.f = z410Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l770)) {
            return false;
        }
        l770 l770Var = (l770) obj;
        return this.a.equals(l770Var.a) && this.b.equals(l770Var.b) && this.c.equals(l770Var.c) && this.d.equals(l770Var.d) && this.e.equals(l770Var.e) && this.f.equals(l770Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NotificationActionDelegate(actionMapper=" + this.a + ", entityActionMapper=" + this.b + ", bubbleActionMapper=" + this.c + ", menuMapper=" + this.d + ", getOpenProfileAction=" + this.e + ", getOpenVkAppAction=" + this.f + ')';
    }
}
