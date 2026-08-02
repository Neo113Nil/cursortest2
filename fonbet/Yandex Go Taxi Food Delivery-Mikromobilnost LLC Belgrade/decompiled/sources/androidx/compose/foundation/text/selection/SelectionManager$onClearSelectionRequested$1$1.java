package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {1001, 1007}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionManager$onClearSelectionRequested$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ sls $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onClearSelectionRequested$1$1(i iVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$block = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionManager$onClearSelectionRequested$1$1 selectionManager$onClearSelectionRequested$1$1 = new SelectionManager$onClearSelectionRequested$1$1(this.this$0, this.$block, continuation);
        selectionManager$onClearSelectionRequested$1$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionManager$onClearSelectionRequested$1$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r6 == r0) goto L15;
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
            this.L$0 = fVar;
            this.label = 1;
            zls zlsVar = z.a;
            obj = z.c(fVar, PointerEventPass.Main, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue() && this.this$0.f() == null) {
                    this.$block.invoke();
                }
                return zy11.a;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        }
        PointerEventPass pointerEventPass = PointerEventPass.Initial;
        this.L$0 = null;
        this.label = 2;
        obj = androidx.compose.foundation.gestures.i.a(fVar, (zvd0) obj, pointerEventPass, this);
    }
}
