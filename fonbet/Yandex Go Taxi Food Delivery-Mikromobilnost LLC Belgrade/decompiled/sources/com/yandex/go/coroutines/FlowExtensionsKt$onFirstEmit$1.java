package com.yandex.go.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.FlowExtensionsKt$onFirstEmit$1", f = "FlowExtensions.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class FlowExtensionsKt$onFirstEmit$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $action;
    final /* synthetic */ Ref$BooleanRef $firstEmit;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$onFirstEmit$1(Ref$BooleanRef ref$BooleanRef, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$firstEmit = ref$BooleanRef;
        this.$action = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtensionsKt$onFirstEmit$1 flowExtensionsKt$onFirstEmit$1 = new FlowExtensionsKt$onFirstEmit$1(this.$firstEmit, this.$action, continuation);
        flowExtensionsKt$onFirstEmit$1.L$0 = obj;
        return flowExtensionsKt$onFirstEmit$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$onFirstEmit$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$BooleanRef ref$BooleanRef = this.$firstEmit;
            if (ref$BooleanRef.element) {
                ref$BooleanRef.element = false;
                wls wlsVar = this.$action;
                this.L$0 = null;
                this.label = 1;
                if (wlsVar.invoke(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
