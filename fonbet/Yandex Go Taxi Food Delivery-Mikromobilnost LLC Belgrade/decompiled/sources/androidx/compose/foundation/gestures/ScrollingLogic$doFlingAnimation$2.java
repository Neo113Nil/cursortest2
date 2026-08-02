package androidx.compose.foundation.gestures;

import defpackage.clp0;
import defpackage.k631;
import defpackage.m62;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.snr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lclp0;", "Lzy11;", "<anonymous>", "(Lclp0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {921}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(y yVar, Ref$LongRef ref$LongRef, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yVar;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((clp0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y yVar;
        Ref$LongRef ref$LongRef;
        y yVar2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            clp0 clp0Var = (clp0) this.L$0;
            yVar = this.this$0;
            m62 m62Var = new m62(i2, yVar, clp0Var);
            ref$LongRef = this.$result;
            long j2 = this.$available;
            snr snrVar = yVar.c;
            long j3 = ref$LongRef.element;
            float d = yVar.d(yVar.d == Orientation.Horizontal ? k631.c(j2) : k631.d(j2));
            this.L$0 = yVar;
            this.L$1 = yVar;
            this.L$2 = ref$LongRef;
            this.J$0 = j3;
            this.label = 1;
            obj = snrVar.a(m62Var, d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            yVar2 = yVar;
            j = j3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            yVar = (y) this.L$1;
            yVar2 = (y) this.L$0;
            kotlin.b.b(obj);
        }
        float d2 = yVar2.d(((Number) obj).floatValue());
        ref$LongRef.element = yVar.d == Orientation.Horizontal ? k631.b(d2, 0.0f, 2, j) : k631.b(0.0f, d2, 1, j);
        return zy11.a;
    }
}
