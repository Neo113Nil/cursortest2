package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class q2h extends kr {
    public static final p2h Companion = new p2h();
    public final String a;

    public /* synthetic */ q2h(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, o2h.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2h) && jl40.l(this.a, ((q2h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DeeplinkNavigationAction(link=", this.a, Extension.C_BRAKE);
    }
}
