package coil3.intercept;

import defpackage.ago;
import defpackage.gev;
import defpackage.hwq;
import defpackage.lg70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zct0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt1o;", "<anonymous>", "(Ltse;)Lt1o;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<coil3.a> $components;
    final /* synthetic */ ago $eventListener;
    final /* synthetic */ Ref$ObjectRef<hwq> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref$ObjectRef<lg70> $options;
    final /* synthetic */ gev $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(a aVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, gev gevVar, Object obj, Ref$ObjectRef ref$ObjectRef3, ago agoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = gevVar;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = agoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$execute$executeResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        zct0 zct0Var = (zct0) this.$fetchResult.element;
        coil3.a aVar2 = this.$components.element;
        gev gevVar = this.$request;
        Object obj2 = this.$mappedData;
        lg70 lg70Var = this.$options.element;
        ago agoVar = this.$eventListener;
        this.label = 1;
        Object b = a.b(aVar, zct0Var, aVar2, gevVar, obj2, lg70Var, agoVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
