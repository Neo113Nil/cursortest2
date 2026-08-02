package xsna;

/* compiled from: CommunityInvitedByItemModel.kt */
/* loaded from: classes5.dex */
public final class i6h extends s4h {
    public final t230 b;
    public final int c;

    public i6h(t230 t230Var, int i) {
        this.b = t230Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6h)) {
            return false;
        }
        i6h i6hVar = (i6h) obj;
        return epx.f(this.b, i6hVar.b) && this.c == i6hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityInvitedByItemModel(invitedBy=" + this.b + ", groupType=" + ((Object) hr80.G(this.c)) + ')';
    }
}
