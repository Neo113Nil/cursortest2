package com.yandex.go.navigator.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.pe50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.navigation.NavigatorRouter$startFromPayload$2", f = "NavigatorRouter.kt", l = {271, 272}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorRouter$startFromPayload$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorRouter$startFromPayload$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorRouter$startFromPayload$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorRouter$startFromPayload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oe50 oe50Var;
        zy11 zy11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.address.a aVar = this.this$0.K;
            this.label = 1;
            obj = aVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oe50Var = (oe50) this.L$0;
                kotlin.b.b(obj);
                List list = (List) obj;
                zy11Var = zy11.a;
                if (oe50Var != null || list.isEmpty()) {
                    this.this$0.T();
                    this.this$0.X();
                    return zy11Var;
                }
                this.this$0.V(true, new pe50(oe50Var, list));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        oe50 oe50Var2 = (oe50) obj;
        com.yandex.go.navigator.address.a aVar2 = this.this$0.K;
        this.L$0 = oe50Var2;
        this.label = 2;
        Serializable c = aVar2.c(this);
        if (c != coroutineSingletons) {
            oe50Var = oe50Var2;
            obj = c;
            List list2 = (List) obj;
            zy11Var = zy11.a;
            if (oe50Var != null) {
            }
            this.this$0.T();
            this.this$0.X();
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
