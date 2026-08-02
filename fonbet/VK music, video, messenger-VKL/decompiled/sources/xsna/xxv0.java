package xsna;

import com.vk.core.preference.Preference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkUploadBridge.kt */
@b6l(c = "com.vkontakte.android.bridges.VkUploadBridge$setCompressVideosEnabled$2", f = "VkUploadBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class xxv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxv0(boolean z, spj<? super xxv0> spjVar) {
        super(2, spjVar);
        this.$value = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xxv0(this.$value, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xxv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        qaj0.c(Preference.j(), "compressVideos", Boolean.valueOf(this.$value));
        return s3q0.a;
    }
}
