package xsna;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterRepository.kt */
@b6l(c = "com.vk.photo.editor.repository.filter.FilterRepository$sendLutsLoadingRequest$2", f = "FilterRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class rdr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ mdr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdr(mdr mdrVar, Context context, spj<? super rdr> spjVar) {
        super(2, spjVar);
        this.this$0 = mdrVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rdr(this.this$0, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rdr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        mdr mdrVar = this.this$0;
        mdrVar.a.b(this.$context, mdrVar.j);
        return s3q0.a;
    }
}
