package androidx.compose.foundation.text.selection;

import defpackage.asy0;
import defpackage.bwc0;
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
@mvg(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements wls {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, continuation);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((wu60) obj).a;
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        long j = ((wu60) obj).a;
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, (Continuation) obj2);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = j;
        return textFieldSelectionManager$contextMenuAreaModifier$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        if (r8.t(r7) == r0) goto L23;
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
            long j = this.J$0;
            j jVar = this.this$0;
            this.J$0 = j;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Pair a = j.a(this.this$0);
        if (a != null) {
            j jVar2 = this.this$0;
            String str = (String) a.getFirst();
            long j2 = ((asy0) a.getSecond()).a;
            bwc0 bwc0Var = jVar2.j;
            if (bwc0Var != null) {
                this.label = 2;
                Object c = ((a) bwc0Var).c(str, j2, this);
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
