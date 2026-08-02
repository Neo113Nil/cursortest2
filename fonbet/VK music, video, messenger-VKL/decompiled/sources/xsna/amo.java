package xsna;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DropAggregator.java */
/* loaded from: classes8.dex */
public final class amo implements pb1<jlb0> {
    public static final a a = new a();
    public static final amo b = new amo();
    public static final b c = new b(new d370(20), true);

    /* compiled from: DropAggregator.java */
    public class a implements jlb0 {
        @Override // xsna.jlb0
        public final long b() {
            return 0L;
        }

        @Override // xsna.jlb0
        public final long g() {
            return 0L;
        }

        @Override // xsna.jlb0
        public final q94 getAttributes() {
            return jk3.e;
        }

        @Override // xsna.jlb0
        public final List<? extends c4q> o() {
            return Collections.EMPTY_LIST;
        }
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        return mgp.a;
    }

    @Override // xsna.pb1
    public final sb1<jlb0> e() {
        return c;
    }

    /* compiled from: DropAggregator.java */
    public class b extends sb1<jlb0> {
        @Override // xsna.sb1
        public final jlb0 b(long j, long j2, q94 q94Var, List<j6o> list, boolean z) {
            return amo.a;
        }

        @Override // xsna.sb1
        public final void d(double d) {
        }

        @Override // xsna.sb1
        public final void e(long j) {
        }
    }
}
