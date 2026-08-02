package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public class dli0 extends g5z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    public static final class a<T> implements uki0<T> {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // xsna.uki0
        public final Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> uki0<T> c(Iterator<? extends T> it) {
        return new t5j(new a(it));
    }

    public static cor d(uki0 uki0Var) {
        rvq rvqVar = new rvq(26);
        if (!(uki0Var instanceof ulp0)) {
            return new cor(uki0Var, new k990(18), rvqVar);
        }
        ulp0 ulp0Var = (ulp0) uki0Var;
        return new cor(ulp0Var.a, ulp0Var.b, rvqVar);
    }

    public static <T> uki0<T> e(T t, izs<? super T, ? extends T> izsVar) {
        return t == null ? ghp.a : new kjt(new ln20(t, 29), izsVar);
    }

    public static <T> uki0<T> f(gzs<? extends T> gzsVar) {
        return new t5j(new kjt(gzsVar, new cli0(gzsVar, 0)));
    }
}
