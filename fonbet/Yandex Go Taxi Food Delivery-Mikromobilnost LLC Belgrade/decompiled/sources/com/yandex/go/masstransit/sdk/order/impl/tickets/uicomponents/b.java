package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ oz40 c;

    public b(rol0 rol0Var, float f, oz40 oz40Var) {
        this.a = rol0Var;
        this.b = f;
        this.c = oz40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1 mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1) {
            mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1 = (MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1 = new MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
