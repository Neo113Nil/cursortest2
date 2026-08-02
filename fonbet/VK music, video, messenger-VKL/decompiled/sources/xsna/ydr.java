package xsna;

import com.vk.photo.editor.features.filter.FilterUiModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$onFilterHide$1", f = "FilterStore.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ydr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ FilterUiModel $requestedUiModel;
    int label;
    final /* synthetic */ com.vk.photo.editor.ivm.filter.i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydr(com.vk.photo.editor.ivm.filter.i iVar, FilterUiModel filterUiModel, spj<? super ydr> spjVar) {
        super(2, spjVar);
        this.this$0 = iVar;
        this.$requestedUiModel = filterUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ydr(this.this$0, this.$requestedUiModel, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ydr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mdr mdrVar = this.this$0.f;
            int parseInt = Integer.parseInt(this.$requestedUiModel.a);
            this.label = 1;
            if (mdrVar.c(parseInt, this) == coroutineSingletons) {
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
