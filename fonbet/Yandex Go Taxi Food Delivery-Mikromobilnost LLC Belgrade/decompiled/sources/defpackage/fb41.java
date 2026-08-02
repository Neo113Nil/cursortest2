package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class fb41 {
    public static final eb41 Companion = new eb41();
    public static final i3y[] j = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new b931(27)), null, null, null, null};
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final List e;
    public final String f;
    public final yb41 g;
    public final ec41 h;
    public final pb41 i;

    public /* synthetic */ fb41(int i, String str, String str2, boolean z, String str3, List list, String str4, yb41 yb41Var, ec41 ec41Var, pb41 pb41Var) {
        if (26 != (i & 26)) {
            qje.Z(i, 26, db41.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        this.d = str3;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = "back";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = yb41Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = ec41Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = pb41Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb41)) {
            return false;
        }
        fb41 fb41Var = (fb41) obj;
        return jl40.l(this.a, fb41Var.a) && jl40.l(this.b, fb41Var.b) && this.c == fb41Var.c && jl40.l(this.d, fb41Var.d) && jl40.l(this.e, fb41Var.e) && jl40.l(this.f, fb41Var.f) && jl40.l(this.g, fb41Var.g) && jl40.l(this.h, fb41Var.h) && jl40.l(this.i, fb41Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b(unr0.c(unr0.b(unr0.e(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        yb41 yb41Var = this.g;
        int hashCode = (b + (yb41Var == null ? 0 : yb41Var.hashCode())) * 31;
        ec41 ec41Var = this.h;
        int hashCode2 = (hashCode + (ec41Var == null ? 0 : ec41Var.hashCode())) * 31;
        pb41 pb41Var = this.i;
        return hashCode2 + (pb41Var != null ? pb41Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CameraStep(title=", this.a, ", photoClass=", this.b, ", showOverlay=");
        unr0.A(", orientation=", this.d, ", availableControls=", v, this.c);
        oyr.D(", camera=", this.f, ", overlayConfig=", v, this.e);
        v.append(this.g);
        v.append(", selfTimer=");
        v.append(this.h);
        v.append(", exposure=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
