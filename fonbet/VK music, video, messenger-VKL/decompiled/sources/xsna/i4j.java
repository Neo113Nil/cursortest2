package xsna;

import androidx.room.Transactor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ConnectionPoolImpl.kt */
@b6l(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class i4j extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ wzs<Transactor, spj<Object>, Object> $block;
    final /* synthetic */ androidx.room.coroutines.d $confinedConnection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i4j(wzs<? super Transactor, ? super spj<Object>, ? extends Object> wzsVar, androidx.room.coroutines.d dVar, spj<? super i4j> spjVar) {
        super(2, spjVar);
        this.$block = wzsVar;
        this.$confinedConnection = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i4j(this.$block, this.$confinedConnection, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((i4j) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        androidx.room.coroutines.d dVar = this.$confinedConnection;
        this.label = 1;
        Object invoke = wzsVar.invoke(dVar, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
