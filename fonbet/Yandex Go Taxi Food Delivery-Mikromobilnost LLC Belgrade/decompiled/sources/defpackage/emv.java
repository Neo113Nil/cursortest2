package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@jxi
@gsq0
/* loaded from: classes2.dex */
public final class emv implements gov {
    public static final dmv Companion = new dmv();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new syu(23)), null};
    public final String a;
    public final List b;
    public final boolean c;

    public /* synthetic */ emv(String str, List list, boolean z, int i) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, cmv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emv)) {
            return false;
        }
        emv emvVar = (emv) obj;
        return jl40.l(this.a, emvVar.a) && jl40.l(this.b, emvVar.b) && this.c == emvVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetProductsResponse(trackId=");
        sb.append(this.a);
        sb.append(", products=");
        sb.append(this.b);
        sb.append(", error=");
        return unr0.u(sb, this.c, ')');
    }
}
