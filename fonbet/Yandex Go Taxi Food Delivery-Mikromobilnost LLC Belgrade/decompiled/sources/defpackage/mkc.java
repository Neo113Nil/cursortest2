package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class mkc {
    public static final lkc Companion = new lkc();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(17))};
    public final String a;
    public final png b;

    public /* synthetic */ mkc(int i, String str, png pngVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, kkc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkc)) {
            return false;
        }
        mkc mkcVar = (mkc) obj;
        return jl40.l(this.a, mkcVar.a) && jl40.l(this.b, mkcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(directiveName=" + this.a + ", directiveData=" + this.b + Extension.C_BRAKE;
    }

    public mkc(String str, png pngVar) {
        this.a = str;
        this.b = pngVar;
    }
}
