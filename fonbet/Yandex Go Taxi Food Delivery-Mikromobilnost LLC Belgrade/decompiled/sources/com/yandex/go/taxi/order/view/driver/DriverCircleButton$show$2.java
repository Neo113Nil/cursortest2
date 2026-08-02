package com.yandex.go.taxi.order.view.driver;

import android.graphics.Bitmap;
import defpackage.a3y0;
import defpackage.gim;
import defpackage.jbm;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.view.driver.DriverCircleButton$show$2", f = "DriverCircleButton.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class DriverCircleButton$show$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ gim $onShowButtonCallback;
    final /* synthetic */ int $size;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DriverCircleButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverCircleButton$show$2(DriverCircleButton driverCircleButton, gim gimVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = driverCircleButton;
        this.$onShowButtonCallback = gimVar;
        this.$imageUrl = str;
        this.$size = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriverCircleButton$show$2(this.this$0, this.$onShowButtonCallback, this.$imageUrl, this.$size, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriverCircleButton$show$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gim gimVar;
        DriverCircleButton driverCircleButton;
        tt2 tt2Var;
        DriverCircleButton driverCircleButton2;
        a3y0 a3y0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                DriverCircleButton driverCircleButton3 = this.this$0;
                gimVar = this.$onShowButtonCallback;
                String str = this.$imageUrl;
                int i2 = this.$size;
                try {
                    tt2Var = driverCircleButton3.appDispatchers;
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    DriverCircleButton$show$2$1$bitmap$1 driverCircleButton$show$2$1$bitmap$1 = new DriverCircleButton$show$2$1$bitmap$1(driverCircleButton3, str, i2, null);
                    this.L$0 = driverCircleButton3;
                    this.L$1 = gimVar;
                    this.L$2 = driverCircleButton3;
                    this.label = 1;
                    Object k0 = tje.k0(mdhVar, driverCircleButton$show$2$1$bitmap$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    driverCircleButton = driverCircleButton3;
                    obj = k0;
                    driverCircleButton2 = driverCircleButton;
                } catch (Throwable th) {
                    th = th;
                    driverCircleButton = driverCircleButton3;
                    a3y0Var = driverCircleButton.logger;
                    a3y0Var.b("show", th, new jbm(11));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                driverCircleButton = (DriverCircleButton) this.L$2;
                gimVar = (gim) this.L$1;
                driverCircleButton2 = (DriverCircleButton) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    a3y0Var = driverCircleButton.logger;
                    a3y0Var.b("show", th, new jbm(11));
                    return zy11.a;
                }
            }
            driverCircleButton2.showButton((Bitmap) obj, gimVar);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
