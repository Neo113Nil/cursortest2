package com.yandex.plus.home;

import com.yandex.plus.log.api.LogPriority;
import defpackage.lj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.wa20;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.UserInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Llj;", "account", "Lzy11;", "<anonymous>", "(Ltse;Llj;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$5", f = "PlusHomeSdkImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusHomeSdkImpl$5 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeSdkImpl$5(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusHomeSdkImpl$5 plusHomeSdkImpl$5 = new PlusHomeSdkImpl$5(this.this$0, (Continuation) obj3);
        plusHomeSdkImpl$5.L$0 = (lj) obj2;
        zy11 zy11Var = zy11.a;
        plusHomeSdkImpl$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lj ljVar = (lj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        wa20 wa20Var = (wa20) this.this$0.d.w.getValue();
        if (wa20Var != null) {
            rkd0 rkd0Var = this.this$0.b.A;
            LogPriority logPriority = LogPriority.INFO;
            if (rkd0Var.e(logPriority)) {
                rkd0Var.b(logPriority, "PlusHomeSdkImpl", "Update analytics user consumer: account=" + ljVar, null);
            }
            Long id = ljVar.getId();
            String l = id != null ? id.toString() : null;
            if (l != null) {
                IReporterYandex iReporterYandex = wa20Var.b;
                iReporterYandex.reportUserInfoEvent(new UserInfo(l));
                iReporterYandex.setUserProfileID(l);
                wa20Var.a.a(l);
            } else {
                IReporterYandex iReporterYandex2 = wa20Var.b;
                iReporterYandex2.reportUserInfoEvent(new UserInfo(null));
                iReporterYandex2.setUserProfileID(null);
                wa20Var.a.a(null);
            }
        }
        return zy11.a;
    }
}
