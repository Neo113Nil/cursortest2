package androidx.room.coroutines;

import defpackage.gwk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ull0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PassthroughConnection$usePrepared$2 extends SuspendLambda implements tls {
    final /* synthetic */ tls $block;
    final /* synthetic */ String $sql;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$usePrepared$2(c cVar, String str, tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$sql = str;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassthroughConnection$usePrepared$2(this.this$0, this.$sql, this.$block, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PassthroughConnection$usePrepared$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ull0 T0 = this.this$0.b.T0(this.$sql);
        try {
            Object invoke = this.$block.invoke(T0);
            gwk0.m(T0, null);
            return invoke;
        } finally {
        }
    }
}
