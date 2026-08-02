package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class cp50 implements h260 {
    public static final bp50 Companion = new bp50();
    public static final i3y[] h;
    public final yr50 a;
    public final pq50 b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final co50 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new rk50(13)), a.b(lazyThreadSafetyMode, new rk50(14)), null};
    }

    public /* synthetic */ cp50(int i, co50 co50Var, pq50 pq50Var, yr50 yr50Var, String str, String str2, List list, List list2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, ap50.a.getDescriptor());
            throw null;
        }
        this.a = yr50Var;
        this.b = pq50Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = co50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp50)) {
            return false;
        }
        cp50 cp50Var = (cp50) obj;
        return jl40.l(this.a, cp50Var.a) && jl40.l(this.b, cp50Var.b) && jl40.l(this.c, cp50Var.c) && jl40.l(this.d, cp50Var.d) && jl40.l(this.e, cp50Var.e) && jl40.l(this.f, cp50Var.f) && jl40.l(this.g, cp50Var.g);
    }

    @Override // defpackage.h260
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        co50 co50Var = this.g;
        return hashCode + (co50Var != null ? co50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkBoxWidgetGroupModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", widgetIds=" + this.e + ", templates=" + this.f + ", action=" + this.g + ')';
    }
}
