package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class i2u {
    public final g2u a;
    public final ArrayList b;
    public final f2u c;
    public final h2u d;

    public i2u(g2u g2uVar, ArrayList arrayList, f2u f2uVar, h2u h2uVar) {
        this.a = g2uVar;
        this.b = arrayList;
        this.c = f2uVar;
        this.d = h2uVar;
    }

    public final List a() {
        return this.b;
    }

    public final f2u b() {
        return this.c;
    }

    public final g2u c() {
        return this.a;
    }

    public final h2u d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2u)) {
            return false;
        }
        i2u i2uVar = (i2u) obj;
        return this.a.equals(i2uVar.a) && this.b.equals(i2uVar.b) && this.c.equals(i2uVar.c) && this.d.equals(i2uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "GroupDisplayRules(indentRules=" + this.a + ", backgroundColorSettings=" + this.b + ", backgroundShapeSettings=" + this.c + ", width=" + this.d + ')';
    }
}
