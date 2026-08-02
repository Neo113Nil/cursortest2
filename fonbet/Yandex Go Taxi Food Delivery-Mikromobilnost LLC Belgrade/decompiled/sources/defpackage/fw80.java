package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class fw80 implements pw80 {
    public static final dw80 Companion = new dw80();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(1))};
    public final String a;
    public final Set b;

    public /* synthetic */ fw80(int i, String str, Set set) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, cw80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw80)) {
            return false;
        }
        fw80 fw80Var = (fw80) obj;
        return jl40.l(this.a, fw80Var.a) && jl40.l(this.b, fw80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateTargetsState(trackId=");
        sb.append(this.a);
        sb.append(", targets=");
        return qv10.s(sb, this.b, ')');
    }
}
