package com.yandex.go.places.impl.navigation.map.listener;

import defpackage.go80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sr00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.map.listener.ModalViewCoordinatorMapAwareListener$updateMapScreen$1", f = "ModalViewCoordinatorMapAwareListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ModalViewCoordinatorMapAwareListener$updateMapScreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ sr00 $screenInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalViewCoordinatorMapAwareListener$updateMapScreen$1(a aVar, sr00 sr00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenInfo = sr00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModalViewCoordinatorMapAwareListener$updateMapScreen$1(this.this$0, this.$screenInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ModalViewCoordinatorMapAwareListener$updateMapScreen$1 modalViewCoordinatorMapAwareListener$updateMapScreen$1 = (ModalViewCoordinatorMapAwareListener$updateMapScreen$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        modalViewCoordinatorMapAwareListener$updateMapScreen$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        go80 go80Var = this.this$0.c;
        go80Var.d.l(this.$screenInfo);
        return zy11.a;
    }
}
