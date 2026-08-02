package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsContinuousMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.VkpnsContinuousMessagesReceiver", f = "VkpnsContinuousMessagesReceiver.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "fetchMessages")
/* loaded from: classes5.dex */
public final class d4w0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4w0(h4w0 h4w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = h4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h4w0.i(this.this$0, this);
    }
}
