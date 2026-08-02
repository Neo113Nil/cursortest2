package yads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class dr3 {
    public final jq2 a;
    public final f9 b;

    public /* synthetic */ dr3() {
        this(new jq2(), new f9());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g9 a(AdRequestConfiguration adRequestConfiguration) {
        String str;
        String str2;
        String age = adRequestConfiguration.getAge();
        String gender = adRequestConfiguration.getGender();
        String contextQuery = adRequestConfiguration.getContextQuery();
        List<String> contextTags = adRequestConfiguration.getContextTags();
        Location location = adRequestConfiguration.getLocation();
        Map<String, String> parameters = adRequestConfiguration.getParameters();
        String biddingData = adRequestConfiguration.getBiddingData();
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        this.b.getClass();
        String adUnitId = adRequestConfiguration.getAdUnitId();
        hq2 hq2Var = null;
        if (age != null) {
            if (drm0.N(age)) {
                age = null;
            }
            if (age != null) {
                str = age;
                if (gender != null) {
                    if (drm0.N(gender)) {
                        gender = null;
                    }
                    if (gender != null) {
                        str2 = gender;
                        String str3 = contextQuery != null ? contextQuery : null;
                        List<String> list = contextTags != null ? contextTags : null;
                        Location location2 = location != null ? location : null;
                        Map<String, String> map = parameters != null ? parameters : null;
                        String str4 = biddingData != null ? biddingData : null;
                        if (preferredTheme != null) {
                            this.a.getClass();
                            hq2Var = jq2.a(preferredTheme);
                        }
                        return new g9(adUnitId, str, str2, str3, list, location2, map, str4, null, hq2Var, false, null);
                    }
                }
                str2 = null;
                if (contextQuery != null) {
                }
                if (contextTags != null) {
                }
                if (location != null) {
                }
                if (parameters != null) {
                }
                if (biddingData != null) {
                }
                if (preferredTheme != null) {
                }
                return new g9(adUnitId, str, str2, str3, list, location2, map, str4, null, hq2Var, false, null);
            }
        }
        str = null;
        if (gender != null) {
        }
        str2 = null;
        if (contextQuery != null) {
        }
        if (contextTags != null) {
        }
        if (location != null) {
        }
        if (parameters != null) {
        }
        if (biddingData != null) {
        }
        if (preferredTheme != null) {
        }
        return new g9(adUnitId, str, str2, str3, list, location2, map, str4, null, hq2Var, false, null);
    }

    public dr3(jq2 jq2Var, f9 f9Var) {
        this.a = jq2Var;
        this.b = f9Var;
    }
}
