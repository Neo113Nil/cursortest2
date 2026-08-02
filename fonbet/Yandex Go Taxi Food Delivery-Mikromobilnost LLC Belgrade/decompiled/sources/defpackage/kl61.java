package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.z70;

@gsq0
/* loaded from: classes7.dex */
public final class kl61 {
    public static final ah61 Companion = new ah61();
    public static final i3y[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, z70.w), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public kl61(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (18 != (i & 18)) {
            qje.Z(i, 18, ou81.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl61)) {
            return false;
        }
        kl61 kl61Var = (kl61) obj;
        return jl40.l(this.a, kl61Var.a) && jl40.l(this.b, kl61Var.b) && jl40.l(this.c, kl61Var.c) && jl40.l(this.d, kl61Var.d) && jl40.l(this.e, kl61Var.e) && jl40.l(this.f, kl61Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = z2a1.a((str == null ? 0 : str.hashCode()) * 31, this.b);
        String str2 = this.c;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int c = unr0.c((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        String str4 = this.f;
        return c + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelMediationNetwork(id=", this.a, ", name=", this.b, ", logoUrl=");
        g8e.D(v, this.c, ", adapterStatus=", this.d, ", adapters=");
        return n.l(", latestAdapterVersion=", this.f, Extension.C_BRAKE, v, this.e);
    }
}
