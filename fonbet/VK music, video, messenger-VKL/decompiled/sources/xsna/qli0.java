package xsna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: _Sequences.kt */
/* loaded from: classes11.dex */
public final class qli0 implements uki0<Object> {
    public final /* synthetic */ uki0<Object> a;
    public final /* synthetic */ Comparator<Object> b;

    public qli0(uki0<Object> uki0Var, Comparator<Object> comparator) {
        this.a = uki0Var;
        this.b = comparator;
    }

    @Override // xsna.uki0
    public final Iterator<Object> iterator() {
        List B = rli0.B(this.a);
        g5g.L(B, this.b);
        return ((ArrayList) B).iterator();
    }
}
