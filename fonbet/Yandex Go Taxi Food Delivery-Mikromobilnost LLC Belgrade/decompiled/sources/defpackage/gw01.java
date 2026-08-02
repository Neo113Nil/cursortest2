package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgw01;", "", "Companion", "ew01", "fw01", "flex-animation-generic_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class gw01 {
    public static final fw01 Companion = new fw01();
    public final yy01 a;
    public final ykm0 b;
    public final axk0 c;

    public /* synthetic */ gw01(int i, yy01 yy01Var, ykm0 ykm0Var, axk0 axk0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = yy01Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ykm0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = axk0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gw01.class != obj.getClass()) {
            return false;
        }
        gw01 gw01Var = (gw01) obj;
        return jl40.l(this.a, gw01Var.a) && jl40.l(this.b, gw01Var.b) && jl40.l(this.c, gw01Var.c);
    }

    public final int hashCode() {
        yy01 yy01Var = this.a;
        int hashCode = (yy01Var != null ? yy01Var.hashCode() : 0) * 31;
        ykm0 ykm0Var = this.b;
        int hashCode2 = (hashCode + (ykm0Var != null ? ykm0Var.hashCode() : 0)) * 31;
        axk0 axk0Var = this.c;
        return hashCode2 + (axk0Var != null ? axk0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransformAnimationSettings(translation=" + this.a + ", scale=" + this.b + ", rotation=" + this.c + Extension.C_BRAKE;
    }

    public gw01() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
