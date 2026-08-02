package xsna;

import com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent;
import com.vk.superapp.advertisement.di.sticky_banner_ad.StickyBannerAdFactoriesComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class mxg0 implements gzs<c8m<StickyBannerAdFactoriesComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.advertisement.api.di.sticky_banner_ad.a b;

    public mxg0(i7m i7mVar, com.vk.superapp.advertisement.api.di.sticky_banner_ad.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<StickyBannerAdFactoriesComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new StickyBannerAdFactoriesComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
