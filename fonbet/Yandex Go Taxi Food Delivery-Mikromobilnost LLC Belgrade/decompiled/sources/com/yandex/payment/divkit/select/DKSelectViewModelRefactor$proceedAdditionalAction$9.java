package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.aqv;
import defpackage.ct20;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u89;
import defpackage.uv90;
import defpackage.wga0;
import defpackage.wls;
import defpackage.wme;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$proceedAdditionalAction$9", f = "DKSelectViewModelRefactor.kt", l = {638}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$proceedAdditionalAction$9 extends SuspendLambda implements wls {
    final /* synthetic */ ct20 $challengeInfo;
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$proceedAdditionalAction$9(n nVar, ct20 ct20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$challengeInfo = ct20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModelRefactor$proceedAdditionalAction$9(this.this$0, this.$challengeInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModelRefactor$proceedAdditionalAction$9) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentMethod.SbpToken sbpToken;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uv90 uv90Var = this.this$0.c0;
            if (uv90Var != null) {
                ArrayList e = ((wga0) uv90Var).e();
                ArrayList arrayList = new ArrayList();
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof PaymentMethod.SbpToken) {
                        arrayList.add(next);
                    }
                }
                ct20 ct20Var = this.$challengeInfo;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (jl40.l(((PaymentMethod.SbpToken) obj2).getId(), ((u89) ct20Var).e)) {
                        break;
                    }
                }
                sbpToken = (PaymentMethod.SbpToken) obj2;
            } else {
                sbpToken = null;
            }
            if (sbpToken != null) {
                kotlinx.coroutines.channels.a aVar = this.this$0.L;
                aqv aqvVar = new aqv(wme.a((u89) this.$challengeInfo), sbpToken);
                this.L$0 = null;
                this.label = 1;
                if (aVar.o(aqvVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
