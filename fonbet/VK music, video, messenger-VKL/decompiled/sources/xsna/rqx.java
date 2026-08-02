package xsna;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class rqx implements gqx {
    public final String b;

    public rqx(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqx) && epx.f(this.b, ((rqx) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VoiceSearchRecognized(query="), this.b, ')');
    }
}
