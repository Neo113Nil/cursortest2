package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity$onCreate$3", f = "ManagingPlusDevicesHelperActivity.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ManagingPlusDevicesHelperActivity$onCreate$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ManagingPlusDevicesHelperActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagingPlusDevicesHelperActivity$onCreate$3(ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = managingPlusDevicesHelperActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ManagingPlusDevicesHelperActivity$onCreate$3 managingPlusDevicesHelperActivity$onCreate$3 = new ManagingPlusDevicesHelperActivity$onCreate$3(this.this$0, continuation);
        managingPlusDevicesHelperActivity$onCreate$3.L$0 = obj;
        return managingPlusDevicesHelperActivity$onCreate$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ManagingPlusDevicesHelperActivity$onCreate$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar2 = (tse) this.L$0;
            long a = com.yandex.passport.common.time.a.a(0, 0, 50);
            this.L$0 = tseVar2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            tseVar = tseVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        if (bvf0.D(tseVar)) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Manually recreating activity", 8);
            }
            this.this$0.recreate();
        }
        return zy11.a;
    }
}
