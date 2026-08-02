package com.ybsdk.feature.change.payment.method.internal.ui;

import com.ybsdk.feature.change.payment.method.internal.data.DefaultPaymentMethodUnifiedStatusEntity;
import defpackage.ahh;
import defpackage.bd9;
import defpackage.dd9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lahh;", ACSPConstants.STATUS, "Lzy11;", "<anonymous>", "(Lahh;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1", f = "ChangePaymentMethodViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1 changePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1 = new ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1(this.this$0, continuation);
        changePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1.L$0 = obj;
        return changePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1 changePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1 = (ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1) create((ahh) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        changePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity;
        String str;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ahh ahhVar = (ahh) this.L$0;
        c cVar = this.this$0;
        pz40 Y = cVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            defaultPaymentMethodUnifiedStatusEntity = ahhVar.a;
        } while (!r0Var.k(value, bd9.a((bd9) value, null, null, defaultPaymentMethodUnifiedStatusEntity, 7)));
        if (defaultPaymentMethodUnifiedStatusEntity == DefaultPaymentMethodUnifiedStatusEntity.REQUIRED_3DS && (str = ahhVar.b) != null) {
            pz40 Y2 = cVar.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, bd9.a((bd9) value2, null, str, null, 11)));
        }
        cVar.Z(new dd9(ChangePaymentMethodDivVariable.SET_DEFAULT_PAYMENT_METHOD_STATUS.getVariableName(), defaultPaymentMethodUnifiedStatusEntity.name()));
        return zy11.a;
    }
}
