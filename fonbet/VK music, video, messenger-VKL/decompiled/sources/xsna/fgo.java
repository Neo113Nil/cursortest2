package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 249}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class fgo extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<xlb0, ov70, s3q0> $onDrag;
    final /* synthetic */ gzs<s3q0> $onDragCancel;
    final /* synthetic */ izs<xlb0, s3q0> $onDragEnd;
    final /* synthetic */ yzs<xlb0, xlb0, ov70, s3q0> $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ gzs<Boolean> $shouldAwaitTouchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fgo(gzs<Boolean> gzsVar, Orientation orientation, yzs<? super xlb0, ? super xlb0, ? super ov70, s3q0> yzsVar, wzs<? super xlb0, ? super ov70, s3q0> wzsVar, gzs<s3q0> gzsVar2, izs<? super xlb0, s3q0> izsVar, spj<? super fgo> spjVar) {
        super(2, spjVar);
        this.$shouldAwaitTouchSlop = gzsVar;
        this.$orientationLock = orientation;
        this.$onDragStart = yzsVar;
        this.$onDrag = wzsVar;
        this.$onDragCancel = gzsVar2;
        this.$onDragEnd = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        fgo fgoVar = new fgo(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, spjVar);
        fgoVar.L$0 = obj;
        return fgoVar;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((fgo) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (xsna.lgo.l(r3, (xsna.xlb0) r13, r5, r6, r7, r8, r9, r10, r12) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r13 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.L$0 = eu5Var;
            this.label = 1;
            obj = z2o0.a(eu5Var, false, pointerEventPass, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
        }
        eu5 eu5Var2 = eu5Var;
        gzs<Boolean> gzsVar = this.$shouldAwaitTouchSlop;
        Orientation orientation = this.$orientationLock;
        yzs<xlb0, xlb0, ov70, s3q0> yzsVar = this.$onDragStart;
        wzs<xlb0, ov70, s3q0> wzsVar = this.$onDrag;
        gzs<s3q0> gzsVar2 = this.$onDragCancel;
        izs<xlb0, s3q0> izsVar = this.$onDragEnd;
        this.L$0 = null;
        this.label = 2;
    }
}
