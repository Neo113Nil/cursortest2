package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ooe0 extends kr {
    public static final noe0 Companion = new noe0();
    public static final i3y[] e;
    public final u1m a;
    public final ywl b;
    public final Double c;
    public final String d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new jee0(18)), a.b(lazyThreadSafetyMode, new jee0(19)), null, null};
    }

    public /* synthetic */ ooe0(int i, u1m u1mVar, ywl ywlVar, Double d, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, moe0.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ywlVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ooe0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ooe0 ooe0Var = (ooe0) obj;
        return jl40.l(this.a, ooe0Var.a) && jl40.l(this.b, ooe0Var.b) && jl40.i(this.c, ooe0Var.c) && jl40.l(this.d, ooe0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ywl ywlVar = this.b;
        int hashCode2 = (hashCode + (ywlVar != null ? ywlVar.hashCode() : 0)) * 31;
        Double d = this.c;
        int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PreloadAction(query=" + this.a + ", document=" + this.b + ", timeToLive=" + this.c + ", tag=" + this.d + Extension.C_BRAKE;
    }
}
