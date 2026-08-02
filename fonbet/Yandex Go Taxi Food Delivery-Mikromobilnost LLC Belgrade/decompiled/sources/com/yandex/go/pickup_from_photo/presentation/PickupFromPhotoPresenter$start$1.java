package com.yandex.go.pickup_from_photo.presentation;

import defpackage.dob0;
import defpackage.job0;
import defpackage.mmb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qmb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.znb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$start$1", f = "PickupFromPhotoPresenter.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$start$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ job0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoPresenter$start$1(job0 job0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = job0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickupFromPhotoPresenter$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupFromPhotoPresenter$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!((com.yandex.go.permission.b) this.this$0.x.a).a(3)) {
                job0 job0Var = this.this$0;
                job0Var.B.d(mmb0.a, job0Var.z);
            }
            dob0 dob0Var = this.this$0.x;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) dob0Var.a).d(3, this);
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
        if (((Boolean) obj).booleanValue()) {
            ((znb0) this.this$0.Dg()).startCamera();
            job0 job0Var2 = this.this$0;
            job0Var2.B.d(qmb0.a, job0Var2.z);
        }
        return zy11.a;
    }
}
