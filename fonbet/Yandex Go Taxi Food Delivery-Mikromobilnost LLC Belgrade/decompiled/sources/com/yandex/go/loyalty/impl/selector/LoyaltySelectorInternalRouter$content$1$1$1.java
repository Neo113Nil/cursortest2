package com.yandex.go.loyalty.impl.selector;

import com.yandex.go.loyalty.impl.selector.domain.d;
import defpackage.agd;
import defpackage.bxz;
import defpackage.gwz;
import defpackage.hwz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.swz;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.selector.LoyaltySelectorInternalRouter$content$1$1$1", f = "LoyaltySelectorInternalRouter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorInternalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ bxz $it;
    final /* synthetic */ gwz $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ hwz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorInternalRouter$content$1$1$1(hwz hwzVar, bxz bxzVar, yfd yfdVar, gwz gwzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hwzVar;
        this.$it = bxzVar;
        this.$this_buildContent = yfdVar;
        this.$navigator = gwzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoyaltySelectorInternalRouter$content$1$1$1(this.this$0, this.$it, this.$this_buildContent, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoyaltySelectorInternalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.H;
            bxz bxzVar = this.$it;
            Object obj2 = ((agd) this.$this_buildContent).a;
            String str = ((swz) obj2).a;
            String str2 = ((swz) obj2).b;
            gwz gwzVar = this.$navigator;
            this.label = 1;
            if (dVar.e(bxzVar, str, str2, gwzVar, this) == coroutineSingletons) {
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
