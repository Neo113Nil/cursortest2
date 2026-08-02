package xsna;

/* compiled from: NotificationMenuSource.kt */
/* loaded from: classes4.dex */
public final class ee70 {
    public final Long a;
    public final tlo0 b;
    public final String c;
    public final int d;

    public ee70(Long l, tlo0 tlo0Var, String str, int i) {
        this.a = l;
        this.b = tlo0Var;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee70)) {
            return false;
        }
        ee70 ee70Var = (ee70) obj;
        return epx.f(this.a, ee70Var.a) && epx.f(this.b, ee70Var.b) && epx.f(this.c, ee70Var.c) && this.d == ee70Var.d;
    }

    public final int hashCode() {
        Long l = this.a;
        return Integer.hashCode(this.d) + urd0.a(com.vk.movika.sdk.base.model.history.b.a((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationMenuSource(groupId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", counter=");
        return vu5.b(sb, this.d, ')');
    }
}
