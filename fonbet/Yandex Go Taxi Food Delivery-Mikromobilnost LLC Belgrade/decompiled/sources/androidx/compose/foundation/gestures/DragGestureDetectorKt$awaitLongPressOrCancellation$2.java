package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ey91;
import defpackage.kx91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1079, 1101}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<zvd0> $currentDown;
    final /* synthetic */ Ref$BooleanRef $deepPress;
    final /* synthetic */ Ref$ObjectRef<zvd0> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Continuation continuation) {
        super(2, continuation);
        this.$deepPress = ref$BooleanRef;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9 A[EDGE_INSN: B:70:0x00d9->B:13:0x00d9 BREAK  A[LOOP:0: B:7:0x00c6->B:10:0x00d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
    /* JADX WARN: Type inference failed for: r10v13, types: [T, zvd0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b7 -> B:6:0x00ba). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        int i;
        Object obj2;
        int i2;
        Object a;
        androidx.compose.ui.input.pointer.f fVar2;
        tvd0 tvd0Var;
        int size;
        int i3;
        boolean m;
        T t;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        Object obj4 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.I$0;
                fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
                kotlin.b.b(obj);
                obj2 = obj;
                tvd0 tvd0Var2 = (tvd0) obj2;
                List list = tvd0Var2.a;
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        i = i6;
                        break;
                    }
                    if (!kx91.d((zvd0) list.get(i7))) {
                        break;
                    }
                    i7++;
                }
                List list2 = tvd0Var2.a;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    zvd0 zvd0Var = (zvd0) list2.get(i8);
                    if (zvd0Var.j() || kx91.f(zvd0Var, fVar.y.C, fVar.e())) {
                        break;
                    }
                }
                if (tvd0Var2.c == i5) {
                    i2 = 1;
                    this.$deepPress.element = true;
                    i = 1;
                } else {
                    i2 = 1;
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = fVar;
                this.L$1 = tvd0Var2;
                this.I$0 = i;
                this.label = i5;
                a = fVar.a(pointerEventPass, this);
                if (a != coroutineSingletons) {
                    fVar2 = fVar;
                    tvd0Var = tvd0Var2;
                    List list3 = ((tvd0) a).a;
                    size = list3.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                        }
                        i3++;
                    }
                    m = i.m(tvd0Var, this.$currentDown.element.a);
                    List list4 = tvd0Var.a;
                    if (m) {
                    }
                    fVar = fVar2;
                    obj4 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i == 0) {
                    }
                }
                return coroutineSingletons;
            }
            if (i4 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            tvd0Var = (tvd0) this.L$1;
            fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            i2 = 1;
            a = obj;
            List list32 = ((tvd0) a).a;
            size = list32.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((zvd0) list32.get(i3)).j()) {
                    i = i2;
                    break;
                }
                i3++;
            }
            m = i.m(tvd0Var, this.$currentDown.element.a);
            List list42 = tvd0Var.a;
            if (m) {
                Ref$ObjectRef<zvd0> ref$ObjectRef = this.$longPress;
                Ref$ObjectRef<zvd0> ref$ObjectRef2 = this.$currentDown;
                int size4 = list42.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        t = 0;
                        break;
                    }
                    t = list42.get(i9);
                    if (ey91.e(((zvd0) t).a, ref$ObjectRef2.element.a)) {
                        break;
                    }
                    i9++;
                }
                ref$ObjectRef.element = t;
            } else {
                int size5 = list42.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj3 = obj4;
                        break;
                    }
                    obj3 = list42.get(i10);
                    if (((zvd0) obj3).d) {
                        break;
                    }
                    i10++;
                }
                ?? r10 = (zvd0) obj3;
                if (r10 != 0) {
                    this.$currentDown.element = r10;
                    this.$longPress.element = r10;
                } else {
                    i = i2;
                    i6 = i;
                    fVar = fVar2;
                    if (i == 0) {
                        return zy11.a;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                    this.L$0 = fVar;
                    this.L$1 = obj4;
                    this.I$0 = i;
                    this.label = i6;
                    obj2 = fVar.a(pointerEventPass2, this);
                }
            }
            fVar = fVar2;
            obj4 = null;
            i5 = 2;
            i6 = 1;
            if (i == 0) {
            }
        }
    }
}
