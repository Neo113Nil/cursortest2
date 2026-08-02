package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.t80;

@gsq0
/* loaded from: classes7.dex */
public final class al81 {
    public static final rh81 Companion = new rh81();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, t80.w)};
    public final String a;
    public final boolean b;
    public final List c;

    public al81(String str, List list, boolean z, int i) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, jb81.b);
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al81)) {
            return false;
        }
        al81 al81Var = (al81) obj;
        return jl40.l(this.a, al81Var.a) && this.b == al81Var.b && jl40.l(this.c, al81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(oo31.l("DebugPanelSdkData(version=", this.a, ", isIntegratedSuccess=", ", integrationMessages=", this.b), this.c, Extension.C_BRAKE);
    }

    public al81(boolean z, List list) {
        this.a = "8.0.0-beta.1";
        this.b = z;
        this.c = list;
    }
}
