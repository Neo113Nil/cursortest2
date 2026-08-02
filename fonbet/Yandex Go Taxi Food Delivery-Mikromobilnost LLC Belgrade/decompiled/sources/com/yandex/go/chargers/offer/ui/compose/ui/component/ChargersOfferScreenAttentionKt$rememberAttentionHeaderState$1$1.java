package com.yandex.go.chargers.offer.ui.compose.ui.component;

import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.vr60;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.ui.compose.ui.component.ChargersOfferScreenAttentionKt$rememberAttentionHeaderState$1$1", f = "ChargersOfferScreenAttention.kt", l = {43, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferScreenAttentionKt$rememberAttentionHeaderState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ vr60 $attention;
    final /* synthetic */ oz40 $displayedAttention$delegate;
    final /* synthetic */ oz40 $isVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferScreenAttentionKt$rememberAttentionHeaderState$1$1(vr60 vr60Var, oz40 oz40Var, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.$attention = vr60Var;
        this.$isVisible$delegate = oz40Var;
        this.$displayedAttention$delegate = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferScreenAttentionKt$rememberAttentionHeaderState$1$1(this.$attention, this.$isVisible$delegate, this.$displayedAttention$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferScreenAttentionKt$rememberAttentionHeaderState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (kotlinx.coroutines.a.i(600, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (kotlinx.coroutines.a.i(500, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            if (this.$attention == null) {
                oz40 oz40Var = this.$isVisible$delegate;
                SlotSize slotSize = a.a;
                oz40Var.setValue(Boolean.FALSE);
                this.label = 1;
            } else {
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
            oz40 oz40Var2 = this.$displayedAttention$delegate;
            SlotSize slotSize2 = a.a;
            oz40Var2.setValue(null);
            return zy11Var;
        }
        if (i != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        oz40 oz40Var3 = this.$displayedAttention$delegate;
        vr60 vr60Var = this.$attention;
        SlotSize slotSize3 = a.a;
        oz40Var3.setValue(vr60Var);
        this.$isVisible$delegate.setValue(Boolean.TRUE);
        return zy11Var;
    }
}
