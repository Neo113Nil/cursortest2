package com.yandex.go.quark.ai_assistant.impl.router;

import android.content.Context;
import com.yandex.go.quark.dynamic.h;
import defpackage.d8;
import defpackage.e6g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rdb;
import defpackage.tse;
import defpackage.wgg0;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.router.AiAssistantDynamicFeatureRouter$onLaunch$1$1$closeWithResult$1", f = "AiAssistantDynamicFeatureRouter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AiAssistantDynamicFeatureRouter$onLaunch$1$1$closeWithResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ wgg0 $quarkApi;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantDynamicFeatureRouter$onLaunch$1$1$closeWithResult$1(wgg0 wgg0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$quarkApi = wgg0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiAssistantDynamicFeatureRouter$onLaunch$1$1$closeWithResult$1(this.$quarkApi, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiAssistantDynamicFeatureRouter$onLaunch$1$1$closeWithResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = (h) ((xvf0) ((e6g) this.$quarkApi).d).get();
            Context context = this.this$0.D;
            this.label = 1;
            obj = hVar.e(context, this);
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
        this.this$0.r(new d8(2, (rdb) obj));
        return zy11.a;
    }
}
