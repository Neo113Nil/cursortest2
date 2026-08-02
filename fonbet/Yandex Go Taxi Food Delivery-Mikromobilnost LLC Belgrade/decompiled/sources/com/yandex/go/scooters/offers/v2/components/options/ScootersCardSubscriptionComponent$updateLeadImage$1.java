package com.yandex.go.scooters.offers.v2.components.options;

import android.graphics.Bitmap;
import defpackage.evu0;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.options.ScootersCardSubscriptionComponent$updateLeadImage$1", f = "ScootersCardSubscriptionComponent.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersCardSubscriptionComponent$updateLeadImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    Object L$0;
    int label;
    final /* synthetic */ ScootersCardSubscriptionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardSubscriptionComponent$updateLeadImage$1(String str, ScootersCardSubscriptionComponent scootersCardSubscriptionComponent, Continuation continuation) {
        super(2, continuation);
        this.$imageTag = str;
        this.this$0 = scootersCardSubscriptionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardSubscriptionComponent$updateLeadImage$1(this.$imageTag, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardSubscriptionComponent$updateLeadImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Bitmap bitmap = null;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$imageTag;
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
            ScootersCardSubscriptionComponent scootersCardSubscriptionComponent = this.this$0;
            if (bitmap == null) {
                scootersCardSubscriptionComponent.setLeadImage(bitmap);
            } else {
                scootersCardSubscriptionComponent.clearLeadView();
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        bitmap = (Bitmap) obj;
        ScootersCardSubscriptionComponent scootersCardSubscriptionComponent2 = this.this$0;
        if (bitmap == null) {
        }
        return zy11.a;
    }
}
