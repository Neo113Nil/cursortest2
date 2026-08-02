package xsna;

import com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent;
import com.vk.superapp.advertisement.di.fullscreen_ad.FullscreenAdFactoryComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class lxg0 implements gzs<c8m<FullscreenAdFactoryComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.advertisement.api.di.fullscreen_ad.a b;

    public lxg0(i7m i7mVar, com.vk.superapp.advertisement.api.di.fullscreen_ad.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<FullscreenAdFactoryComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new FullscreenAdFactoryComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
