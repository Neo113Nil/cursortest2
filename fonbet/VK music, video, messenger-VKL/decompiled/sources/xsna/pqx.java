package xsna;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class pqx implements gqx {
    public final jis b;

    public pqx(jis jisVar) {
        this.b = jisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqx) && epx.f(this.b, ((pqx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "UserSelected(friend=" + this.b + ')';
    }
}
