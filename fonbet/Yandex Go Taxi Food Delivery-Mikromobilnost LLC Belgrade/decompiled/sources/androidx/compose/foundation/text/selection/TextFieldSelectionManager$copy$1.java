package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import defpackage.asy0;
import defpackage.b3c;
import defpackage.c3c;
import defpackage.eja1;
import defpackage.fmb1;
import defpackage.kk2;
import defpackage.mvg;
import defpackage.nnb1;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w72;
import defpackage.wls;
import defpackage.yp90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {891}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(j jVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$cancelSelection = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$copy$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c3c c3cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        kk2 kk2Var = null;
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
        j jVar = this.this$0;
        boolean z = this.$cancelSelection;
        if (!asy0.c(jVar.o().b) && !(jVar.f instanceof yp90)) {
            kk2Var = fmb1.l(jVar.o());
            if (z) {
                int e = asy0.e(jVar.o().b);
                jVar.c.invoke(j.e(jVar.o().a, eja1.c(e, e)));
                jVar.r(HandleState.None);
            }
        }
        if (kk2Var != null && (c3cVar = this.this$0.h) != null) {
            b3c c = nnb1.c(kk2Var);
            this.label = 1;
            ((w72) c3cVar).a(c);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
