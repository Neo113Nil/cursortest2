package androidx.compose.foundation.text.selection;

import defpackage.e3o0;
import defpackage.kx91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Landroidx/compose/foundation/text/selection/DownResolution;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)Landroidx/compose/foundation/text/selection/DownResolution;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, Ref$LongRef ref$LongRef, Continuation continuation) {
        super(2, continuation);
        this.$pointerId = j;
        this.$overSlop = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, continuation);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
            long j = this.$pointerId;
            e3o0 e3o0Var = new e3o0(13, this.$overSlop);
            this.L$0 = fVar2;
            this.label = 1;
            Object e = androidx.compose.foundation.gestures.i.e(fVar2, j, e3o0Var, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            fVar = fVar2;
            obj = e;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        }
        if (((zvd0) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        zvd0 zvd0Var = (zvd0) kotlin.collections.a.P(fVar.y.x.a);
        if (!kx91.d(zvd0Var)) {
            return DownResolution.Cancel;
        }
        zvd0Var.a();
        return DownResolution.Up;
    }
}
