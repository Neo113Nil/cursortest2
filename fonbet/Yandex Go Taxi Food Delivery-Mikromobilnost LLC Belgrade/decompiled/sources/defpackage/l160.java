package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class l160 implements h260 {
    public static final k160 Companion = new k160();
    public static final i3y[] h;
    public final yr50 a;
    public final pq50 b;
    public final String c;
    public final String d;
    public final List e;
    public final co50 f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new ew50(17)), null, a.b(lazyThreadSafetyMode, new ew50(18))};
    }

    public /* synthetic */ l160(int i, co50 co50Var, pq50 pq50Var, yr50 yr50Var, String str, String str2, List list, List list2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, j160.a.getDescriptor());
            throw null;
        }
        this.a = yr50Var;
        this.b = pq50Var;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = co50Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l160)) {
            return false;
        }
        l160 l160Var = (l160) obj;
        return jl40.l(this.a, l160Var.a) && jl40.l(this.b, l160Var.b) && jl40.l(this.c, l160Var.c) && jl40.l(this.d, l160Var.d) && jl40.l(this.e, l160Var.e) && jl40.l(this.f, l160Var.f) && jl40.l(this.g, l160Var.g);
    }

    @Override // defpackage.h260
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        List list = this.e;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        co50 co50Var = this.f;
        int hashCode2 = (hashCode + (co50Var == null ? 0 : co50Var.hashCode())) * 31;
        List list2 = this.g;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkSwitchWidgetModel(displayRules=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", templates=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", textItems=");
        return unr0.t(sb, this.g, ')');
    }
}
