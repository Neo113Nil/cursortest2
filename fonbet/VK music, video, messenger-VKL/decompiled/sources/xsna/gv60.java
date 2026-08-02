package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.r070;

/* compiled from: NewsfeedPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gv60 {
    public static final io.reactivex.rxjava3.internal.operators.single.o a(io.reactivex.rxjava3.core.x xVar) {
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, new wmz(new ehu(15), 10));
    }

    public static final io.reactivex.rxjava3.internal.operators.single.o b(io.reactivex.rxjava3.internal.operators.single.y yVar, izs izsVar, gzs gzsVar) {
        return new io.reactivex.rxjava3.internal.operators.single.o(yVar, new kjs(new mh4(gzsVar, izsVar), 9));
    }

    public static final io.reactivex.rxjava3.internal.operators.single.l c(io.reactivex.rxjava3.core.x xVar, f170 f170Var) {
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, new zk30(new xgv(f170Var, 17), 7)).h(new oo20(new jjx(f170Var, 20), 8));
    }

    public static final io.reactivex.rxjava3.internal.operators.single.i d(io.reactivex.rxjava3.internal.operators.single.y yVar, final int i, final String str, final izs izsVar) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        return new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.o(yVar, new tl30(new tm9(ref$BooleanRef, 1), 7)), new io.reactivex.rxjava3.functions.a(izsVar, i, ref$BooleanRef, str) { // from class: xsna.fv60
            public final /* synthetic */ FunctionReferenceImpl b;
            public final /* synthetic */ int c;
            public final /* synthetic */ Ref$BooleanRef d;
            public final /* synthetic */ String e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = (FunctionReferenceImpl) izsVar;
                this.c = i;
                this.d = ref$BooleanRef;
                this.e = str;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                r070.e.d dVar = new r070.e.d(true);
                ?? r2 = this.b;
                r2.invoke(dVar);
                r2.invoke(new r070.e.g(this.c, this.d.element && this.e.equals("initial")));
            }
        });
    }
}
