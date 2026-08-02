package coil3;

import defpackage.ago;
import defpackage.gev;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q7v;
import defpackage.tse;
import defpackage.wls;
import defpackage.xis0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmev;", "<anonymous>", "(Ltse;)Lmev;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {143}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class RealImageLoader$execute$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ q7v $cachedPlaceholder;
    final /* synthetic */ ago $eventListener;
    final /* synthetic */ gev $request;
    final /* synthetic */ xis0 $size;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(gev gevVar, c cVar, xis0 xis0Var, ago agoVar, q7v q7vVar, Continuation continuation) {
        super(2, continuation);
        this.$request = gevVar;
        this.this$0 = cVar;
        this.$size = xis0Var;
        this.$eventListener = agoVar;
        this.$cachedPlaceholder = q7vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$cachedPlaceholder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        gev gevVar = this.$request;
        coil3.intercept.c cVar = new coil3.intercept.c(gevVar, this.this$0.d.a, 0, gevVar, this.$size, this.$eventListener, this.$cachedPlaceholder != null);
        this.label = 1;
        Object a = cVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
