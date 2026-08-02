package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class eu80 implements pw80 {
    public static final au80 Companion = new au80();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(20))};
    public final String a;
    public final List b;

    public /* synthetic */ eu80(int i, String str, List list) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, zt80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu80)) {
            return false;
        }
        eu80 eu80Var = (eu80) obj;
        return jl40.l(this.a, eu80Var.a) && jl40.l(this.b, eu80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenStoriesList(trackId=");
        sb.append(this.a);
        sb.append(", urls=");
        return unr0.t(sb, this.b, ')');
    }
}
