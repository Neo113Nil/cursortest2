package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class cv8 implements uni {
    public final t4s a;
    public final a6s b;
    public final boolean c;
    public final zi8 w;
    public final Integer x;
    public final Map y;

    public cv8(t4s t4sVar, a6s a6sVar, boolean z, zi8 zi8Var, Integer num, Map map) {
        this.a = t4sVar;
        this.b = a6sVar;
        this.c = z;
        this.w = zi8Var;
        this.x = num;
        this.y = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv8)) {
            return false;
        }
        cv8 cv8Var = (cv8) obj;
        return jl40.l(this.a, cv8Var.a) && jl40.l(this.b, cv8Var.b) && this.c == cv8Var.c && jl40.l(this.w, cv8Var.w) && jl40.l(this.x, cv8Var.x) && jl40.l(this.y, cv8Var.y);
    }

    public final int hashCode() {
        t4s t4sVar = this.a;
        int hashCode = (t4sVar == null ? 0 : t4sVar.a.hashCode()) * 31;
        a6s a6sVar = this.b;
        int hashCode2 = (this.w.hashCode() + unr0.e((hashCode + (a6sVar == null ? 0 : a6sVar.a.hashCode())) * 31, 31, this.c)) * 31;
        Integer num = this.x;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.y;
        return Boolean.hashCode(false) + ((hashCode3 + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        return "CargoFormArgs(inputPoint=" + this.a + ", scenario=" + this.b + ", forceOpenAddressDetails=" + this.c + ", cardMode=" + this.w + ", addressDetailsSearchIndex=" + this.x + ", meta=" + this.y + ", shouldWaitOrderCreation=false)";
    }

    public cv8() {
        this(null, null, false, new xi8(false), null, null);
    }
}
