package androidx.compose.foundation.text.selection;

import defpackage.asy0;
import defpackage.bwc0;
import defpackage.kk2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwu60;", "clickLocation", "Lzy11;", "<anonymous>", "(Lwu60;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", l = {194}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements wls {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$contextMenuAreaModifier$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionManager$contextMenuAreaModifier$1 selectionManager$contextMenuAreaModifier$1 = new SelectionManager$contextMenuAreaModifier$1(this.this$0, continuation);
        selectionManager$contextMenuAreaModifier$1.J$0 = ((wu60) obj).a;
        return selectionManager$contextMenuAreaModifier$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        long j = ((wu60) obj).a;
        SelectionManager$contextMenuAreaModifier$1 selectionManager$contextMenuAreaModifier$1 = new SelectionManager$contextMenuAreaModifier$1(this.this$0, (Continuation) obj2);
        selectionManager$contextMenuAreaModifier$1.J$0 = j;
        return selectionManager$contextMenuAreaModifier$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Pair e = this.this$0.e();
        if (e != null) {
            i iVar = this.this$0;
            kk2 kk2Var = (kk2) e.getFirst();
            long j = ((asy0) e.getSecond()).a;
            bwc0 bwc0Var = iVar.w;
            if (bwc0Var != null) {
                this.label = 1;
                Object c = ((a) bwc0Var).c(kk2Var, j, this);
                if (c != coroutineSingletons) {
                    c = zy11Var;
                }
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
