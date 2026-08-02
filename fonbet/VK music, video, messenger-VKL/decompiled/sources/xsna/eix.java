package xsna;

import com.vk.core.compose.component.modal.SheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalModalBottomSheet.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalModalBottomSheetKt$DragHandleSection$1$1$1$2$1", f = "InternalModalBottomSheet.kt", l = {362}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class eix extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ fdj0 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eix(fdj0 fdj0Var, spj<? super eix> spjVar) {
        super(2, spjVar);
        this.$this_with = fdj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eix(this.$this_with, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((eix) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fdj0 fdj0Var = this.$this_with;
            this.label = 1;
            e12<SheetValue> e12Var = fdj0Var.b;
            Object j = d02.j(e12Var, SheetValue.Expanded, ((vak0) e12Var.j).getFloatValue(), this);
            if (j != obj2) {
                j = s3q0.a;
            }
            if (j == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
