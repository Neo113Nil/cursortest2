package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.e5w0;

/* compiled from: VkpnsPushProviderSdk.kt */
@b6l(c = "com.vk.push.pushsdk.VkpnsPushProviderSdk", f = "VkpnsPushProviderSdk.kt", l = {252, 264, 275, 282, 290, 291, 293}, m = "initMasterElectionsIfNeeded")
/* loaded from: classes5.dex */
public final class g5w0 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5w0(e5w0 e5w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e5w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        e5w0 e5w0Var = this.this$0;
        e5w0.b bVar = e5w0.y;
        return e5w0Var.a(false, this);
    }
}
