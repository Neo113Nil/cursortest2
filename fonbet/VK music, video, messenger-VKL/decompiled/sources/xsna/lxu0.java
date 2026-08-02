package xsna;

import com.vk.core.preference.Preference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthGoogleFitAvailabilityStorageNew.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.storage.VkHealthGoogleFitAvailabilityStorageNew$setGoogleFitAvailable$2", f = "VkHealthGoogleFitAvailabilityStorageNew.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class lxu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isAvailable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxu0(boolean z, spj<? super lxu0> spjVar) {
        super(2, spjVar);
        this.$isAvailable = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lxu0(this.$isAvailable, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lxu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Preference.I("VkHealthGoogleFitAvailabilityStorage.is_google_fit_available", "VkHealthGoogleFitAvailabilityStorage.is_google_fit_available", this.$isAvailable);
        return s3q0.a;
    }
}
