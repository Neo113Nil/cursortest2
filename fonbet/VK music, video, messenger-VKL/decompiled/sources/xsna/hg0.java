package xsna;

import com.vk.libvideo.api.ad.AdBannerData;

/* compiled from: AdMapper.kt */
/* loaded from: classes18.dex */
public final class hg0 {
    public static sh0 a(AdBannerData.AdRedirectData adRedirectData) {
        String str = adRedirectData.b;
        Integer num = adRedirectData.c;
        Integer num2 = adRedirectData.d;
        String str2 = adRedirectData.e;
        String str3 = adRedirectData.f;
        return new sh0(str, num, num2, str2, str3 != null ? new kiw(str3) : null);
    }
}
