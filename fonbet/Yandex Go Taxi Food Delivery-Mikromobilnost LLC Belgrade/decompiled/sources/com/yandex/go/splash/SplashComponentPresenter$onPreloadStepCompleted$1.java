package com.yandex.go.splash;

import com.yandex.go.lifecycle.ObtainType;
import com.yandex.go.preload.e;
import com.yandex.go.splash.data.a;
import defpackage.bst0;
import defpackage.iqt0;
import defpackage.jqt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.SplashComponentPresenter$onPreloadStepCompleted$1", f = "SplashComponentPresenter.kt", l = {39, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SplashComponentPresenter$onPreloadStepCompleted$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ jqt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashComponentPresenter$onPreloadStepCompleted$1(jqt0 jqt0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jqt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashComponentPresenter$onPreloadStepCompleted$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashComponentPresenter$onPreloadStepCompleted$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bst0 bst0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0.A;
            ObtainType obtainType = ObtainType.DO_NOT_WAIT;
            this.label = 1;
            obj = aVar.b(obtainType, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bst0Var = (bst0) this.L$0;
                b.b(obj);
                ((iqt0) this.this$0.Dg()).Md(bst0Var);
                return zy11.a;
            }
            b.b(obj);
        }
        bst0 bst0Var2 = (bst0) obj;
        e eVar = this.this$0.y;
        this.L$0 = bst0Var2;
        this.label = 2;
        if (eVar.d(this) != coroutineSingletons) {
            bst0Var = bst0Var2;
            ((iqt0) this.this$0.Dg()).Md(bst0Var);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
