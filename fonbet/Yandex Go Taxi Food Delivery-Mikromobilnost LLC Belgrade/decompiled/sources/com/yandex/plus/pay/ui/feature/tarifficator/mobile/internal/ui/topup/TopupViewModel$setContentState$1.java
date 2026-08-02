package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup;

import defpackage.dio;
import defpackage.eu90;
import defpackage.hxz0;
import defpackage.ind0;
import defpackage.ixz0;
import defpackage.lpd0;
import defpackage.lyz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupViewModel$setContentState$1", f = "TopupViewModel.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TopupViewModel$setContentState$1 extends SuspendLambda implements wls {
    final /* synthetic */ ind0 $scenarioContext;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopupViewModel$setContentState$1(a aVar, ind0 ind0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$scenarioContext = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopupViewModel$setContentState$1(this.this$0, this.$scenarioContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TopupViewModel$setContentState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ixz0 ixz0Var = this.this$0.b;
            ind0 ind0Var = this.$scenarioContext;
            this.label = 1;
            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a) ixz0Var).a(ind0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        hxz0 hxz0Var = (hxz0) obj;
        a aVar = this.this$0;
        if (hxz0Var == null) {
            aVar.W();
        } else {
            String str = hxz0Var.b;
            aVar.y = hxz0Var;
            if (str != null) {
                r0 r0Var = aVar.z;
                Long l = hxz0Var.c;
                long longValue = l != null ? l.longValue() : 10000L;
                Long l2 = hxz0Var.d;
                lyz0 lyz0Var = new lyz0(str, longValue, l2 != null ? l2.longValue() : 10000L);
                r0Var.getClass();
                r0Var.m(null, lyz0Var);
                lpd0 lpd0Var = aVar.w;
                String str2 = hxz0Var.a;
                ind0 a = lpd0Var.a.a();
                eu90 eu90Var = lpd0Var.b;
                LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", dio.d(a.a), "action_scenario", str2);
                t.put("url", str);
                t.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("PostPaymentYB.Screen.Shown", t);
            } else {
                aVar.W();
            }
        }
        return zy11.a;
    }
}
