package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.animations;

import androidx.compose.ui.input.pointer.f;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.animations.RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1", f = "RedirectAnimations.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ m3u0 $redirectAnimationProgress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1(m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$redirectAnimationProgress = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1 redirectAnimationsKt$blockClicksOnHidePhase$1$1$1 = new RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1(this.$redirectAnimationProgress, continuation);
        redirectAnimationsKt$blockClicksOnHidePhase$1$1$1.L$0 = obj;
        return redirectAnimationsKt$blockClicksOnHidePhase$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            androidx.compose.ui.input.pointer.f r0 = (androidx.compose.ui.input.pointer.f) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            kotlin.b.b(r10)
            goto L28
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r9)
            r9 = 0
            return r9
        L18:
            kotlin.b.b(r10)
        L1b:
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r9.L$0 = r0
            r9.label = r3
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r1) goto L28
            return r1
        L28:
            tvd0 r10 = (defpackage.tvd0) r10
            m3u0 r2 = r9.$redirectAnimationProgress
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1b
            java.util.List r2 = r10.a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto L4d
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4d
            goto L7f
        L4d:
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r2.next()
            zvd0 r5 = (defpackage.zvd0) r5
            r6 = 0
            long r5 = defpackage.kx91.g(r5, r6)
            r7 = 32
            long r7 = r5 >> r7
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L1b
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L1b
            goto L51
        L7f:
            java.util.List r10 = r10.a
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L87:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r10.next()
            zvd0 r2 = (defpackage.zvd0) r2
            r2.a()
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.summary.ui.compose.expanded.content.tariffcard.animations.RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
