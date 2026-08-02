package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicClearStorageInteractor.kt */
@b6l(c = "com.vk.music.offline.api.domain.interactor.MusicClearStorageInteractor$Companion$STUB$1$clearDownloads$2", f = "MusicClearStorageInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class df40 extends SuspendLambda implements wzs<lsr<? super Long>, spj<? super s3q0>, Object> {
    int label;

    public df40() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new df40(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super Long> lsrVar, spj<? super s3q0> spjVar) {
        return ((df40) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return s3q0.a;
    }
}
