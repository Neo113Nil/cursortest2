package yads;

import java.util.Iterator;

/* loaded from: classes10.dex */
public class c0 extends uy1 {
    public final /* synthetic */ e0 b;

    public c0(a0 a0Var) {
        this.b = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.b;
        a0Var.getClass();
        return new k(a0Var);
    }
}
