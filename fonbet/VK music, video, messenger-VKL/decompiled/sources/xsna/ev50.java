package xsna;

import com.vk.ads.analytics.NativeAdType;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: NativeAdEntryVisibilityTracker.kt */
/* loaded from: classes4.dex */
public final class ev50 implements gb60 {
    public final NativeAdUserLevelAnalyticsSender a;
    public final qg50 b = new qg50((Object) null);

    public ev50(NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender) {
        this.a = nativeAdUserLevelAnalyticsSender;
    }

    @Override // xsna.gb60
    public final void a() {
        this.b.c();
    }

    @Override // xsna.gb60
    public final void b(NewsEntry newsEntry) {
        OptionalNativeAdEntry optionalNativeAdEntry;
        x9v0 x9v0Var;
        Integer num;
        if (!(newsEntry instanceof OptionalNativeAdEntry) || (x9v0Var = (optionalNativeAdEntry = (OptionalNativeAdEntry) newsEntry).m) == null || (num = optionalNativeAdEntry.k) == null) {
            return;
        }
        int intValue = num.intValue();
        qg50 qg50Var = this.b;
        if (qg50Var.a(intValue)) {
            return;
        }
        qg50Var.b(intValue);
        NativeAdType nativeAdType = NativeAdType.APPLOVIN;
        String str = optionalNativeAdEntry.n.b;
        x9v0Var.a();
        throw null;
    }
}
