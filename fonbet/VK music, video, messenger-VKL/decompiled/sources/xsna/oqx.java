package xsna;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class oqx implements gqx {
    public final String b;

    public oqx(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqx) && epx.f(this.b, ((oqx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SearchInput(query="), this.b, ')');
    }
}
