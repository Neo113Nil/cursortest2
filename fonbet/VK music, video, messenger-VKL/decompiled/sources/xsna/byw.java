package xsna;

import com.vk.core.utils.newtork.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEditMode$2", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class byw extends SuspendLambda implements wzs<com.vk.core.utils.newtork.d, spj<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public byw() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        byw bywVar = new byw(2, spjVar);
        bywVar.L$0 = obj;
        return bywVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.core.utils.newtork.d dVar, spj<? super Boolean> spjVar) {
        return ((byw) create(dVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.core.utils.newtork.d dVar = (com.vk.core.utils.newtork.d) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return Boolean.valueOf(dVar instanceof d.a);
    }
}
