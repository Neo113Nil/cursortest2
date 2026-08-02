package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DatePicker.kt */
@b6l(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1653}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class nzk extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zz8 $displayedMonth;
    final /* synthetic */ xvy $monthsListState;
    final /* synthetic */ int $year;
    final /* synthetic */ k9x $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzk(xvy xvyVar, int i, k9x k9xVar, zz8 zz8Var, spj<? super nzk> spjVar) {
        super(2, spjVar);
        this.$monthsListState = xvyVar;
        this.$year = i;
        this.$yearRange = k9xVar;
        this.$displayedMonth = zz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nzk(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nzk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            xvy xvyVar = this.$monthsListState;
            int i2 = (((this.$year - this.$yearRange.b) * 12) + this.$displayedMonth.b) - 1;
            this.label = 1;
            fh9 fh9Var = xvy.y;
            if (xvyVar.k(i2, 0, this) == coroutineSingletons) {
                return coroutineSingletons;
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
