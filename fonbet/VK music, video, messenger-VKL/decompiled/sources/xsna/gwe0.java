package xsna;

import java.util.Random;
import java.util.function.Supplier;

/* compiled from: RandomFixedSizeExemplarReservoir.java */
/* loaded from: classes8.dex */
public final class gwe0 extends hnr {

    /* compiled from: RandomFixedSizeExemplarReservoir.java */
    public static class a implements b9g0 {
        public final a300 a;
        public final Supplier<Random> b;

        public a(Supplier supplier) {
            this.a = wp0.a ? new b1y((byte) 0, 0) : new ofy0(2);
            this.b = supplier;
        }

        @Override // xsna.b9g0
        public final int a(a9g0[] a9g0VarArr, double d) {
            return c(a9g0VarArr);
        }

        @Override // xsna.b9g0
        public final int b(a9g0[] a9g0VarArr, long j) {
            return c(a9g0VarArr);
        }

        public final int c(a9g0[] a9g0VarArr) {
            a300 a300Var = this.a;
            int sum = ((int) a300Var.sum()) + 1;
            int nextInt = this.b.get().nextInt(sum > 0 ? sum : 1);
            a300Var.add(1L);
            if (nextInt < a9g0VarArr.length) {
                return nextInt;
            }
            return -1;
        }

        @Override // xsna.b9g0
        public final void reset() {
            this.a.reset();
        }
    }
}
