package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lru extends n351 {
    public final List c;
    public final l690 d;
    public final float e;
    public final x2s f;

    public lru(List list, l690 l690Var, float f, x2s x2sVar) {
        super("horizontal-stack", false, 14);
        this.c = list;
        this.d = l690Var;
        this.e = f;
        this.f = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lru)) {
            return false;
        }
        lru lruVar = (lru) obj;
        return jl40.l(this.c, lruVar.c) && this.d.equals(lruVar.d) && y7m.b(this.e, lruVar.e) && this.f.equals(lruVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + g8e.c(this.e, (this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "HorizontalStackModel(widgets=" + this.c + ", horizontalPaddings=" + this.d + ", spacingWidth=" + y7m.c(this.e) + ", onShownAnalyticsData=" + this.f + Extension.C_BRAKE;
    }
}
