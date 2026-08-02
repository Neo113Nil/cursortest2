package com.yandex.go.superapp.searchbar.impl.presentation;

import com.yandex.go.superapp.searchbar.impl.domain.c;
import defpackage.mvg;
import defpackage.ndw0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.udw0;
import defpackage.wls;
import defpackage.ydw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.searchbar.impl.presentation.SuperappSearchbarPresenter$renderInitialUiStateImmediately$1", f = "SuperappSearchbarPresenter.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSearchbarPresenter$renderInitialUiStateImmediately$1 extends SuspendLambda implements wls {
    final /* synthetic */ ndw0 $configuration;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSearchbarPresenter$renderInitialUiStateImmediately$1(a aVar, ndw0 ndw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$configuration = ndw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSearchbarPresenter$renderInitialUiStateImmediately$1(this.this$0, this.$configuration, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSearchbarPresenter$renderInitialUiStateImmediately$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ydw0 ydw0Var;
        udw0 udw0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ydw0Var = (ydw0) this.this$0.D.c.a.getValue();
            c cVar = this.this$0.C;
            ndw0 ndw0Var = this.$configuration;
            this.L$0 = ydw0Var;
            this.label = 1;
            obj = cVar.a(ndw0Var, ydw0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                udw0Var = (udw0) this.L$2;
                b.b(obj);
                udw0Var.render(obj);
                return zy11.a;
            }
            ydw0Var = (ydw0) this.L$0;
            b.b(obj);
        }
        udw0 udw0Var2 = (udw0) this.this$0.Dg();
        a aVar = this.this$0;
        ndw0 ndw0Var2 = this.$configuration;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = udw0Var2;
        this.label = 2;
        obj = a.Kg(aVar, ndw0Var2, ydw0Var, (Float) obj, this);
        if (obj != coroutineSingletons) {
            udw0Var = udw0Var2;
            udw0Var.render(obj);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
