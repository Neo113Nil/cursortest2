package xsna;

import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutRepository.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.repository.VkWorkoutRepository$importWorkouts$2", f = "VkWorkoutRepository.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class l2w0 extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    final /* synthetic */ List<WorkoutData> $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2w0(List<WorkoutData> list, spj<? super l2w0> spjVar) {
        super(2, spjVar);
        this.$data = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l2w0(this.$data, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((l2w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.single.y b = vdx0Var.A().b(this.$data);
        this.label = 1;
        Object f = sd9.f(b, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
