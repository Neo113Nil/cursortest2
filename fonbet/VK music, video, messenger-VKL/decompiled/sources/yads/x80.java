package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;
import xsna.epx;
import xsna.xy6;

/* loaded from: classes10.dex */
public final class x80 {
    public final String a;
    public final int b;
    public final Integer c;
    public final int d;

    public x80(String str, int i, Integer num, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return epx.f(this.a, x80Var.a) && this.b == x80Var.b && epx.f(this.c, x80Var.c) && this.d == x80Var.d;
    }

    public final int hashCode() {
        int a = re3.a(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        Integer num = this.c;
        int i2 = this.d;
        StringBuilder b = xy6.b(i, "DebugPanelTextWithIcon(text=", str, ", color=", ", icon=");
        b.append(num);
        b.append(", style=");
        b.append(i2);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ x80(String str, int i, Integer num, int i2, int i3) {
        this(str, (i3 & 2) != 0 ? R$attr.debug_panel_label_primary : i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? R$style.DebugPanelText_Body1 : i2);
    }
}
