package defpackage;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class fx81 {
    public final String a;
    public final int b;
    public final Integer c;
    public final int d;

    public fx81(int i, int i2, int i3, Integer num, String str) {
        i = (i3 & 2) != 0 ? R$attr.debug_panel_label_primary : i;
        num = (i3 & 4) != 0 ? null : num;
        i2 = (i3 & 8) != 0 ? R$style.DebugPanelText_Body1 : i2;
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx81)) {
            return false;
        }
        fx81 fx81Var = (fx81) obj;
        return jl40.l(this.a, fx81Var.a) && this.b == fx81Var.b && jl40.l(this.c, fx81Var.c) && this.d == fx81Var.d;
    }

    public final int hashCode() {
        int b = fia1.b(this.b, this.a.hashCode() * 31);
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "DebugPanelTextWithIcon(text=", this.a, ", color=", ", icon=");
        u.append(this.c);
        u.append(", style=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
