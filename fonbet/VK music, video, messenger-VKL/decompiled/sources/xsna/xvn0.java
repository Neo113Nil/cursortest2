package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: TabbarSettingsMainItem.kt */
/* loaded from: classes6.dex */
public final class xvn0 {
    public final String a;
    public final gzo0 b;
    public final aqv c;
    public final boolean d;
    public final boolean e;
    public final UserId f;

    public xvn0(String str, gzo0 gzo0Var, aqv aqvVar, boolean z, boolean z2, UserId userId) {
        this.a = str;
        this.b = gzo0Var;
        this.c = aqvVar;
        this.d = z;
        this.e = z2;
        this.f = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvn0)) {
            return false;
        }
        xvn0 xvn0Var = (xvn0) obj;
        return epx.f(this.a, xvn0Var.a) && this.b.equals(xvn0Var.b) && this.c.equals(xvn0Var.c) && this.d == xvn0Var.d && this.e == xvn0Var.e && epx.f(this.f, xvn0Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        UserId userId = this.f;
        return b + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarSettingsMainItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", iconData=");
        sb.append(this.c);
        sb.append(", isEmpty=");
        sb.append(this.d);
        sb.append(", isChosen=");
        sb.append(this.e);
        sb.append(", pinnedGroupId=");
        return gp.b(sb, this.f, ')');
    }
}
