package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class gdt0 implements aud, Iterable, xfx {
    public final sus0 a;
    public final int b;
    public final psi0 c;
    public final Integer w = 0;
    public final gdt0 x = this;

    public gdt0(sus0 sus0Var, int i, dts dtsVar, psi0 psi0Var) {
        this.a = sus0Var;
        this.b = i;
        this.c = psi0Var;
    }

    @Override // defpackage.aud
    public final String a() {
        return null;
    }

    @Override // defpackage.aud
    public final Object b() {
        return this.c.c(this.a);
    }

    @Override // defpackage.vtd
    public final Iterable d() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gdt0)) {
            return false;
        }
        gdt0 gdt0Var = (gdt0) obj;
        return gdt0Var.b == this.b && gdt0Var.a == this.a && gdt0Var.c.equals(this.c);
    }

    @Override // defpackage.aud
    public final Iterable getData() {
        return new edt0(this.a, this.b, null);
    }

    @Override // defpackage.aud
    public final Object getKey() {
        return this.w;
    }

    @Override // defpackage.aud
    public final Object getNode() {
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fdt0(this.a, this.b, null, this.c);
    }
}
