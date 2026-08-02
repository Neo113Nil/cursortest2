package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j9y {
    public final String a;
    public final Integer b;
    public final MapBuilder c;

    public j9y(String str, Integer num) {
        this.a = str;
        this.b = num;
        MapBuilder y = qv10.y("text", str);
        if (num != null) {
            y.put("editOpCount", num);
        }
        this.c = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9y)) {
            return false;
        }
        j9y j9yVar = (j9y) obj;
        return jl40.l(this.a, j9yVar.a) && jl40.l(this.b, j9yVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "LegacySuggestSearchFilter(text=" + this.a + ", editOpCount=" + this.b + Extension.C_BRAKE;
    }
}
