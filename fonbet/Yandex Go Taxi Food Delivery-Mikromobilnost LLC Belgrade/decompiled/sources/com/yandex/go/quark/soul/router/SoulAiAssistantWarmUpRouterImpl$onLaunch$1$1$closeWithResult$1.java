package com.yandex.go.quark.soul.router;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.quark.dynamic.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e6g;
import defpackage.mvg;
import defpackage.n9t0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rdb;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgg0;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.activity.MainActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.soul.router.SoulAiAssistantWarmUpRouterImpl$onLaunch$1$1$closeWithResult$1", f = "SoulAiAssistantWarmUpRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SoulAiAssistantWarmUpRouterImpl$onLaunch$1$1$closeWithResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ n9t0 $payload;
    final /* synthetic */ wgg0 $quarkApi;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoulAiAssistantWarmUpRouterImpl$onLaunch$1$1$closeWithResult$1(wgg0 wgg0Var, c cVar, n9t0 n9t0Var, Continuation continuation) {
        super(2, continuation);
        this.$quarkApi = wgg0Var;
        this.this$0 = cVar;
        this.$payload = n9t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SoulAiAssistantWarmUpRouterImpl$onLaunch$1$1$closeWithResult$1(this.$quarkApi, this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SoulAiAssistantWarmUpRouterImpl$onLaunch$1$1$closeWithResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = (h) ((xvf0) ((e6g) this.$quarkApi).d).get();
            MainActivity mainActivity = this.this$0.D;
            this.label = 1;
            obj = hVar.e(mainActivity, this);
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
        rdb rdbVar = (rdb) obj;
        c cVar = this.this$0;
        n9t0 n9t0Var = this.$payload;
        cVar.getClass();
        View view = ((com.yandex.go.quark.dynamic.c) rdbVar).a;
        View decorView = cVar.D.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(view, new ViewGroup.LayoutParams(0, 0));
            pzt0 pzt0Var = cVar.H;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            cVar.H = tje.N(cVar.o(), null, CoroutineStart.UNDISPATCHED, new SoulAiAssistantWarmUpRouterImpl$warmUp$1(rdbVar, viewGroup, n9t0Var, cVar, null), 1);
        }
        return zy11.a;
    }
}
