package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.is90;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.seu;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l8x l8xVar = (l8x) ((tse) this.L$0).getCoroutineContext().get(seu.C);
            if (l8xVar == null) {
                ny61.r("when[State] methods should have a parent job");
                return null;
            }
            is90 is90Var = new is90();
            n nVar2 = new n(this.$this_whenStateAtLeast, this.$minState, is90Var.b, l8xVar);
            try {
                wls wlsVar = this.$block;
                this.L$0 = nVar2;
                this.label = 1;
                obj = tje.k0(is90Var, wlsVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                nVar = nVar2;
            } catch (Throwable th) {
                th = th;
                nVar = nVar2;
                nVar.a();
                throw th;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar = (n) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                nVar.a();
                throw th;
            }
        }
        nVar.a();
        return obj;
    }
}
