package com.vkontakte.android.attachments;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdSource.kt */
/* loaded from: classes7.dex */
public final class AdSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdSource[] $VALUES;
    public static final a Companion;
    public static final AdSource UNKNOWN;
    public static final AdSource VKONTAKTE;
    public static final AdSource VK_FEED;
    public static final AdSource VK_FEED_YANDEX;
    private final String value;

    /* compiled from: AdSource.kt */
    public static final class a {
        public static AdSource a(String str) {
            AdSource adSource = null;
            if (str != null) {
                AdSource[] values = AdSource.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    AdSource adSource2 = values[i];
                    if (epx.f(adSource2.h(), str)) {
                        adSource = adSource2;
                        break;
                    }
                    i++;
                }
                if (adSource == null) {
                    return AdSource.UNKNOWN;
                }
            }
            return adSource;
        }

        public static boolean b(AdSource adSource) {
            return adSource == AdSource.VK_FEED || adSource == AdSource.VK_FEED_YANDEX;
        }
    }

    static {
        AdSource adSource = new AdSource("VK_FEED", 0, "vkfeed");
        VK_FEED = adSource;
        AdSource adSource2 = new AdSource("VK_FEED_YANDEX", 1, "vkfeed_yandex");
        VK_FEED_YANDEX = adSource2;
        AdSource adSource3 = new AdSource("VKONTAKTE", 2, "vkontakte");
        VKONTAKTE = adSource3;
        AdSource adSource4 = new AdSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = adSource4;
        AdSource[] adSourceArr = {adSource, adSource2, adSource3, adSource4};
        $VALUES = adSourceArr;
        $ENTRIES = new asp(adSourceArr);
        Companion = new a();
    }

    public AdSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdSource valueOf(String str) {
        return (AdSource) Enum.valueOf(AdSource.class, str);
    }

    public static AdSource[] values() {
        return (AdSource[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
