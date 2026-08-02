package com.yandex.go.scooters.driver_license_notification;

import android.graphics.Bitmap;
import defpackage.evu0;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.xno0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.driver_license_notification.ScootersDriverLicenseNotification$onAttachedToWindow$1$1$iconAsync$1", f = "ScootersDriverLicenseNotification.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDriverLicenseNotification$onAttachedToWindow$1$1$iconAsync$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ScootersDriverLicenseNotification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDriverLicenseNotification$onAttachedToWindow$1$1$iconAsync$1(ScootersDriverLicenseNotification scootersDriverLicenseNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersDriverLicenseNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDriverLicenseNotification$onAttachedToWindow$1$1$iconAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDriverLicenseNotification$onAttachedToWindow$1$1$iconAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xno0 xno0Var;
        pav pavVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xno0Var = this.this$0.topBannerCommunication;
            String str = xno0Var.e;
            if (str != null) {
                if (evu0.J(str)) {
                    str = null;
                }
                if (str != null) {
                    pavVar = this.this$0.imageLoader;
                    g16 i2 = pavVar.b().i(new obv(str, null, 6, 0));
                    this.L$0 = null;
                    this.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(i2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return (Bitmap) obj;
    }
}
