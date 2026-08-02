package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SafeCollector.kt */
/* loaded from: classes11.dex */
public final class ezg0 {
    public static final yzs<lsr<Object>, Object, spj<? super s3q0>, Object> a;

    /* compiled from: SafeCollector.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements yzs<lsr<? super Object>, Object, spj<? super s3q0>, Object> {
        public static final a b = new a(3, lsr.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

        @Override // xsna.yzs
        public final Object invoke(lsr<? super Object> lsrVar, Object obj, spj<? super s3q0> spjVar) {
            return lsrVar.emit(obj, spjVar);
        }
    }

    static {
        a aVar = a.b;
        ttp0.d(3, aVar);
        a = aVar;
    }
}
