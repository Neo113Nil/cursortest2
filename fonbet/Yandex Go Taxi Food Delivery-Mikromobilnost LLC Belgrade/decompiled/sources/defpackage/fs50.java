package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class fs50 implements pq50 {
    public static final es50 Companion = new es50();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(24))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ fs50(String str, int i, String str2, String str3, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ds50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs50)) {
            return false;
        }
        fs50 fs50Var = (fs50) obj;
        return jl40.l(this.a, fs50Var.a) && jl40.l(this.b, fs50Var.b) && jl40.l(this.c, fs50Var.c) && jl40.l(this.d, fs50Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkEnabledContentDescriptionModel(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", templates=");
        return unr0.t(sb, this.d, ')');
    }
}
