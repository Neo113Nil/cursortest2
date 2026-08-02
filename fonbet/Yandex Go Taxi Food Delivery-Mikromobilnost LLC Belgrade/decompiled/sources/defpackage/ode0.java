package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lode0;", "Lsde0;", "Companion", "mde0", "nde0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ode0 extends sde0 {
    public static final nde0 Companion = new nde0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ode0(String str, String str2, String str3, String str4, int i, String str5) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ode0)) {
            return false;
        }
        ode0 ode0Var = (ode0) obj;
        return jl40.l(this.a, ode0Var.a) && jl40.l(this.b, ode0Var.b) && jl40.l(this.c, ode0Var.c) && jl40.l(this.d, ode0Var.d) && jl40.l(this.e, ode0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChooseAddress(bubbleText=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", skipButtonText=", this.d, ", otherText=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public ode0() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }
}
