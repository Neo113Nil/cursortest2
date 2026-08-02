package xsna;

import androidx.room.Transactor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ConnectionPoolImpl.kt */
@b6l(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {143}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class j4j extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ wzs<Transactor, spj<Object>, Object> $block;
    final /* synthetic */ Ref$ObjectRef<androidx.room.coroutines.d> $connection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j4j(wzs<? super Transactor, ? super spj<Object>, ? extends Object> wzsVar, Ref$ObjectRef<androidx.room.coroutines.d> ref$ObjectRef, spj<? super j4j> spjVar) {
        super(2, spjVar);
        this.$block = wzsVar;
        this.$connection = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j4j(this.$block, this.$connection, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((j4j) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        wzs<Transactor, spj<Object>, Object> wzsVar = this.$block;
        androidx.room.coroutines.d dVar = this.$connection.element;
        this.label = 1;
        Object invoke = wzsVar.invoke(dVar, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
