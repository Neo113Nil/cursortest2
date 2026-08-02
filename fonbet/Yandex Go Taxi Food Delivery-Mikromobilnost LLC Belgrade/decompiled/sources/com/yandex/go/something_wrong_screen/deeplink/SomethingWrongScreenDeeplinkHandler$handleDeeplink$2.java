package com.yandex.go.something_wrong_screen.deeplink;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenEntryPoint;
import defpackage.hxx;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.something_wrong_screen.deeplink.SomethingWrongScreenDeeplinkHandler$handleDeeplink$2", f = "SomethingWrongScreenDeeplinkHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SomethingWrongScreenDeeplinkHandler$handleDeeplink$2 extends SuspendLambda implements wls {
    final /* synthetic */ oep0 $this_handleDeeplink;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomethingWrongScreenDeeplinkHandler$handleDeeplink$2(oep0 oep0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_handleDeeplink = oep0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SomethingWrongScreenDeeplinkHandler$handleDeeplink$2(this.$this_handleDeeplink, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SomethingWrongScreenDeeplinkHandler$handleDeeplink$2 somethingWrongScreenDeeplinkHandler$handleDeeplink$2 = (SomethingWrongScreenDeeplinkHandler$handleDeeplink$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        somethingWrongScreenDeeplinkHandler$handleDeeplink$2.invokeSuspend(zy11Var);
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
        ((pep0) this.$this_handleDeeplink).f((m950) this.this$0.b.get(), SomethingWrongScreenEntryPoint.DEEPLINK, hxx.a);
        return zy11.a;
    }
}
