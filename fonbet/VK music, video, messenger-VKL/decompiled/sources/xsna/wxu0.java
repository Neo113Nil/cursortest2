package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthHuaweiHealthPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHuaweiHealthPermissionsProvider$onActivityResult$3", f = "VkHealthHuaweiHealthPermissionsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class wxu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;

    public wxu0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wxu0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wxu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yxu0.a.g(false);
        tw8 tw8Var = yxu0.c;
        qcy<Object> qcyVar = yxu0.b[0];
        tw8Var.g("");
        return s3q0.a;
    }
}
