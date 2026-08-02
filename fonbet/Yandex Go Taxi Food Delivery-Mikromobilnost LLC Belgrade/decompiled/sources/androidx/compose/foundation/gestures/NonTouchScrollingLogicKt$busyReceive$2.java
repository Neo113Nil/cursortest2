package androidx.compose.foundation.gestures;

import defpackage.ci9;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", f = "NonTouchScrollingLogic.kt", l = {80}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class NonTouchScrollingLogicKt$busyReceive$2 extends SuspendLambda implements wls {
    final /* synthetic */ ci9 $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$busyReceive$2(ci9 ci9Var, Continuation continuation) {
        super(2, continuation);
        this.$this_busyReceive = ci9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NonTouchScrollingLogicKt$busyReceive$2 nonTouchScrollingLogicKt$busyReceive$2 = new NonTouchScrollingLogicKt$busyReceive$2(this.$this_busyReceive, continuation);
        nonTouchScrollingLogicKt$busyReceive$2.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NonTouchScrollingLogicKt$busyReceive$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        l8x l8xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pzt0 N = tje.N((tse) this.L$0, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(2, null), 3);
            try {
                ci9 ci9Var = this.$this_busyReceive;
                this.L$0 = N;
                this.label = 1;
                Object e = ci9Var.e(this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                l8xVar = N;
            } catch (Throwable th2) {
                th = th2;
                l8xVar = N;
                l8xVar.a(null);
                throw th;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8xVar = (l8x) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                l8xVar.a(null);
                throw th;
            }
        }
        l8xVar.a(null);
        return obj;
    }
}
