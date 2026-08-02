package xsna;

import com.vkontakte.android.R;

/* compiled from: ActionItem.kt */
/* loaded from: classes3.dex */
public final class s10 {
    public final int a;
    public final int b;
    public final int c;
    public final od4 d;
    public final Integer e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ s10(int i, int i2, od4 od4Var) {
        this(i, i2, od4Var, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s10)) {
            return false;
        }
        s10 s10Var = (s10) obj;
        return this.a == s10Var.a && this.b == s10Var.b && this.c == s10Var.c && epx.f(this.d, s10Var.d) && epx.f(this.e, s10Var.e) && this.f == s10Var.f && this.g == s10Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.g) + qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(iconRes=");
        sb.append(this.a);
        sb.append(", iconColor=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", isDisabledState=");
        sb.append(this.f);
        sb.append(", isClickable=");
        return defpackage.q0.a(sb, this.g, ')');
    }

    public s10(int i, int i2, od4 od4Var, Integer num, boolean z) {
        this.a = i;
        this.b = R.attr.vk_ui_icon_accent_themed;
        this.c = i2;
        this.d = od4Var;
        this.e = num;
        this.f = z;
        this.g = true;
    }
}
