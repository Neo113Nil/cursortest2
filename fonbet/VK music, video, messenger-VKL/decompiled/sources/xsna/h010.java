package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: MarketItemArgs.kt */
/* loaded from: classes18.dex */
public final class h010 {
    public final String a;
    public long b;
    public final UserId c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public h010(Bundle bundle, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
        String obj;
        this.a = str;
        this.b = bundle.getLong("id");
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        this.c = userId == null ? UserId.d : userId;
        this.d = bundle.getString("access_key", "");
        bundle.getBoolean("is_service", false);
        bundle.getString("source", "");
        this.e = bundle.getString("root_ref_screen", (mobileOfficialAppsCoreNavStat$EventScreen == null || (obj = mobileOfficialAppsCoreNavStat$EventScreen.toString()) == null) ? "" : obj);
        this.f = bundle.getString("ref_post_id", "");
        this.g = bundle.getString("ads_label");
    }
}
