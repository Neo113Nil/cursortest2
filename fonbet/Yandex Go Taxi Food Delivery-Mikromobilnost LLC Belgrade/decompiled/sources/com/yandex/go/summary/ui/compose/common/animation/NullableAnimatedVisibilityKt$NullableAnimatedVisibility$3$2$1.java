package com.yandex.go.summary.ui.compose.common.animation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.sz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1", f = "NullableAnimatedVisibility.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $lastNonNullValue;
    final /* synthetic */ Object $value;
    final /* synthetic */ sz40 $visibleState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1(Object obj, sz40 sz40Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$value = obj;
        this.$visibleState = sz40Var;
        this.$lastNonNullValue = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1(this.$value, this.$visibleState, this.$lastNonNullValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1 nullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1 = (NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$value == null && this.$visibleState.a()) {
            this.$lastNonNullValue.setValue(null);
        }
        return zy11.a;
    }
}
