package xsna;

/* compiled from: CommunityLegoSubscriberInviteItemModel.kt */
/* loaded from: classes5.dex */
public final class y7h extends s4h {
    public final t230 b;
    public final int c;

    public y7h(t230 t230Var, int i) {
        this.b = t230Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7h)) {
            return false;
        }
        y7h y7hVar = (y7h) obj;
        return epx.f(this.b, y7hVar.b) && this.c == y7hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityLegoSubscriberInviteItemModel(invitedBy=" + this.b + ", groupType=" + ((Object) hr80.G(this.c)) + ')';
    }
}
