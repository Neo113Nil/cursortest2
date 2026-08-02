package xsna;

import java.util.Iterator;
import java.util.List;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class ezu<T> implements lsr {
    public final /* synthetic */ qb1<T, Object> b;

    public ezu(qb1<T, Object> qb1Var) {
        this.b = qb1Var;
    }

    @Override // xsna.lsr
    public final Object emit(Object obj, spj spjVar) {
        Iterator<T> it = ((List) obj).iterator();
        while (it.hasNext()) {
            this.b.a((zef0) it.next());
        }
        return s3q0.a;
    }
}
