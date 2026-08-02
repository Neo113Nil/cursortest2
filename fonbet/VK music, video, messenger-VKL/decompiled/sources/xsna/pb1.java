package xsna;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import xsna.jlb0;

/* compiled from: Aggregator.java */
/* loaded from: classes8.dex */
public interface pb1<T extends jlb0> {
    default T a() {
        throw new UnsupportedOperationException("This aggregator does not support createReusablePoint.");
    }

    yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality);

    default void c(T t, T t2) {
        throw new UnsupportedOperationException("This aggregator does not support diffInPlace.");
    }

    default void d(T t, T t2) {
        throw new UnsupportedOperationException("This aggregator does not support toPoint.");
    }

    sb1<T> e();

    default T f(T t, T t2) {
        throw new UnsupportedOperationException("This aggregator does not support diff.");
    }
}
