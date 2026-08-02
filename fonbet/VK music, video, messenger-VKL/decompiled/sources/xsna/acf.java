package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mjf;
import xsna.qef;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadLinksAvailability$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {545}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class acf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.a.c $task;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acf(wcf wcfVar, mjf.a.c cVar, spj<? super acf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$task = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new acf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((acf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception unused) {
            this.this$0.c(qef.c0.a);
        }
        if (i == 0) {
            kotlin.a.a(obj);
            if (!this.this$0.m.p()) {
                return s3q0.a;
            }
            ukf ukfVar = this.this$0.h;
            UserId userId = this.$task.b;
            this.label = 1;
            obj = ukfVar.b(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ConditionalFeature.State state = ((Boolean) obj).booleanValue() ? ConditionalFeature.State.SHOWN : ConditionalFeature.State.DISABLED;
        return s3q0.a;
    }
}
