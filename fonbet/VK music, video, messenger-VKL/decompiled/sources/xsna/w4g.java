package xsna;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public abstract class w4g<E, C extends Collection<? extends E>, B> extends u4g<E, C, B> {
    @Override // xsna.rd
    public final Iterator c(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((Collection) obj).size();
    }
}
