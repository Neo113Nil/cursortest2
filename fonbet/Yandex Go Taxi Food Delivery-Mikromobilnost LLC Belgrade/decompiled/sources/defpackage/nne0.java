package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class nne0 extends kr {
    public static final mne0 Companion = new mne0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(17)), null, null};
    public final u1m a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ nne0(int i, u1m u1mVar, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, lne0.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nne0) || !nne0.class.equals(obj.getClass())) {
            return false;
        }
        nne0 nne0Var = (nne0) obj;
        return jl40.l(this.a, nne0Var.a) && this.b == nne0Var.b && this.c == nne0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrefetchDocumentAction(query=");
        sb.append(this.a);
        sb.append(", force=");
        sb.append(this.b);
        sb.append(", useCache=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public nne0(u1m u1mVar) {
        this.a = u1mVar;
        this.b = false;
        this.c = false;
    }
}
