package androidx.compose.foundation.text.selection;

import defpackage.asy0;
import defpackage.bwc0;
import defpackage.kk2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", l = {215}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$contextMenuAreaModifier$2(i iVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SelectionManager$contextMenuAreaModifier$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SelectionManager$contextMenuAreaModifier$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
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
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
