package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class bsu {
    public static final asu Companion = new asu();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(2)), null, null, null, null};
    public final List a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public /* synthetic */ bsu(int i, List list, int i2, int i3, String str, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, zru.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsu)) {
            return false;
        }
        bsu bsuVar = (bsu) obj;
        return jl40.l(this.a, bsuVar.a) && this.b == bsuVar.b && this.c == bsuVar.c && jl40.l(this.d, bsuVar.d) && jl40.l(this.e, bsuVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostAppDto(fingerprints=");
        sb.append(this.a);
        sb.append(", minAmSdkVersion=");
        sb.append(this.b);
        sb.append(", minPaySdkVersion=");
        smw0.t(this.c, ", packageName=", this.d, ", redirectionStrategy=", sb);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
