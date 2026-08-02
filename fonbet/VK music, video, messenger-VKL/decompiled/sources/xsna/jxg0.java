package xsna;

import com.vk.autologin.di.VkAutoLoginComponent;
import com.vk.autologin.di.VkAutoLoginComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class jxg0 implements gzs<c8m<VkAutoLoginComponent, pwj0>> {
    public final /* synthetic */ com.vk.autologin.di.a b;

    public jxg0(i7m i7mVar, com.vk.autologin.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<VkAutoLoginComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new VkAutoLoginComponentImpl.Factory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
