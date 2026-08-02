package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class NativeAdRequestConfiguration {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final Location f;
    private final Map g;
    private final String h;
    private final AdTheme i;
    private final boolean j;

    public static final class Builder {
        private final String a;
        private String b;
        private String c;
        private Location d;
        private String e;
        private List f;
        private Map g;
        private String h;
        private AdTheme i;
        private boolean j = true;

        public Builder(String str) {
            this.a = str;
        }

        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.a, this.b, this.c, this.e, this.f, this.d, this.g, this.h, this.i, this.j, null);
        }

        public final Builder setShouldLoadImagesAutomatically(boolean z) {
            this.j = z;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z, zcl zclVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z);
    }

    public final String getAdUnitId() {
        return this.a;
    }

    public final String getAge() {
        return this.b;
    }

    public final String getBiddingData() {
        return this.h;
    }

    public final String getContextQuery() {
        return this.d;
    }

    public final List<String> getContextTags() {
        return this.e;
    }

    public final String getGender() {
        return this.c;
    }

    public final Location getLocation() {
        return this.f;
    }

    public final Map<String, String> getParameters() {
        return this.g;
    }

    public final AdTheme getPreferredTheme() {
        return this.i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.j;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = location;
        this.g = map;
        this.h = str5;
        this.i = adTheme;
        this.j = z;
    }
}
