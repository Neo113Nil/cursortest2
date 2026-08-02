package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterRepository.kt */
@b6l(c = "com.vk.photo.editor.repository.filter.FilterRepository$getLutById$firstNonEmptyLutList$1", f = "FilterRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ldr extends SuspendLambda implements wzs<List<? extends y900>, spj<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public ldr() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ldr ldrVar = new ldr(2, spjVar);
        ldrVar.L$0 = obj;
        return ldrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(List<? extends y900> list, spj<? super Boolean> spjVar) {
        return ((ldr) create(list, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return Boolean.valueOf(!list.isEmpty());
    }
}
