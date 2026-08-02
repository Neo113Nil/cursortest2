package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class k060 implements co50 {
    public static final j060 Companion = new j060();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(12))};
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public /* synthetic */ k060(Map map, String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, i060.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k060)) {
            return false;
        }
        k060 k060Var = (k060) obj;
        return jl40.l(this.a, k060Var.a) && jl40.l(this.b, k060Var.b) && jl40.l(this.c, k060Var.c) && jl40.l(this.d, k060Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Map map = this.d;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkServiceSpecificActionModel(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", specificType=");
        sb.append(this.c);
        sb.append(", params=");
        return smw0.n(sb, this.d, ')');
    }
}
