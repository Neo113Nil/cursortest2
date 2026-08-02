package xsna;

/* compiled from: PostsFromNotificationsMviState.kt */
/* loaded from: classes4.dex */
public final class uvc0 implements tw60<uvc0> {
    public final ur60 b;
    public final String c;

    public uvc0(String str, ur60 ur60Var) {
        this.b = ur60Var;
        this.c = str;
    }

    @Override // xsna.tw60
    public final uvc0 b(ur60 ur60Var) {
        return new uvc0(this.c, ur60Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvc0)) {
            return false;
        }
        uvc0 uvc0Var = (uvc0) obj;
        return epx.f(this.b, uvc0Var.b) && epx.f(this.c, uvc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostsFromNotificationsMviState(listState=");
        sb.append(this.b);
        sb.append(", scrollToPost=");
        return ho8.a(sb, this.c, ')');
    }
}
