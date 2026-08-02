package xsna;

import com.vkontakte.android.R;

/* compiled from: ActionItem.kt */
/* loaded from: classes2.dex */
public final class r10 implements hfz {
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final Integer f;

    public r10(int i, int i2, int i3, Integer num, Integer num2) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r10)) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return this.b == r10Var.b && this.c == r10Var.c && this.d == r10Var.d && epx.f(this.e, r10Var.e) && epx.f(this.f, r10Var.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(nameRes=");
        sb.append(this.b);
        sb.append(", iconRes=");
        sb.append(this.c);
        sb.append(", dialogActionIndex=");
        sb.append(this.d);
        sb.append(", iconColor=");
        sb.append(this.e);
        sb.append(", textColor=");
        return uqi.b(sb, this.f, ')');
    }

    public /* synthetic */ r10(int i, int i2, int i3, Integer num, int i4) {
        this(i, i2, i3, (i4 & 8) != 0 ? Integer.valueOf(R.attr.vk_ui_icon_accent) : num, (Integer) null);
    }
}
