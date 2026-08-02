package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: TabbarSettingsBottomItem.kt */
/* loaded from: classes6.dex */
public final class uun0 {
    public final aqv a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final float g;
    public final gzo0 h;
    public final UserId i;

    public uun0(aqv aqvVar, String str, boolean z, boolean z2, boolean z3, String str2, float f, gzo0 gzo0Var, UserId userId) {
        this.a = aqvVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = f;
        this.h = gzo0Var;
        this.i = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uun0)) {
            return false;
        }
        uun0 uun0Var = (uun0) obj;
        return epx.f(this.a, uun0Var.a) && epx.f(this.b, uun0Var.b) && this.c == uun0Var.c && this.d == uun0Var.d && this.e == uun0Var.e && epx.f(this.f, uun0Var.f) && Float.compare(this.g, uun0Var.g) == 0 && epx.f(this.h, uun0Var.h) && epx.f(this.i, uun0Var.i);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (this.h.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.g, (b + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        UserId userId = this.i;
        return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarSettingsBottomItem(iconData=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isEmpty=");
        sb.append(this.c);
        sb.append(", isEditable=");
        sb.append(this.d);
        sb.append(", isSelected=");
        sb.append(this.e);
        sb.append(", animationUrl=");
        sb.append(this.f);
        sb.append(", animationSpeed=");
        sb.append(this.g);
        sb.append(", titleData=");
        sb.append(this.h);
        sb.append(", pinnedGroupId=");
        return gp.b(sb, this.i, ')');
    }
}
