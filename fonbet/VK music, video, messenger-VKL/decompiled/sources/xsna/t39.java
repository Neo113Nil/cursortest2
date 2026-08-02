package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CallFromUserItem.kt */
/* loaded from: classes7.dex */
public final class t39 implements hfz {
    public final UserId b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public t39(UserId userId, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t39)) {
            return false;
        }
        t39 t39Var = (t39) obj;
        return epx.f(this.b, t39Var.b) && epx.f(this.c, t39Var.c) && epx.f(this.d, t39Var.d) && this.e == t39Var.e && this.f == t39Var.f && this.g == t39Var.g;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(Long.hashCode(this.b.b));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallFromUserItem(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", imgSrc=");
        sb.append(this.d);
        sb.append(", imageIsNft=");
        sb.append(this.e);
        sb.append(", isGroup=");
        sb.append(this.f);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
