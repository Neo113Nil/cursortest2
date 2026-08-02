package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.SheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalBottomSheet.kt */
@b6l(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ix20 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $it;
    final /* synthetic */ gdj0 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix20(gdj0 gdj0Var, float f, spj<? super ix20> spjVar) {
        super(2, spjVar);
        this.$sheetState = gdj0Var;
        this.$it = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ix20(this.$sheetState, this.$it, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ix20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gdj0 gdj0Var = this.$sheetState;
            float f = this.$it;
            this.label = 1;
            d12<SheetValue> d12Var = gdj0Var.d;
            Object value = ((zak0) d12Var.g).getValue();
            Object c = d12Var.c(d12Var.g(), f, value);
            if (((Boolean) d12Var.d.invoke(c)).booleanValue()) {
                b = d12Var.b(c, MutatePriority.Default, new pz1(d12Var, f, null), this);
                if (b != obj2) {
                    b = s3q0.a;
                }
                if (b != obj2) {
                    b = s3q0.a;
                }
            } else {
                b = d12Var.b(value, MutatePriority.Default, new pz1(d12Var, f, null), this);
                if (b != obj2) {
                    b = s3q0.a;
                }
                if (b != obj2) {
                    b = s3q0.a;
                }
            }
            if (b != obj2) {
                b = s3q0.a;
            }
            if (b == obj2) {
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
