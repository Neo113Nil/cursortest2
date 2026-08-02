package xsna;

import java.util.List;

/* compiled from: PrivacyBestFriendInfo.kt */
/* loaded from: classes4.dex */
public final class lcd0 {
    public final int a;
    public final List<String> b;
    public final List<String> c;

    public lcd0(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcd0)) {
            return false;
        }
        lcd0 lcd0Var = (lcd0) obj;
        return this.a == lcd0Var.a && epx.f(this.b, lcd0Var.b) && epx.f(this.c, lcd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyBestFriendInfo(count=");
        sb.append(this.a);
        sb.append(", avatars=");
        sb.append(this.b);
        sb.append(", names=");
        return ms9.a(')', sb, this.c);
    }
}
