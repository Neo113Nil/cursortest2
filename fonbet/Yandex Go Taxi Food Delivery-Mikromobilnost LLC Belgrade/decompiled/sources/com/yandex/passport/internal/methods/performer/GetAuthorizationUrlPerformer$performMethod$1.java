package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.p7;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.q7;
import com.yandex.passport.internal.report.yd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetAuthorizationUrlPerformer$performMethod$1", f = "GetAuthorizationUrlPerformer.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetAuthorizationUrlPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.x0 $method;
    Object L$0;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAuthorizationUrlPerformer$performMethod$1(com.yandex.passport.internal.methods.x0 x0Var, t tVar, Continuation continuation) {
        super(2, continuation);
        this.$method = x0Var;
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetAuthorizationUrlPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetAuthorizationUrlPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uid uid;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uid B = com.yandex.passport.internal.util.p.B(this.$method.e().getUid());
            com.yandex.passport.internal.report.reporters.c0 c0Var = this.this$0.w;
            String valueOf = String.valueOf(B.getValue());
            Map<String, String> analyticsParams = this.$method.e().getAnalyticsParams();
            c0Var.getClass();
            ArrayList i2 = scc.i(new jd(valueOf, 3));
            com.yandex.passport.internal.report.reporters.c0.j(i2, analyticsParams);
            p7 p7Var = p7.w;
            pd[] pdVarArr = (pd[]) i2.toArray(new pd[0]);
            c0Var.f(p7Var, (pd[]) Arrays.copyOf(pdVarArr, pdVarArr.length));
            t tVar = this.this$0;
            com.yandex.passport.internal.usecase.y yVar = tVar.a;
            com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(B, ((com.yandex.passport.internal.ui.lang.a) tVar.c).b(), this.$method.e().getReturnUrl(), this.$method.e().getTld(), this.$method.e().getAnalyticsParams(), (FrontendUrlType) null, 80);
            this.L$0 = B;
            this.label = 1;
            obj = yVar.a(wVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            uid = B;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uid = (Uid) this.L$0;
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        t tVar2 = this.this$0;
        com.yandex.passport.internal.methods.x0 x0Var = this.$method;
        boolean z = value instanceof Result.Failure;
        Object obj2 = value;
        if (!z) {
            String str = ((com.yandex.passport.common.url.b) value).a;
            com.yandex.passport.internal.report.reporters.c0 c0Var2 = tVar2.w;
            String valueOf2 = String.valueOf(uid.getValue());
            Map<String, String> analyticsParams2 = x0Var.e().getAnalyticsParams();
            String i3 = com.yandex.passport.common.url.b.i(str, "track_id");
            c0Var2.getClass();
            ArrayList i4 = scc.i(new jd(valueOf2, 3), new yd(i3, 12));
            com.yandex.passport.internal.report.reporters.c0.j(i4, analyticsParams2);
            q7 q7Var = q7.w;
            pd[] pdVarArr2 = (pd[]) i4.toArray(new pd[0]);
            c0Var2.f(q7Var, (pd[]) Arrays.copyOf(pdVarArr2, pdVarArr2.length));
            obj2 = str;
        }
        return new Result(obj2);
    }
}
