package androidx.datastore.core;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2", f = "DataStoreImpl.kt", l = {434}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DataStoreImpl$doWithWriteFileLock$2 extends SuspendLambda implements tls {
    final /* synthetic */ tls $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$doWithWriteFileLock$2(tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$doWithWriteFileLock$2(this.$block, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$doWithWriteFileLock$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tls tlsVar = this.$block;
        this.label = 1;
        Object invoke = tlsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
