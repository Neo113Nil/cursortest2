package xsna;

import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import java.util.Set;

/* compiled from: MarkerOperations.kt */
/* loaded from: classes2.dex */
public final class jo00 {
    public final Set<StringId> a;
    public final Set<do00> b;
    public final Set<do00> c;
    public final Set<do00> d;
    public final zk3<StringId, VisibleStyle> e;
    public final boolean f;
    public final Object g;
    public final int h;
    public final boolean i;

    public jo00() {
        throw null;
    }

    public jo00(Set set, Set set2, Set set3, Set set4, zk3 zk3Var, boolean z, Object obj) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = zk3Var;
        this.f = z;
        this.g = obj;
        int size = set4.size() + set3.size() + set2.size();
        int i = zk3Var.d;
        this.h = size > i ? i : size;
        this.i = set2.isEmpty() && set3.isEmpty() && set4.isEmpty();
    }

    public final String toString() {
        return "MarkerOperations(removal=" + this.b.size() + ", additions=" + this.c.size() + ", updates=" + this.d.size() + ')';
    }
}
