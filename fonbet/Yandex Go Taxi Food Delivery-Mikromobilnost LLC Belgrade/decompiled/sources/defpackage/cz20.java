package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class cz20 implements gz20 {
    public final wp2 a;
    public final sls b;
    public final boolean c;
    public final Integer d;

    public /* synthetic */ cz20(wp2 wp2Var, sls slsVar, boolean z, int i) {
        this((i & 1) != 0 ? AppColor$Palette.Fog : wp2Var, (i & 2) != 0 ? null : slsVar, (i & 4) != 0 ? true : z, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz20)) {
            return false;
        }
        cz20 cz20Var = (cz20) obj;
        return jl40.l(this.a, cz20Var.a) && jl40.l(this.b, cz20Var.b) && this.c == cz20Var.c && jl40.l(this.d, cz20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sls slsVar = this.b;
        int e = unr0.e((hashCode + (slsVar == null ? 0 : slsVar.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        return e + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Fullscreen(bgColor=" + this.a + ", outsideTouchCallback=" + this.b + ", defaultInsetHandle=" + this.c + ", accessibilityOutsideTouchActionLabel=" + this.d + Extension.C_BRAKE;
    }

    public cz20(wp2 wp2Var, sls slsVar, boolean z, Integer num) {
        this.a = wp2Var;
        this.b = slsVar;
        this.c = z;
        this.d = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cz20() {
        this((wp2) null, (sls) (0 == true ? 1 : 0), false, 15);
    }
}
