package com.yandex.go.taxi.ui.selector;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s0f0;
import defpackage.t0f0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.ui.selector.OptimisedPriceViewHolder$bindPrice$2", f = "OptimisedPriceViewHolder.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OptimisedPriceViewHolder$bindPrice$2 extends SuspendLambda implements wls {
    final /* synthetic */ t0f0 $priceState;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimisedPriceViewHolder$bindPrice$2(b bVar, t0f0 t0f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$priceState = t0f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OptimisedPriceViewHolder$bindPrice$2(this.this$0, this.$priceState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OptimisedPriceViewHolder$bindPrice$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            FormattedText formattedText = ((s0f0) this.$priceState).a;
            this.label = 1;
            if (b.a(bVar, formattedText, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.b(((s0f0) this.$priceState).b);
        this.this$0.c(null);
        this.this$0.d(null);
        return zy11.a;
    }
}
