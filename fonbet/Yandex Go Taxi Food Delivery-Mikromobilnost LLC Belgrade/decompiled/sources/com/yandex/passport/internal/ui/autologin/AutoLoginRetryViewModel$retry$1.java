package com.yandex.passport.internal.ui.autologin;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.entities.UserCredentials;
import defpackage.dy40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w53;
import defpackage.wls;
import defpackage.zy11;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.autologin.AutoLoginRetryViewModel$retry$1", f = "AutoLoginRetryViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AutoLoginRetryViewModel$retry$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLoginRetryViewModel$retry$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoLoginRetryViewModel$retry$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoLoginRetryViewModel$retry$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.yandex.passport.internal.account.c cVar2 = cVar.A;
            UserCredentials userCredentials = cVar.B;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.AUTOLOGIN;
            this.label = 1;
            a = cVar2.a(userCredentials, null, analyticsFromValue, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        c cVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            cVar3.E.m(((ModernAccount) a).getUid());
        }
        c cVar4 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            String message = a2.getMessage();
            if (message != null) {
                c0 c0Var = cVar4.C;
                c0Var.getClass();
                w53 w53Var = new w53();
                w53Var.put("error", message);
                c0Var.a.a(com.yandex.passport.internal.analytics.d.e, w53Var);
            }
            dy40 dy40Var = cVar4.D;
            if (!(a2 instanceof JSONException) && !(a2 instanceof IOException)) {
                z = false;
            }
            dy40Var.m(Boolean.valueOf(z));
        }
        this.this$0.c.m(Boolean.FALSE);
        return zy11.a;
    }
}
