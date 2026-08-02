package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class bgy extends kr {
    public static final agy Companion = new agy();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new vix(24)), null, null};
    public final kr a;
    public final int b;
    public final String c;

    public /* synthetic */ bgy(int i, kr krVar, int i2, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, zfy.a.getDescriptor());
            throw null;
        }
        this.a = krVar;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bgy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        bgy bgyVar = (bgy) obj;
        return jl40.l(this.a, bgyVar.a) && this.b == bgyVar.b && jl40.l(this.c, bgyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimiterAction(wrappedAction=");
        sb.append(this.a);
        sb.append(", maxLimit=");
        sb.append(this.b);
        sb.append(", actionId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
