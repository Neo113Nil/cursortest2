package androidx.work;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls2s;", "<anonymous>", "(Ltse;)Ls2s;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CoroutineWorker$getForegroundInfoAsync$1 coroutineWorker$getForegroundInfoAsync$1 = (CoroutineWorker$getForegroundInfoAsync$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        coroutineWorker$getForegroundInfoAsync$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CoroutineWorker coroutineWorker = this.this$0;
        this.label = 1;
        coroutineWorker.getClass();
        ny61.r("Not implemented");
        return null;
    }
}
