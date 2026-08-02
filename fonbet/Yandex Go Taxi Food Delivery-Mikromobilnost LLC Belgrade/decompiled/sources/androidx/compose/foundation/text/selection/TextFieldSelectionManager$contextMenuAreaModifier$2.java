package androidx.compose.foundation.text.selection;

import defpackage.asy0;
import defpackage.bwc0;
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
@mvg(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(j jVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r9.t(r8) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.B = true;
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        Pair a = j.a(this.this$0);
        if (a != null) {
            j jVar2 = this.this$0;
            String str = (String) a.getFirst();
            long j = ((asy0) a.getSecond()).a;
            bwc0 bwc0Var = jVar2.j;
            if (bwc0Var != null) {
                this.label = 2;
                Object c = ((a) bwc0Var).c(str, j, this);
                if (c != coroutineSingletons) {
                    c = zy11Var;
                }
            }
        }
        this.this$0.B = true;
        return zy11Var;
    }
}
