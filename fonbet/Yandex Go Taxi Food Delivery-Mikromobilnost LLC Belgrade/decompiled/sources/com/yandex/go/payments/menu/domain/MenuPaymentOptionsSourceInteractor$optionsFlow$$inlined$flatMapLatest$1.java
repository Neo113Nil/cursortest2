package com.yandex.go.payments.menu.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.mvg;
import defpackage.n65;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xw91;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.menu.domain.MenuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1", f = "MenuPaymentOptionsSourceInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class MenuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $isSelectableMode$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1(Continuation continuation, c cVar, boolean z) {
        super(3, continuation);
        this.this$0 = cVar;
        this.$isSelectableMode$inlined = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MenuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1 menuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1 = new MenuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$isSelectableMode$inlined);
        menuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        menuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return menuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = new b(this.this$0.d.c(this.this$0.c.b((Zone) obj2, xw91.b, new n65[0])), this.this$0, this.$isSelectableMode$inlined);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(bVar, vprVar, this) == coroutineSingletons) {
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
