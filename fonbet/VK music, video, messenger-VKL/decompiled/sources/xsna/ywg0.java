package xsna;

import com.vk.qr.rustore.api.VkRustoreQrComponent;
import com.vk.qr.rustore.impl.VkRustoreQrComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class ywg0 implements gzs<b7m<VkRustoreQrComponent>> {
    public final /* synthetic */ b7m b;

    public ywg0(i7m i7mVar, b7m b7mVar) {
        this.b = b7mVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b7m<VkRustoreQrComponent> invoke() {
        Object failure;
        try {
            failure = (b7m) new VkRustoreQrComponentImpl.Factory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
