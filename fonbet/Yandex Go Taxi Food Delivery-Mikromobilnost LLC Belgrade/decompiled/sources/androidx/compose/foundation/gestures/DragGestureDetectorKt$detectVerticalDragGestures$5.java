package androidx.compose.foundation.gestures;

import defpackage.mj1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9m;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {558, 561, 569}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ sls $onDragCancel;
    final /* synthetic */ sls $onDragEnd;
    final /* synthetic */ tls $onDragStart;
    final /* synthetic */ wls $onVerticalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(tls tlsVar, wls wlsVar, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.$onDragStart = tlsVar;
        this.$onVerticalDrag = wlsVar;
        this.$onDragEnd = slsVar;
        this.$onDragCancel = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
        dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        Ref$FloatRef ref$FloatRef;
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5;
        androidx.compose.ui.input.pointer.f fVar2;
        zvd0 zvd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        if (i == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            this.L$0 = fVar;
            this.label = 1;
            obj = z.b(fVar, null, this, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
                    if (((Boolean) obj).booleanValue()) {
                        dragGestureDetectorKt$detectVerticalDragGestures$5.$onDragEnd.invoke();
                    } else {
                        dragGestureDetectorKt$detectVerticalDragGestures$5.$onDragCancel.invoke();
                    }
                    return zy11.a;
                }
                ref$FloatRef = (Ref$FloatRef) this.L$1;
                fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
                kotlin.b.b(obj);
                dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
                zvd0Var = (zvd0) obj;
                if (zvd0Var != null) {
                    dragGestureDetectorKt$detectVerticalDragGestures$5.$onDragStart.invoke(new wu60(zvd0Var.c));
                    dragGestureDetectorKt$detectVerticalDragGestures$5.$onVerticalDrag.invoke(zvd0Var, new Float(ref$FloatRef.element));
                    long j = zvd0Var.a;
                    mj1 mj1Var = new mj1(dragGestureDetectorKt$detectVerticalDragGestures$5.$onVerticalDrag, i2);
                    dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = null;
                    dragGestureDetectorKt$detectVerticalDragGestures$5.L$1 = null;
                    dragGestureDetectorKt$detectVerticalDragGestures$5.label = 3;
                    obj = i.p(fVar2, j, mj1Var, dragGestureDetectorKt$detectVerticalDragGestures$5);
                }
                return zy11.a;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        }
        androidx.compose.ui.input.pointer.f fVar3 = fVar;
        zvd0 zvd0Var2 = (zvd0) obj;
        ref$FloatRef = new Ref$FloatRef();
        long j2 = zvd0Var2.a;
        int i3 = zvd0Var2.i;
        o9m o9mVar = new o9m(ref$FloatRef, 1);
        this.L$0 = fVar3;
        this.L$1 = ref$FloatRef;
        this.label = 2;
        dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
        obj = i.f(fVar3, j2, i3, o9mVar, dragGestureDetectorKt$detectVerticalDragGestures$5);
        if (obj != coroutineSingletons) {
            fVar2 = fVar3;
            zvd0Var = (zvd0) obj;
            if (zvd0Var != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
