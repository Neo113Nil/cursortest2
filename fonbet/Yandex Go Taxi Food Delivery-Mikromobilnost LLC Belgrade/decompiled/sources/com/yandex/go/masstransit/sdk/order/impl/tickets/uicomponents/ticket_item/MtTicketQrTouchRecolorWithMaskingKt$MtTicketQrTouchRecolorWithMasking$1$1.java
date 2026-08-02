package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dz10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.yyz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.MtTicketQrTouchRecolorWithMaskingKt$MtTicketQrTouchRecolorWithMasking$1$1", f = "MtTicketQrTouchRecolorWithMasking.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketQrTouchRecolorWithMaskingKt$MtTicketQrTouchRecolorWithMasking$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $animationDuration;
    final /* synthetic */ SnapshotStateList<yyz0> $touchEffects;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketQrTouchRecolorWithMaskingKt$MtTicketQrTouchRecolorWithMasking$1$1(SnapshotStateList snapshotStateList, long j, Continuation continuation) {
        super(2, continuation);
        this.$touchEffects = snapshotStateList;
        this.$animationDuration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketQrTouchRecolorWithMaskingKt$MtTicketQrTouchRecolorWithMasking$1$1(this.$touchEffects, this.$animationDuration, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketQrTouchRecolorWithMaskingKt$MtTicketQrTouchRecolorWithMasking$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        do {
            long currentTimeMillis = System.currentTimeMillis();
            ycc.w(this.$touchEffects, new dz10(16, currentTimeMillis, this.$animationDuration), true);
            this.J$0 = currentTimeMillis;
            this.label = 1;
        } while (kotlinx.coroutines.a.i(16L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
