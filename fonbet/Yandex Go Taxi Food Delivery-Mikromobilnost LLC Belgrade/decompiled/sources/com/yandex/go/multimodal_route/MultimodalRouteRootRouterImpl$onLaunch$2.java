package com.yandex.go.multimodal_route;

import android.content.Context;
import com.yandex.go.multimodal_route.interactors.b;
import defpackage.c0g;
import defpackage.c4g;
import defpackage.fl10;
import defpackage.fu40;
import defpackage.i6r;
import defpackage.ju40;
import defpackage.lu40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ut40;
import defpackage.vt40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.MultimodalRouteRootRouterImpl$onLaunch$2", f = "MultimodalRouteRootRouterImpl.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteRootRouterImpl$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ b $onboardingInteractor;
    final /* synthetic */ ju40 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteRootRouterImpl$onLaunch$2(b bVar, a aVar, ju40 ju40Var, Continuation continuation) {
        super(2, continuation);
        this.$onboardingInteractor = bVar;
        this.this$0 = aVar;
        this.$payload = ju40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRouteRootRouterImpl$onLaunch$2(this.$onboardingInteractor, this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRouteRootRouterImpl$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.$onboardingInteractor;
            this.label = 1;
            obj = bVar.b(this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a aVar = this.this$0;
        ju40 ju40Var = this.$payload;
        if (booleanValue) {
            fu40 fu40Var = (fu40) ju40Var;
            c4g Q = aVar.Q();
            fl10 fl10Var = new fl10(Q.b());
            c0g c0gVar = (c0g) ((i6r) Q.a);
            b G5 = c0gVar.G5();
            c b = c0gVar.b();
            q5z.h(b);
            tt2 tt2Var = (tt2) c0gVar.z.n.get();
            q5z.h(tt2Var);
            com.yandex.go.multimodal_route.ui.onboarding.c cVar = new com.yandex.go.multimodal_route.ui.onboarding.c(G5, b, tt2Var, Q.b());
            b G52 = c0gVar.G5();
            Context H1 = c0gVar.H1();
            q5z.h(H1);
            aVar.A(new ut40(fl10Var, cVar, G52, H1, Q.a()), new vt40(fu40Var.d, fu40Var.b), new lu40(aVar, fu40Var, 0));
        } else {
            aVar.R((fu40) ju40Var);
        }
        return zy11.a;
    }
}
