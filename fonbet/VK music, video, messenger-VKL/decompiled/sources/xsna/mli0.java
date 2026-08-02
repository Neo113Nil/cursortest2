package xsna;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: _Sequences.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class mli0 extends FunctionReferenceImpl implements izs<Iterable<Object>, Iterator<Object>> {
    public static final mli0 b = new mli0(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);

    @Override // xsna.izs
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        return iterable.iterator();
    }
}
