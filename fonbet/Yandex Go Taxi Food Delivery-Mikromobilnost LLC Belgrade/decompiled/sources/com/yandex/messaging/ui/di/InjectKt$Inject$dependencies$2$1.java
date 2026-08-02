package com.yandex.messaging.ui.di;

import androidx.compose.runtime.g;
import defpackage.hs31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rwi;
import defpackage.tls;
import defpackage.w6f0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw6f0;", "Lrwi;", "Lzy11;", "<anonymous>", "(Lw6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.di.InjectKt$Inject$dependencies$2$1", f = "Inject.kt", l = {39, 40}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InjectKt$Inject$dependencies$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $activityComponentProvider;
    final /* synthetic */ tls $viewModelFactoryProvider;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InjectKt$Inject$dependencies$2$1(tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$viewModelFactoryProvider = tlsVar;
        this.$activityComponentProvider = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InjectKt$Inject$dependencies$2$1 injectKt$Inject$dependencies$2$1 = new InjectKt$Inject$dependencies$2$1(this.$viewModelFactoryProvider, this.$activityComponentProvider, continuation);
        injectKt$Inject$dependencies$2$1.L$0 = obj;
        return injectKt$Inject$dependencies$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InjectKt$Inject$dependencies$2$1) create((w6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r1 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w6f0 w6f0Var;
        Object invoke;
        w6f0 w6f0Var2;
        hs31 hs31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            w6f0Var = (w6f0) this.L$0;
            tls tlsVar = this.$viewModelFactoryProvider;
            this.L$0 = w6f0Var;
            this.label = 1;
            invoke = tlsVar.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hs31Var = (hs31) this.L$1;
                w6f0Var2 = (w6f0) this.L$0;
                b.b(obj);
                if (obj == null) {
                    ny61.u();
                    return null;
                }
                ((g) w6f0Var2).setValue(new rwi(hs31Var));
                return zy11.a;
            }
            w6f0 w6f0Var3 = (w6f0) this.L$0;
            b.b(obj);
            invoke = obj;
            w6f0Var = w6f0Var3;
        }
        hs31 hs31Var2 = (hs31) invoke;
        tls tlsVar2 = this.$activityComponentProvider;
        this.L$0 = w6f0Var;
        this.L$1 = hs31Var2;
        this.label = 2;
        Object invoke2 = tlsVar2.invoke(this);
        if (invoke2 != coroutineSingletons) {
            w6f0 w6f0Var4 = w6f0Var;
            obj = invoke2;
            w6f0Var2 = w6f0Var4;
            hs31Var = hs31Var2;
            if (obj == null) {
            }
        }
        return coroutineSingletons;
    }
}
