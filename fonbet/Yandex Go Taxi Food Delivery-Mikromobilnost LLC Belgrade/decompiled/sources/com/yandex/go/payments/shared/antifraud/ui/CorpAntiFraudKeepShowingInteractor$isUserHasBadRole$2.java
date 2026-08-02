package com.yandex.go.payments.shared.antifraud.ui;

import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.ClientInfoResponse;
import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.CorpAccountClientInfoApi;
import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.Role;
import defpackage.cmt;
import defpackage.eue;
import defpackage.gue;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.antifraud.ui.CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2", f = "CorpAntiFraudKeepShowingInteractor.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2 extends SuspendLambda implements wls {
    final /* synthetic */ gue $corpAntiFraudData;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2(a aVar, gue gueVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$corpAntiFraudData = gueVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2(this.this$0, this.$corpAntiFraudData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        gue gueVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        gue gueVar2 = this.label;
        try {
            if (gueVar2 == 0) {
                b.b(obj);
                String Jg = this.this$0.b.Jg();
                aVar = this.this$0;
                gue gueVar3 = this.$corpAntiFraudData;
                cmt<ClientInfoResponse> a = ((CorpAccountClientInfoApi) aVar.c.getValue()).a(Jg);
                CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2$1$response$1 corpAntiFraudKeepShowingInteractor$isUserHasBadRole$2$1$response$1 = new CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2$1$response$1(1, eue.a, eue.class, "failedCheckLogin", "failedCheckLogin(Ljava/lang/Throwable;)V", 0);
                this.L$0 = null;
                this.L$1 = aVar;
                this.L$2 = gueVar3;
                this.L$3 = gueVar3;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.a(a, corpAntiFraudKeepShowingInteractor$isUserHasBadRole$2$1$response$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gueVar = gueVar3;
                gueVar2 = gueVar3;
            } else {
                if (gueVar2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gue gueVar4 = (gue) this.L$3;
                gueVar = (gue) this.L$2;
                aVar = (a) this.L$1;
                b.b(obj);
                gueVar2 = gueVar4;
            }
            List list = gueVar.e.c;
            Role role = ((ClientInfoResponse) obj).a;
            boolean G = kotlin.collections.a.G(list, role != null ? role.a : null);
            if (G) {
                aVar.a.m();
            } else {
                aVar.a.n();
            }
            return Boolean.valueOf(!G);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, kotlin.collections.a.X(scc.g("B2B.TOKEN_ERROR:ANTI_FRAUD_ACCOUNT_ERROR_TOKEN", "commonThrowable"), ":", null, null, null, 62), null, th, "commonThrowable", 2);
            return Boolean.valueOf(gueVar2.e.b);
        }
    }
}
