package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class kxy {
    public static final jxy Companion = new jxy();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new wky(20))};
    public final String a;
    public final hlk b;

    public /* synthetic */ kxy(int i, String str, hlk hlkVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ixy.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = hlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxy)) {
            return false;
        }
        kxy kxyVar = (kxy) obj;
        return jl40.l(this.a, kxyVar.a) && jl40.l(this.b, kxyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadStartedAction(url=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
