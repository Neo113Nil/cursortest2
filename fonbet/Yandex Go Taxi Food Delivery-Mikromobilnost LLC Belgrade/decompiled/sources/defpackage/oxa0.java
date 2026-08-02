package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oxa0 {
    public final Long a;
    public final Long b;
    public final List c;

    public oxa0(Long l, Long l2, List list) {
        this.a = l;
        this.b = l2;
        this.c = list;
    }

    public final List a() {
        return this.c;
    }

    public final Long b() {
        return this.b;
    }

    public final Long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxa0)) {
            return false;
        }
        oxa0 oxa0Var = (oxa0) obj;
        return jl40.l(this.a, oxa0Var.a) && jl40.l(this.b, oxa0Var.b) && this.c.equals(oxa0Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return this.c.hashCode() + ((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformerSearch(startTime=");
        sb.append(this.a);
        sb.append(", estimateMs=");
        sb.append(this.b);
        sb.append(", dynamicSearchStatuses=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
