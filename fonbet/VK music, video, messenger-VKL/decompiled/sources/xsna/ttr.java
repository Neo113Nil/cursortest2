package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Reduce.kt */
/* loaded from: classes8.dex */
public final class ttr<T> implements lsr {
    public final /* synthetic */ Ref$ObjectRef<Object> b;

    public ttr(Ref$ObjectRef<Object> ref$ObjectRef) {
        this.b = ref$ObjectRef;
    }

    @Override // xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        Ref$ObjectRef<Object> ref$ObjectRef = this.b;
        if (ref$ObjectRef.element != tyx.h) {
            throw new IllegalArgumentException("Flow has more than one element");
        }
        ref$ObjectRef.element = t;
        return s3q0.a;
    }
}
