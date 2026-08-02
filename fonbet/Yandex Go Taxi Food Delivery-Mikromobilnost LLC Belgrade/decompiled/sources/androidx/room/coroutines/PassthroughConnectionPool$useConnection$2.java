package androidx.room.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.room.coroutines.PassthroughConnectionPool$useConnection$2", f = "PassthroughConnectionPool.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PassthroughConnectionPool$useConnection$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ c $connectionWrapper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnectionPool$useConnection$2(wls wlsVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
        this.$connectionWrapper = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassthroughConnectionPool$useConnection$2(this.$block, this.$connectionWrapper, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassthroughConnectionPool$useConnection$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        wls wlsVar = this.$block;
        c cVar = this.$connectionWrapper;
        this.label = 1;
        Object invoke = wlsVar.invoke(cVar, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
