package defpackage;

import flex.trim.memory.MemoryPriority;

/* loaded from: classes4.dex */
public final class k1m implements bnr0 {
    public final MemoryPriority a;

    public k1m(MemoryPriority memoryPriority) {
        this.a = memoryPriority;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        k1m k1mVar = bnr0Var instanceof k1m ? (k1m) bnr0Var : null;
        return k1mVar != null ? k1mVar : this;
    }

    public final MemoryPriority b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k1m.class == obj.getClass() && this.a == ((k1m) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
