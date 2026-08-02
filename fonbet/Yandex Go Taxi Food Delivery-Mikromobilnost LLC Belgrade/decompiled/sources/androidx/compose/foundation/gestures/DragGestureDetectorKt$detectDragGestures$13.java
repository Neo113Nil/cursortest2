package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 249}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ wls $onDrag;
    final /* synthetic */ sls $onDragCancel;
    final /* synthetic */ tls $onDragEnd;
    final /* synthetic */ zls $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ sls $shouldAwaitTouchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$13(sls slsVar, Orientation orientation, zls zlsVar, wls wlsVar, sls slsVar2, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$shouldAwaitTouchSlop = slsVar;
        this.$orientationLock = orientation;
        this.$onDragStart = zlsVar;
        this.$onDrag = wlsVar;
        this.$onDragCancel = slsVar2;
        this.$onDragEnd = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (androidx.compose.foundation.gestures.i.o(r4, (defpackage.zvd0) r14, r6, r7, r8, r9, r10, r11, r13) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r14 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.L$0 = fVar;
            this.label = 1;
            obj = z.a(fVar, false, pointerEventPass, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        }
        androidx.compose.ui.input.pointer.f fVar2 = fVar;
        sls slsVar = this.$shouldAwaitTouchSlop;
        Orientation orientation = this.$orientationLock;
        zls zlsVar = this.$onDragStart;
        wls wlsVar = this.$onDrag;
        sls slsVar2 = this.$onDragCancel;
        tls tlsVar = this.$onDragEnd;
        this.L$0 = null;
        this.label = 2;
    }
}
