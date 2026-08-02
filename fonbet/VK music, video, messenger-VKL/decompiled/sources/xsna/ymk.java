package xsna;

import java.util.Date;

/* compiled from: EasyPromoteState.kt */
/* loaded from: classes14.dex */
public final class ymk {
    public final k9x a;
    public final Date b;
    public final Long c;

    public ymk(k9x k9xVar, Date date, Long l) {
        this.a = k9xVar;
        this.b = date;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymk)) {
            return false;
        }
        ymk ymkVar = (ymk) obj;
        return epx.f(this.a, ymkVar.a) && epx.f(this.b, ymkVar.b) && epx.f(this.c, ymkVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomDateState(yearsRange=");
        sb.append(this.a);
        sb.append(", dateFrom=");
        sb.append(this.b);
        sb.append(", selectedDateMs=");
        return iq.b(sb, this.c, ')');
    }
}
