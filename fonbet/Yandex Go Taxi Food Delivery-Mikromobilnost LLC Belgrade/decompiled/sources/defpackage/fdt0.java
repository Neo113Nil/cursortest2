package defpackage;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes10.dex */
public final class fdt0 implements Iterator, xfx {
    public final sus0 a;
    public final int b;
    public final meb1 c;
    public final int w;
    public int x;

    public fdt0(sus0 sus0Var, int i, dts dtsVar, meb1 meb1Var) {
        this.a = sus0Var;
        this.b = i;
        this.c = meb1Var;
        this.w = sus0Var.A;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        lid.b("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
