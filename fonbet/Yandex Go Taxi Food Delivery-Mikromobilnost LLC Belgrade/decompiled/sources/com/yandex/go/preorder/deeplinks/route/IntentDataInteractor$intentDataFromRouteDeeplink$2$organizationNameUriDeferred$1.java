package com.yandex.go.preorder.deeplinks.route;

import defpackage.c2l0;
import defpackage.lj80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oj80;
import defpackage.tse;
import defpackage.w2h;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.IntentDataInteractor$intentDataFromRouteDeeplink$2$organizationNameUriDeferred$1", f = "IntentDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class IntentDataInteractor$intentDataFromRouteDeeplink$2$organizationNameUriDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ c2l0 $deeplink;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentDataInteractor$intentDataFromRouteDeeplink$2$organizationNameUriDeferred$1(b bVar, c2l0 c2l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$deeplink = c2l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntentDataInteractor$intentDataFromRouteDeeplink$2$organizationNameUriDeferred$1(this.this$0, this.$deeplink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntentDataInteractor$intentDataFromRouteDeeplink$2$organizationNameUriDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        w2h w2hVar = this.this$0.f;
        c2l0 c2l0Var = this.$deeplink;
        String str = c2l0Var.C;
        String str2 = c2l0Var.B;
        if (str == null || str2 == null) {
            return null;
        }
        return ((xnt) w2hVar.a).e(new lj80(str, new oj80(str2)), lj80.Companion.serializer());
    }
}
