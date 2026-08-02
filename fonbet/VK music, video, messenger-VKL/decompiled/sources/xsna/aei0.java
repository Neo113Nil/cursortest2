package xsna;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.obi0;

/* compiled from: SelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", l = {ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class aei0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<qko0> $selectionInSelectable;
    final /* synthetic */ Ref$LongRef $targetSelectableId;
    final /* synthetic */ Ref$ObjectRef<CharSequence> $textInSelectable;
    int label;
    final /* synthetic */ bei0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aei0(bei0 bei0Var, Ref$ObjectRef<CharSequence> ref$ObjectRef, Ref$ObjectRef<qko0> ref$ObjectRef2, Ref$LongRef ref$LongRef, spj<? super aei0> spjVar) {
        super(2, spjVar);
        this.this$0 = bei0Var;
        this.$textInSelectable = ref$ObjectRef;
        this.$selectionInSelectable = ref$ObjectRef2;
        this.$targetSelectableId = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new aei0(this.this$0, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((aei0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qko0 qko0Var;
        cai0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            aua0 aua0Var = this.this$0.x;
            if (aua0Var == null) {
                qko0Var = null;
                if (qko0Var != null) {
                    long j = qko0Var.a;
                    if (!qko0.a(j, this.$selectionInSelectable.element) && (b = this.this$0.a.c.b(this.$targetSelectableId.element)) != null && b.getText() == this.$textInSelectable.element) {
                        ljo0 k = b.k();
                        if (k == null) {
                            return s3q0.a;
                        }
                        int i2 = (int) (j >> 32);
                        obi0.a aVar = new obi0.a(a020.s(k, i2), i2, this.$targetSelectableId.element);
                        int i3 = (int) (j & 4294967295L);
                        ResolvedTextDirection s = a020.s(k, i3);
                        long j2 = this.$targetSelectableId.element;
                        obi0 obi0Var = new obi0(aVar, new obi0.a(s, i3, j2), false);
                        oei0 oei0Var = this.this$0.a;
                        xg50 xg50Var = t300.a;
                        xg50 xg50Var2 = new xg50();
                        xg50Var2.i(j2, obi0Var);
                        ((zak0) oei0Var.k).setValue(xg50Var2);
                        this.this$0.d.invoke(obi0Var);
                        this.this$0.u = null;
                    }
                }
                return s3q0.a;
            }
            CharSequence charSequence = this.$textInSelectable.element;
            long j3 = this.$selectionInSelectable.element.a;
            this.label = 1;
            obj = aua0Var.c(charSequence, j3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        qko0Var = (qko0) obj;
        if (qko0Var != null) {
        }
        return s3q0.a;
    }
}
