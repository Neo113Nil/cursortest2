package xsna;

import java.util.Map;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: KnetInitConfig.kt */
/* loaded from: classes.dex */
public final class aky {
    public static final Set<Regex> f = rl3.y0(new Regex[]{new Regex(".*oauth.*"), new Regex(".*/(im\\d+|nim\\d+|uim\\d+|ruim\\d+)")});
    public final Object a;
    public final Set<Regex> b;
    public final Set<Regex> c;
    public final yek d;
    public final int e;

    public aky(Map<Regex, String> map, Set<Regex> set, Set<Regex> set2, yek yekVar, int i) {
        this.a = map;
        this.b = set;
        this.c = set2;
        this.d = yekVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aky)) {
            return false;
        }
        aky akyVar = (aky) obj;
        return this.a.equals(akyVar.a) && epx.f(this.b, akyVar.b) && epx.f(this.c, akyVar.c) && epx.f(this.d, akyVar.d) && this.e == akyVar.e;
    }

    public final int hashCode() {
        int b = fw3.b(fw3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        yek yekVar = this.d;
        return Integer.hashCode(this.e) + ((b + (yekVar == null ? 0 : yekVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KnetInitConfig(hosts=");
        sb.append(this.a);
        sb.append(", ignore=");
        sb.append(this.b);
        sb.append(", alternativeHost=");
        sb.append(this.c);
        sb.append(", quicOptions=");
        sb.append(this.d);
        sb.append(", version=");
        return vu5.b(sb, this.e, ')');
    }
}
