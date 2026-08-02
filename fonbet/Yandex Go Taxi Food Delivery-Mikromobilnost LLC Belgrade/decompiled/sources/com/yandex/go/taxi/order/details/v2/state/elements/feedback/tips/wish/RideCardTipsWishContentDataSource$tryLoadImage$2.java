package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import android.graphics.drawable.BitmapDrawable;
import defpackage.g92;
import defpackage.gpk0;
import defpackage.jpk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lkpk0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.RideCardTipsWishContentDataSource$tryLoadImage$2", f = "RideCardTipsWishContentDataSource.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsWishContentDataSource$tryLoadImage$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    int label;
    final /* synthetic */ gpk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsWishContentDataSource$tryLoadImage$2(gpk0 gpk0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gpk0Var;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardTipsWishContentDataSource$tryLoadImage$2(this.this$0, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsWishContentDataSource$tryLoadImage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.b;
            String str = this.$imageTag;
            this.label = 1;
            obj = e.i(eVar, str, null, this, 14);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            return new g92(2, new jpk0(pkf.g(bitmapDrawable, this.$imageTag, null)));
        }
        gpk0 gpk0Var = this.this$0;
        String str2 = this.$imageTag;
        gpk0Var.getClass();
        return new rol0(new RideCardTipsWishContentDataSource$loadImage$1(gpk0Var, str2, null));
    }
}
