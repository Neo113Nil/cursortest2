package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class p8r {
    public static final o8r Companion = new o8r();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(2)), null};
    public final int a;
    public final List b;
    public final int c;

    public /* synthetic */ p8r(int i, int i2, int i3, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, n8r.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = list;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8r)) {
            return false;
        }
        p8r p8rVar = (p8r) obj;
        return this.a == p8rVar.a && jl40.l(this.b, p8rVar.b) && this.c == p8rVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FingerprintCurrentActivity(duration=");
        sb.append(this.a);
        sb.append(", values=");
        sb.append(this.b);
        sb.append(", confidence=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
