package com.yandex.go.order.ui.presentation.car;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.ui.presentation.car.LocalColorizedCarIconFactoryImpl$createCarIconSuspend$2", f = "LocalColorizedCarIconFactoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LocalColorizedCarIconFactoryImpl$createCarIconSuspend$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $color;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalColorizedCarIconFactoryImpl$createCarIconSuspend$2(a aVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$color = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalColorizedCarIconFactoryImpl$createCarIconSuspend$2(this.this$0, this.$color, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalColorizedCarIconFactoryImpl$createCarIconSuspend$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return this.this$0.a(this.$color);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
