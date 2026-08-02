package xsna;

import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: GeoCluster.kt */
/* loaded from: classes2.dex */
public final class akt implements atx0 {
    public final elb0 b;
    public final LinkedHashMap<StringId, elb0> c;
    public int d;

    public akt() {
        throw null;
    }

    public akt(elb0 elb0Var, LinkedHashMap linkedHashMap, int i) {
        this.b = elb0Var;
        this.c = linkedHashMap;
        this.d = i;
    }

    public static akt b(akt aktVar) {
        int i = aktVar.d;
        elb0 c = aktVar.b.c();
        LinkedHashMap<StringId, elb0> linkedHashMap = aktVar.c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<StringId, elb0> entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(new StringId(entry.getKey().b), entry.getValue().c());
        }
        return new akt(c, linkedHashMap2, i);
    }

    @Override // xsna.atx0
    public final String a() {
        return this.b.b;
    }

    public final String c() {
        elb0 elb0Var = this.b;
        if (elb0Var instanceof do00) {
            ((do00) elb0Var).getClass();
        }
        LinkedHashMap<StringId, elb0> linkedHashMap = this.c;
        if (linkedHashMap.size() <= 1) {
            return null;
        }
        linkedHashMap.size();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akt)) {
            return false;
        }
        akt aktVar = (akt) obj;
        return epx.f(this.b, aktVar.b) && epx.f(this.c, aktVar.c) && this.d == aktVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + uf3.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GeoCluster(top=" + this.b + ", points=" + this.c + ", style=" + ((Object) VisibleStyle.K(this.d)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public akt(elb0 elb0Var) {
        this(elb0Var, r0, r1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new StringId(elb0Var.b), elb0Var);
        int M = VisibleStyle.M(67108868);
        if (elb0Var instanceof do00) {
            M = ((do00) elb0Var).n ? VisibleStyle.M(268435464) : M;
            if (VisibleStyle.p(M) && VisibleStyle.e(M)) {
                M &= -129;
            }
        }
    }
}
