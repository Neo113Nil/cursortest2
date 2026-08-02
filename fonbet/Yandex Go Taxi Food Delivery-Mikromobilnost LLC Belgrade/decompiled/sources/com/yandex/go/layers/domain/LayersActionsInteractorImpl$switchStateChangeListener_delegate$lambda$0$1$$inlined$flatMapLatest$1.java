package com.yandex.go.layers.domain;

import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.uud0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.layers.domain.LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1", f = "LayersActionsInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ nm00 $new$inlined;
    final /* synthetic */ nm00 $previous$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1(Continuation continuation, g gVar, nm00 nm00Var, nm00 nm00Var2) {
        super(3, continuation);
        this.this$0 = gVar;
        this.$previous$inlined = nm00Var;
        this.$new$inlined = nm00Var2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1 layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1 = new LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$previous$inlined, this.$new$inlined);
        layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1.L$1 = obj2;
        return layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$1$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr[] tprVarArr = (tpr[]) g.a(this.this$0, this.$previous$inlined, this.$new$inlined, (uud0) obj2).toArray(new tpr[0]);
            tpr[] tprVarArr2 = (tpr[]) Arrays.copyOf(tprVarArr, tprVarArr.length);
            h K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(tprVarArr2, tprVarArr2.length));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(K, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
