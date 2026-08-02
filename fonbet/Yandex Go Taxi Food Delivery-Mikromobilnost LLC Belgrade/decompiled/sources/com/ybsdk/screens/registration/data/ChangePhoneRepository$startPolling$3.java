package com.ybsdk.screens.registration.data;

import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.text.d;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.ee9;
import defpackage.m13;
import defpackage.mvg;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.p2e0;
import defpackage.pz40;
import defpackage.q2e0;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lpz40;", "Ls2e0;", "Lee9;", "pollingState", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse;", "callResult", "Lzy11;", "<anonymous>", "(Lpz40;Lkotlin/Result;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.data.ChangePhoneRepository$startPolling$3", f = "ChangePhoneRepository.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePhoneRepository$startPolling$3 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $continuePolling;
    final /* synthetic */ boolean $ignoreFailures;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePhoneRepository$startPolling$3(a aVar, boolean z, boolean z2, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$continuePolling = z;
        this.$ignoreFailures = z2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object value = ((Result) obj2).getValue();
        ChangePhoneRepository$startPolling$3 changePhoneRepository$startPolling$3 = new ChangePhoneRepository$startPolling$3(this.this$0, this.$continuePolling, this.$ignoreFailures, (Continuation) obj3);
        changePhoneRepository$startPolling$3.L$0 = (pz40) obj;
        changePhoneRepository$startPolling$3.L$1 = new Result(value);
        return changePhoneRepository$startPolling$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        Object failure;
        Object n2e0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 pz40Var2 = (pz40) this.L$0;
            Object value = ((Result) this.L$1).getValue();
            a aVar = this.this$0;
            Throwable a = Result.a(value);
            if (a == null) {
                ChangePhoneRepository$startPolling$3$1$1 changePhoneRepository$startPolling$3$1$1 = new ChangePhoneRepository$startPolling$3$1$1(aVar, null);
                this.L$0 = pz40Var2;
                this.label = 1;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) value, changePhoneRepository$startPolling$3$1$1, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
                pz40Var = pz40Var2;
                failure = d;
            } else {
                pz40Var = pz40Var2;
                failure = new Result.Failure(a);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pz40Var = (pz40) this.L$0;
            kotlin.b.b(obj);
            failure = ((Result) obj).getValue();
        }
        boolean z = this.$continuePolling;
        if (!(failure instanceof Result.Failure)) {
            dqg dqgVar = (dqg) failure;
            if (dqgVar instanceof bqg) {
                bqg bqgVar = (bqg) dqgVar;
                n2e0Var = new n2e0(new ApplicationStatusFailedException(d.f(bqgVar.a), d.f(bqgVar.b), bqgVar.d, (Themes) null, (List) null, 56));
            } else {
                if (!(dqgVar instanceof cqg)) {
                    w511.b();
                    return null;
                }
                Object value2 = ((Result) ((cqg) dqgVar).a).getValue();
                kotlin.b.b(value2);
                ee9 ee9Var = (ee9) value2;
                switch (m13.b[ee9Var.a.ordinal()]) {
                    case 1:
                    case 2:
                        n2e0Var = new n2e0(new ApplicationStatusFailedException(ee9Var.b, ee9Var.c, ee9Var.d, (Themes) null, (List) null, 56));
                        break;
                    case 3:
                        n2e0Var = new q2e0(ee9Var, true);
                        break;
                    case 4:
                        n2e0Var = new q2e0(ee9Var, !z);
                        break;
                    case 5:
                    case 6:
                        n2e0Var = new p2e0(ee9Var.d, 8, ee9Var.b, ee9Var.c);
                        break;
                    default:
                        w511.b();
                        return null;
                }
            }
            r0 r0Var = (r0) pz40Var;
            r0Var.getClass();
            r0Var.m(null, n2e0Var);
        }
        boolean z2 = this.$ignoreFailures;
        Throwable a2 = Result.a(failure);
        if (a2 == null || z2) {
            return zy11.a;
        }
        n2e0 n2e0Var2 = new n2e0(a2);
        r0 r0Var2 = (r0) pz40Var;
        r0Var2.getClass();
        r0Var2.m(null, n2e0Var2);
        throw a2;
    }
}
