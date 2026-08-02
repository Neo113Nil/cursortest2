package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TemplateDetailsField.kt */
@b6l(c = "com.vk.messagetemplates.impl.details.ui.TemplateDetailsFieldKt$TemplateDetailsField$1$1", f = "TemplateDetailsField.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l8o0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $fieldText;
    final /* synthetic */ wh50<tho0> $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8o0(String str, wh50<tho0> wh50Var, spj<? super l8o0> spjVar) {
        super(2, spjVar);
        this.$fieldText = str;
        this.$text$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l8o0(this.$fieldText, this.$text$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((l8o0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!epx.f(this.$fieldText, this.$text$delegate.getValue().a.c)) {
            wh50<tho0> wh50Var = this.$text$delegate;
            String str = this.$fieldText;
            int length = str.length();
            wh50Var.setValue(new tho0(str, jgz.c(length, length), 4));
        }
        return s3q0.a;
    }
}
