package androidx.room.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u5e;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {231}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class Pool$acquireWithTimeout$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<u5e> $connection;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$2(Ref$ObjectRef ref$ObjectRef, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$connection = ref$ObjectRef;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pool$acquireWithTimeout$2(this.$connection, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Pool$acquireWithTimeout$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T t;
        Ref$ObjectRef<u5e> ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef<u5e> ref$ObjectRef2 = this.$connection;
            e eVar = this.this$0;
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object a = eVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            t = a;
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.b.b(obj);
            t = obj;
        }
        ref$ObjectRef.element = t;
        return zy11.a;
    }
}
