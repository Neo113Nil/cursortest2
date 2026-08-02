package xsna;

import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes8.dex */
public final class jli0 implements Iterable<Object>, gcy {
    public final /* synthetic */ uki0 b;

    public jli0(uki0 uki0Var) {
        this.b = uki0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.b.iterator();
    }
}
