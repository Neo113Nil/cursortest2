package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class iyd extends kr {
    public static final gyd Companion = new gyd();
    public static final i3y[] c;
    public final v5x a;
    public final kr b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new kpd(17)), a.b(lazyThreadSafetyMode, new kpd(19))};
    }

    public /* synthetic */ iyd(int i, v5x v5xVar, kr krVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, eyd.a.getDescriptor());
            throw null;
        }
        this.a = v5xVar;
        this.b = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iyd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        iyd iydVar = (iyd) obj;
        return jl40.l(this.a, iydVar.a) && jl40.l(this.b, iydVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConditionalAction(condition=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
