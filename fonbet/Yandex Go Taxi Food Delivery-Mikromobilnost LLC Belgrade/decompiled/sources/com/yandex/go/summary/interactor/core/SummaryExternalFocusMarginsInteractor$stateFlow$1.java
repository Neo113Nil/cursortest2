package com.yandex.go.summary.interactor.core;

import android.graphics.Rect;
import defpackage.jfv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vhv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "mapContentHeight", "Lvhv0;", "summaryMarginsState", "Landroid/graphics/Rect;", "<anonymous>", "(ILvhv0;)Landroid/graphics/Rect;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryExternalFocusMarginsInteractor$stateFlow$1", f = "SummaryExternalFocusMarginsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryExternalFocusMarginsInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jfv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryExternalFocusMarginsInteractor$stateFlow$1(jfv0 jfv0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = jfv0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        SummaryExternalFocusMarginsInteractor$stateFlow$1 summaryExternalFocusMarginsInteractor$stateFlow$1 = new SummaryExternalFocusMarginsInteractor$stateFlow$1(this.this$0, (Continuation) obj3);
        summaryExternalFocusMarginsInteractor$stateFlow$1.I$0 = intValue;
        summaryExternalFocusMarginsInteractor$stateFlow$1.L$0 = (vhv0) obj2;
        return summaryExternalFocusMarginsInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        vhv0 vhv0Var = (vhv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i2 = vhv0Var.c;
        boolean z = vhv0Var.a;
        int i3 = vhv0Var.d;
        int intValue = i2 > 0 ? ((Number) this.this$0.f.getValue()).intValue() + i2 : 0;
        if (i > 0) {
            int max = Math.max(intValue, i3);
            if (max > 0) {
                i = (i - i3) + max;
            }
        } else {
            i = intValue;
        }
        int intValue2 = z ? 0 : ((Number) this.this$0.d.getValue()).intValue();
        int intValue3 = z ? ((Number) this.this$0.e.getValue()).intValue() : 0;
        Rect rect = vhv0Var.b;
        return new Rect(rect.left, rect.height() + intValue2 + i, rect.right, rect.height() + intValue3);
    }
}
