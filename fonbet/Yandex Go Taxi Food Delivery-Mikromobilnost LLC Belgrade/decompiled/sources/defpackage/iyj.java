package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class iyj extends kr {
    public static final hyj Companion = new hyj();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new acj(8)), null};
    public final Boolean a;
    public final kr b;
    public final s9i0 c;

    public iyj(int i, Boolean bool, kr krVar, s9i0 s9i0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, gyj.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = krVar;
        }
        if ((i & 4) != 0) {
            this.c = s9i0Var;
        } else {
            s9i0.Companion.getClass();
            this.c = s9i0.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyj) || !iyj.class.equals(obj.getClass())) {
            return false;
        }
        iyj iyjVar = (iyj) obj;
        return jl40.l(this.a, iyjVar.a) && jl40.l(this.b, iyjVar.b) && jl40.l(this.c, iyjVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        kr krVar = this.b;
        return this.c.a.hashCode() + ((hashCode + (krVar != null ? krVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DismissAction(animated=" + this.a + ", completionAction=" + this.b + ", customProps=" + this.c + Extension.C_BRAKE;
    }
}
