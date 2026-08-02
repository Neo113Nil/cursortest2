package com.yandex.go.taxi.order.tipssuggest.mvp;

import android.graphics.drawable.Drawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uhz0;
import defpackage.vhz0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.tipssuggest.mvp.TipsSuggestPresenter$initIcon$1", f = "TipsSuggestPresenter.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TipsSuggestPresenter$initIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    Object L$0;
    int label;
    final /* synthetic */ vhz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsSuggestPresenter$initIcon$1(vhz0 vhz0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vhz0Var;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TipsSuggestPresenter$initIcon$1(this.this$0, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TipsSuggestPresenter$initIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uhz0 uhz0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            uhz0 uhz0Var2 = (uhz0) this.this$0.Dg();
            e eVar = this.this$0.B;
            String str = this.$imageTag;
            this.L$0 = uhz0Var2;
            this.label = 1;
            Object f = e.f(eVar, str, null, this, 6);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = f;
            uhz0Var = uhz0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uhz0Var = (uhz0) this.L$0;
            b.b(obj);
        }
        uhz0Var.updateImage((Drawable) obj);
        return zy11.a;
    }
}
