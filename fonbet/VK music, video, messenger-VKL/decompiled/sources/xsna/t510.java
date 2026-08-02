package xsna;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: MarketItemsForReviewConfigStorageImpl.kt */
/* loaded from: classes18.dex */
public final class t510 implements s510 {
    public final bpn0 a = new bpn0(new uv0(21));

    @Override // xsna.s510
    public final Integer a() {
        if (e().contains("community_config_value")) {
            return Integer.valueOf(e().getInt("community_config_value", -1));
        }
        return null;
    }

    @Override // xsna.s510
    public final Date b() {
        long j = e().getLong("date_of_last_showing_offers_to_user_from_community", 0L);
        if (j == 0) {
            return null;
        }
        return new Date(j);
    }

    @Override // xsna.s510
    public final Date c() {
        long j = e().getLong("date_of_last_success_get_item_reviews_api_response", 0L);
        if (j == 0) {
            return null;
        }
        return new Date(j);
    }

    @Override // xsna.s510
    public final int d() {
        int seconds = (int) TimeUnit.DAYS.toSeconds(1L);
        return e().contains("requests_delay_config_value") ? e().getInt("requests_delay_config_value", seconds) : seconds;
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.a.getValue();
    }
}
