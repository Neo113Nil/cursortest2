package com.yandex.go.taxi.order.superapp.orders.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import defpackage.e58;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$bindCarIcon$2$1", f = "TaxiOrderViewHolder.kt", l = {802}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderViewHolder$bindCarIcon$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ e58 $carIconStrategy;
    final /* synthetic */ ImageView $imageView;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewHolder$bindCarIcon$2$1(b bVar, e58 e58Var, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$carIconStrategy = e58Var;
        this.$imageView = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderViewHolder$bindCarIcon$2$1(this.this$0, this.$carIconStrategy, this.$imageView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderViewHolder$bindCarIcon$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 b = this.this$0.S.b().b(this.$carIconStrategy.b);
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = this.$imageView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageDrawable(c.k(this.$carIconStrategy.c, this.this$0.a));
        }
        return zy11.a;
    }
}
