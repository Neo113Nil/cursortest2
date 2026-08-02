package defpackage;

import kotlin.a;

/* loaded from: classes9.dex */
public final class elf0 {
    public final u1m a;
    public final ywl b;
    public final i3y c;

    public elf0(ywl ywlVar, u1m u1mVar) {
        this.a = u1mVar;
        this.b = ywlVar;
        this.c = a.a(new t9a0(29, this));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof elf0)) {
            return false;
        }
        u1m u1mVar = this.a;
        if (jl40.l(u1mVar != null ? u1mVar.b : null, u1mVar != null ? u1mVar.b : null)) {
            if (jl40.l(u1mVar != null ? u1mVar.a : null, u1mVar != null ? u1mVar.a : null) && jl40.l(((elf0) obj).b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Number) this.c.getValue()).intValue();
    }

    public elf0() {
        this(null, null);
    }
}
