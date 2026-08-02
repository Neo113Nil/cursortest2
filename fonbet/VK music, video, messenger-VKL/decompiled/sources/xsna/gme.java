package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsMyDescriptionEditView.kt */
@b6l(c = "com.vk.clips.viewer.impl.grid.toolbar.profile.ClipsMyDescriptionEditViewKt$onFocusSelectAll$2$1$1", f = "ClipsMyDescriptionEditView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class gme extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<tho0> $textFieldValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(wh50<tho0> wh50Var, spj<? super gme> spjVar) {
        super(2, spjVar);
        this.$textFieldValue = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gme(this.$textFieldValue, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gme) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        tho0 value = this.$textFieldValue.getValue();
        this.$textFieldValue.setValue(tho0.b(value, null, jgz.c(0, value.a.c.length()), 5));
        return s3q0.a;
    }
}
