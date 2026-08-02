package com.yandex.go.taxi.summary.mobilityhub.router;

import com.yandex.go.taxi.summary.mobilityhub.interactor.j;
import com.yandex.go.taxi.summary.mobilityhub.interactor.l;
import com.yandex.go.zone.repository.o;
import defpackage.c0g;
import defpackage.ck31;
import defpackage.i6r;
import defpackage.iv20;
import defpackage.m020;
import defpackage.mvg;
import defpackage.n3g;
import defpackage.nw20;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.tt2;
import defpackage.w3r0;
import defpackage.w811;
import defpackage.wls;
import defpackage.wmm;
import defpackage.z721;
import defpackage.zy11;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.search.suggest.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.router.MobilityHubVerticalRootRouterImpl$onLaunch$1", f = "MobilityHubVerticalRootRouterImpl.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubVerticalRootRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ nw20 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubVerticalRootRouterImpl$onLaunch$1(a aVar, nw20 nw20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = nw20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobilityHubVerticalRootRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobilityHubVerticalRootRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            n3g P = this.this$0.P();
            c0g c0gVar = (c0g) ((i6r) P.m);
            w3r0 T2 = c0gVar.T2();
            zzf zzfVar = c0gVar.z;
            String str = (String) P.l;
            ck31 d1 = c0gVar.d1();
            q5z.h(d1);
            l lVar = new l(str, d1, zzfVar.d());
            tt2 k = c0gVar.k();
            q5z.h(k);
            o I6 = c0gVar.I6();
            q5z.h(I6);
            com.yandex.go.zone.interactors.b n = zzfVar.n();
            i r1 = c0gVar.r1();
            q5z.h(r1);
            com.yandex.go.route.interactor.b W5 = c0gVar.W5();
            q5z.h(W5);
            z721 z721Var = new z721(k, W5, n, I6, r1);
            tt2 k2 = c0gVar.k();
            q5z.h(k2);
            com.yandex.go.route.interactor.b W52 = c0gVar.W5();
            q5z.h(W52);
            w811 w811Var = new w811(k2, W52, (com.yandex.go.taxi.summary.mobilityhub.repository.b) P.c.get(), P.a());
            com.yandex.go.taxi.summary.mobilityhub.deeplink.b A5 = c0gVar.A5();
            tt2 k3 = c0gVar.k();
            q5z.h(k3);
            com.yandex.go.route.interactor.b W53 = c0gVar.W5();
            q5z.h(W53);
            j jVar = new j(T2, lVar, z721Var, w811Var, A5, new wmm(k3, W53));
            m020 m020Var = new m020(9, this.this$0);
            iv20 iv20Var = this.$payload.a;
            this.label = 1;
            if (jVar.a(m020Var, iv20Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
