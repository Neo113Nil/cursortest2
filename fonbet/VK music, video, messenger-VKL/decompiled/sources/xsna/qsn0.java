package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.psn0;

/* compiled from: VkTabItem.kt */
@b6l(c = "com.vk.core.compose.component.tabs.TabItem$Middle$Text$Content$1$1", f = "VkTabItem.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class qsn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<l5g, vq2> $textColor;
    final /* synthetic */ long $textColorSelected;
    final /* synthetic */ long $textColorUnselected;
    int label;
    final /* synthetic */ psn0.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsn0(if2<l5g, vq2> if2Var, long j, long j2, psn0.a aVar, spj<? super qsn0> spjVar) {
        super(2, spjVar);
        this.$textColor = if2Var;
        this.$textColorUnselected = j;
        this.$textColorSelected = j2;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qsn0(this.$textColor, this.$textColorUnselected, this.$textColorSelected, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qsn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<l5g, vq2> if2Var = this.$textColor;
            l5g l5gVar = new l5g(f870.D(this.$textColorUnselected, this.$textColorSelected, ((Number) ((zak0) this.this$0.a).getValue()).floatValue()));
            this.label = 1;
            if (if2Var.e(l5gVar, this) == coroutineSingletons) {
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
