package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: DoubleHistogramBuilder.java */
/* loaded from: classes8.dex */
public interface q6o {
    p6o build();

    l300 ofLongs();

    q6o setDescription(String str);

    default q6o setExplicitBucketBoundariesAdvice(List<Double> list) {
        List list2 = Collections.EMPTY_LIST;
        return this;
    }

    q6o setUnit(String str);
}
