package com.yandex.go.explorer.impl.navigation;

import com.yandex.go.explorer.impl.ui.map.m;
import defpackage.fto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wuo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$updateButtonState$1", f = "ExplorerRouterImpl.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$updateButtonState$1 extends SuspendLambda implements wls {
    final /* synthetic */ m $uiStateProvider;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$updateButtonState$1(c cVar, m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$uiStateProvider = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$updateButtonState$1(this.this$0, this.$uiStateProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$updateButtonState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean e = this.this$0.G.e();
            m mVar = this.$uiStateProvider;
            this.Z$0 = e;
            this.label = 1;
            obj = mVar.b(e, this);
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
        fto ftoVar = (fto) obj;
        zy11 zy11Var = zy11.a;
        if (ftoVar == null) {
            return zy11Var;
        }
        fto ftoVar2 = (fto) this.this$0.E.b.getValue();
        wuo wuoVar = this.this$0.E;
        fto a = fto.a(ftoVar, ftoVar2 != null ? ftoVar2.e : false, ftoVar2 != null ? ftoVar2.f : false, 15);
        r0 r0Var = wuoVar.b;
        r0Var.getClass();
        r0Var.m(null, a);
        return zy11Var;
    }
}
