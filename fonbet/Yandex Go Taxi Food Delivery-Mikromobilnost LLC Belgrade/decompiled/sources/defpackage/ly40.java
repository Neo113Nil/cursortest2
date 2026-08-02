package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ly40 extends du00 implements bgx {
    public tz40 A;
    public final hz40 x;
    public qx40 y;
    public cy40 z;

    public ly40(hz40 hz40Var) {
        super(hz40Var);
        this.x = hz40Var;
    }

    @Override // defpackage.du00
    public final Set a() {
        qx40 qx40Var = this.y;
        if (qx40Var != null) {
            return qx40Var;
        }
        qx40 qx40Var2 = new qx40(this.x);
        this.y = qx40Var2;
        return qx40Var2;
    }

    @Override // defpackage.du00
    public final Set b() {
        cy40 cy40Var = this.z;
        if (cy40Var != null) {
            return cy40Var;
        }
        cy40 cy40Var2 = new cy40(this.x);
        this.z = cy40Var2;
        return cy40Var2;
    }

    @Override // defpackage.du00
    public final Collection c() {
        tz40 tz40Var = this.A;
        if (tz40Var != null) {
            return tz40Var;
        }
        tz40 tz40Var2 = new tz40(this.x);
        this.A = tz40Var2;
        return tz40Var2;
    }

    @Override // defpackage.du00, java.util.Map
    public final void clear() {
        this.x.h();
    }

    @Override // defpackage.du00, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.x.l(obj, obj2);
    }

    @Override // defpackage.du00, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.x.o(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.du00, java.util.Map
    public final Object remove(Object obj) {
        return this.x.m(obj);
    }
}
