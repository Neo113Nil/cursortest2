package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
/* loaded from: classes8.dex */
public final class qtr implements lsr<Object> {
    public final /* synthetic */ Ref$ObjectRef b;

    public qtr(Ref$ObjectRef ref$ObjectRef) {
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lsr
    public final Object emit(Object obj, spj<? super s3q0> spjVar) {
        this.b.element = obj;
        throw new AbortFlowException(this);
    }
}
