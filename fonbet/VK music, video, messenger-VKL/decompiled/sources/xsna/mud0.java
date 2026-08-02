package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProfileCard.kt */
@b6l(c = "com.vk.clips.design.compose.profile.ProfileCardKt$UserNameAndIcons$1$1$1$1", f = "ProfileCard.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class mud0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rg50 $iconsCount$delegate;
    final /* synthetic */ wh50<pco> $textMaxWidth$delegate;
    final /* synthetic */ va8 $this_BoxWithConstraints;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mud0(va8 va8Var, rg50 rg50Var, wh50<pco> wh50Var, spj<? super mud0> spjVar) {
        super(2, spjVar);
        this.$this_BoxWithConstraints = va8Var;
        this.$iconsCount$delegate = rg50Var;
        this.$textMaxWidth$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mud0(this.$this_BoxWithConstraints, this.$iconsCount$delegate, this.$textMaxWidth$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mud0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        rg50 rg50Var = this.$iconsCount$delegate;
        float f = nud0.a;
        this.$textMaxWidth$delegate.setValue(new pco(this.$this_BoxWithConstraints.j() - ((nud0.a + nud0.b) * rg50Var.getIntValue())));
        return s3q0.a;
    }
}
