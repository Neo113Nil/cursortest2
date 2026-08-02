package androidx.room.coroutines;

import androidx.room.Transactor$SQLiteTransactionType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PassthroughConnection$withTransaction$2 extends SuspendLambda implements tls {
    final /* synthetic */ wls $block;
    final /* synthetic */ Transactor$SQLiteTransactionType $type;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$withTransaction$2(c cVar, Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, wls wlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$type = transactor$SQLiteTransactionType;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassthroughConnection$withTransaction$2(this.this$0, this.$type, this.$block, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PassthroughConnection$withTransaction$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        c cVar = this.this$0;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = this.$type;
        wls wlsVar = this.$block;
        this.label = 1;
        Object e = cVar.e(transactor$SQLiteTransactionType, wlsVar, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
