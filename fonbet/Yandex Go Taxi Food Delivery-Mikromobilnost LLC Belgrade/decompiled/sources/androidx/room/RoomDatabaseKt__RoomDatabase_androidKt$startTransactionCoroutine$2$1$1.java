package androidx.room;

import defpackage.ayy0;
import defpackage.fse;
import defpackage.he01;
import defpackage.i18;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ i18 $continuation;
    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
    final /* synthetic */ wls $transactionBlock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1(RoomDatabase roomDatabase, i18 i18Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_startTransactionCoroutine = roomDatabase;
        this.$continuation = i18Var;
        this.$transactionBlock = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 roomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 = new RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, continuation);
        roomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1.L$0 = obj;
        return roomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Continuation continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jse jseVar = (jse) ((tse) this.L$0).getCoroutineContext().get(x4c.K);
            RoomDatabase roomDatabase = this.$this_startTransactionCoroutine;
            fse plus = jseVar.plus(new he01(jseVar));
            fse plus2 = plus.plus(new ayy0(plus, roomDatabase.i));
            i18 i18Var = this.$continuation;
            wls wlsVar = this.$transactionBlock;
            this.L$0 = i18Var;
            this.label = 1;
            obj = tje.k0(plus2, wlsVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            continuation = i18Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            continuation = (Continuation) this.L$0;
            kotlin.b.b(obj);
        }
        continuation.resumeWith(obj);
        return zy11.a;
    }
}
