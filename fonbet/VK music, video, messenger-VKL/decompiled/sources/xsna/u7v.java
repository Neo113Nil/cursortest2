package xsna;

import java.util.List;

/* compiled from: HistogramExemplarReservoir.java */
/* loaded from: classes8.dex */
public final class u7v extends hnr {
    public u7v(List list) {
        super(list.size() + 1, new a(list));
    }

    @Override // xsna.hnr, xsna.h300
    public final void a(long j, q94 q94Var, wmj wmjVar) {
        c(j, q94Var, wmjVar);
    }

    /* compiled from: HistogramExemplarReservoir.java */
    public static class a implements b9g0 {
        public final double[] a;

        public a(List list) {
            u9q.b(list);
            this.a = list.stream().mapToDouble(new t9q()).toArray();
        }

        @Override // xsna.b9g0
        public final int a(a9g0[] a9g0VarArr, double d) {
            return u9q.a(d, this.a);
        }

        @Override // xsna.b9g0
        public final int b(a9g0[] a9g0VarArr, long j) {
            return u9q.a(j, this.a);
        }

        @Override // xsna.b9g0
        public final void reset() {
        }
    }
}
