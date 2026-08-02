package xsna;

import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class cxg0 implements gzs<c8m<VkWorkoutComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.vkworkout.di.a b;

    public cxg0(i7m i7mVar, com.vk.superapp.vkworkout.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<VkWorkoutComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new VkWorkoutComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
