package xsna;

import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: TopBarViewState.kt */
/* loaded from: classes16.dex */
public final class d8p0 {
    public static final d8p0 d = new d8p0("", EmptySet.b, true);
    public final String a;
    public final Set b;
    public final boolean c;

    public d8p0(String str, Set set, boolean z) {
        this.a = str;
        this.b = set;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8p0)) {
            return false;
        }
        d8p0 d8p0Var = (d8p0) obj;
        return epx.f(this.a, d8p0Var.a) && epx.f(this.b, d8p0Var.b) && this.c == d8p0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fw3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarViewState(query=");
        sb.append(this.a);
        sb.append(", selected=");
        sb.append((Object) ipw.a(this.b));
        sb.append(", isTopBarHideable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
