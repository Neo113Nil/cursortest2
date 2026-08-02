package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class klc0 {
    public final ArrayList a;
    public final List b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public klc0(ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = arrayList;
        this.b = list;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.g = arrayList6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klc0)) {
            return false;
        }
        klc0 klc0Var = (klc0) obj;
        return this.a.equals(klc0Var.a) && jl40.l(this.b, klc0Var.b) && this.c.equals(klc0Var.c) && this.d.equals(klc0Var.d) && this.e.equals(klc0Var.e) && this.f.equals(klc0Var.f) && this.g.equals(klc0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return this.g.hashCode() + ly3.b(ly3.b(ly3.b(ly3.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueDefinitions(widgets=");
        sb.append(this.a);
        sb.append(", widgetGroups=");
        sb.append(this.b);
        sb.append(", widgetsLevels=");
        sb.append(this.c);
        sb.append(", plaques=");
        sb.append(this.d);
        sb.append(", prefetchPlaqueList=");
        sb.append(this.e);
        sb.append(", defaultPlaqueList=");
        sb.append(this.f);
        sb.append(", fallbackPlaqueList=");
        return smw0.m(sb, this.g, ')');
    }
}
