package xsna;

import java.util.Set;
import kotlin.text.Regex;

/* compiled from: LinkFilter.kt */
/* loaded from: classes15.dex */
public final class f9z {
    public final Set<Regex> a;
    public final Set<String> b;
    public final Set<String> c;
    public final Set<String> d;
    public final Set<String> e;
    public final Set<Regex> f;
    public final bpn0 g;
    public final bpn0 h;

    public f9z() {
        this(null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9z)) {
            return false;
        }
        f9z f9zVar = (f9z) obj;
        return epx.f(this.a, f9zVar.a) && epx.f(this.b, f9zVar.b) && epx.f(this.c, f9zVar.c) && epx.f(this.d, f9zVar.d) && epx.f(this.e, f9zVar.e) && epx.f(this.f, f9zVar.f);
    }

    public final int hashCode() {
        Set<Regex> set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<String> set2 = this.b;
        int hashCode2 = (hashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set<String> set3 = this.c;
        int hashCode3 = (hashCode2 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set<String> set4 = this.d;
        int hashCode4 = (hashCode3 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Set<String> set5 = this.e;
        int hashCode5 = (hashCode4 + (set5 == null ? 0 : set5.hashCode())) * 961;
        Set<Regex> set6 = this.f;
        return hashCode5 + (set6 != null ? set6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkFilter(patterns=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.b);
        sb.append(", categories=");
        sb.append(this.c);
        sb.append(", schemes=");
        sb.append(this.d);
        sb.append(", hosts=");
        sb.append(this.e);
        sb.append(", mimeTypes=null, fullPatterns=");
        return ur.c(sb, this.f, ')');
    }

    public f9z(Set set, Set set2, Set set3, Set set4, Set set5, Set set6, int i) {
        set = (i & 1) != 0 ? null : set;
        set2 = (i & 2) != 0 ? null : set2;
        set3 = (i & 4) != 0 ? null : set3;
        set4 = (i & 8) != 0 ? null : set4;
        set5 = (i & 16) != 0 ? null : set5;
        set6 = (i & 64) != 0 ? null : set6;
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = set5;
        this.f = set6;
        this.g = new bpn0(new g4g(this, 28));
        this.h = new bpn0(new z0h(this, 27));
    }
}
