package com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest;

import com.yandex.fintechsdk.core.network.api.exception.NetworkException;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester.c;
import defpackage.a6o;
import defpackage.bia1;
import defpackage.gvu0;
import defpackage.ig5;
import defpackage.j6p;
import defpackage.jh5;
import defpackage.l6p;
import defpackage.mvg;
import defpackage.n6p;
import defpackage.ny61;
import defpackage.ozo;
import defpackage.sh5;
import defpackage.tse;
import defpackage.vm50;
import defpackage.w511;
import defpackage.wls;
import defpackage.z22;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.FTRequestActionHandler$handle$1", f = "FTRequestActionHandler.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FTRequestActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ jh5 $context;
    final /* synthetic */ n6p $errorHandler;
    final /* synthetic */ sh5 $stateManager;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTRequestActionHandler$handle$1(a aVar, ig5 ig5Var, n6p n6pVar, jh5 jh5Var, sh5 sh5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = ig5Var;
        this.$errorHandler = n6pVar;
        this.$context = jh5Var;
        this.$stateManager = sh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FTRequestActionHandler$handle$1(this.this$0, this.$action, this.$errorHandler, this.$context, this.$stateManager, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FTRequestActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.a).a(new l6p((j6p) this.$action, "ft_request_action", null));
            c cVar = this.this$0.w;
            ig5 ig5Var = this.$action;
            this.label = 1;
            b = cVar.b(ig5Var, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        ig5 ig5Var2 = this.$action;
        a aVar = this.this$0;
        n6p n6pVar = this.$errorHandler;
        jh5 jh5Var = this.$context;
        sh5 sh5Var = this.$stateManager;
        if (!(b instanceof Result.Failure)) {
            Map map = (Map) b;
            j6p j6pVar = (j6p) ig5Var2;
            List list = j6pVar.l;
            if (list != null) {
                bia1.j(sh5Var, list, new Integer(200));
            }
            Throwable a = Result.a(aVar.b.s(map, j6pVar.k));
            if (a != null) {
                n6pVar.a(a);
            }
            vm50 vm50Var = j6pVar.m;
            if (vm50Var != null) {
                jh5Var.a.dispatch(vm50Var);
            }
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar.a).a(new l6p(j6pVar, "ft_request_action_success", null));
        }
        a aVar2 = this.this$0;
        ig5 ig5Var3 = this.$action;
        jh5 jh5Var2 = this.$context;
        n6p n6pVar2 = this.$errorHandler;
        sh5 sh5Var2 = this.$stateManager;
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            if (a2 instanceof NetworkException.BadCodeException) {
                z22 z22Var = aVar2.a;
                j6p j6pVar2 = (j6p) ig5Var3;
                NetworkException.BadCodeException badCodeException = (NetworkException.BadCodeException) a2;
                int code = badCodeException.getCode();
                kotlinx.serialization.json.c body = badCodeException.getBody();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed with code " + code);
                a6o a6oVar = j6pVar2.b;
                ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type = a6oVar != null ? a6oVar.a : null;
                int i2 = errorBodyLoggingRule$Type == null ? -1 : ozo.a[errorBodyLoggingRule$Type.ordinal()];
                if (i2 != -1 && i2 != 1) {
                    if (i2 == 2) {
                        sb.append(", body: " + (body != null ? body.toString() : null));
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        Integer num = a6oVar.b;
                        if (num != null) {
                            sb.append(", body snippet: " + (body != null ? gvu0.A0(num.intValue(), body.toString()) : null));
                        }
                    }
                }
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new l6p(j6pVar2, "ft_request_action_failed_response", sb.toString()));
                List list2 = j6pVar2.l;
                if (list2 != null) {
                    bia1.j(sh5Var2, list2, new Integer(badCodeException.getCode()));
                }
                Map map2 = j6pVar2.d;
                if (map2 != null) {
                    kotlinx.serialization.json.c body2 = badCodeException.getBody();
                    Map g = body2 != null ? bia1.g(body2) : null;
                    if (g == null) {
                        g = kotlin.collections.b.f();
                    }
                    Throwable a3 = Result.a(aVar2.b.s(g, map2));
                    if (a3 != null) {
                        n6pVar2.a(a3);
                    }
                }
                vm50 vm50Var2 = j6pVar2.e;
                if (vm50Var2 != null) {
                    jh5Var2.a.dispatch(vm50Var2);
                }
            } else {
                n6pVar2.a(a2);
            }
        }
        return zy11.a;
    }
}
