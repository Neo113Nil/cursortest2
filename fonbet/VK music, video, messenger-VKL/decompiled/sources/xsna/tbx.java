package xsna;

import android.os.SystemClock;
import com.vk.ads.analytics.NativeAdType;
import com.vk.ads.optional.api.nativead.NativeAd$NativeAdListener$AdLoadingError;
import com.vk.core.serialize.Serializer;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.polls.Poll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tbx implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializer.StreamParcelableAdapter e;

    public /* synthetic */ tbx(InteractivePollStickerView interactivePollStickerView, Poll poll, int i) {
        this.d = interactivePollStickerView;
        this.e = poll;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem;
        switch (this.b) {
            case 0:
                ((InteractivePollStickerView) this.d).b((Poll) this.e, this.c);
                return s3q0.a;
            default:
                tt80 tt80Var = (tt80) this.d;
                OptionalNativeAdEntry optionalNativeAdEntry = (OptionalNativeAdEntry) this.e;
                Throwable th = (Throwable) obj;
                NewsEntry.TrackData trackData = optionalNativeAdEntry.n;
                if (th instanceof NativeAd$NativeAdListener$AdLoadingError) {
                    NativeAd$NativeAdListener$AdLoadingError nativeAd$NativeAdListener$AdLoadingError = (NativeAd$NativeAdListener$AdLoadingError) th;
                    if (nativeAd$NativeAdListener$AdLoadingError instanceof NativeAd$NativeAdListener$AdLoadingError.EmptyAd) {
                        schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_APPLOVIN_LOAD_FAIL.h(), null, ((NativeAd$NativeAdListener$AdLoadingError.EmptyAd) nativeAd$NativeAdListener$AdLoadingError).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 3, null);
                    } else {
                        if (!(nativeAd$NativeAdListener$AdLoadingError instanceof NativeAd$NativeAdListener$AdLoadingError.LoadingFailed)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String h = DevNullEventKey.FEED_APPLOVIN_LOAD_FAIL.h();
                        NativeAd$NativeAdListener$AdLoadingError.LoadingFailed loadingFailed = (NativeAd$NativeAdListener$AdLoadingError.LoadingFailed) nativeAd$NativeAdListener$AdLoadingError;
                        int d = loadingFailed.d();
                        int h2 = loadingFailed.h();
                        int j = (int) loadingFailed.j();
                        Long k = loadingFailed.k();
                        int longValue = k != null ? (int) k.longValue() : -1;
                        NetworkType.a aVar = NetworkType.Companion;
                        Set<Integer> set = com.vk.core.utils.newtork.b.c().b;
                        aVar.getClass();
                        boolean n = NetworkType.VPN.n(set);
                        int i = longValue;
                        String g = loadingFailed.g();
                        String i2 = loadingFailed.i();
                        String l = loadingFailed.l();
                        String m = loadingFailed.m();
                        NetworkType d2 = com.vk.core.utils.newtork.b.c().d();
                        StringBuilder sb = new StringBuilder("isCellular: ");
                        sb.append(d2.l());
                        sb.append(" isWifi: ");
                        sb.append(d2 == NetworkType.WIFI);
                        schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, g, Integer.valueOf(d), i2, Integer.valueOf(h2), l, Integer.valueOf(j), m, Integer.valueOf(i), sb.toString(), Integer.valueOf(n ? 1 : 0), com.vk.core.utils.newtork.b.c().c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8190, 3, null);
                    }
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = schemeStat$TypeDevNullItem;
                    l5mVar.q();
                }
                tt80.q0(1, 0, 0, null, null, null);
                tt80Var.d.a(new fv50(NativeAdType.APPLOVIN, this.c, trackData.b, trackData.c), null, false, SystemClock.elapsedRealtime() - tt80Var.h);
                l5m l5mVar2 = new l5m(null, null, 3);
                l5mVar2.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_APPLOVIN_TRACKCODE.h(), null, trackData.b, null, "requestFail", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                l5mVar2.q();
                return optionalNativeAdEntry.i;
        }
    }

    public /* synthetic */ tbx(tt80 tt80Var, int i, OptionalNativeAdEntry optionalNativeAdEntry) {
        this.d = tt80Var;
        this.c = i;
        this.e = optionalNativeAdEntry;
    }
}
