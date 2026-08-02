package xsna;

import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkhealth.permissions.impl.di.VkHealthPermissionsComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class bxg0 implements gzs<c8m<VkHealthPermissionsComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.vkhealth.permissions.api.di.a b;

    public bxg0(i7m i7mVar, com.vk.superapp.vkhealth.permissions.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<VkHealthPermissionsComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new VkHealthPermissionsComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
