package xsna;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: _Sequences.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class kli0 extends FunctionReferenceImpl implements izs<Iterable<Object>, Iterator<Object>> {
    public static final kli0 b = new kli0(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);

    @Override // xsna.izs
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        return iterable.iterator();
    }
}
