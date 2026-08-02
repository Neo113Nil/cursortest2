package com.yandex.go.multimodal_route.ui.rate_route;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oip0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.rate_route.MultimodalRoutesRateScreenKt$MultimodalRoutesRateScreen$2$1$1", f = "MultimodalRoutesRateScreen.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRoutesRateScreenKt$MultimodalRoutesRateScreen$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oip0 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRoutesRateScreenKt$MultimodalRoutesRateScreen$2$1$1(oip0 oip0Var, Continuation continuation) {
        super(2, continuation);
        this.$scrollState = oip0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRoutesRateScreenKt$MultimodalRoutesRateScreen$2$1$1(this.$scrollState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRoutesRateScreenKt$MultimodalRoutesRateScreen$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oip0 oip0Var = this.$scrollState;
            int intValue = oip0Var.e.getIntValue();
            this.label = 1;
            if (androidx.compose.foundation.gestures.c.p(oip0Var, intValue - oip0Var.a.getIntValue(), this) == coroutineSingletons) {
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
