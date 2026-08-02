package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ImmutableHistogramPointData.java */
/* loaded from: classes8.dex */
public abstract class pow implements v7v {
    public static mm5 p(long j, long j2, q94 q94Var, double d, boolean z, double d2, boolean z2, double d3, List list, hbd0 hbd0Var, List list2) {
        long[] jArr = hbd0Var.b;
        if (jArr.length != list.size() + 1) {
            throw new IllegalArgumentException("invalid counts: size should be " + (list.size() + 1) + " instead of " + jArr.length);
        }
        sdi.z(list);
        sdi.y(list);
        long j3 = 0;
        for (long j4 : jArr) {
            j3 += j4;
        }
        return new mm5(j, j2, q94Var, d, j3, z, d2, z2, d3, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(hbd0Var)), list2);
    }
}
