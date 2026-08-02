package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: TabbarSettingsItem.kt */
/* loaded from: classes6.dex */
public final class wvn0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final UserId f;

    public wvn0(UserId userId, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = userId;
    }

    public static wvn0 a(wvn0 wvn0Var, UserId userId) {
        return new wvn0(userId, wvn0Var.a, wvn0Var.b, wvn0Var.d, wvn0Var.e, wvn0Var.c);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvn0)) {
            return false;
        }
        wvn0 wvn0Var = (wvn0) obj;
        return epx.f(this.a, wvn0Var.a) && epx.f(this.b, wvn0Var.b) && this.c == wvn0Var.c && epx.f(this.d, wvn0Var.d) && epx.f(this.e, wvn0Var.e) && epx.f(this.f, wvn0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.f;
        return hashCode3 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarSettingsItem(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isEditable=");
        sb.append(this.c);
        sb.append(", animationChange=");
        sb.append(this.d);
        sb.append(", animationSelect=");
        sb.append(this.e);
        sb.append(", pinnedGroupId=");
        return gp.b(sb, this.f, ')');
    }
}
