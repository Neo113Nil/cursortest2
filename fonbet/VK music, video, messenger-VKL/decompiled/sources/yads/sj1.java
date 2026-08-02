package yads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class sj1 extends AbstractMap {
    public transient l b;
    public transient rj1 c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l((n) this);
        this.b = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        rj1 rj1Var = this.c;
        if (rj1Var != null) {
            return rj1Var;
        }
        rj1 rj1Var2 = new rj1(this);
        this.c = rj1Var2;
        return rj1Var2;
    }
}
