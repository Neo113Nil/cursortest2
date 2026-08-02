package xsna;

import com.vk.core.compose.component.modal.SheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalModalBottomSheet.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalModalBottomSheetKt$InternalModalBottomSheet$settleToDismiss$1$1$1", f = "InternalModalBottomSheet.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class lix extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $it;
    final /* synthetic */ fdj0 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lix(fdj0 fdj0Var, float f, spj<? super lix> spjVar) {
        super(2, spjVar);
        this.$sheetState = fdj0Var;
        this.$it = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lix(this.$sheetState, this.$it, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lix) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fdj0 fdj0Var = this.$sheetState;
            float f = this.$it;
            this.label = 1;
            e12<SheetValue> e12Var = fdj0Var.b;
            Object value = ((zak0) e12Var.f).getValue();
            Object c = e12Var.c(e12Var.g(), f, value);
            if (((Boolean) e12Var.c.invoke(c)).booleanValue()) {
                j = d02.j(e12Var, c, f, this);
                if (j != obj2) {
                    j = s3q0.a;
                }
            } else {
                j = d02.j(e12Var, value, f, this);
                if (j != obj2) {
                    j = s3q0.a;
                }
            }
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
