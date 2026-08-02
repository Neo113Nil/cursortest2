package xsna;

import com.vkontakte.android.R;

/* compiled from: SublistStyleParams.kt */
/* loaded from: classes18.dex */
public final class hum0 {
    public static final hum0 c = new hum0(R.drawable.vk_icon_message_outline_24, R.drawable.gradient_gray);
    public final int a;
    public final int b;

    public hum0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hum0)) {
            return false;
        }
        hum0 hum0Var = (hum0) obj;
        return this.a == hum0Var.a && this.b == hum0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SublistStyleParams(icon=");
        sb.append(this.a);
        sb.append(", background=");
        return vu5.b(sb, this.b, ')');
    }
}
