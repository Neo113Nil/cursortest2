package xsna;

import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class rxg0 implements gzs<c8m<SakAnalyticsComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.analytics.di.a b;

    public rxg0(i7m i7mVar, com.vk.superapp.analytics.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<SakAnalyticsComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new SakAnalyticsComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
