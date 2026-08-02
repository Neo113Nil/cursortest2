package com.yandex.go.user_profile.fullscreen.router;

import com.yandex.go.user_profile.fullscreen.models.l;
import com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi;
import defpackage.dg41;
import defpackage.ff41;
import defpackage.fn21;
import defpackage.gg41;
import defpackage.hls;
import defpackage.hs21;
import defpackage.ils;
import defpackage.mff0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qu;
import defpackage.rqo;
import defpackage.scg;
import defpackage.t1g;
import defpackage.tse;
import defpackage.wls;
import defpackage.yio0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.router.UserProfileFeatureRouter$onLaunch$1", f = "UserProfileFeatureRouter.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserProfileFeatureRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ mff0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFeatureRouter$onLaunch$1(a aVar, mff0 mff0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = mff0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileFeatureRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileFeatureRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t1g t1gVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hls hlsVar = (hls) this.this$0.D.get();
            hs21 hs21Var = new hs21(this.this$0);
            hlsVar.getClass();
            t1g t1gVar2 = new t1g(new ils(), hlsVar, hs21Var);
            rqo rqoVar = hlsVar.b;
            q5z.h(rqoVar);
            l lVar = new l(rqoVar);
            ru.yandex.taxi.am.token.a aVar = hlsVar.f;
            q5z.h(aVar);
            fn21 fn21Var = hlsVar.g;
            q5z.h(fn21Var);
            com.yandex.go.user_profile.fullscreen.domain.a aVar2 = new com.yandex.go.user_profile.fullscreen.domain.a(lVar, aVar, fn21Var, (UserProfileJsNativeApi) t1gVar2.g.get());
            boolean z = this.$payload.b;
            this.L$0 = t1gVar2;
            this.label = 1;
            obj = aVar2.a(z, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            t1gVar = t1gVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t1gVar = (t1g) this.L$0;
            b.b(obj);
        }
        UiWebViewConfig uiWebViewConfig = (UiWebViewConfig) obj;
        zy11 zy11Var = zy11.a;
        if (uiWebViewConfig == null) {
            this.this$0.r(new qu(9));
            return zy11Var;
        }
        UserProfileJsNativeApi userProfileJsNativeApi = (UserProfileJsNativeApi) t1gVar.g.get();
        gg41 b = ((scg) ((ff41) t1gVar.b.get())).b();
        q5z.i(b);
        this.this$0.A(b, new dg41(uiWebViewConfig, userProfileJsNativeApi, null, null, null, null, null, 252), new yio0(29, this.this$0));
        return zy11Var;
    }
}
