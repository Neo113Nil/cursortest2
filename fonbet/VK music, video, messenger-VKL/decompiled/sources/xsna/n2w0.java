package xsna;

import com.vk.core.preference.Preference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.store.VkWorkoutStore$clearCache$2", f = "VkWorkoutStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class n2w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;

    public n2w0() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n2w0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n2w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Preference.C("VkWorkoutStore", "KEY_VK_WORKOUT_MONTHLY_WORKOUTS");
        return s3q0.a;
    }
}
