package com.yandex.go.routestops.v2.ui.utils;

import defpackage.bpl0;
import defpackage.jl40;
import defpackage.l3t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.ui.utils.DragNDropKt$rememberDragNDropState$1$1", f = "DragNDrop.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DragNDropKt$rememberDragNDropState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yx40 $draggingIndex;
    final /* synthetic */ l3t0 $itemBounds;
    final /* synthetic */ oz40 $localList;
    final /* synthetic */ bpl0 $safeList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragNDropKt$rememberDragNDropState$1$1(yx40 yx40Var, bpl0 bpl0Var, oz40 oz40Var, l3t0 l3t0Var, Continuation continuation) {
        super(2, continuation);
        this.$draggingIndex = yx40Var;
        this.$safeList = bpl0Var;
        this.$localList = oz40Var;
        this.$itemBounds = l3t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DragNDropKt$rememberDragNDropState$1$1(this.$draggingIndex, this.$safeList, this.$localList, this.$itemBounds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DragNDropKt$rememberDragNDropState$1$1 dragNDropKt$rememberDragNDropState$1$1 = (DragNDropKt$rememberDragNDropState$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dragNDropKt$rememberDragNDropState$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$draggingIndex.getIntValue() == -1 && !jl40.l(this.$safeList, this.$localList.getValue())) {
            this.$localList.setValue(this.$safeList);
            this.$itemBounds.clear();
        }
        return zy11.a;
    }
}
