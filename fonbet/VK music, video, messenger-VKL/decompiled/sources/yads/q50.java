package yads;

import com.yandex.mobile.ads.R$style;
import xsna.epx;
import xsna.h5s;
import xsna.xy6;

/* loaded from: classes10.dex */
public final class q50 {
    public final String a;
    public final int b;
    public final int c;

    public q50(int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return epx.f(this.a, q50Var.a) && this.b == q50Var.b && this.c == q50Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + re3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        return h5s.c(this.c, ")", xy6.b(this.b, "DebugPanelColoredText(text=", str, ", color=", ", style="));
    }

    public /* synthetic */ q50(String str, int i) {
        this(i, R$style.DebugPanelText_Body2, str);
    }
}
