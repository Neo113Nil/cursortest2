package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.jrj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsModalView$InnerMvpView$render$1", f = "DiscountsPromoCodeDetailsModalView.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsPromoCodeDetailsModalView$InnerMvpView$render$1 extends SuspendLambda implements wls {
    final /* synthetic */ jrj $uiState;
    int label;
    final /* synthetic */ DiscountsPromoCodeDetailsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsPromoCodeDetailsModalView$InnerMvpView$render$1(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, jrj jrjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = discountsPromoCodeDetailsModalView;
        this.$uiState = jrjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsPromoCodeDetailsModalView$InnerMvpView$render$1(this.this$0, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscountsPromoCodeDetailsModalView$InnerMvpView$render$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.widget.utils.e eVar;
        GoImageView goImageView;
        GoImageView goImageView2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            eVar = this.this$0.mediaInfoConverter;
            String str = this.$uiState.d;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        goImageView = this.this$0.decorationImageView;
        goImageView.setImageDrawable(bitmapDrawable);
        goImageView2 = this.this$0.decorationImageView;
        goImageView2.setVisibility(bitmapDrawable != null ? 0 : 8);
        return zy11.a;
    }
}
