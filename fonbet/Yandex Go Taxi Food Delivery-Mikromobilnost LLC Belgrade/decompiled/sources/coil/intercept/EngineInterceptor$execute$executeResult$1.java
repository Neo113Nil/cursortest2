package coil.intercept;

import defpackage.cgo;
import defpackage.hev;
import defpackage.iwq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pjt0;
import defpackage.qg70;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu1o;", "<anonymous>", "(Ltse;)Lu1o;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<coil.a> $components;
    final /* synthetic */ cgo $eventListener;
    final /* synthetic */ Ref$ObjectRef<iwq> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref$ObjectRef<qg70> $options;
    final /* synthetic */ hev $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(a aVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, hev hevVar, Object obj, Ref$ObjectRef ref$ObjectRef3, cgo cgoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = hevVar;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = cgoVar;
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
        pjt0 pjt0Var = (pjt0) this.$fetchResult.element;
        coil.a aVar2 = this.$components.element;
        hev hevVar = this.$request;
        Object obj2 = this.$mappedData;
        qg70 qg70Var = this.$options.element;
        cgo cgoVar = this.$eventListener;
        this.label = 1;
        Object a = a.a(aVar, pjt0Var, aVar2, hevVar, obj2, qg70Var, cgoVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
