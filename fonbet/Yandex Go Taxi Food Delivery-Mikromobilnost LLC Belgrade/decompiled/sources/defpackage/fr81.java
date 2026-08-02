package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.v30;

@gsq0
/* loaded from: classes7.dex */
public final class fr81 {
    public static final vn81 Companion = new vn81();
    public static final i3y[] f = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, v30.w), null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public fr81(int i, String str, String str2, String str3, String str4, List list) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, hh81.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr81)) {
            return false;
        }
        fr81 fr81Var = (fr81) obj;
        return jl40.l(this.a, fr81Var.a) && jl40.l(this.b, fr81Var.b) && jl40.l(this.c, fr81Var.c) && jl40.l(this.d, fr81Var.d) && jl40.l(this.e, fr81Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c(z2a1.a((str == null ? 0 : str.hashCode()) * 31, this.b), 31, this.c);
        String str2 = this.d;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAdUnitBiddingMediation(adapter=", this.a, ", networkName=", this.b, ", biddingParameters=");
        oyr.D(", adUnitId=", this.d, ", networkAdUnitIdName=", v, this.c);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
