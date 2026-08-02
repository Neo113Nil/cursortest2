package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k1u extends n351 {
    public final List c;
    public final float d;
    public final float e;
    public final n1u f;
    public final l690 g;
    public final x2s h;

    public k1u(List list, float f, float f2, n1u n1uVar, l690 l690Var, x2s x2sVar) {
        super("grid-layout", false, 14);
        this.c = list;
        this.d = f;
        this.e = f2;
        this.f = n1uVar;
        this.g = l690Var;
        this.h = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1u)) {
            return false;
        }
        k1u k1uVar = (k1u) obj;
        return jl40.l(this.c, k1uVar.c) && y7m.b(this.d, k1uVar.d) && y7m.b(this.e, k1uVar.e) && this.f.equals(k1uVar.f) && this.g.equals(k1uVar.g) && this.h.equals(k1uVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + g8e.c(this.e, g8e.c(this.d, this.c.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.d);
        String c2 = y7m.c(this.e);
        StringBuilder s = xvz.s("GridLayoutModel(items=", this.c, ", lineSpacing=", c, ", columnSpacing=");
        s.append(c2);
        s.append(", size=");
        s.append(this.f);
        s.append(", paddings=");
        s.append(this.g);
        s.append(", onShownAnalyticsData=");
        s.append(this.h);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
