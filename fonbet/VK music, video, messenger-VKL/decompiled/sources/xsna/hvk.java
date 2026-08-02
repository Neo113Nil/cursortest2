package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.commons.http.Http;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {Http.StatusCode.RANGE_NOT_SATISFIABLE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class hvk extends SuspendLambda implements izs<spj<Object>, Object> {
    final /* synthetic */ izs<spj<Object>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hvk(izs<? super spj<Object>, ? extends Object> izsVar, spj<? super hvk> spjVar) {
        super(1, spjVar);
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new hvk(this.$block, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<Object> spjVar) {
        return ((hvk) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        izs<spj<Object>, Object> izsVar = this.$block;
        this.label = 1;
        Object invoke = izsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
