package com.yandex.go.taxi.order.view.driver;

import defpackage.g16;
import defpackage.mvg;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.view.driver.DriverCircleButton$show$2$1$bitmap$1", f = "DriverCircleButton.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DriverCircleButton$show$2$1$bitmap$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ int $size;
    int label;
    final /* synthetic */ DriverCircleButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverCircleButton$show$2$1$bitmap$1(DriverCircleButton driverCircleButton, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = driverCircleButton;
        this.$imageUrl = str;
        this.$size = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriverCircleButton$show$2$1$bitmap$1(this.this$0, this.$imageUrl, this.$size, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriverCircleButton$show$2$1$bitmap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        pavVar = this.this$0.imageLoader;
        g16 e = pavVar.b().b(this.$imageUrl).e(nfv.a);
        int i2 = this.$size;
        g16 g = e.g(i2, i2);
        this.label = 1;
        Object b = a.b(g, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
