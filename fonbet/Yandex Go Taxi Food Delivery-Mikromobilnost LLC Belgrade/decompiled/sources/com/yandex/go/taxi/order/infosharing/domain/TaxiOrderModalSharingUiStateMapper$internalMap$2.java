package com.yandex.go.taxi.order.infosharing.domain;

import android.graphics.drawable.Drawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s2y0;
import defpackage.tse;
import defpackage.v5y0;
import defpackage.w5y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lw5y0;", "<anonymous>", "(Ltse;)Lw5y0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.domain.TaxiOrderModalSharingUiStateMapper$internalMap$2", f = "TaxiOrderModalSharingUiStateMapper.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderModalSharingUiStateMapper$internalMap$2 extends SuspendLambda implements wls {
    final /* synthetic */ v5y0 $button;
    final /* synthetic */ s2y0 $model;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderModalSharingUiStateMapper$internalMap$2(s2y0 s2y0Var, v5y0 v5y0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$model = s2y0Var;
        this.$button = v5y0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderModalSharingUiStateMapper$internalMap$2(this.$model, this.$button, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderModalSharingUiStateMapper$internalMap$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        v5y0 v5y0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s2y0 s2y0Var = this.$model;
            CharSequence charSequence3 = s2y0Var.b;
            CharSequence charSequence4 = s2y0Var.c;
            v5y0 v5y0Var2 = this.$button;
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.b;
            String str = s2y0Var.e;
            this.L$0 = charSequence3;
            this.L$1 = charSequence4;
            this.L$2 = v5y0Var2;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence = charSequence3;
            charSequence2 = charSequence4;
            v5y0Var = v5y0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v5y0Var = (v5y0) this.L$2;
            charSequence2 = (CharSequence) this.L$1;
            charSequence = (CharSequence) this.L$0;
            kotlin.b.b(obj);
        }
        return new w5y0(charSequence, charSequence2, v5y0Var, (Drawable) obj);
    }
}
