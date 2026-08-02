package com.yandex.smartcamera.arscene.ui;

import defpackage.l95;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.z69;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.smartcamera.arscene.ui.BoxSizeSwitcherKt$BoxSizeSwitcher$1$1", f = "BoxSizeSwitcher.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class BoxSizeSwitcherKt$BoxSizeSwitcher$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onSizeSelected;
    final /* synthetic */ z69 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxSizeSwitcherKt$BoxSizeSwitcher$1$1(z69 z69Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = z69Var;
        this.$onSizeSelected = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoxSizeSwitcherKt$BoxSizeSwitcher$1$1(this.$state, this.$onSizeSelected, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BoxSizeSwitcherKt$BoxSizeSwitcher$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(androidx.compose.runtime.f.o(new l95(29, this.$state)));
            t24 t24Var = new t24(3, this.$onSizeSelected);
            this.label = 1;
            if (t.collect(t24Var, this) == coroutineSingletons) {
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
