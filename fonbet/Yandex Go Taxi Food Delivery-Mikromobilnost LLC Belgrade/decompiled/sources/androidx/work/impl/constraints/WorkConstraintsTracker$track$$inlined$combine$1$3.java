package androidx.work.impl.constraints;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8e;
import defpackage.s8e;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WorkConstraintsTracker$track$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WorkConstraintsTracker$track$$inlined$combine$1$3 workConstraintsTracker$track$$inlined$combine$1$3 = new WorkConstraintsTracker$track$$inlined$combine$1$3(3, (Continuation) obj3);
        workConstraintsTracker$track$$inlined$combine$1$3.L$0 = (vpr) obj;
        workConstraintsTracker$track$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return workConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s8e s8eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        s8e s8eVar2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            s8e[] s8eVarArr = (s8e[]) ((Object[]) this.L$1);
            int length = s8eVarArr.length;
            int i2 = 0;
            while (true) {
                s8eVar = q8e.a;
                if (i2 >= length) {
                    break;
                }
                s8e s8eVar3 = s8eVarArr[i2];
                if (!jl40.l(s8eVar3, s8eVar)) {
                    s8eVar2 = s8eVar3;
                    break;
                }
                i2++;
            }
            if (s8eVar2 != null) {
                s8eVar = s8eVar2;
            }
            this.label = 1;
            if (vprVar.emit(s8eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
