package xsna;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ScreenHelper.kt */
@b6l(c = "com.vk.games.presentation.utils.ScreenHelperKt$onAppearInWindow$1$1$1", f = "ScreenHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class wbh0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $fired$delegate;
    final /* synthetic */ mtk0<Lifecycle.Event> $lifecycleOwnerState$delegate;
    final /* synthetic */ gzs<s3q0> $onView;
    final /* synthetic */ wh50<Boolean> $wasVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wbh0(gzs<s3q0> gzsVar, mtk0<? extends Lifecycle.Event> mtk0Var, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, spj<? super wbh0> spjVar) {
        super(2, spjVar);
        this.$onView = gzsVar;
        this.$lifecycleOwnerState$delegate = mtk0Var;
        this.$fired$delegate = wh50Var;
        this.$wasVisible$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wbh0(this.$onView, this.$lifecycleOwnerState$delegate, this.$fired$delegate, this.$wasVisible$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wbh0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        mtk0<Lifecycle.Event> mtk0Var = this.$lifecycleOwnerState$delegate;
        float f = vbh0.a;
        if (mtk0Var.getValue() == Lifecycle.Event.ON_PAUSE) {
            if (this.$fired$delegate.getValue().booleanValue()) {
                this.$wasVisible$delegate.setValue(Boolean.TRUE);
            }
            this.$fired$delegate.setValue(Boolean.FALSE);
        }
        if (this.$lifecycleOwnerState$delegate.getValue() == Lifecycle.Event.ON_RESUME && this.$wasVisible$delegate.getValue().booleanValue()) {
            this.$onView.invoke();
            this.$wasVisible$delegate.setValue(Boolean.FALSE);
        }
        return s3q0.a;
    }
}
