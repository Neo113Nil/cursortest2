package com.yandex.go.quark.soul.router;

import android.view.ViewGroup;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.n9t0;
import defpackage.ndb;
import defpackage.ny61;
import defpackage.odb;
import defpackage.ora1;
import defpackage.p9t0;
import defpackage.pdb;
import defpackage.qdb;
import defpackage.qu;
import defpackage.rdb;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.soul.router.SoulAiAssistantWarmUpRouterImpl$warmUp$1", f = "SoulAiAssistantWarmUpRouterImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SoulAiAssistantWarmUpRouterImpl$warmUp$1 extends SuspendLambda implements wls {
    final /* synthetic */ rdb $chatViewController;
    final /* synthetic */ n9t0 $payload;
    final /* synthetic */ ViewGroup $rootView;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoulAiAssistantWarmUpRouterImpl$warmUp$1(rdb rdbVar, ViewGroup viewGroup, n9t0 n9t0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$chatViewController = rdbVar;
        this.$rootView = viewGroup;
        this.$payload = n9t0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SoulAiAssistantWarmUpRouterImpl$warmUp$1 soulAiAssistantWarmUpRouterImpl$warmUp$1 = new SoulAiAssistantWarmUpRouterImpl$warmUp$1(this.$chatViewController, this.$rootView, this.$payload, this.this$0, continuation);
        soulAiAssistantWarmUpRouterImpl$warmUp$1.L$0 = obj;
        return soulAiAssistantWarmUpRouterImpl$warmUp$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SoulAiAssistantWarmUpRouterImpl$warmUp$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                bvf0.t(tseVar);
                g b = ((com.yandex.go.quark.dynamic.c) this.$chatViewController).b();
                SoulAiAssistantWarmUpRouterImpl$warmUp$1$state$1 soulAiAssistantWarmUpRouterImpl$warmUp$1$state$1 = new SoulAiAssistantWarmUpRouterImpl$warmUp$1$state$1(2, null);
                this.L$0 = null;
                this.label = 1;
                obj = e.x(b, soulAiAssistantWarmUpRouterImpl$warmUp$1$state$1, this);
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
            qdb qdbVar = (qdb) obj;
            if (!jl40.l(qdbVar, pdb.a)) {
                if (jl40.l(qdbVar, odb.a)) {
                    this.$rootView.removeView(((com.yandex.go.quark.dynamic.c) this.$chatViewController).a);
                    String str = this.$payload.b;
                    if (str != null) {
                        ora1.e(((com.yandex.go.quark.dynamic.c) this.$chatViewController).d.a, str);
                    }
                    this.this$0.r(new p9t0(0, this.$chatViewController));
                } else {
                    if (!jl40.l(qdbVar, ndb.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewGroup viewGroup = this.$rootView;
                    rdb rdbVar = this.$chatViewController;
                    viewGroup.removeView(((com.yandex.go.quark.dynamic.c) rdbVar).a);
                    ((com.yandex.go.quark.dynamic.c) rdbVar).a();
                    this.this$0.r(new qu(9));
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            ViewGroup viewGroup2 = this.$rootView;
            rdb rdbVar2 = this.$chatViewController;
            viewGroup2.removeView(((com.yandex.go.quark.dynamic.c) rdbVar2).a);
            ((com.yandex.go.quark.dynamic.c) rdbVar2).a();
            throw e;
        }
    }
}
