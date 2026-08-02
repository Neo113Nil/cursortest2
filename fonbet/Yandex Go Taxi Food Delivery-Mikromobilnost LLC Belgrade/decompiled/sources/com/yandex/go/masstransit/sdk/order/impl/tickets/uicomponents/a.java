package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import defpackage.ny61;
import defpackage.oz40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ float b;
    public final /* synthetic */ oz40 c;

    public a(vpr vprVar, float f, oz40 oz40Var) {
        this.a = vprVar;
        this.b = f;
        this.c = oz40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1 mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1) {
            mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1 = (MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Number) obj).intValue() >= ((int) this.b) && !((Boolean) this.c.getValue()).booleanValue()) {
                        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1 = new MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
