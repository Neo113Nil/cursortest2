package xsna;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;

/* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHealthConnectPermissionsProvider$getSdkStatusSuspended$sdkStatus$1", f = "VkHealthHealthConnectPermissionsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class sxu0 extends SuspendLambda implements wzs<yvj, spj<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxu0(Context context, spj<? super sxu0> spjVar) {
        super(2, spjVar);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sxu0(this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Integer> spjVar) {
        return ((sxu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (gz80.a(26)) {
            czu.b bVar = czu.a;
            Context context = this.$context;
            bVar.getClass();
            i = czu.b.c(context);
        } else {
            i = 1;
        }
        return new Integer(i);
    }
}
