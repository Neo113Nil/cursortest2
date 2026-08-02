package xsna;

import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;

/* compiled from: ResponseConverters.kt */
/* loaded from: classes12.dex */
public final class pbg0 extends Lambda implements izs<AggregationType<Object>, Set<? extends DataOrigin>> {
    public static final pbg0 i = new pbg0(1);

    @Override // xsna.izs
    public final Set<? extends DataOrigin> invoke(AggregationType<Object> aggregationType) {
        d81.m(aggregationType);
        return EmptySet.b;
    }
}
