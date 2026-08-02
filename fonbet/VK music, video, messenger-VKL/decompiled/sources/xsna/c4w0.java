package xsna;

import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.process.SeparateProcessRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkpnsAuthSdk.kt */
@b6l(c = "com.vk.push.authsdk.VkpnsAuthSdk$onInitialized$1", f = "VkpnsAuthSdk.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c4w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ b4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4w0(b4w0 b4w0Var, spj<? super c4w0> spjVar) {
        super(2, spjVar);
        this.this$0 = b4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c4w0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c4w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!((SeparateProcessRepository) this.this$0.C.getValue()).isMultiProcessMode() || ((SeparateProcessRepository) this.this$0.C.getValue()).isSeparateProcess()) {
            b4w0 b4w0Var = this.this$0;
            if (b4w0Var.a.d) {
                ((hip) b4w0Var.y.getValue()).a();
                ((CollectDeviceIdErrorsUseCase) this.this$0.A.getValue()).invoke();
            } else {
                ((yzm) b4w0Var.z.getValue()).a();
            }
        } else {
            b4w0 b4w0Var2 = this.this$0;
            if (b4w0Var2.a.d) {
                ((hip) b4w0Var2.y.getValue()).a();
            } else {
                ((yzm) b4w0Var2.z.getValue()).a();
            }
        }
        return s3q0.a;
    }
}
