package com.yandex.go.places.impl.navigation.common.base;

import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$PresentType;
import defpackage.a5g;
import defpackage.at3;
import defpackage.cb0;
import defpackage.evu0;
import defpackage.g830;
import defpackage.g8e;
import defpackage.h830;
import defpackage.j24;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9c0;
import defpackage.q9c0;
import defpackage.r9c0;
import defpackage.s9c0;
import defpackage.sls;
import defpackage.t9c0;
import defpackage.tse;
import defpackage.u3m;
import defpackage.u9c0;
import defpackage.ul80;
import defpackage.v9c0;
import defpackage.w511;
import defpackage.w9c0;
import defpackage.wls;
import defpackage.x9c0;
import defpackage.y9c0;
import defpackage.z9c0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1", f = "BasePlacesRouter.kt", l = {376}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $doOnGoBack;
    final /* synthetic */ boolean $isPayloadUpdating;
    final /* synthetic */ ul80 $payload;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La5g;", "it", "Lh830;", "<anonymous>", "(La5g;)Lh830;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1$2", f = "BasePlacesRouter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ ul80 $payload;
        final /* synthetic */ u3m $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(u3m u3mVar, ul80 ul80Var, Continuation continuation) {
            super(2, continuation);
            this.$screen = u3mVar;
            this.$payload = ul80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$screen, this.$payload, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((a5g) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String a = this.$screen.a.a();
            String str = this.$screen.b;
            MorphlexScreenPayload$PresentType morphlexScreenPayload$PresentType = MorphlexScreenPayload$PresentType.FULLSCREEN;
            List singletonList = Collections.singletonList(new g830(MorphlexScreenPayload$ParamType.AUTH, true));
            String str2 = this.$payload.d;
            Map z = str2 != null ? g8e.z("query", str2) : null;
            String str3 = this.$screen.d;
            return new h830(a, str, morphlexScreenPayload$PresentType, null, singletonList, z, evu0.J(str3) ? null : str3, false, null, false, null, 1928);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1(d dVar, ul80 ul80Var, boolean z, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = ul80Var;
        this.$isPayloadUpdating = z;
        this.$doOnGoBack = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1(this.this$0, this.$payload, this.$isPayloadUpdating, this.$doOnGoBack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.flex.b bVar = this.this$0.D;
            String str = this.$payload.c;
            this.label = 1;
            obj = bVar.c(str, this);
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
        u3m u3mVar = (u3m) obj;
        z9c0 z9c0Var = u3mVar != null ? u3mVar.a : null;
        boolean l = jl40.l(z9c0Var, v9c0.b);
        zy11 zy11Var = zy11.a;
        if (l || jl40.l(z9c0Var, w9c0.b) || jl40.l(z9c0Var, y9c0.b) || jl40.l(z9c0Var, r9c0.b) || jl40.l(z9c0Var, x9c0.b) || jl40.l(z9c0Var, s9c0.b) || jl40.l(z9c0Var, t9c0.b) || jl40.l(z9c0Var, u9c0.b) || (z9c0Var instanceof q9c0) || z9c0Var == null) {
            return zy11Var;
        }
        if (!z9c0Var.equals(p9c0.b)) {
            w511.b();
            return null;
        }
        b T = this.this$0.T();
        j24 j24Var = new j24(8, this.this$0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(u3mVar, this.$payload, null);
        cb0 cb0Var = new cb0(2, this.this$0, this.$doOnGoBack);
        boolean z = this.$isPayloadUpdating;
        at3 at3Var = new at3(27);
        d dVar = T.a;
        dVar.S(new BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2(anonymousClass2, j24Var, dVar, z, at3Var, cb0Var, null));
        return zy11Var;
    }
}
