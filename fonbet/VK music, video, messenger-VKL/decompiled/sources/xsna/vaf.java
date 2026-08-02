package xsna;

import com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs;
import com.vk.core.preference.Preference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ClipsTrendsPrefsImpl.kt */
/* loaded from: classes17.dex */
public final class vaf implements ClipsTrendsPrefs {
    public static final /* synthetic */ qcy<Object>[] d = {new MutablePropertyReference1Impl(vaf.class, "defaultBannerClosed", "getDefaultBannerClosed()Z", 0), p5j.a(0, vaf.class, "closedBannerId", "getClosedBannerId()Ljava/lang/String;", fpf0.a), new MutablePropertyReference1Impl(vaf.class, "closedBannerExpirationDate", "getClosedBannerExpirationDate()J", 0)};
    public final f18 a = new f18("VkVideoBridge", "VkVideoBridge.clips_grid_trends_banner_closed_by_user", false);
    public final tw8 b = new tw8("VkVideoBridge", "clips_trends_banner_id");
    public final hn70 c = new hn70("VkVideoBridge", "clips_trends_banner_expiration_date");

    @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
    public final void a(long j, String str) {
        qcy<Object>[] qcyVarArr = d;
        qcy<Object> qcyVar = qcyVarArr[1];
        this.b.g(str);
        long currentTimeMillis = System.currentTimeMillis() + j;
        qcy<Object> qcyVar2 = qcyVarArr[2];
        this.c.b(currentTimeMillis);
    }

    @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
    public final void b() {
        qcy<Object> qcyVar = d[0];
        this.a.b(true);
    }

    @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
    public final ClipsTrendsPrefs.BannerClosedFlag c(String str) {
        qcy<Object>[] qcyVarArr = d;
        qcy<Object> qcyVar = qcyVarArr[1];
        if (!this.b.b().equals(str)) {
            return ClipsTrendsPrefs.BannerClosedFlag.UNSET;
        }
        qcy<Object> qcyVar2 = qcyVarArr[2];
        if (this.c.a().longValue() > System.currentTimeMillis()) {
            return ClipsTrendsPrefs.BannerClosedFlag.SET;
        }
        ClipsTrendsPrefs.BannerClosedFlag bannerClosedFlag = ClipsTrendsPrefs.BannerClosedFlag.EXPIRED;
        Preference.C("VkVideoBridge", "clips_trends_banner_id");
        Preference.C("VkVideoBridge", "clips_trends_banner_expiration_date");
        return bannerClosedFlag;
    }

    @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
    public final boolean d() {
        qcy<Object> qcyVar = d[0];
        return this.a.a().booleanValue();
    }
}
