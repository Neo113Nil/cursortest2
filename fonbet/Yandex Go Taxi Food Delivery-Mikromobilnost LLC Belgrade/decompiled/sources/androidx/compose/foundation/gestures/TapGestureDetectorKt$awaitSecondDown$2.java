package androidx.compose.foundation.gestures;

import defpackage.mvg;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzvd0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)Lzvd0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ zvd0 $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(zvd0 zvd0Var, Continuation continuation) {
        super(2, continuation);
        this.$firstUp = zvd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, continuation);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:5:0x003e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            long r4 = r8.J$0
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.ui.input.pointer.f) r1
            kotlin.b.b(r9)
            goto L3e
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r8)
            return r2
        L1a:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.f r9 = (androidx.compose.ui.input.pointer.f) r9
            zvd0 r1 = r8.$firstUp
            long r4 = r1.b
            xp31 r1 = r9.g()
            long r6 = r1.a()
            long r6 = r6 + r4
            r1 = r9
            r4 = r6
        L30:
            r8.L$0 = r1
            r8.J$0 = r4
            r8.label = r3
            r9 = 3
            java.lang.Object r9 = androidx.compose.foundation.gestures.z.b(r1, r2, r8, r9)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            zvd0 r9 = (defpackage.zvd0) r9
            long r6 = r9.b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L30
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
