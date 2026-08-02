package xsna;

import com.vkontakte.android.R;

/* compiled from: AudioBookPersonActionItem.kt */
/* loaded from: classes3.dex */
public final class vh4 {
    public final int a;
    public final int b;
    public final uh4 c;

    public vh4(int i, int i2, uh4 uh4Var) {
        this.a = i;
        this.b = i2;
        this.c = uh4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh4)) {
            return false;
        }
        vh4 vh4Var = (vh4) obj;
        return this.a == vh4Var.a && this.b == vh4Var.b && epx.f(this.c, vh4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, shy.a(R.attr.vk_ui_icon_accent, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AudioBookPersonActionItem(iconRes=" + this.a + ", iconColor=2130971803, title=" + this.b + ", action=" + this.c + ')';
    }
}
