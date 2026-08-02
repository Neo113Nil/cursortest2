package com.yandex.go.navigator.compose.speed_group;

import androidx.compose.animation.core.RepeatMode;
import defpackage.mvg;
import defpackage.nsv;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.compose.speed_group.AlarmLayerKt$AlarmLayer$1$1", f = "AlarmLayer.kt", l = {25, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AlarmLayerKt$AlarmLayer$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $alarmAlpha;
    final /* synthetic */ boolean $isExceeded;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmLayerKt$AlarmLayer$1$1(androidx.compose.animation.core.a aVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$isExceeded = z;
        this.$alarmAlpha = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AlarmLayerKt$AlarmLayer$1$1(this.$alarmAlpha, continuation, this.$isExceeded);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AlarmLayerKt$AlarmLayer$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (androidx.compose.animation.core.a.d(r5, r6, r7, null, null, r12, 12) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r5.f(r12, r12) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            boolean z = this.$isExceeded;
            androidx.compose.animation.core.a aVar = this.$alarmAlpha;
            if (z) {
                Float f = new Float(1.0f);
                nsv w = sb2.w(sb2.K(220, 0, null, 6), RepeatMode.Reverse, 0L, 4);
                this.label = 1;
            } else {
                Float f2 = new Float(0.0f);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
