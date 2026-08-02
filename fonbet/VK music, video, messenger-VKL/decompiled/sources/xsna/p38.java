package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: BottomActionItem.kt */
/* loaded from: classes6.dex */
public final class p38 {
    public final bqv a;
    public final String b;
    public final UserId c;
    public final gzs<s3q0> d;

    public p38(bqv bqvVar, String str, UserId userId, gzs<s3q0> gzsVar) {
        this.a = bqvVar;
        this.b = str;
        this.c = userId;
        this.d = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p38)) {
            return false;
        }
        p38 p38Var = (p38) obj;
        return epx.f(this.a, p38Var.a) && epx.f(this.b, p38Var.b) && epx.f(this.c, p38Var.c) && epx.f(this.d, p38Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        UserId userId = this.c;
        return this.d.hashCode() + ((a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomActionItem(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", groupId=");
        sb.append(this.c);
        sb.append(", clickAction=");
        return uf3.d(sb, this.d, ')');
    }
}
