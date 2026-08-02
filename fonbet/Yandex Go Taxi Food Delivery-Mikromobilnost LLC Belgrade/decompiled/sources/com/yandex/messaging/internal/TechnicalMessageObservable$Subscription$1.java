package com.yandex.messaging.internal;

import android.content.res.Resources;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.acu;
import defpackage.e9y;
import defpackage.kcy0;
import defpackage.kw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.TechnicalMessageObservable$Subscription$1", f = "TechnicalMessageObservable.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TechnicalMessageObservable$Subscription$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ kcy0 this$0;
    final /* synthetic */ e0 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TechnicalMessageObservable$Subscription$1(kcy0 kcy0Var, e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kcy0Var;
        this.this$1 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TechnicalMessageObservable$Subscription$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TechnicalMessageObservable$Subscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            acu acuVar = new acu(this.this$0.a.a(this.this$1.w), 26);
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(acuVar, this);
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
        Boolean bool = (Boolean) obj;
        zy11 zy11Var = zy11.a;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            e0 e0Var = this.this$1;
            kcy0 kcy0Var = e0Var.A;
            kw kwVar = kcy0Var.d;
            TechBaseMessage techBaseMessage = e0Var.b;
            boolean z = e0Var.c;
            String[] strArr = e0Var.y;
            Resources resources = kcy0Var.c;
            e0Var.a.u((String) techBaseMessage.a(z ? new e9y(strArr, resources, kwVar, booleanValue, 1) : new e9y(strArr, resources, kwVar, booleanValue, 0)));
        }
        return zy11Var;
    }
}
