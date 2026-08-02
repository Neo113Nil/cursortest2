package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes8.dex */
public final class ssr implements ksr<Object> {
    public final /* synthetic */ Object b;

    public ssr(Object obj) {
        this.b = obj;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        Object emit = lsrVar.emit(this.b, spjVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : s3q0.a;
    }
}
