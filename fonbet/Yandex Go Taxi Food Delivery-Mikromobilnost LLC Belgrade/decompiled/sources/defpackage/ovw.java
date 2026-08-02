package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ovw extends kr {
    public static final nvw Companion = new nvw();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(19))};
    public final String a;
    public final Map b;

    public /* synthetic */ ovw(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, mvw.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ovw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ovw ovwVar = (ovw) obj;
        return jl40.l(this.a, ovwVar.a) && jl40.l(this.b, ovwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("InvalidateCacheAction(path='", this.a, "', queryItems=", Extension.C_BRAKE, this.b);
    }
}
