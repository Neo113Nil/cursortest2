package com.ybsdk.screens.registration.applicationstatus.presentation;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qqi0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusViewModel$loadData$1", f = "RegistrationApplicationStatusViewModel.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, 83, HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationApplicationStatusViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApplicationStatusViewModel$loadData$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegistrationApplicationStatusViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RegistrationApplicationStatusViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (com.ybsdk.screens.registration.applicationstatus.presentation.c.c0(r1, r8, r2, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r8.g0(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (com.ybsdk.screens.registration.applicationstatus.presentation.c.d0(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            RegistrationApplicationStatusScreenParams registrationApplicationStatusScreenParams = cVar.B;
            if (registrationApplicationStatusScreenParams instanceof RegistrationApplicationStatusScreenParams.OpenProduct) {
                YBProduct product = ((RegistrationApplicationStatusScreenParams.OpenProduct) registrationApplicationStatusScreenParams).getProduct();
                Map<String, String> additionalRequestParams = ((RegistrationApplicationStatusScreenParams.OpenProduct) this.this$0.B).getAdditionalRequestParams();
                this.label = 1;
            } else {
                if (!(registrationApplicationStatusScreenParams instanceof RegistrationApplicationStatusScreenParams.StatusPolling)) {
                    w511.b();
                    return null;
                }
                int i2 = qqi0.a[((RegistrationApplicationStatusScreenParams.StatusPolling) registrationApplicationStatusScreenParams).getOngoingOperation().ordinal()];
                if (i2 == 1) {
                    c cVar2 = this.this$0;
                    String applicationId = ((RegistrationApplicationStatusScreenParams.StatusPolling) cVar2.B).getApplicationId();
                    this.label = 2;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    c cVar3 = this.this$0;
                    String applicationId2 = ((RegistrationApplicationStatusScreenParams.StatusPolling) cVar3.B).getApplicationId();
                    this.label = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
