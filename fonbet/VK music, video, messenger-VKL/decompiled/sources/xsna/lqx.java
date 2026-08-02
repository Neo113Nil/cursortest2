package xsna;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class lqx implements gqx {
    public final String b;
    public final String c;

    public lqx(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqx)) {
            return false;
        }
        lqx lqxVar = (lqx) obj;
        return epx.f(this.b, lqxVar.b) && epx.f(this.c, lqxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadMoreSearchResults(query=");
        sb.append(this.b);
        sb.append(", startFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
