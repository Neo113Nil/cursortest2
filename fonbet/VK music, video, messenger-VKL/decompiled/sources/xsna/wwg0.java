package xsna;

import com.vk.superapp.navigation.api.di.VkAnalyticsComponent;
import com.vk.superapp.navigation.impl.di.VkAnalyticsComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class wwg0 implements gzs<b7m<VkAnalyticsComponent>> {
    public final /* synthetic */ com.vk.superapp.navigation.api.di.a b;

    public wwg0(i7m i7mVar, com.vk.superapp.navigation.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<VkAnalyticsComponent> invoke() {
        Object failure;
        try {
            failure = new VkAnalyticsComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
