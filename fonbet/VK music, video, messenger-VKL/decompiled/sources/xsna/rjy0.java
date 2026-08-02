package xsna;

import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class rjy0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 0;
    }
}
