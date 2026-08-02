package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class kui0 extends kr {
    public static final iui0 Companion = new iui0();
    public static final i3y[] c;
    public final hx a;
    public final kr b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new vci0(6)), a.b(lazyThreadSafetyMode, new vci0(7))};
    }

    public /* synthetic */ kui0(int i, hx hxVar, kr krVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, hui0.a.getDescriptor());
            throw null;
        }
        this.a = hxVar;
        this.b = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kui0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kui0 kui0Var = (kui0) obj;
        return jl40.l(this.a, kui0Var.a) && jl40.l(this.b, kui0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kr krVar = this.b;
        return hashCode + (krVar != null ? krVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteAction(query=" + this.a + ", fallback=" + this.b + Extension.C_BRAKE;
    }

    public kui0(hx hxVar) {
        this.a = hxVar;
        this.b = null;
    }
}
