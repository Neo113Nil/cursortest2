package xsna;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public final class ogy extends jgy {
    public final ewp0 b;
    public final boolean c;
    public final boolean d;

    public ogy(ewp0 ewp0Var, boolean z, boolean z2) {
        this.b = ewp0Var;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.jgy
    public final jgy a(boolean z) {
        return new ogy(this.b, this.c, z);
    }

    @Override // xsna.jgy
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogy)) {
            return false;
        }
        ogy ogyVar = (ogy) obj;
        return epx.f(this.b, ogyVar.b) && this.c == ogyVar.c && this.d == ogyVar.d;
    }

    @Override // xsna.jgy
    public final int getId() {
        return -7;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardNavigationWithUGCItem(ugcPack=");
        sb.append(this.b);
        sb.append(", hasNotViewed=");
        sb.append(this.c);
        sb.append(", selected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
