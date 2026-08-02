package com.yandex.plus.home.feature.webviews.internal.smart;

import defpackage.asd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xlv;
import defpackage.yld0;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lxlv;", Constants.KEY_MESSAGE, "Lzy11;", "<anonymous>", "(Ltse;Lxlv;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.smart.PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1", f = "PlusSmartWebPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yld0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1(yld0 yld0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = yld0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1 plusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1 = new PlusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1(this.this$0, (Continuation) obj3);
        plusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1.L$0 = (xlv) obj2;
        zy11 zy11Var = zy11.a;
        plusSmartWebPresenter$subscribeOnWebViewReceiverMessages$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xlv xlvVar = (xlv) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((asd0) this.this$0.b).sendMessage(xlvVar);
        return zy11.a;
    }
}
