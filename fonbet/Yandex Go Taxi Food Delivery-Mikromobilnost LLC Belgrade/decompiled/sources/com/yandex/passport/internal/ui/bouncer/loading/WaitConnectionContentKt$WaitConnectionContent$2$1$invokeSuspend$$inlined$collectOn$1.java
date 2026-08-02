package com.yandex.passport.internal.ui.bouncer.loading;

import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.loading.WaitConnectionContentKt$WaitConnectionContent$2$1$invokeSuspend$$inlined$collectOn$1", f = "WaitConnectionContent.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WaitConnectionContentKt$WaitConnectionContent$2$1$invokeSuspend$$inlined$collectOn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectOn;
    final /* synthetic */ t $wishSource$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitConnectionContentKt$WaitConnectionContent$2$1$invokeSuspend$$inlined$collectOn$1(tpr tprVar, Continuation continuation, t tVar) {
        super(2, continuation);
        this.$this_collectOn = tprVar;
        this.$wishSource$inlined = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WaitConnectionContentKt$WaitConnectionContent$2$1$invokeSuspend$$inlined$collectOn$1(this.$this_collectOn, continuation, this.$wishSource$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WaitConnectionContentKt$WaitConnectionContent$2$1$invokeSuspend$$inlined$collectOn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectOn;
            com.yandex.passport.common.ui.compose.b bVar = new com.yandex.passport.common.ui.compose.b(3, this.$wishSource$inlined);
            this.label = 1;
            if (tprVar.collect(bVar, this) == coroutineSingletons) {
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
