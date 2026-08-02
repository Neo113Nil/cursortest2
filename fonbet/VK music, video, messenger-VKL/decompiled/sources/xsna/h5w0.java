package xsna;

import com.vk.push.core.process.SeparateProcessRepository;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.e5w0;

/* compiled from: VkpnsPushProviderSdk.kt */
@b6l(c = "com.vk.push.pushsdk.VkpnsPushProviderSdk$onInitialized$1", f = "VkpnsPushProviderSdk.kt", l = {112, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h5w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ e5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5w0(e5w0 e5w0Var, spj<? super h5w0> spjVar) {
        super(2, spjVar);
        this.this$0 = e5w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h5w0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h5w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r5 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r5.b(r4) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            e5w0 e5w0Var = this.this$0;
            e5w0.b bVar = e5w0.y;
            if (((SeparateProcessRepository) e5w0Var.w.getValue()).isMultiProcessMode()) {
                e5w0 e5w0Var2 = this.this$0;
                this.label = 1;
                if (((SeparateProcessRepository) e5w0Var2.w.getValue()).isSeparateProcess()) {
                    b = e5w0Var2.b(this);
                    if (b != coroutineSingletons) {
                        b = s3q0.a;
                    }
                } else {
                    VkpnsPushConfig vkpnsPushConfig = qxi.b;
                    if (vkpnsPushConfig != null ? vkpnsPushConfig.d : false) {
                        ((gip) e5w0Var2.m.getValue()).a();
                    } else {
                        ((xzm) e5w0Var2.n.getValue()).a();
                    }
                    ((pqk0) e5w0Var2.j.getValue()).b();
                    ((hqf0) e5w0Var2.k.getValue()).a();
                    b = s3q0.a;
                }
            } else {
                e5w0 e5w0Var3 = this.this$0;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
