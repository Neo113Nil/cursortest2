package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;

/* compiled from: ClassifiedsCatalogBaseRootVh.kt */
/* loaded from: classes18.dex */
public final class yfc {
    public final Bundle a;

    public yfc(Bundle bundle) {
        this.a = bundle;
    }

    public final Integer a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("KEY_ALBUM_ID")) {
            return Integer.valueOf(bundle.getInt("KEY_ALBUM_ID"));
        }
        return null;
    }

    public final MarketAnalyticsParams b() {
        return (MarketAnalyticsParams) this.a.getParcelable("KEY_ANALYTICS_PARAMS");
    }

    public final UserId c() {
        return (UserId) this.a.getParcelable("KEY_OWNER_ID");
    }
}
