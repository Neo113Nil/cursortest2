package xsna;

import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.superapp.vksteps.di.VkStepsComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class dxg0 implements gzs<c8m<VkStepsComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.vksteps.di.a b;

    public dxg0(i7m i7mVar, com.vk.superapp.vksteps.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<VkStepsComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new VkStepsComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
