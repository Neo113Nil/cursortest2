package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e2e {
    public final String a;
    public final String b;
    public final d2e c;
    public final y1e d;
    public final List e;
    public final ArrayList f;

    public e2e(String str, String str2, d2e d2eVar, y1e y1eVar, List list, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = d2eVar;
        this.d = y1eVar;
        this.e = list;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2e)) {
            return false;
        }
        e2e e2eVar = (e2e) obj;
        return this.a.equals(e2eVar.a) && this.b.equals(e2eVar.b) && jl40.l(this.c, e2eVar.c) && jl40.l(this.d, e2eVar.d) && jl40.l(this.e, e2eVar.e) && this.f.equals(e2eVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        d2e d2eVar = this.c;
        int hashCode = (b + (d2eVar == null ? 0 : d2eVar.a.hashCode())) * 31;
        y1e y1eVar = this.d;
        int hashCode2 = (hashCode + (y1eVar == null ? 0 : y1eVar.hashCode())) * 31;
        List list = this.e;
        return this.f.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigurationShortcutFragment(name=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", textStyle=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", commonOverlays=");
        sb.append(this.e);
        sb.append(", actions=");
        return smw0.m(sb, this.f, ')');
    }
}
