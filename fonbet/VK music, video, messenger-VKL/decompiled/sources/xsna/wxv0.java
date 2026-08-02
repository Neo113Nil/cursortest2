package xsna;

import com.vk.core.preference.Preference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkUploadBridge.kt */
@b6l(c = "com.vkontakte.android.bridges.VkUploadBridge$isCompressVideosEnabled$2", f = "VkUploadBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class wxv0 extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    int label;

    public wxv0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wxv0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((wxv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return Boolean.valueOf(Preference.j().getBoolean("compressVideos", true));
    }
}
