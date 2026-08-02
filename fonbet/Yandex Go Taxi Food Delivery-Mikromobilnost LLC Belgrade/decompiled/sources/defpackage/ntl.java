package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ntl {
    public static final mtl Companion = new mtl();
    public static final i3y[] c;
    public final tg2 a;
    public final tg2 b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new acj(17)), a.b(lazyThreadSafetyMode, new acj(18))};
    }

    public /* synthetic */ ntl(int i, tg2 tg2Var, tg2 tg2Var2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ltl.a.getDescriptor());
            throw null;
        }
        this.a = tg2Var;
        this.b = tg2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntl)) {
            return false;
        }
        ntl ntlVar = (ntl) obj;
        return jl40.l(this.a, ntlVar.a) && jl40.l(this.b, ntlVar.b);
    }

    public final int hashCode() {
        tg2 tg2Var = this.a;
        int hashCode = (tg2Var == null ? 0 : tg2Var.hashCode()) * 31;
        tg2 tg2Var2 = this.b;
        return hashCode + (tg2Var2 != null ? tg2Var2.hashCode() : 0);
    }

    public final String toString() {
        return "Animations(onShow=" + this.a + ", onRefresh=" + this.b + Extension.C_BRAKE;
    }
}
