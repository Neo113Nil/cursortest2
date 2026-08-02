package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class a4r0 extends kr {
    public static final z3r0 Companion = new z3r0();
    public final String a;

    public /* synthetic */ a4r0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, y3r0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a4r0.class == obj.getClass() && jl40.l(this.a, ((a4r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SetSelectedLoadMoreAction(selectedLoadMoreId=", this.a, Extension.C_BRAKE);
    }
}
